package com.nhungtester.features.Order;

import com.nhungtester.entity.Inventory;
import com.nhungtester.entity.Product;
import com.nhungtester.entity.User;
import com.nhungtester.enviroment.Url;
import com.nhungtester.tasks.*;
import com.nhungtester.ui.CartUI;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.WithTag;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.List;

@RunWith(SerenityRunner.class)
public class WhenOrderItems {

    Actor nhungTester = Actor.named("Nhung");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;


    @Before
    public void annaCanBrowseTheWeb() {
        nhungTester.can(BrowseTheWeb.with(herBrowser));
    }
    @WithTag("testcase01")
    @Test
    public void when_order_by_normal_user_then_order_single_product_successfully() {
        User userDuong = new User("duong",  "nhung123@");
        Product macBook = new Product("Apple MacBook Pro 13-inch",2, 1800.00 );
        nhungTester.wasAbleTo(
                Open.url(Url.DEMO_BASE_URL),
                Register.by(userDuong),
                Login.by(userDuong),
                Search.theProduct(macBook),
                AddToCart.theProduct(macBook),
                Ensure.thatTheCurrentPage().currentUrl().isEqualTo("https://demo.nopcommerce.com/cart"),
                Ensure.that(CartUI.PRODUCT_NAME).text().contains(macBook.getNameProduct()),
                Ensure.that(CartUI.QUANTITY).attribute("value").isEqualTo(String.valueOf(macBook.getQuantity())),
                Ensure.that(CartUI.PRODUCT_SUBTOTAL).text().isEqualTo(String.valueOf(macBook.getTotal())),
                Ensure.that(CartUI.PRODUCTS_TOTAL_VALUE).text().isEqualTo(String.valueOf(macBook.getTotal()))
                );
    }
    @WithTag("testcase02")
    @Test
    public void when_order_by_normal_user_then_order_multi_products_successfully() {
        User userNhung = new User("nhung",  "nhung123@");
        Product macBook = new Product("Apple MacBook Pro 13-inch",2, 1800.00 );
        Product asus = new Product("Asus N551JK-XO076H Laptop",2, 1500.00 );
        List<Product> products = List.of(macBook,asus);

        nhungTester.wasAbleTo(
                Open.url(Url.DEMO_BASE_URL),
                Register.by(userNhung),
                Login.by(userNhung),
                AddToCart.theProducts(products),
                Ensure.that(CartUI.PRODUCTS_TOTAL_VALUE).text().isEqualTo(String.valueOf(Inventory.getTotalAll(products)))
        );
    }
}
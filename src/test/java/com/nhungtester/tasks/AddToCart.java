package com.nhungtester.tasks;

import com.nhungtester.entity.Product;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class AddToCart {
    public static final Target PRODUCT_ITEM = Target.the("{0} item")
            .locatedBy("//a[text()='{0}']/parent::h2/following-sibling::div[@class='add-info']//button[text()='Add to cart']");
    public static final Target SHOPPING_CART_HREF = Target.the("shopping cart href")
            .locatedBy("//a[text()='shopping cart']");
    public static final Target ADD_TO_CART_BUTTON = Target.the("add to cart button")
            .locatedBy("(//button[text()='Add to cart'])[1]");

    public static Performable theProduct(Product product) {
        return Task.where("{0} add item into cart", actor -> actor.attemptsTo(
                Click.on(PRODUCT_ITEM.of(product.getNameProduct())),
                Click.on(ADD_TO_CART_BUTTON),
                Click.on(SHOPPING_CART_HREF)
        ));

    }

    public static Performable theProducts(List<Product> products) {
        return Task.where("{0} add items into cart", actor -> {
                    products.forEach(product -> {
                        actor.attemptsTo(
                                Search.theProduct(product),
                                AddToCart.theProduct(product)
                        );
                    });
                }
        );
    }
}

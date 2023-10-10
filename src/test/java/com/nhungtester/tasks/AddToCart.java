package com.nhungtester.tasks;

import com.nhungtester.entity.Product;
import com.nhungtester.ui.CartUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Select;

import java.util.List;

public class AddToCart {

    public static Performable theProduct(Product product) {
        return Task.where("{0} add item into cart", actor -> actor.attemptsTo(
                Click.on(CartUI.PRODUCT_ITEM.of(product.getNameProduct())),
                Clear.field(CartUI.QTY_INPUT),
                Enter.theValue(String.valueOf(product.getQuantity())).into(CartUI.QTY_INPUT),
                Click.on(CartUI.ADD_TO_CART_BUTTON),
                Click.on(CartUI.SHOPPING_CART_HREF)
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

    public static Performable Shoes(Product product) {
        return Task.where("{0} add item into cart", actor -> actor.attemptsTo(
                Click.on(CartUI.PRODUCT_ITEM.of(product.getNameProduct())),
                Select.option(String.valueOf(product.getSize())).from(CartUI.SIZE_DROPDOWN_LIST),
                Click.on(CartUI.COLOR_SQUARE.of(product.getColor())),
                Clear.field(CartUI.QTY_INPUT),
                Enter.theValue(String.valueOf(product.getQuantity())).into(CartUI.QTY_INPUT),
                Click.on(CartUI.ADD_TO_CART_BUTTON),
                Click.on(CartUI.SHOPPING_CART_HREF)
        ));
    }
}

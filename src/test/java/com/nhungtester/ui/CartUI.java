package com.nhungtester.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartUI {
    public static final Target PRODUCTS_TOTAL_VALUE = Target.the("total value")
            .locatedBy("//div[@class='totals']//tr[@class='order-total']//strong");
    public static final Target QUANTITY =Target.the("quantity")
            .locatedBy("//td[@class='quantity']//input");
    public static final Target PRODUCT_NAME = Target.the("product name")
            .locatedBy("//td[@class='product']//a[@class='product-name']");
    public static final Target PRODUCT_SUBTOTAL = Target.the("subtotal of apple mac book pro 13 inch item")
            .locatedBy("//a[text()='Apple MacBook Pro 13-inch']/parent::td/following-sibling::td[@class='subtotal']/span[@class='product-subtotal']");
}

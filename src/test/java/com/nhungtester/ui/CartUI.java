package com.nhungtester.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartUI {
    public static final Target PRODUCTS_TOTAL_VALUE = Target.the("total value")
            .locatedBy("//div[@class='totals']//tr[@class='order-total']//strong");
    public static final Target QUANTITY =Target.the("quantity")
            .locatedBy("//td[@class='quantity']//input");
    public static final Target PRODUCT_NAME = Target.the("product name")
            .locatedBy("//td[@class='product']//a[@class='product-name']");
    public static final Target PRODUCT_SUBTOTAL = Target.the("subtotal of items")
            .locatedBy("//div[@class='total-info']//tr[@class='order-subtotal']//span[@class='value-summary']");
    public static final Target GIFT_WRAPPING_SELECT = Target.the("select gift wrapping")
            .locatedBy("//label[contains(text(),'Gift wrapping')]/parent::dt/following-sibling::dd//select");
    public static final Target GIFT_WRAPPING_STATUS = Target.the("gift wrapping status")
            .locatedBy("//div[@class='cart-options']/div[@class='selected-checkout-attributes']");
    public static final Target PRODUCT_ITEM = Target.the("{0} item")
            .locatedBy("//h2[@class='product-title']/a[text()='{0}']");
    public static final Target SHOPPING_CART_HREF = Target.the("shopping cart href")
            .locatedBy("//a[text()='shopping cart']");
    public static final Target ADD_TO_CART_BUTTON = Target.the("add to cart button")
            .locatedBy("(//button[text()='Add to cart'])[1]");
    public static final Target QTY_INPUT = Target.the("input quantity of the item")
            .locatedBy("//input[@class='qty-input']");
    public static final Target SIZE_DROPDOWN_LIST = Target.the("choose size of the item")
            .locatedBy("//label[text()=' Size ']/parent::dt/following-sibling::dd[1]/select");
    public static final Target COLOR_SQUARE = Target.the("choose {0} color of the item")
            .locatedBy("//span[@title ='{0}']/span[@class='attribute-square']");
    public static final Target SELECTED_GIFT_WRAPPING = Target.the("selected gift wrapping")
            .locatedBy("//div[@class='cart-options']/div[@class='selected-checkout-attributes']");
}

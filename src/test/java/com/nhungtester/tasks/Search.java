package com.nhungtester.tasks;

import com.nhungtester.entity.Product;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class Search {

    public static final Target SMALL_SEARCHTERMS_TEXTBOX = Target.the("small search item textbox")
            .locatedBy("//input[@id='small-searchterms']");

    public static final Target SEARCH_BOX_BUTTON = Target.the("search box button")
            .locatedBy("//button[@class='button-1 search-box-button']");

    public static Performable theProduct(Product product) {
        return Task.where("{0} search item", actor -> actor.attemptsTo(
                Enter.theValue(product.getNameProduct()).into(SMALL_SEARCHTERMS_TEXTBOX),
                Click.on(SEARCH_BOX_BUTTON)
        ));
    }
}

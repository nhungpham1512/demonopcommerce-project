package com.nhungtester.tasks;

import com.nhungtester.entity.Product;
import com.nhungtester.ui.SearchUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search {

    public static Performable theProduct(Product product) {
        return Task.where("{0} search item", actor -> actor.attemptsTo(
                Enter.theValue(product.getNameProduct()).into(SearchUI.SMALL_SEARCHTERMS_TEXTBOX),
                Click.on(SearchUI.SEARCH_BOX_BUTTON)
        ));
    }
}

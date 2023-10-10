package com.nhungtester.tasks;

import com.nhungtester.ui.CartUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ui.Select;

public class ChoseGiftWrapping {

    public static Performable optionWrapping() {
        return Task.where("select gift wrapping option", actor -> actor.attemptsTo(
                Select.option("Yes [+$10.00]").from(CartUI.GIFT_WRAPPING_SELECT)
        ));
    }



}

package com.nhungtester.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SearchUI {
    public static final Target SMALL_SEARCHTERMS_TEXTBOX = Target.the("small search item textbox")
            .locatedBy("//input[@id='small-searchterms']");
    public static final Target SEARCH_BOX_BUTTON = Target.the("search box button")
            .locatedBy("//button[@class='button-1 search-box-button']");
}

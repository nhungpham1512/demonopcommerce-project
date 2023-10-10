package com.nhungtester.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {
    public static final Target LOGIN_LINK = Target.the("login link")
            .locatedBy("//a[@class='ico-login']");
    public static final Target EMAIL = Target.the("login email")
            .locatedBy("//input[@id='Email']");
    public static final Target PASSWORD_TEXTBOX = Target.the("login password textbox")
            .locatedBy("//input[@id='Password']");
    public static final Target LOGIN_BUTTON = Target.the("login button")
            .locatedBy("//button[@class='button-1 login-button']");
}

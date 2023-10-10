package com.nhungtester.ui;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterUI {
    public static final Target REGISTER_LINK = Target.the("register link")
            .locatedBy("//a[@class='ico-register']");
    public static final Target FEMALE_RADIO_BUTTON = Target.the("female radio button")
            .locatedBy("//input[@id='gender-female']");
    public static final Target FIRST_NAME_TEXTBOX = Target.the("first name textbox")
            .locatedBy("//input[@id='FirstName']");
    public static final Target LAST_NAME_TEXTBOX = Target.the("last name textbox")
            .locatedBy("//input[@id='LastName']");
    public static final Target BIRTH_DAY_OPTION = Target.the("birthday option")
            .locatedBy("//select[@name='DateOfBirthDay']");
    public static final Target BIRTH_MONTH_OPTION = Target.the("birthmonth option")
            .locatedBy("//select[@name='DateOfBirthMonth']");
    public static final Target BIRTH_YEAR_OPTION = Target.the("birthyear option")
            .locatedBy("//select[@name='DateOfBirthYear']");
    public static final Target EMAIL_TEXTBOX = Target.the("register email textbox")
            .locatedBy("//input[@id='Email']");
    public static final Target COMPANY_TEXTBOX = Target.the("company textbox")
            .locatedBy("//input[@id='Company']");
    public static final Target PASSWORD_TEXTBOX = Target.the("register password textbox")
            .locatedBy("//input[@id='Password']");
    public static final Target CONFIRM_PASSWORD_TEXTBOX = Target.the("register confirm password textbox")
            .locatedBy("//input[@id='ConfirmPassword']");
    public static final Target REGISTER_BUTTON = Target.the("register button")
            .locatedBy("//button[@id='register-button']");
    public static final Target REGISTER_CONTINUE_BUTTON = Target.the("register continue button")
            .locatedBy("//a[@class='button-1 register-continue-button']");
}

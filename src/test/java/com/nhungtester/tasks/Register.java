package com.nhungtester.tasks;

import com.nhungtester.entity.User;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Select;

public class Register {
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

    public static Performable by(String firstName, String lastName, String birthday, int birthMonth, String birthYear, String email, String company, String password) {
        return Task.where("{0} register normal user", actor -> actor.attemptsTo(
                Click.on(REGISTER_LINK),
                Click.on(FEMALE_RADIO_BUTTON),
                Enter.theValue(firstName).into(FIRST_NAME_TEXTBOX),
                Enter.theValue(lastName).into(LAST_NAME_TEXTBOX),
                Select.value(birthday).from(BIRTH_DAY_OPTION),
                Select.optionNumber(birthMonth).from(BIRTH_MONTH_OPTION),
                Select.value(birthYear).from(BIRTH_YEAR_OPTION),
                Enter.theValue(email).into(EMAIL_TEXTBOX),
                Enter.theValue(company).into(COMPANY_TEXTBOX),
                Enter.theValue(password).into(PASSWORD_TEXTBOX),
                Enter.theValue(password).into(CONFIRM_PASSWORD_TEXTBOX),
                Click.on(REGISTER_BUTTON),
                Click.on(REGISTER_CONTINUE_BUTTON)
        ));
    }


    public static Performable by(User user) {
        return Task.where("{0} register normal user", actor -> actor.attemptsTo(
                Click.on(REGISTER_LINK),
                Click.on(FEMALE_RADIO_BUTTON),
                Enter.theValue(user.getFirstName()).into(FIRST_NAME_TEXTBOX),
                Enter.theValue(user.getLastName()).into(LAST_NAME_TEXTBOX),
                Select.value(user.getBirthday()).from(BIRTH_DAY_OPTION),
                Select.optionNumber(user.getBirthMonth()).from(BIRTH_MONTH_OPTION),
                Select.value(user.getBirthYear()).from(BIRTH_YEAR_OPTION),
                Enter.theValue(user.getEmail()).into(EMAIL_TEXTBOX),
                Enter.theValue(user.getCompany()).into(COMPANY_TEXTBOX),
                Enter.theValue(user.getPassword()).into(PASSWORD_TEXTBOX),
                Enter.theValue(user.getPassword()).into(CONFIRM_PASSWORD_TEXTBOX),
                Click.on(REGISTER_BUTTON),
                Click.on(REGISTER_CONTINUE_BUTTON)
        ));
    }
}

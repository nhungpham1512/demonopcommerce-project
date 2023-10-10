package com.nhungtester.tasks;

import com.nhungtester.entity.User;
import com.nhungtester.ui.RegisterUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Select;

public class Register {

    public static Performable by(String firstName, String lastName, String birthday, int birthMonth, String birthYear, String email, String company, String password) {
        return Task.where("{0} register normal user", actor -> actor.attemptsTo(
                Click.on(RegisterUI.REGISTER_LINK),
                Click.on(RegisterUI.FEMALE_RADIO_BUTTON),
                Enter.theValue(firstName).into(RegisterUI.FIRST_NAME_TEXTBOX),
                Enter.theValue(lastName).into(RegisterUI.LAST_NAME_TEXTBOX),
                Select.value(birthday).from(RegisterUI.BIRTH_DAY_OPTION),
                Select.optionNumber(birthMonth).from(RegisterUI.BIRTH_MONTH_OPTION),
                Select.value(birthYear).from(RegisterUI.BIRTH_YEAR_OPTION),
                Enter.theValue(email).into(RegisterUI.EMAIL_TEXTBOX),
                Enter.theValue(company).into(RegisterUI.COMPANY_TEXTBOX),
                Enter.theValue(password).into(RegisterUI.PASSWORD_TEXTBOX),
                Enter.theValue(password).into(RegisterUI.CONFIRM_PASSWORD_TEXTBOX),
                Click.on(RegisterUI.REGISTER_BUTTON),
                Click.on(RegisterUI.REGISTER_CONTINUE_BUTTON)
        ));
    }


    public static Performable by(User user) {
        return Task.where("{0} register normal user", actor -> actor.attemptsTo(
                Click.on(RegisterUI.REGISTER_LINK),
                Click.on(RegisterUI.FEMALE_RADIO_BUTTON),
                Enter.theValue(user.getFirstName()).into(RegisterUI.FIRST_NAME_TEXTBOX),
                Enter.theValue(user.getLastName()).into(RegisterUI.LAST_NAME_TEXTBOX),
                Select.value(user.getBirthday()).from(RegisterUI.BIRTH_DAY_OPTION),
                Select.optionNumber(user.getBirthMonth()).from(RegisterUI.BIRTH_MONTH_OPTION),
                Select.value(user.getBirthYear()).from(RegisterUI.BIRTH_YEAR_OPTION),
                Enter.theValue(user.getEmail()).into(RegisterUI.EMAIL_TEXTBOX),
                Enter.theValue(user.getCompany()).into(RegisterUI.COMPANY_TEXTBOX),
                Enter.theValue(user.getPassword()).into(RegisterUI.PASSWORD_TEXTBOX),
                Enter.theValue(user.getPassword()).into(RegisterUI.CONFIRM_PASSWORD_TEXTBOX),
                Click.on(RegisterUI.REGISTER_BUTTON),
                Click.on(RegisterUI.REGISTER_CONTINUE_BUTTON)
        ));
    }
}

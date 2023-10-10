package com.nhungtester.tasks;

import com.nhungtester.entity.User;
import com.nhungtester.ui.LoginUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login {

    public static Performable by(String email, String password) {
        return Task.where("{0}: login as normal user", actor -> actor.attemptsTo(
                Click.on(LoginUI.LOGIN_LINK),
                Enter.theValue(email).into(LoginUI.EMAIL),
                Enter.theValue(password).into(LoginUI.PASSWORD_TEXTBOX),
                Click.on(LoginUI.LOGIN_BUTTON)
        ));
    }

    public static Performable by(User user) {
        return Task.where("{0}: login as normal user", actor -> actor.attemptsTo(
                Click.on(LoginUI.LOGIN_LINK),
                Enter.theValue(user.getEmail()).into(LoginUI.EMAIL),
                Enter.theValue(user.getPassword()).into(LoginUI.PASSWORD_TEXTBOX),
                Click.on(LoginUI.LOGIN_BUTTON)
        ));
    }
}

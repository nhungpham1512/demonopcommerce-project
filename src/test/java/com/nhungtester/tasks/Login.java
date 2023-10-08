package com.nhungtester.tasks;

import com.nhungtester.entity.User;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class Login {

    public static final Target LOGIN_LINK = Target.the("login link")
            .locatedBy("//a[@class='ico-login']");
    public static final Target EMAIL = Target.the("login email")
            .locatedBy("//input[@id='Email']");
    public static final Target PASSWORD_TEXTBOX = Target.the("login password textbox")
            .locatedBy("//input[@id='Password']");
    public static final Target LOGIN_BUTTON = Target.the("login button")
            .locatedBy("//button[@class='button-1 login-button']");


    public static Performable by(String email, String password) {
        return Task.where("{0}: login as normal user", actor -> actor.attemptsTo(
                Click.on(LOGIN_LINK),
                Enter.theValue(email).into(EMAIL),
                Enter.theValue(password).into(PASSWORD_TEXTBOX),
                Click.on(LOGIN_BUTTON)
        ));
    }

    public static Performable by(User user) {
        return Task.where("{0}: login as normal user", actor -> actor.attemptsTo(
                Click.on(LOGIN_LINK),
                Enter.theValue(user.getEmail()).into(EMAIL),
                Enter.theValue(user.getPassword()).into(PASSWORD_TEXTBOX),
                Click.on(LOGIN_BUTTON)
        ));
    }
}

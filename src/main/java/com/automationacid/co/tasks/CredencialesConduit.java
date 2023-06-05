package com.automationacid.co.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.automationacid.co.ui.HomeConduitPage.BTN_GO_LOGIN;
import static com.automationacid.co.ui.LoginConduitPage.*;

public class CredencialesConduit implements Task {
    private String email;
    private String password;
    public CredencialesConduit(String email,String password){
        this.email = email;
        this.password = password;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_GO_LOGIN),
                Enter.theValue(email).into(TXT_EMAIL),
                Enter.theValue(password).into(TXT_PASSWORD),
                Click.on(BTB_SIGN_IN)
        );
    }
}

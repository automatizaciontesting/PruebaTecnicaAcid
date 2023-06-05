package com.automationacid.co.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.automationacid.co.ui.LoginConduitPage.LBL_EMAIL_EMPTY;

public class CampoEmaildVacio implements Question<Boolean> {
    public static CampoEmaildVacio alLoguear() {
        return new CampoEmaildVacio();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_EMAIL_EMPTY.isVisibleFor(actor);
    }
}

package com.automationacid.co.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.automationacid.co.ui.LoginConduitPage.LBL_PASSWORD_EMPTY;

public class CampoPasswordVacio implements Question<Boolean> {

    public static CampoEmaildVacio alLoguear() {
        return new CampoEmaildVacio();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_PASSWORD_EMPTY.isVisibleFor(actor);
    }
}

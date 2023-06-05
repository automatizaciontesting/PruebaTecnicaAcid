package com.automationacid.co.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.automationacid.co.ui.LoginConduitPage.LBL_ERROR_OCURRED;

public class LogueoUsuarioInexistente implements Question<Boolean> {

    public static LogueoUsuarioInexistente enLaAplicacion() {
        return new LogueoUsuarioInexistente();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_ERROR_OCURRED.isVisibleFor(actor);
    }
}

package com.automationacid.co.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.automationacid.co.ui.HomeConduitPage.LNK_TABS;

public class LogueoConduit implements Question<Boolean> {
    public static LogueoConduit veoElHome() {
        return new LogueoConduit();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return LNK_TABS.resolveFor(actor).isVisible();
    }
}

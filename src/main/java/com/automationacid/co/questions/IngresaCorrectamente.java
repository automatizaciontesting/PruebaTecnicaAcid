package com.automationacid.co.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.automationacid.co.ui.FeedTab.LBL_YOUR_FEED;

public class IngresaCorrectamente implements Question<Boolean> {
    public static IngresaCorrectamente aLaSesion() {
        return new IngresaCorrectamente();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_YOUR_FEED.isVisibleFor(actor);
    }
}

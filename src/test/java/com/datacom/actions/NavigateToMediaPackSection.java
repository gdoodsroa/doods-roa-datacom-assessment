package com.datacom.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.datacom.pages.ContactUsPage.MEDIA_PACK;

public class NavigateToMediaPackSection implements Task {

    @Step("{0} navigates to Media Pack section")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MEDIA_PACK));
    }
}

package com.datacom.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.datacom.pages.ContactUsPage.GET_IN_TOUCH;

public class NavigateToGetInTouchSection implements Task {

    @Step("{0} navigates to Get in touch section")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(GET_IN_TOUCH));
    }
}

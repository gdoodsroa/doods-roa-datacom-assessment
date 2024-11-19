package com.datacom.actions;

import com.datacom.pages.ContactUsPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate {

    public static Performable goToContactPage() {
        return Task.where("{0} navigates to contact us page",
                Open.browserOn().the(ContactUsPage.class));
    }
}

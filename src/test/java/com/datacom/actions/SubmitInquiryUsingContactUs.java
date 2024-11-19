package com.datacom.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.datacom.pages.ContactUsPage.*;

public class SubmitInquiryUsingContactUs implements Task {

    String firstName, lastName, email, phone, jobTitle, company, country, how, message,
            relationship, product, solution,
            lookingFor, university, interestedFor;

    @Step("{0} submits inquiry using Contact Us")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CONTACT_US));

        actor.attemptsTo(
                Enter.theValue(firstName).into(FIRST_NAME_FIELD),
                Enter.theValue(lastName).into(LAST_NAME_FIELD),
                Enter.theValue(email).into(BUSINESS_EMAIL_FIELD),
                Enter.theValue(phone).into(PHONE_NUMBER_FIELD),
                Enter.theValue(jobTitle).into(JOB_TITLE_FIELD),
                Enter.theValue(company).into(COMPANY_NAME_FIELD),
                selectCountry(country));

        if(how.equalsIgnoreCase("payroll support")) {
            actor.attemptsTo(
                    SelectFromOptions.byIndex(0).from(HOW_HELP_FIELD),
                    payrollSupport(relationship, product, company, message));
        } else if(how.equalsIgnoreCase("expert consult")) {
            actor.attemptsTo(
                    SelectFromOptions.byIndex(1).from(HOW_HELP_FIELD),
                    expertConsult(relationship, solution, message));
        } else if(how.equalsIgnoreCase("careers")) {
            actor.attemptsTo(
                    SelectFromOptions.byIndex(2).from(HOW_HELP_FIELD),
                    careers(relationship, lookingFor, university, interestedFor, message));
        }
    }

    public static SubmitInquiryUsingContactUs sessionWith(String firstName, String lastName, String email, String phone, String jobTitle,
                                                          String company, String country, String how, String message, String relationship, String product,
                                                          String solution, String lookingFor, String university, String interestedFor) {
        return Tasks.instrumented(SubmitInquiryUsingContactUs.class, firstName, lastName, email, phone, jobTitle, company, country, how, message, relationship,
                product, solution, lookingFor, university, interestedFor);
    }

    private static Performable selectCountry(String country) {
        return Task.where("{0} selects a origin country",
                actor -> {
                    actor.attemptsTo(
                            Click.on(COUNTRY_FIELD),
                            SelectFromOptions.byVisibleText(country).from(COUNTRY_FIELD));
                });
    }

    private static Performable payrollSupport(String relationship, String product, String companyCode, String message) {
        return Task.where("{0} selects payroll support",
                actor -> {
                    actor.attemptsTo(
                            SelectFromOptions.byVisibleText(relationship).from(RELATIONSHIP),
                            SelectFromOptions.byVisibleText(product).from(PRODUCT_SELECT),
                            Enter.theValue(companyCode).into(COMPANY_CODE),
                            Enter.theValue(message).into(MESSAGE_FIELD));
                });
    }

    private static Performable expertConsult(String relationship,String solution, String message) {
        return Task.where("{0} selects expert consult",
                actor -> {
                    actor.attemptsTo(
                            SelectFromOptions.byVisibleText(relationship).from(RELATIONSHIP),
                            SelectFromOptions.byVisibleText(solution).from(SOLUTION_SELECT),
                            Enter.theValue(message).into(MESSAGE_FIELD));
                });
    }

    private static Performable careers(String relationship, String lookingFor, String university, String interestedFor, String message) {
        return Task.where("{0} selects career",
        actor -> {
                actor.attemptsTo(
                        SelectFromOptions.byVisibleText(relationship).from(RELATIONSHIP));
                if(lookingFor.equalsIgnoreCase("graduate")) {
                    actor.attemptsTo(
                            SelectFromOptions.byVisibleText(lookingFor).from(LOOKING_FOR_SELECT),
                            Enter.theValue(university).into(UNIVERSITY_NAME_FIELD),
                            Enter.theValue(interestedFor).into(INTERESTED_FOR_FIELD));
                } else if(lookingFor.equalsIgnoreCase("internship")) {
                    actor.attemptsTo(
                            Enter.theValue(interestedFor).into(INTERESTED_FOR_FIELD));
                } else if(lookingFor.equalsIgnoreCase("experience professional")) {
                    actor.attemptsTo(
                            Enter.theValue(interestedFor).into(INTERESTED_FOR_FIELD));
                } else if(lookingFor.equalsIgnoreCase("other")) {
                    actor.attemptsTo(
                            Enter.theValue(message).into(MESSAGE_FIELD));
                }
        });
    }
}
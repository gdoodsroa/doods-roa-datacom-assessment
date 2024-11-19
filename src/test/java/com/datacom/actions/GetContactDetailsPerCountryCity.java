package com.datacom.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.datacom.pages.ContactUsPage.*;

public class GetContactDetailsPerCountryCity implements Task {

    String country, city, country1;

    @Step("{0} search for contact information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OUR_LOCATIONS));
        if (country.equalsIgnoreCase("New Zealand")) {
            actor.attemptsTo(
                    Click.on(NEW_ZEALAND_TAB),
                    selectNewZealandCityDetails(city));
        } else if (country.equalsIgnoreCase("Australia")) {
            actor.attemptsTo(
                    Click.on(AUSTRALIA_TAB),
                    selectAustraliaCityDetails(city));
        } else if (country.equalsIgnoreCase("ASIA")) {
            actor.attemptsTo(
                    Click.on(ASIA_TAB),
                    selectAsiaCityDetails(country1));
        }
    }

    public static GetContactDetailsPerCountryCity sessionWith (String country, String city, String country1) {
        return Tasks.instrumented(GetContactDetailsPerCountryCity.class, country, city, country1);
    }

    public static Performable selectNewZealandCityDetails(String city) {
        return Task.where("{0} selects a city",
        actor -> {
                if(city.equalsIgnoreCase("Auckland")) {
                    actor.attemptsTo(
                            Click.on(AUCKLAND_CONTACT));
                } else if (city.equalsIgnoreCase("Christchurch")) {
                    actor.attemptsTo(
                            Click.on(CHRISTCHURCH_CONTACT));
                } else if (city.equalsIgnoreCase("Dunedin")) {
                    actor.attemptsTo(
                            Click.on(DUNEDIN_CONTACT));
                } else if (city.equalsIgnoreCase("Hamilton")) {
                    actor.attemptsTo(
                            Click.on(HAMILTON_CONTACT));
                } else if (city.equalsIgnoreCase("Hastings")) {
                    actor.attemptsTo(
                            Click.on(HASTINGS_CONTACT));
                } else if (city.equalsIgnoreCase("Nelson")) {
                    actor.attemptsTo(
                            Click.on(NELSON_CONTACT));
                } else if (city.equalsIgnoreCase("New Plymouth")) {
                    actor.attemptsTo(
                            Click.on(NEW_PLYMOUTH_CONTACT));
                } else if (city.equalsIgnoreCase("Roturua")) {
                    actor.attemptsTo(
                            Click.on(ROTORUA_CONTACT));
                } else if (city.equalsIgnoreCase("Tauranga")) {
                    actor.attemptsTo(
                            Click.on(TAURANGA_CONTACT));
                } else if (city.equalsIgnoreCase("Wellington")) {
                    actor.attemptsTo(
                            Click.on(WELLINGTON_CONTACT));
                }
        });
    }

    public static Performable selectAustraliaCityDetails(String city) {
        return Task.where("{0} selects a city",
                actor -> {
                    if(city.equalsIgnoreCase("Adelaide")) {
                        actor.attemptsTo(
                                Click.on(ADELAIDE_CONTACT));
                    } else if (city.equalsIgnoreCase("Brisbane")) {
                        actor.attemptsTo(
                                Click.on(BRISBANE_CONTACT));
                    } else if (city.equalsIgnoreCase("Canberra")) {
                        actor.attemptsTo(
                                Click.on(CANBERRA_CONTACT));
                    } else if (city.equalsIgnoreCase("Melbourne")) {
                        actor.attemptsTo(
                                Click.on(MELBOURNE_CONTACT));
                    } else if (city.equalsIgnoreCase("Modbury")) {
                        actor.attemptsTo(
                                Click.on(MODBURY_CONTACT));
                    } else if (city.equalsIgnoreCase("Perth")) {
                        actor.attemptsTo(
                                Click.on(PERTH_CONTACT));
                    } else if (city.equalsIgnoreCase("Sydney")) {
                        actor.attemptsTo(
                                Click.on(SYDNEY_CONTACT));
                    } else if (city.equalsIgnoreCase("Townsville")) {
                        actor.attemptsTo(
                                Click.on(TOWNSVILLE_CONTACT));
                    }
                });
    }

    public static Performable selectAsiaCityDetails(String country1) {
        return Task.where("{0} selects a city",
                actor -> {
                    if(country1.equalsIgnoreCase("Malaysia")) {
                        actor.attemptsTo(
                                Click.on(MALAYSIA_CONTACT));
                    } else if (country1.equalsIgnoreCase("Philippines")) {
                        actor.attemptsTo(
                                Click.on(PHILIPPINES_CONTACT));
                    } else if (country1.equalsIgnoreCase("Singapore")) {
                        actor.attemptsTo(
                                Click.on(SINGAPORE_CONTACT));
                    }
                });
    }
}

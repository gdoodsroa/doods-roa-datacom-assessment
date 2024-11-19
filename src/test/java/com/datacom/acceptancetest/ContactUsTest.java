package com.datacom.acceptancetest;

import com.datacom.actions.Navigate;
import com.datacom.actions.SubmitInquiryUsingContactUs;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.when;

@ExtendWith(SerenityJUnit5Extension.class)
public class ContactUsTest {

    @CastMember
    Actor customer;

    @ParameterizedTest
    @DisplayName("Should be able to submit using contact us")
    @CsvSource( useHeadersInDisplayName = false,
            value = {"John, Doe, johndoe@mail.com, 1234567, hr, google, Australia, careers, , , , graduate, australia university, looking for a job"})
    public void happyPath(String firstName, String lastName, String email, String phone, String jobTitle,
                          String company, String country, String how, String message, String relationship, String product,
                          String solution, String lookingFor, String university, String interestedFor) {
        givenThat(customer).attemptsTo(Navigate.goToContactPage());

        when(customer).attemptsTo(
                SubmitInquiryUsingContactUs.sessionWith(firstName, lastName, email, phone, jobTitle, company, country, how, message, relationship,
                        product, solution, lookingFor, university, interestedFor)
        );
    }
}

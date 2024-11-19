package com.datacom.pages;

import net.serenitybdd.annotations.DefaultUrl;
import com.datacom.constants.BaseUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl(BaseUrl.DATACOM_CONTACT_US)
public class ContactUsPage extends PageObject {

    //MAIN TABS
    public static By OUR_LOCATIONS = By.xpath("//a[contains(text(), 'Our locations')]");
    public static By GET_IN_TOUCH = By.xpath("//a[contains(text(), 'Get in touch')]");
    public static By MEDIA_PACK = By.xpath("//a[contains(text(), 'Media pack')]");

    //CONTACT US BTN
    public static By CONTACT_US = By.xpath("//a[contains(text(), 'Contact us')]");
    public static By FIRST_NAME_FIELD = By.xpath("//*[@id='FirstName']");
    public static By LAST_NAME_FIELD = By.xpath("//*[@id='LastName']");
    public static By BUSINESS_EMAIL_FIELD = By.xpath("//*[@id='Email']");
    public static By PHONE_NUMBER_FIELD = By.xpath("//*[@id='Phone']");
    public static By JOB_TITLE_FIELD = By.xpath("//*[@id='Title']");
    public static By COMPANY_NAME_FIELD = By.xpath("//*[@id='Company']");
    public static By COUNTRY_FIELD = By.xpath("//*[@id='Country']");
    public static By HOW_HELP_FIELD = By.xpath("//*[@id='custom5']");
    public static By MESSAGE_FIELD = By.xpath("How_can_we_help__c");

    //PAYROLL SUPPORT
    public static By RELATIONSHIP = By.xpath("//*[@id='custom4']");
    public static By PRODUCT_SELECT = By.xpath("//*[@id='custom1']");
    public static By COMPANY_CODE = By.xpath("//*[@id='custom3']");

    //CONSULT WITH AN EXPERT
    public static By SOLUTION_SELECT = By.xpath("//*[@id='Enquiry__c']");

    //CAREERS
    public static By LOOKING_FOR_SELECT = By.xpath("//*[@id='custom5']");
    public static By UNIVERSITY_NAME_FIELD = By.xpath("//*[@id='custom6']");
    public static By INTERESTED_FOR_FIELD = By.xpath("//*[@id='custom7']");

    //COUNTRIES
    public static By NEW_ZEALAND_TAB = By.xpath("//li[contains(text(), 'New Zealand')]");
    public static By AUSTRALIA_TAB = By.xpath("//li[contains(text(), 'Australia')]");
    public static By ASIA_TAB = By.xpath("//li[contains(text(), 'Asia')]");

    //NEW ZEALAND - CITIES
    public static By AUCKLAND_CONTACT = By.xpath("//div[contains(text(), 'Auckland')]");
    public static By CHRISTCHURCH_CONTACT = By.xpath("//div[contains(text(), 'Christchurch')]");
    public static By DUNEDIN_CONTACT = By.xpath("//div[contains(text(), 'Dunedin')]");
    public static By HAMILTON_CONTACT = By.xpath("//div[contains(text(), 'Hamilton')]");
    public static By HASTINGS_CONTACT = By.xpath("//div[contains(text(), 'Hastings')]");
    public static By NELSON_CONTACT = By.xpath("//div[contains(text(), 'Nelson')]");
    public static By NEW_PLYMOUTH_CONTACT = By.xpath("//div[contains(text(), 'New Plymouth ')]");
    public static By ROTORUA_CONTACT = By.xpath("//div[contains(text(), 'Rotorua')]");
    public static By TAURANGA_CONTACT = By.xpath("//div[contains(text(), 'Tauranga')]");
    public static By WELLINGTON_CONTACT = By.xpath("//div[contains(text(), 'Wellington')]");

    //AUSTRALIA - CITIES
    public static By ADELAIDE_CONTACT = By.xpath("//div[contains(text(), 'Adelaide')]");
    public static By BRISBANE_CONTACT = By.xpath("//div[contains(text(), 'BRisbane')]");
    public static By CANBERRA_CONTACT = By.xpath("//div[contains(text(), 'Canberra')]");
    public static By MELBOURNE_CONTACT = By.xpath("//div[contains(text(), 'Melbourne')]");
    public static By MODBURY_CONTACT = By.xpath("//div[contains(text(), 'Modbury')]");
    public static By PERTH_CONTACT = By.xpath("//div[contains(text(), 'Perth')]");
    public static By SYDNEY_CONTACT = By.xpath("//div[contains(text(), 'Sydney')]");
    public static By TOWNSVILLE_CONTACT = By.xpath("//div[contains(text(), 'Townsville')]");

    //ASIA - CITIES
    public static By MALAYSIA_CONTACT = By.xpath("//div[contains(text(), 'Malaysia')]");
    public static By PHILIPPINES_CONTACT = By.xpath("//div[contains(text(), 'Philippines')]");
    public static By SINGAPORE_CONTACT = By.xpath("//div[contains(text(), 'Singapore')]");

    //GET IN TOUCH SECTION
    public static By GET_IN_TOUCH_MSG = By.xpath("/html/body/div[2]/div/div/div/div[4]/div/div/div[1]/div[1]/p/text()");

    //OUR MEDIA PACK
    public static By MEDIA_PACK_MSG = By.xpath("/html/body/div[2]/div/div/div/div[6]/div/div/div[1]/div[1]/p/text()");
}

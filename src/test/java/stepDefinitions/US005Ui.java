package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MustafaPage005;
import utilities.ConfigurationReader;
import utilities.Driver;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
public class US005Ui {
    MustafaPage005 mP = new MustafaPage005();
    Actions actions = new Actions(Driver.getDriver());
    static String appointmentMessage;

    @Given("MB Launch web browser and navigate to the home page")
    public void mb_launch_web_browser_and_navigate_to_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunnaUrl"));
    }


    @Given("MB Click the Make an Appointment button")
    public void mb_click_the_make_an_appointment_button() {
        Driver.waitAndClick(mP.makeAnAppointmentButton);
        Driver.wait(1);
    }


    @Then("MB Click First Name textbox and Enter First Name {string}")
    public void mb_click_first_name_textbox_and_enter_first_name(String mfirstname) {
        mP.lastNameInputBox.click();
        mP.firstNameInputBox.sendKeys(mfirstname);
    }

    @Then("MB Click the Last Name textbox and enter Last Name {string}")
    public void mb_click_the_last_name_textbox_and_enter_last_name(String mlastname) {
        mP.lastNameInputBox.click();
        mP.lastNameInputBox.sendKeys(mlastname);
    }


    @Then("MB Click the SSN textbox and enter SSN number {string}")
    public void mb_click_the_ssn_textbox_and_enter_ssn_number(String mssn) {
        mP.ssnInputBox.click();
        mP.ssnInputBox.sendKeys(mssn);
    }


    @Then("MB Click Email textbox and enter a valid Email address {string}")
    public void mb_click_email_textbox_and_enter_a_valid_email_address(String memail) {
        mP.emailInputBox.click();
        mP.emailInputBox.sendKeys(memail);
    }


    @Then("MB Click the Phone textbox and enter a valid Phone number {string}")
    public void mb_click_the_phone_textbox_and_enter_a_valid_phone_number(String mphone) {
        mP.phoneInputBox.click();
        mP.phoneInputBox.sendKeys(mphone);
    }


    @Then("MB Verify that user is using digits for Phone textbox")
    public void mb_verify_that_user_is_using_digits_for_phone_textbox() {
        Assert.assertEquals(0, mP.phoneInputBox.getAttribute("value").replaceAll("[\\d,-]", "").length());
    }

    @Then("MB Verify that this Phone textbox is not blank")
    public void mb_verify_that_this_phone_textbox_is_not_blank() {
        Assert.assertFalse(mP.phoneInputBox.getAttribute("value").isEmpty());
    }


    @Then("MB Click Send An Appointment Request button and verify appointment success message which contains Registration saved")
    public void mb_click_send_an_appointment_request_button_and_verify_appointment_success_message_which_contains_registration_saved() {
        mP.appointmentRequestButton.click();

        Driver.wait(1);

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(mP.savedToastContainer).perform();

        Assert.assertTrue(mP.savedToastContainer.getText().contains("saved"));

        Driver.wait(1);
    }
}

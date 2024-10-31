package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class US012 {

    HomePage homePage = new HomePage();

    @Given("user is on the home page :  {string}")
    public void userIsOnTheHomePage(String url) {
        Driver.getDriver().get(url);
    }

    @When("user clicks on user icon")
    public void user_clicks_on_user_icon() {
        homePage.userIcon.click();
    }

    @Then("user clicks on Sign In Button")
    public void user_clicks_on_sign_in_button() {
        homePage.signInOption.click();
    }

    @Then("user enters valid username {string} in username input")
    public void user_enters_valid_username_in_username_input(String username) {
        homePage.usernameInput.sendKeys(username);
    }

    @Then("user enters valid password {string} in password input")
    public void user_enters_valid_password_in_password_input(String password) {
        homePage.passwordInput.sendKeys(password);
    }

    @Then("user clicks on Remember Me checkbox")
    public void user_clicks_on_remember_me_checkbox() {
        homePage.rememberMeCheckbox.click();

    }

    @Then("user clicks on Sign In submit Button")
    public void user_clicks_on_sign_in_submit_button() {
        homePage.signInSubmitButton.click();
    }

    @Then("user clicks on My Pages")
    public void user_clicks_on_my_pages() {
        homePage.myPagesButton.click();
    }

    @Then("user clicks on My Appointments")
    public void user_clicks_on_my_appointments() {
        homePage.myAppointmentsButton.click();
    }

    @Then("user clicks on Edit button")
    public void user_clicks_on_edit_button() {

        homePage.editButton.click();
    }

    @Then("user verifies Create or Edit an Appointment text is visible")
    public void userVerifiesCreateOrEditAnAppointmentTextIsVisible() {
        assertTrue(homePage.createOrEditAnAppointmentText.isDisplayed());
    }


    @Then("user verifies patient id is visible")
    public void userVerifiesPatientIdIsVisible() {
        assertTrue(homePage.appointmentId.isDisplayed());
    }

    @Then("user verifies start date is visible")
    public void userVerifiesStartDateIsVisible() {
        assertTrue(homePage.appointmentStartDate.isDisplayed());
    }

    @Then("user verifies end date is visible")
    public void userVerifiesEndDateIsVisible() {
        assertTrue(homePage.appointmentEndDate.isDisplayed());
    }

    @Then("user verifies status is visible")
    public void userVerifiesStatusIsVisible() {
        assertTrue(homePage.appointmentStatus.isDisplayed());
    }

    @Then("user verifies physician is visible")
    public void userVerifiesPhysicianIsVisible() {
        assertTrue(homePage.appointmentPhysician.isDisplayed());
    }


    @And("user fills in Anamnesis field with {string}")
    public void userFillsInAnamnesisFieldWith(String text) {
       homePage.appointmentAnamnesis.clear();
        homePage.appointmentAnamnesis.sendKeys(text);
    }


    @And("user fills in Treatments field with {string}")
    public void userFillsInTreatmentsFieldWith(String text) {
        homePage.appointmentTreatment.clear();
        homePage.appointmentTreatment.sendKeys(text);
    }


    @And("user fills in Diagnosis field with {string}")
    public void userFillsInDiagnosisFieldWith(String text) {
        homePage.appointmentDiagnosis.clear();
        homePage.appointmentDiagnosis.sendKeys(text);
    }


    @And("user clicks on save button")
    public void userClicksOnSaveButton() {
        homePage.saveButton.submit();
    }

    @And("user verifies Anamnesis text which is written by user is visible")
    public void userVerifiesAnamnesisTextWhichIsWrittenByUserIsVisible() {
        assertTrue(homePage.anamnesisText.isDisplayed());
    }

    @And("user verifies Treatments text which is written by user is visible")
    public void userVerifiesTreatmentsTextWhichIsWrittenByUserIsVisible() {
        assertTrue(homePage.treatmentText.isDisplayed());
    }

    @And("user verifies Diagnosis text which is written by user is visible")
    public void userVerifiesDiagnosisTextWhichIsWrittenByUserIsVisible() {
        assertTrue(homePage.diagnosisText.isDisplayed());
    }


    @Then("user verifies appointment is saved with Appointments text is visible.")
    public void userVerifiesAppointmentIsSavedWithAppointmentsTextIsVisible() {
        assertTrue(homePage.appointmentHeading.isDisplayed());
    }

    @And("user does not fill Diagnosis field")
    public void userDoesNotFillDiagnosisField() {
        homePage.appointmentDiagnosis.clear();
    }

    @Then("user verifies {string} text is visible.")
    public void userVerifiesTextIsVisible(String string) {
        assertTrue(homePage.thisFieldIsRequiredText.isDisplayed());
    }


    @And("user fills Prescription field with {string}")
    public void userFillsPrescriptionFieldWith(String prescription) {
        homePage.appointmentPrescription.clear();
        homePage.appointmentPrescription.sendKeys(prescription);
    }

    @And("user fills Description field with {string}")
    public void userFillsDescriptionFieldWith(String description) {
        homePage.appointmentDescription.clear();
        homePage.appointmentDescription.sendKeys(description);
    }


    @And("user does not fill Prescription field")
    public void userDoesNotFillPrescriptionField() {
      homePage.appointmentPrescription.clear();
    }

    @And("user does not fill Description field")
    public void userDoesNotFillDescriptionField() {
       homePage.appointmentDescription.clear();
    }


    @And("User selects status as {string}")
    public void userSelectsStatusAs(String status) {

        Select select = new Select(homePage.appointmentStatus);
        select.selectByVisibleText(status);
    }

    @Then("user verifies status is {string}")
    public void userVerifiesStatusIs(String status) {
        assertTrue(homePage.statusText.getText().equals(status));
    }


    @Then("user closes the page")
    public void userClosesThePage() {
        Driver.closeDriver();
    }


    @And("user verifies {string} is selectable.")
    public void userVerifiesIsSelectable(String arg0) {
        homePage.appointmentStatus.click();
        assertTrue(homePage.statusPending.isEnabled());
        assertTrue(homePage.statusCancelled.isEnabled());
        Select select = new Select(homePage.appointmentStatus);
        select.selectByVisibleText("COMPLETED");
    }


    @And("user verifies {string} is not selectable.")
    public void userVerifiesIsNotSelectable(String arg0) {
        homePage.appointmentStatus.click();
        assertFalse(homePage.statusUnapproved.isEnabled());
        Select select = new Select(homePage.appointmentStatus);
        select.selectByVisibleText("COMPLETED");
    }

    @And("user does not fill in Treatments field")
    public void userDoesNotFillInTreatmentsField() {
      homePage.appointmentTreatment.clear();
    }

    @And("user does not fill Anamnesis field.")
    public void userDoesNotFillAnamnesisField() {
        homePage.appointmentAnamnesis.clear();
    }

    @And("user clicks on {string} button")
    public void userClicksOnButton(String status) {

        Select select = new Select(homePage.appointmentStatus);
        if(status.equals(status)) {
            homePage.statusCompleted.click();
        } if(status.equals(status)) {
            homePage.statusCancelled.click();
        }if(status.equals(status)) {
            homePage.statusPending.click();
        }if(status.equals(status)) {
            homePage.statusPending.click();
        }

    }


}

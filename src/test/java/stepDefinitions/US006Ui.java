package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MustafaPage006;
import utilities.Driver;

public class US006Ui {

    MustafaPage006 kP = new  MustafaPage006();

    @Given("MKT user click the left top user sign in button")
    public void mkt_user_click_the_left_top_user_sign_in_button() {
        Driver.waitAndClick(kP.accountMenuIcon);
        Driver.waitAndClick(kP.dropdownSignInButton);
        Driver.wait(3);

    }
    @Then("MKT user inputs his or her {string} to username")
    public void mktUserInputsHisOrHerToUsername(String username) {
        Driver.waitAndClick(kP.signInUsernameTextBox);
        kP.signInUsernameTextBox.clear();
        kP.signInUsernameTextBox.sendKeys(username);
    }

    @And("MKT user inputs his or her {string} to password")
    public void mktUserInputsHisOrHerToPassword(String password) {
        Driver.waitAndClick(kP.signInPasswordTextBox);
        kP.signInPasswordTextBox.clear();
        kP.signInPasswordTextBox.sendKeys(password);
    }

    @Then("MKT user click the Sign in button")
    public void mkt_user_click_the_sign_in_button() {
        Driver.waitAndClick(kP.submitButton);
        Driver.wait(2);

    }
    @Then("MKT user click the top left the button that have same name with username")
    public void mkt_user_click_the_top_left_the_button_that_have_same_name_with_username() {
        kP.accountMenu.click();
        Driver.wait(2);

    }
    @Then("MKT user click settings at dropdown window")
    public void mkt_user_click_settings_at_dropdown_window() {
        kP.accountSettings.click();
    }
    @Then("MKT user click firstname textbox")
    public void mkt_user_click_firstname_textbox() {
        Driver.waitAndClick(kP.firstNameTextBox);
    }
    @Then("MKT user clear firstname textbox")
    public void mkt_user_clear_firstname_textbox() {
        kP.firstNameTextBox.clear();
    }
    @Then("MKT user input {string} in firstname textbox")
    public void mkt_user_input_in_firstname_textbox(String firstName) {
        kP.firstNameTextBox.sendKeys(firstName);
    }
    @Then("MKT user clicks save button")
    public void mkt_user_clicks_save_button() {
        Driver.waitAndClick(kP.submitButton);
    }
    @Then("MKT user click signout button in dropdown page")
    public void mkt_user_click_signout_button_in_dropdown_page() {
        Driver.waitAndClick(kP.dropdownSignOutButton);
    }
    @Then("MKT verify firstname textbox has {string} value")
    public void mkt_verify_firstname_textbox_has_value(String firstName) {
        String expectedFirstNameValue = kP.firstNameTextBox.getAttribute("value");
        System.out.println("expectedFirstNameValue = " + expectedFirstNameValue);
        Assert.assertEquals(firstName,expectedFirstNameValue);

    }
}

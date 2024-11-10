package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.MustafaPage004;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.time.Duration;

public class US004Ui {

    MustafaPage004 cP = new MustafaPage004();

    @Given("C navigate to Medduna Home Page")
    public void c_navigate_to_medduna_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunnaUrl"));
    }

    @When("C Verify that home page is visible successfully")
    public void c_verify_that_home_page_is_visible_successfully() {
        Driver.waitForVisibility(cP.mainPageLogo, 5);
    }

    @When("C Click on Account DropDownMenu button")
    public void c_click_on_account_drop_down_menu_button() {
        Driver.wait(3);
        Driver.waitAndClick(cP.dropDownmenu);
    }

    @When("C Click on Sign in")
    public void c_click_on_sign_in() {
        Driver.wait(1);
        Driver.waitAndClick(cP.signIn);
        Driver.wait(1);
    }

    @When("C Click on Username input box.")
    public void c_click_on_username_input_box() {
        Driver.wait(1);
        Driver.waitAndClick(cP.userNameInputBox);
        Driver.wait(1);
    }

    @Then("C Enter Valid {string} Username")
    public void cEnterValidUsername(String username) {
        cP.userNameInputBox.sendKeys(username);
    }

    @Then("C Click on Password input box.")
    public void c_click_on_password_input_box() {
        Driver.wait(1);
        cP.userNameInputBox.sendKeys(Keys.TAB);
        Driver.wait(1);
    }

    @Then("C Enter Valid {string} Password")
    public void cEnterValidPassword(String pasw) {
        cP.passwordInputBox.sendKeys(pasw);
        Driver.wait(1);
    }

    @Then("C Click on Sign in button")
    public void cClickOnSignInButton() {
        Driver.waitAndClick(cP.signInButton);
        Driver.wait(3);
    }

    @And("Verify that Sign Out  is displayed")
    public void verifyThatSignOutIsDisplayed() {

        Assert.assertTrue(cP.welcomeAfterAdminSign.getText().equalsIgnoreCase("Welcome to MEDUNNA"));
    }
}

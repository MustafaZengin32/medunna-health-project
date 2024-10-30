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

    @And("Verify that Sign Out  is displayed")
    public void verifyThatSignOutIsDisplayed() {
        Driver.waitAndClick(cP.accountName);
        Driver.wait(1);
        Assert.assertTrue(cP.signOut.isDisplayed());
    }

    @And("C Verify Sign in page header is visible")
    public void cVerifySignInPageHeaderIsVisible() {
        Assert.assertTrue(cP.signInHeader.isDisplayed());
        Driver.wait(1);
    }

    @And("C Verify Sign in Header is visible")
    public void cVerifySignInHeaderIsVisible() {
        Driver.waitForVisibility(cP.signInHeader, 3);
    }

    @Then("C Click on Sign in button")
    public void cClickOnSignInButton() {
        Driver.waitAndClick(cP.signInButton);
        Driver.wait(3);
    }

    @Then("C Verify that Cancel button is enable")
    public void cVerifyThatCancelButtonIsEnable() {
        Assert.assertTrue(cP.cancelButton.isEnabled());
    }

    @And("C Verify that remember me checkbox is clickable")
    public void cVerifyThatRememberMeCheckoutIsClickable() {
        cP.rememberMeCheckbox.click();
        Assert.assertTrue(cP.rememberMeCheckbox.isSelected());
        Driver.wait(3);
    }

    @And("C Click on Did you forget your password? text box")
    public void cClickOnDidYouForgetYourPasswordTextBox() {
        cP.didYouForgetYourPassword.click();
        Driver.wait(3);
        cP.didYouForgetYourPassword.click();
    }

    @And("C Verify that Did you forget your password? Header is visible")
    public void cVerifyThatDidYouForgetYourPasswordHeaderIsVisible() {
        Assert.assertTrue(cP.container.isDisplayed());
    }

    @And("C Click on email text box")
    public void cClickOnEmailTextBox() {
        cP.emailInputBox.sendKeys(Keys.ENTER);
    }

    @And("C Enter the {string} address you used to register")
    public void cEnterTheAddressYouUsedToRegister(String email) {
        cP.emailInputBox.sendKeys(email);
        cP.emailInputBox.sendKeys(Keys.TAB);
    }

    @And("C Click on Reset password button")
    public void cClickOnResetPasswordButton() {
        Driver.wait(3);
        cP.resetYourPasswordButton.click();
        Driver.wait(3);
    }

    @And("C Verify Alert Check your emails for details on how to reset your password is visible")
    public void cVerifyAlertCheckYourEmailsForDetailsOnHowToResetYourPasswordIsVisible() {
        String toasterText = cP.toaster.getText();
        String expectedData = "Check your emails for details on how to reset your password.";
        Assert.assertEquals(expectedData, toasterText);
        //Assert.assertTrue(cemilePage.toaster.isDisplayed());
    }

    @And("C Verify You don't have an account yet? Register a new account is visible")
    public void cVerifyYouDonTHaveAnAccountYetRegisterANewAccountIsVisible() {
        Assert.assertTrue(cP.registerNewAccount.isDisplayed());
    }

    @And("C Click on Register a new account")
    public void cClickOnRegisterANewAccount() {

        cP.registerNewAccount.click();
        cP.registerNewAccount.click();
        Driver.wait(3);
    }

    @And("C Verify that Reset your password? Header is visible")
    public void cVerifyThatResetYourPasswordHeaderIsVisible() {
        Driver.wait(3);
        Assert.assertTrue(cP.resetYourPasswordHeader.isDisplayed());
    }

    @And("C Verify that  Registration Page is visible")
    public void cVerifyThatRegistrationPageIsVisible() {

        Assert.assertTrue(cP.registrationPage.isDisplayed());
    }

    @And("Verify that Failed to sign in!  is displayed")
    public void verifyThatFailedToSignInIsDisplayed() {
        String toasterText = cP.containerDidYouForget.getText();
        String expectedData = "Authentication information not correct.";
        Assert.assertEquals(expectedData, toasterText);

    }





    @Then("C Enter wrong {string} Password")
    public void cEnterWrongPassword(String wpassword) {
        cP.passwordInputBox.sendKeys(wpassword);
        Driver.wait(1);
    }

    @Then("C Enter wrong {string} Username")
    public void cEnterWrongUsername(String wusername) {
        cP.userNameInputBox.sendKeys(wusername);
        Driver.wait(1);
    }

    @Then("Verify that Authentication information not correct  is displayed")
    public void verifyThatAuthenticationInformationNotCorrectIsDisplayed() {
        String toasterText = cP.containerDidYouForget.getText();
        String expectedData = "Authentication information not correct.";
        Assert.assertEquals(expectedData, toasterText);
    }
}

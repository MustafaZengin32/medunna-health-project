package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MustafaPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US001 {

    MustafaPage page =new MustafaPage();

    @Given("MKT user enter the mainpage")
    public void mktUserEnterTheMainpage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("medunnaUrl"));
    }


    @And("MKT user click the top user button")
    public void mktUserClickTheTopUserButton() {

        page.accountMenuIcon.click();


    }

    @Then("MKT user click the register button")
    public void mktUserClickTheRegisterButton() {

        page.dropdownRegisterButton.click();
    }

    @And("MKT user click SSN textbox")
    public void mktUserClickSSNTextbox() {
        page.registerSSNTextBox.click();
    }

    @Then("MKT user input  {string} number in SSN textbox")
    public void mktUserInputNumberInSSNTextbox(String invalidSSN) {
        page.registerSSNTextBox.sendKeys(invalidSSN);
    }

    @And("MKT user click the First Name textbox")
    public void mktUserClickTheFirstNameTextbox() {
        page.firstNameTextBox.click();
    }

    @And("MKT verify that {string} text appears")
    public void mktVerifyThatTextAppears(String expectedOutput) {

        String actualOutput = page.registerSSNInvalidFeedbackText.getText();
        Assert.assertEquals(expectedOutput,actualOutput);
    }
}

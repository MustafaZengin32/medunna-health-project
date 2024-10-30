package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MustafaPage009;
import utilities.ConfigurationReader;
import utilities.Driver;
public class US009Ui {


   MustafaPage009 bP = new MustafaPage009();


    @Given("BT  Go to main page")
    public void bt_go_to_https_medunna_com() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunnaUrl"));

    }

    @Given("BT  Click the human icon to Sign")
    public void bt_click_the_human_icon_to_sign_in_register() {
        bP.firstLogin.click();

    }

    @Given("BT  Select {string} from drop down menu and click")
    public void bt_select_from_drop_down_menu_and_click(String string) {
        bP.signIn.click();

    }

    @Given("BT  Enter User name and password")
    public void bt_enter_user_name_and_password() {
        bP.userName.sendKeys(ConfigurationReader.getProperty("btusernamestaff"));
        bP.password.sendKeys(ConfigurationReader.getProperty("btpassword"));
        bP.signIn2.click();
    }

    @Given("BT  verify that {string} text appears")
    public void bt_verify_that_text_appears(String string) {
        Driver.waitForVisibility(bP.MypagesText, 5);

        Assert.assertTrue(bP.MypagesText.isDisplayed());

    }


    @Given("bt_ Click the {string}")
    public void bt_click_the(String string) {

    }

    @Given("bt_Send {int}-{int}-{int} to SSN nummer")
    public void bt_send_to_ssn_nummer(Integer int1, Integer int2, Integer int3) {

    }

    @Given("bt_verift that {string} text")
    public void bt_verift_that_text(String string) {





    }
    @Given("bt_ Click the {string} and see patient")
    public void bt_click_the_and_see_patient(String string) {
        Driver.waitAndClick(bP.MypagesText);


    }
    @Given("bt_Send {string} to SSN nummer")
    public void bt_send_to_ssn_nummer(String string) {
        bP.SearchPatient.click();
        bP.PatientSSN.click();
        bP.PatientSSN.sendKeys(ConfigurationReader.getProperty("btSSN_nummerPatient"));

    }

    @And("bt_verift that showing first name and text")
    public void bt_veriftThatShowingFirstNameAndText() {
        Driver.waitForVisibility(bP.FirstName,5);
        Assert.assertTrue(bP.FirstName.isDisplayed());
    }

    @Then("Bt  Click the Edit")
    public void bt_click_the_edit() {


    }
    @Then("Bt  go til adress og write from faker")
    public void bt_go_til_adress_og_write_from_faker() {


    }
    @Then("Bt  write Norway to country")
    public void bt_write_norway_to_country() {


    }
    @Then("Bt  click to edit")
    public void bt_click_to_edit() {

        System.out.println("deneme1");
    }


    @And("Bt  verify that Create or edit a Patient text appears")
    public void btVerifyThatCreateOrEditAPatientTextAppears() {


    }


}

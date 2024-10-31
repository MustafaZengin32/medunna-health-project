package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MustafaPage0010;
import utilities.Driver;
import java.io.IOException;

import static stepDefinitions.US0011.getScreenshot;

public class US0010Ui {

   MustafaPage0010 Sp =new  MustafaPage0010();

    @And("S user asserts the visibility of the appointment table")
    public void userAssertsTheVisibilityOfTheAppointmentTable() throws IOException, InterruptedException {
        Thread.sleep(7000);
        getScreenshot("appointment table");
    }

    @Then("S user asserts the visibility of time slot_from")
    public void s_user_asserts_the_visibility_of_time_slot_from() {
        Driver.waitForVisibility(Sp.timeSlotFrom,5);
        Sp.timeSlotFrom.isDisplayed();

    }
    @Then("S user asserts the visibility of time slot_to")
    public void s_user_asserts_the_visibility_of_time_slot_to() {
        Driver.waitForVisibility(Sp.timeSlotTo,5);
        Sp.timeSlotTo.isDisplayed();
    }


    @Then("S user asserts the id of the patient")
    public void s_user_asserts_the_id_of_the_patient() throws InterruptedException {
        String expectedId="49681";
        Thread.sleep(8000);
        String rowData= Sp.satirYazdir().getText();
        Assert.assertTrue(rowData.contains(expectedId));

    }
    @Then("S user asserts start date of the appointment")
    public void s_user_asserts_start_date_of_the_appointment() {
        String expectedStartDate= "04/04/22 02:00";
        String rowData= Sp.satirYazdir().getText();
        Assert.assertTrue(rowData.contains(expectedStartDate));

    }
    @Then("S user asserts end date of the appointment")
    public void s_user_asserts_end_date_of_the_appointment() {
        String expectedEndDate= "04/04/22 03:00";
        String rowData= Sp.satirYazdir().getText();
        Assert.assertTrue(rowData.contains(expectedEndDate));
    }
    @Then("S user asserts the status of the appointment")
    public void s_user_asserts_the_status_of_the_appointment() {
        String expectedStatus="UNAPPROVED";
        String rowData= Sp.satirYazdir().getText();
        Assert.assertTrue(rowData.contains(expectedStatus));
    }




}

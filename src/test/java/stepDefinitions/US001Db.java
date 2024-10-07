package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.HashMap;
import java.util.Map;

import static utilities.ReadText.readAllRegistrantInDBDataMap;
import static utilities.WriteToTxt.saveRegistrantDataDB;

public class US001Db {

    Map<String, Object> registrantMap = new HashMap<String, Object>();
    @Given("MKT user creates a connection with db")
    public void mktUserCreatesAConnectionWithDb() {

        DBUtils.createConnection();
    }

    @And("MKT user sends the query to db and gets the user data with ssn number {string}")
    public void mktUserSendsTheQueryToDbAndGetsTheUserDataWithSsnNumber(String ssn) {

        String query = "select * from jhi_user where ssn=\'" + ssn + "\'";
        registrantMap.putAll(DBUtils.getRowMap(query));
        System.out.println("registrantMap = " + registrantMap);
    }

    @Then("MKT validates db registrant data  {string}")
    public void mktValidatesDbRegistrantData(String ssn) {

        Map<String, Object>expectedData = new HashMap<String, Object>();
        expectedData.put("ssn", ssn);
        try {
            readAllRegistrantInDBDataMap(expectedData);
            saveRegistrantDataDB(registrantMap);
        }catch (Exception e) {
            System.out.println("data is already in the list");
        }
        Assert.assertTrue(registrantMap.entrySet().containsAll(expectedData.entrySet()));


    }
}

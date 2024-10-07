package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US001 {
    @Given("MKT user enter the mainpage")
    public void mktUserEnterTheMainpage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("medunnaUrl"));
    }


}

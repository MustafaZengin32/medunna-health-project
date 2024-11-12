package stepDefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojo.RegistrationPostPojo;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.AdminAuthenticationMedunna.generateTokenForAdmin;

public class US001Api {
    Faker faker = new Faker();
    RegistrationPostPojo expectedData;
    RegistrationPostPojo actualData;
    Response response;
    String username = faker.name().username();
    String name = faker.name().firstName();
    String lastName = faker.name().lastName();
    String ssn = faker.idNumber().ssnValid();
    String email = faker.internet().emailAddress();
    String password = faker.internet().password();

    @Given("send post request to {string} to create register")
    public void send_post_request_to_create_register(String endPoint) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("string");

        expectedData = new RegistrationPostPojo(
                true, arrayList, "string", "2023-02-23T19:29:41.427Z", email, name, "string", "string", "string",
                "2023-02-23T19:29:41.428Z", lastName, username, password, ssn);

        response = given()
                .when()
                .contentType(ContentType.JSON)
                .body(expectedData)
                .headers("Authorization", "Bearer " + generateTokenForAdmin())
                .post(endPoint);

      response.prettyPrint();

      assertEquals(201, response.getStatusCode());
    }

    @Then("verifying all")
    public void verifying_all() throws JsonProcessingException {


        actualData = new ObjectMapper().readValue(response.asString(), RegistrationPostPojo.class);


        assertEquals(expectedData.getFirstName(), actualData.getFirstName());
        assertEquals(expectedData.getLastName(), actualData.getLastName());
        assertEquals(expectedData.getSsn(), actualData.getSsn());
        assertEquals(expectedData.getEmail(), actualData.getEmail());
        assertEquals(expectedData.getLogin(), actualData.getLogin());
    }

}
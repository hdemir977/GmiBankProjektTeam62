package gmiBank.com.stepDefinitions;

import gmiBank.com.utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;


import static io.restassured.RestAssured.given;

public class US_027_StepDefs {

    Response response;

    @Given("delete a state using api end point {string} and its extension {string}")
    public void deleteAStateUsingApiEndPointAndItsExtension(String endpoint, String id) {

        response=given().headers("Authorization",
                "Bearer "+ ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .delete(endpoint+id)
                .then()
                .extract()
                .response();

    }

    @Then("user validates if state deleted using {string}")
    public void userValidatesIfStateDeleted(String id) {

        response=given().headers("Authorization",
                "Bearer "+ ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get("https://www.gmibank.com/api/tp-states")
                .then().contentType(ContentType.JSON)
                .extract()
                .response();


        JsonPath jsonPath=response.jsonPath();
        String ids= jsonPath.getString("id");
        Assert.assertFalse("state did not delete", ids.contains(id));

        System.out.println("delete was succesfull");



    }
}
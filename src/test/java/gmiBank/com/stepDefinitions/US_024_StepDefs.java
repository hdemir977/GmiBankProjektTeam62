package gmiBank.com.stepDefinitions;
import gmiBank.com.utilities.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;


import java.util.List;

import static gmiBank.com.jsonModels.StateJson.CreateState1;
import static io.restassured.RestAssured.given;


public class US_024_StepDefs {

    Response response;
    Response response1;

    Integer createdStateId;
    String createdStateName;


    @Given("User can Just create each state one by one using {string}")
    public void userCanJustCreateEachStateOneByOneUsing(String api_end_point_states) {

        response=given().headers("Authorization",
                "Bearer "+ ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .body(CreateState1)  // kalip olarak bu modeli kullandik,
                .post(ConfigReader.getProperty(api_end_point_states))
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        response.prettyPrint();

        JsonPath jsonPath=response.jsonPath();
        createdStateId=jsonPath.getInt("id");
        System.out.println(createdStateId);
        createdStateName= jsonPath.getString("name");
        System.out.println(createdStateName);


    }

    @And("user verify if state created {string}")
    public void userVerifyIfStateCreated(String api_end_point_states) {

        response1 = given().headers(
                "Authorization",
                "Bearer " + ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(ConfigReader.getProperty(api_end_point_states))
                .then().
                        contentType(ContentType.JSON)
                .extract()
                .response();
        response1.prettyPrint();


    }

    @And("user assert the new state if created")
    public void userAssertTheNewStateIfCreated() {

        JsonPath jsonPath=response1.jsonPath();

        System.out.println("==================***** ===============");
        String actualStateName=jsonPath.getString("name"); //  unique
        String[] states=actualStateName.split(" ");
        System.out.println(states.length);
        System.out.println("=====================================================");
        System.out.println(actualStateName);

        String actualStateId=jsonPath.getString("id");
        System.out.println("================");
        System.out.println(actualStateId);

        Assert.assertTrue(actualStateName.contains(createdStateName));

        System.out.println("state creation is succesfull");

    }
}
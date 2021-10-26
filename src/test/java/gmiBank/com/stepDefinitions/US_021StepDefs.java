package gmiBank.com.stepDefinitions;

import gmiBank.com.utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.json.JSONPropertyIgnore;

import static io.restassured.RestAssured.given;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US_021StepDefs {


    Response response;

    @Given("Read all countries you created and validate them from your data set {string}")
    public void readAllCountriesYouCreatedAndValidateThemFromYourDataSet(String endpoint_countries) {

        response = given().headers(
                "Authorization",
                "Bearer " + ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(ConfigReader.getProperty(endpoint_countries))
                .then().
                        contentType(ContentType.JSON)
                .extract()
                .response();
        response.prettyPrint();

    }

    @Then("Read all countries you created and validate them one by one")
    public void readAllCountriesYouCreatedAndValidateThemBy() {


    }
}


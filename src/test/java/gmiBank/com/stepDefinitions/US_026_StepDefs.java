package gmiBank.com.stepDefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmiBank.com.pojos.Customer6;
import gmiBank.com.utilities.ConfigReader;
import gmiBank.com.utilities.ReadTxtUS20;
import gmiBank.com.utilities.WriteToTxtUS20;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import static gmiBank.com.jsonModels.CountryJson.createCountry;
import static gmiBank.com.jsonModels.CountryJson.createCountry2;
import static io.restassured.RestAssured.given;

public class US_026_StepDefs {

    FileInputStream fileInputStream;
    FileOutputStream fileOutputStream;
    Properties properties;
    Response response;
    String token;
    List<Object> customerId;
//
//    @Given("user creates token via api endpoint {string}")
//    public void userCreatesTokenViaApiEndpoint(String endpoint) throws IOException {
//        String postBody = "{\n" +
//                "    \"username\" : \"Team62AdminV\",\n" +
//                "    \"password\" : \"Aa1.123\",\n" +
//                "    \"rememberMe\" : false\n" +
//                "}";
//
//        response = given().contentType("application/json").when().body(postBody).post(endpoint);
//        JsonPath js = response.jsonPath();
//        token = js.get("id_token");
//        System.out.println(token);
//        fileInputStream = new FileInputStream("configuration1.properties");
//        properties = new Properties();
//        properties.load(fileInputStream);
//        properties.setProperty("token",token);
//        fileOutputStream = new FileOutputStream("configuration1.properties");
//        properties.store(fileOutputStream,null);
//


  //  }

    @Then("user read all countries {string}")
    public void userReadAllCountries(String endpoint) {

        response = given().accept(ContentType.JSON).auth().oauth2(ConfigReader.getProperty("token")).when().get(endpoint);

        // response.prettyPrint();

    }

    @Then("user update a country")
    public void userUpdateACountry() {
//        {
//            "id": 24103,
//                "name": "FRANCE",
//                "states": null
//        }


        Map<String , Object> putCountry = new HashMap<>();
        putCountry.put("id", "103322");
        putCountry.put("name", "FRANCE111");
        putCountry.put("states",null);

        response = given().headers("Authorization",
                "Bearer " + ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .body(putCountry)
                .put("https://www.gmibank.com/api/tp-countries")
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        response.prettyPrint();

    }

    @And("user validate update the country")
    public void userValidateUpdateTheCountry() {

        response = given().accept(ContentType.JSON).auth().oauth2(ConfigReader.getProperty("token")).when().get("https://www.gmibank.com/api/tp-countries");
        JsonPath jsonPath = response.jsonPath();
        String name = jsonPath.getString("name");
        System.out.println(name);
        Assert.assertTrue("not match", name.contains("FRANCE111"));
        System.out.println("Validation is successful");

    }
}
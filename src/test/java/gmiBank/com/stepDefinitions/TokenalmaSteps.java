package gmiBank.com.stepDefinitions;

import io.restassured.path.json.JsonPath;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.io.FileInputStream;

import static io.restassured.RestAssured.given;

public class TokenalmaSteps {


        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        Properties properties;
        Response response;
        String token;
        List<Object> customerId;

        @Given("user creates token via api endpoint {string}")
        public void userCreatesTokenViaApiEndpoint(String endpoint) throws IOException {
            String postBody = "{\n" +
                    "    \"username\" : \"Team62AdminV\",\n" +
                    "    \"password\" : \"Aa1.123\",\n" +
                    "    \"rememberMe\" : false\n" +
                    "}";

            response = given().contentType("application/json").when().body(postBody).post(endpoint);
            JsonPath js = response.jsonPath();
            token = js.get("id_token");
            System.out.println(token);
            fileInputStream = new FileInputStream("configuration1.properties");
            properties = new Properties();
            properties.load(fileInputStream);
            properties.setProperty("token",token);
            fileOutputStream = new FileOutputStream("configuration1.properties");
            properties.store(fileOutputStream,null);



        }

        @Then("read all customer data using with api endpoint {string}")
        public void readAllCustomerDataUsingWithApiEndpoint(String endpoint_customer) {
            response = given().accept(ContentType.JSON).auth().oauth2(token).when().get(endpoint_customer);

            response.prettyPrint();
        }
    }


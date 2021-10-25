package gmiBank.com.stepDefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmiBank.com.pojos.Country6;
import gmiBank.com.pojos.Customer6;
import gmiBank.com.utilities.ConfigReader;
import gmiBank.com.utilities.ReadTxt;
import gmiBank.com.utilities.WriteToTxt;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import static gmiBank.com.jsonModels.CountryJson.createCountry;
import static gmiBank.com.jsonModels.CountryJson.createCountry2;
import static io.restassured.RestAssured.given;

public class US_25StepDefs {

    Response response;
    Response response1;
    Response response2;
    int createdCountryId;
    String stringcreatedCountryId;
    FileInputStream fileInputStream;
    FileOutputStream fileOutputStream;
    Properties properties;
    String token;



    @Given("user creates token via api endpoint {string}")
    public void user_creates_token_via_api_endpoint(String endpoint) throws IOException {
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


    @Given("User post a request to create a new country from api_endpoint {string}")
    public void user_post_a_request_to_create_a_new_country_from_api_endpoint(String endpoint_countries) {


//       response = given().accept(ContentType.JSON).auth()
//                .oauth2(token)
//                .when()
//                .body(createCountry2)
//                .post(ConfigReader.getProperty(endpoint_countries))
//               .then()
//                .contentType(ContentType.JSON)
//               .extract()
//              .response();
        response = given().headers("Authorization",
                "Bearer " + ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .body(createCountry2)
                .post(ConfigReader.getProperty(endpoint_countries))
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        response.prettyPrint();

        JsonPath jsonPath = response.jsonPath();
        createdCountryId = jsonPath.getInt("id");

        System.out.println(createdCountryId);
        stringcreatedCountryId = String.valueOf(createdCountryId);
        System.out.println(stringcreatedCountryId);
    }

    @Given("User read all country information from api_endpoint {string}")
    public void user_read_all_country_information_from_api_endpoint(String endpoint_countries) throws IOException {

//        response1=given().accept(ContentType.JSON).auth()
//                .oauth2(token)
//                .when().get(ConfigReader.getProperty(endpoint_countries));

       response1 = given().headers("Authorization",
                "Bearer " + ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(ConfigReader.getProperty(endpoint_countries))
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
       response1.prettyPrint();

//       List<String> countryIdList = new ArrayList<>();
//       ObjectMapper objectMapper = new ObjectMapper();
//       Country6[] country6 = objectMapper.readValue(response1.asString(),Country6[].class);
//        for(int i =0; i<country6.length; i++) {
//            countryIdList.add(String.valueOf(country6[i].getId()));
//        }
//
//        WriteToTxt.saveDataInFileWithCountry6Id("CountryIdList1",country6);
//            System.out.println(countryIdList);
//            System.out.println("=============================================================================");
//        List<String> readTxtCountryId = ReadTxt.returnCountry6IdList("countryIdList1");
//            System.out.println(readTxtCountryId);
//
//        Assert.assertEquals("validation failed",countryIdList,readTxtCountryId);
//        System.out.println("validation is successfull");
        }


    @Then("User validate create a new country from api_endpoint {string}")
    public void user_validate_create_a_new_country_from_api_endpoint(String endpoint_countries) {


//       response2 = given().accept(ContentType.JSON).auth()
//                .oauth2(token)
//                .when().get(ConfigReader.getProperty(endpoint_countries));

      response2 = given().headers("Authorization",
                "Bearer " + ConfigReader.getProperty("token"),
                "Content-Type", ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(ConfigReader.getProperty(endpoint_countries))
                .then()
                .extract()
                .response();
        response2.prettyPrint();

        System.out.println("==============================================================");
        JsonPath jsonPath = response2.jsonPath();
        String stringIds = jsonPath.getString("id");
        System.out.println(stringIds);
        System.out.println("===================================================================");

      stringcreatedCountryId = String.valueOf(createdCountryId);
    //   System.out.println(stringcreatedCountryId);

        Assert.assertTrue("not contains", stringIds.contains(stringcreatedCountryId));
        System.out.println("validation is successfull");

    }
}


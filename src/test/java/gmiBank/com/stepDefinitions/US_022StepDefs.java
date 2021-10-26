package gmiBank.com.stepDefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmiBank.com.pojos.Customer6;
import gmiBank.com.pojos.States06;
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
import java.util.List;
import java.util.Properties;










import static io.restassured.RestAssured.given;

public class US_022StepDefs {
    FileInputStream fileInputStream;
    FileOutputStream fileOutputStream;
    Properties properties;
    Response response;
    String token;
    List<Object> customerId;

    @Given("Read all states you created and validate them from your data set using api_endpoint {string}")
    public void readAllStatesYouCreatedAndValidateThemFromYourDataSetUsingApi_endpoint(String string) {

        response=given().accept(ContentType.JSON).auth().oauth2(ConfigReader.getProperty("token")).when().get(string);

response.prettyPrint();

    }

    @Then("Read all states you created and validate them one by one")
    public void readAllStatesYouCreatedAndValidateThemOneByOne() throws IOException {
        List<String > statesId=new ArrayList<>();
        ObjectMapper objectMapper=new ObjectMapper();
        States06[] states06 =objectMapper.readValue(response.asString(),States06[].class);
        for (int i = 0; i <states06.length  ; i++) {
            statesId.add(String.valueOf(states06[i].getId()));


        }
        System.out.println(statesId.size());
        WriteToTxt.saveDataInFileWithStateid("Statesids",states06);
        List<String> readstatesİds=ReadTxt.returnStates6IdList("Statesids");
        Assert.assertEquals("notMatch",readstatesİds,statesId);
        System.out.println("validation is Succesfull");


    }

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
}

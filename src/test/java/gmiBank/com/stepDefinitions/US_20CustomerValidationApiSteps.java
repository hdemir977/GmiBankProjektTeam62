package gmiBank.com.stepDefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmiBank.com.pojos.Customer6;
import gmiBank.com.utilities.ReadTxtUS20;
import gmiBank.com.utilities.WriteToTxtUS20;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static io.restassured.RestAssured.given;

public class US_20CustomerValidationApiSteps {
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

    @Then("validate all customer data")
    public void validateAllCustomerData() throws IOException {


        ObjectMapper objectMapper=new ObjectMapper();
        Customer6[] customer6=objectMapper.readValue(response.asString(),Customer6[].class);
       List<String> customerList=new ArrayList<>();
        for (int i = 0; i <customer6.length ; i++) {
            customerList.add(String.valueOf(customer6[i].getFirstName()+ " , "+customer6[i].getLastName()+" , "+customer6[i].getSsn()));
        }
        System.out.println(customerList);
        System.out.println(".....................................");


        WriteToTxtUS20.saveDataInFileAllCustomersInfo3("CustomerList",customer6);
        List<String > readtxtCustomer= ReadTxtUS20.returnCustomerList("CustomerList");
        Assert.assertEquals("not match", customerList,readtxtCustomer);
        System.out.println("Customer First Name , Last Name and SSn validation is Succesfull");

        List<String> customerSSNlist = new ArrayList<>();
        for (int i = 0; i <customer6.length ; i++) {
            customerSSNlist.add(String.valueOf(customer6[i].getSsn()));
        }
        WriteToTxtUS20.saveDataInFileWithSSN("CustomerSSNList",customer6);

        List <String> readTxtCustomerSSN = ReadTxtUS20.returnCustomerSNNList("CustomerSSNList");

        System.out.println(readTxtCustomerSSN);

        Assert.assertEquals("not match",readTxtCustomerSSN,customerSSNlist);

        System.out.println("===============================================");

        System.out.println("Custumer SSn Validation is succesfull");

    }
}

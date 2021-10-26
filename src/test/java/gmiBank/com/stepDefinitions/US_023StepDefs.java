package gmiBank.com.stepDefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmiBank.com.pojos.Registrants;
import gmiBank.com.utilities.ConfigReader;
import gmiBank.com.utilities.ReadText;
import gmiBank.com.utilities.WriteToText;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.apache.xmlbeans.impl.xb.xmlconfig.impl.QnametargetlistImpl;
import org.junit.Assert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class US_023StepDefs {
    Response response;

    @Given("Read all registrants you created and validate them from your data set {string}")
    public void readAllRegistrantsYouCreatedAndValidateThemFromYourDataSet(String string) {
        response = RestAssured.given().accept(ContentType.JSON).auth().
                oauth2(ConfigReader.getProperty("token")).when().get(string);
        response.prettyPrint();

    }

    @Then("Read all registrants you created and validate them one by one")
    public void readAllRegistrantsYouCreatedAndValidateThemBy() throws IOException {


        ObjectMapper objectMapper=new ObjectMapper();
        Registrants[] registrants=objectMapper.readValue(response.asString(),Registrants[].class);

        List<String> ssnList=new ArrayList<>();
        for (int i = 0; i < registrants.length; i++) {
            ssnList.add(String.valueOf(registrants[i].getSsn()));
        }
        //System.out.println(ssnList); Butun SSN'leri getirir

        List<String> expectedList=new ArrayList<>();
        expectedList.add("123-12-4446");
        expectedList.add("505-14-7702");
        expectedList.add("107-13-7695");
        expectedList.add("111-23-4562");
        expectedList.add("499-45-9148");

        Assert.assertTrue("don't mach",ssnList.containsAll(expectedList));
        System.out.println("Ssn'ler eslesti.");

//        WriteToText.saveDataInFileWithSSN("RegistrantsSsnList",registrants);
//        List<String> readToSsnList=ReadText.returnRegistrantSsnList("RegistrantsSsnList");
//        Assert.assertEquals("SSN listeleri eslesmedi",readToSsnList,ssnList);










    }


}

package gmiBank.com.stepDefinitions;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import gmiBank.com.pojos.Country6;
import gmiBank.com.utilities.ConfigReader;
import gmiBank.com.utilities.ReadText;
import gmiBank.com.utilities.WriteToText;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.junit.Assert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class US_021StepDefs {
    Response response;
    Country6[] country6;

    String countryName;
    Faker faker=new Faker();
    String fileNames;

    String readTextcountryName;

    @Given("Read all countries you created and validate them from your data set {string}")
    public void readAllCountriesYouCreatedAndValidateThemFromYourDataSet(String endpoint_countries) throws IOException {

        response = given().headers("Authorization",
                "Bearer "+ ConfigReader.getProperty("token"),
                "ContentType.Json", ContentType.JSON,
                "Accept",ContentType.JSON)
                .when()
                .get(ConfigReader.getProperty(endpoint_countries))
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        //response.prettyPrint();


        //object mapper ile response'den gelenleri javay cevirerek "deserilazation" yapiyoruz

        ObjectMapper objectMapper=new ObjectMapper();
        country6=objectMapper.readValue(response.asString(), Country6[].class);
        System.out.println(country6[0].getId());
        List<String> countryName=new ArrayList<>();

        for(int i=0;i<country6.length;i++){
            countryName.add(country6[i].getName());
        }
        System.out.println(countryName);
       // String countryFakerNames=faker.name().title();

        //response'den gelen countryname'leri writetotext methodu ile framework'a yazdirdik
        WriteToText.saveDataInFileWithCountry6Name("fileNames",country6);

        //burada Readtext ile okuma yaptik
        List<String > readTextcountryName= ReadText.returnCountryName6List(fileNames);
        System.out.println(readTextcountryName);

    }

    @Then("Read all countries you created and validate them one by one")
    public void readAllCountriesYouCreatedAndValidateThemBy() {


        //validasyon isleminde readtext ile okuttugumuz filenames dosyasini response aldigimiz contryname karsilastirdik
        Assert.assertEquals("Text'ler eslesmedi",readTextcountryName,countryName);


    }
}


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

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static gmiBank.com.JsonModels.CountryJson.createCountry;
import static io.restassured.RestAssured.given;

public class apiDersBank8 {

    Response response;
    int createdCoutryId;

    @Given("read all customer data using with api endpoint {string} bank8")
    public void read_all_customer_data_using_with_api_endpoint_bank8(String api_endpoint) {

        response = given().headers("Authorization",
                "Bearer "+ ConfigReader.getProperty("token"),
                "ContentType.Json", ContentType.JSON,
                "Accept",ContentType.JSON)
                .when()
                .get(api_endpoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();

        System.out.println("==================================================================================");


    }

    @Then("validate customer data bank8")
    public void validate_customer_data_bank8() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Customer6 [] customer6 = objectMapper.readValue(response.asString(),Customer6[].class); //array gormek gerekiyor

        // ilk musterinin ismi
        System.out.println(customer6[0].getFirstName());

        System.out.println("=================================================================================="); //Nikita

        // 6. musterinin ssn numarasi
        System.out.println(customer6[5].getSsn());

        System.out.println("==================================================================================");

        // ilk 10 musterinin lastname leri
        for(int i = 0 ; i < 10 ; i++){
            System.out.println(customer6[i].getLastName());
        }

        System.out.println("==================================================================================");

        // M harfi ile baslayan customer isimlerinin yanina emeil adresleri ile getirin

        for(int i = 0 ; i < customer6.length ; i++){ //kac customer varsa onlarin gerekli bilgleri al
            if (customer6[i].getFirstName().startsWith("M")){ //take the first names starting with M
                System.out.println(customer6[i].getFirstName() + " == " + customer6[i].getEmail());
            }
        }

        System.out.println("==================================================================================");

        /////////////////////////////////////USER/////////////////////////////////////////////////////////////////

        // ilk musterinin user icindeki firstname
        System.out.println(customer6[0].getUser().getFirstName());

        System.out.println("==================================================================================");

        //tum musterilerin user icindeki id leri

        for (int i = 0 ; i < customer6.length ; i++){
            if(customer6[i].getUser() != null) { //null degisle yazdir
                System.out.println(customer6[i].getUser().getId());
            }
        }

    }

    //.....................................II Ders API_2..................................................................//

    // ============================  read all countries =================================

    @Then("read all countries and write country ids to txt using api endpoint {string} bank8")
    public void read_all_countries_and_write_country_ids_to_txt_using_api_endpoint_bank8(String api_endpoint) throws IOException {

        response = given().headers("Authorization",
                "Bearer "+ ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",ContentType.JSON)
                .when()
                .get(api_endpoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();

        // 1. asama country idlerini bir listin icine atalim - We wnt to store all data from country in a List

        List <String> countryId = new ArrayList<>();

        // objectMapper kullanarak deserilazation yapicaz ve country id'lerini listin icine aticaz

        ObjectMapper objectMapper = new ObjectMapper();

        Country6 [] country6 = objectMapper.readValue(response.asString(), Country6[].class);

        // for dongusu ile country id'lerini listin icine ekleyecegiz

        for(int i = 0 ; i < country6.length ; i++){
            countryId.add(String.valueOf(country6[i].getId())); //
        }

        // 2. asama country idlerini txt dosyasi olarak yazdiralim

        WriteToTxt.saveDataInFileWithCountry6Id("CountryIdBank8",country6);

        // 3. asama olusturulan txt dosyasindaki bilgileri okutalim

        List <String> readTxtCountryId = ReadTxt.returnCountry6IdList("CountryIdBank8");

        // 4. asama ilk olusturulan List ile son olusturulan listin karsilastirilmasi - validasyon

        Assert.assertEquals("not match",countryId,readTxtCountryId);

        System.out.println("===============================================");

        System.out.println("Validation is succesfull");



    }

    // ============================  create all countries =================================

    @Given("create country {string} bank8")
    public void create_country_bank8(String api_endpoint) {

        response = given().headers("Authorization",
                "Bearer "+ ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",ContentType.JSON)
                .when()
                .body(createCountry)
                .post(api_endpoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();

        JsonPath jsonPath = response.jsonPath();

        createdCoutryId = jsonPath.getInt("id");

        System.out.println("=================================================");

        System.out.println(createdCoutryId);


    }

    // ============================  validate created country =================================

    @Then("validate created a country bank8")
    public void validate_created_a_country_bank8() {

        response = given().headers("Authorization",
                "Bearer "+ ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",ContentType.JSON)
                .when()
                .get("https://www.gmibank.com/api/tp-countries")
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        JsonPath jsonPath = response.jsonPath();
        String stringIds = jsonPath.getString("id");

        String stringCreatedCountryId = String.valueOf(createdCoutryId);

        Assert.assertTrue("not contains",stringIds.contains(stringCreatedCountryId));

        System.out.println("Validation is succesfull");



    }

    // ============================  update created country =================================


    @Given("update created a country using api end point {string}  {string} and its extension {string} bank8")
    public void update_created_a_country_using_api_end_point_and_its_extension_bank8(String api_endpoint, String name, String id) {

        Map<String , Object> putCountry = new HashMap<>();
        putCountry.put("id",id);
        putCountry.put("name",name);
        putCountry.put("states",null);

        response = given().headers("Authorization",
                "Bearer "+ ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",ContentType.JSON)
                .when()
                .body(putCountry)
                .put(api_endpoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();


    }

    // ============================  delete and validate created country =================================


    @Given("delete updated a country using endpoint {string} and its extension {string} and validate bank8")
    public void delete_updated_a_country_using_endpoint_and_its_extension_and_validate_bank8(String api_endpoint, String id) {

        response = given().headers("Authorization",
                "Bearer "+ ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",ContentType.JSON)
                .when()
                .delete(api_endpoint+id)
                .then()
                .extract()
                .response();


        Response responseNew = given().headers("Authorization",
                "Bearer "+ ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",ContentType.JSON)
                .when()
                .get(api_endpoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        JsonPath jsonPath = responseNew.jsonPath();
        String ids = jsonPath.getString("id");

        Assert.assertFalse("not delete",ids.contains(id));
        System.out.println("Validation is succesfull");


    }



}


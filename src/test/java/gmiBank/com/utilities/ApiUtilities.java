package gmiBank.com.utilities;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;

public class ApiUtilities {

    FileInputStream fileInputStream;
    FileOutputStream fileOutputStream;
    Properties properties;
    Response response;
    String token;


    public String userCreatesTokenViaApiEndpoint() throws IOException {

        String postBody = "{\n" +
                "    \"username\" : \"Team62AdminV\",\n" +
                "    \"password\" : \"Aa1.123\",\n" +
                "    \"rememberMe\" : false\n" +
                "}";

        response = given().contentType("application/json").when().body(postBody).post("https://gmibank.com/api/authenticate");
        JsonPath js = response.jsonPath();
        token = js.get("id_token");
        System.out.println(token);
        fileInputStream = new FileInputStream("configuration.properties");
        properties = new Properties();
        properties.load(fileInputStream);
        properties.setProperty("token", token);
        fileOutputStream = new FileOutputStream("configuration.properties");
        properties.store(fileOutputStream, null);

        return token;

    }

//    // get() methodu ile endpointleri degistirerek okutma yapabiliriz
//
//    public void readAllCountriesFromEndPoint(String newCountrEndpoint) {
//
//        Response response1 = given().headers("Authorization",
//                "Bearer " + ConfigReader.getProperty("token"),
//                "Content-Type", ContentType.JSON,
//                "Accept", ContentType.JSON)
//                .when()
//                .get(newCountrEndpoint)
//                .then()
//                .contentType(ContentType.JSON)
//                .extract().response();
//        response1.prettyPrint();

}

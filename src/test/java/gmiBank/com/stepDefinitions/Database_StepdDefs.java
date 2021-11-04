package gmiBank.com.stepDefinitions;

import gmiBank.com.utilities.ReadTxtUS20;
import gmiBank.com.utilities.WriteToTxt;
import gmiBank.com.utilities.WriteToTxtUS20;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static gmiBank.com.utilities.DatabaseUtility.*;

public class Database_StepdDefs {

    List<Object> objectList;
    String fileNameSsnDB="src\\test\\resources\\test_data\\countryIdDB.txt";
    String fileNameCountryIdDB="C:\\Users\\bekir\\IdeaProjects\\GmiBankProjektTeam62\\src\\test\\java\\gmiBank\\com\\write_test_data\\countryIdDB.txt";


    public static void main(String[] args) {

        createConnection();
        String query1="Select * from tp_customer";
        System.out.println(getColumnNames(query1));

        System.out.println("==========================");
        String query2="Select * from tp_customer where first_name like '%ali%'";
        System.out.println(getColumnData(query2,"first_name"));

        System.out.println("==========================");
        System.out.println(getCellValue(query1,8,8));
        closeConnection();


    }

    @Given("database user creates a connection with db using {string} , {string} and {string}")
    public void databaseDersBankUserCreatesAConnectionWithDbUsingAnd(String url, String user, String password) {

        createConnection(url, user, password);
    }

    @And("database user reads the Customers data using {string} and {string}")
    public void databaseUserReadsTheCustomersDataUsingAnd(String query, String ssn) {

        objectList=getColumnData(query, ssn);
        System.out.println(objectList);


    }

    @Then("database validate customers data")
    public void databaseDersBankValidateCustomersData() {

        Assert.assertTrue(objectList.contains("462-38-7492"));
        System.out.println("================");
        System.out.println("connection is succesfull");
        closeConnection();


    }

//==============================================
    @Then("user reads the country data using {string} and {string}")
    public void userReadsTheCountryDataUsingAnd(String query, String columnName) {

        objectList=getColumnData(query,columnName);
        System.out.println(objectList);

    }

    @Then("user save DB country info to correspondent files")
    public void userSaveDBCountryInfoToCorrespondentFiles() {

        File file = new File("C:\\Users\\bekir\\IdeaProjects\\GmiBankProjektTeam62\\src\\test\\java\\gmiBank\\com\\write_test_data\\countryIdDB.txt");
        if (file != null) {
            file.delete();
        }

        WriteToTxtUS20.saveAllCustomersComingFromDB(fileNameCountryIdDB,objectList);

    }

    @Then("user validates all countries' info")
    public void userValidatesAllCountriesInfo() {

        List<String> expectedIds=new ArrayList<>();
        expectedIds.add("22347");
        expectedIds.add("24103");
        expectedIds.add("24368");
        expectedIds.add("24379");

        List<String> actualCountryIds= ReadTxtUS20.returnCountryIdList(fileNameCountryIdDB);
        Assert.assertTrue("all countries do not match", actualCountryIds.containsAll(expectedIds));
        System.out.println(" db country testing is succesfull");


    }
}

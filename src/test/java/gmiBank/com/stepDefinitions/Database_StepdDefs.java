package gmiBank.com.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

import static gmiBank.com.utilities.DatabaseUtility.*;

public class Database_StepdDefs {

    List<Object> objectList;

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

    @Given("database ders bank8 user creates a connection with db using {string} , {string} and {string}")
    public void databaseDersBankUserCreatesAConnectionWithDbUsingAnd(String url, String user, String password) {

        createConnection(url, user, password);
    }

    @And("database ders bank8 user reads the Customers data using {string} and {string}")
    public void databaseDersBankUserReadsTheCustomersDataUsingAnd(String query, String ssn) {

        objectList=getColumnData(query, ssn);
        System.out.println(objectList.toString());

    }

    @Then("database ders bank8 validate customers data")
    public void databaseDersBankValidateCustomersData() {

        Assert.assertTrue(objectList.contains("462-38-7492"));
        System.out.println("================");
        System.out.println("connection is succesfull");
        closeConnection();


    }
}

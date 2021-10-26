package gmiBank.com.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

import static gmiBank.com.utilities.DatabaseUtility.*;

public class DatebaseDerBank8 {

    public static void main (String[] args) {

        createConnection(); //connection actik

        String query1 = "Select * from tp_customer";
        //getColumnNames(query1); //butun columnName bilgileri aldik from DataUtilities, bilgiyi aldik ama yazdirmadik
        System.out.println(getColumnNames(query1));
        System.out.println("=====================================================");
        String query2 = "Select * from tp_customer where first_name like '%ali%'";
        System.out.println(getColumnData(query2,"first_name")); //[alice, Rosaline, Oralia, Adaline, Madaline, Eulalia, Halit, salih, Rosalie, ali, ali, Salih, Halime]
        System.out.println("=====================================================");
        System.out.println(getCellValue(query1,8,7)); //free world street
        System.out.println("=====================================================");

        closeConnection(); //databasi kapat

    }

    List<Object> objectList;

    @Given("database ders bank8 user creates a connection with db using {string} , {string} and {string}")
    public void database_ders_bank8_user_creates_a_connection_with_db_using_and(String url, String user, String password) {
        createConnection(url, user, password);
    }

    @Given("database ders bank8 user reads the Customers data using {string} and {string}")
    public void database_ders_bank8_user_reads_the_customers_data_using_and(String query, String ssn) {
    objectList = getColumnData(query, ssn);
        System.out.println(objectList.toString());

    }

//sunu featurden calistir

    @Then("database ders bank8 validate customers data")
    public void database_ders_bank8_validate_customers_data() {
        Assert.assertTrue(objectList.contains("124-30-1598"));
        System.out.println("=========================================");
        System.out.println("Validation is succesfull");
        closeConnection();
    }
}
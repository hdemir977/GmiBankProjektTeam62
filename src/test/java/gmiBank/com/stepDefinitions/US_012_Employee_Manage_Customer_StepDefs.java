package gmiBank.com.stepDefinitions;

import gmiBank.com.pages.HomePage;
import gmiBank.com.pages.LoginPage;
import gmiBank.com.pages.US_012_EmployeePage;
import gmiBank.com.utilities.ConfigReader;
import gmiBank.com.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US_012_Employee_Manage_Customer_StepDefs {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    US_012_EmployeePage us_012_employeePage = new US_012_EmployeePage();

    //background
    @Then("user login the application valid credantials")
    public void userLoginTheApplicationValidCredantials() {

        loginPage.loginExecution();

    }

    @Then("user click My Operations")
    public void user_click_my_operations() {
        Driver.wait(2);
        us_012_employeePage.myOperations.click();

    }

    @Then("user select Manage Customers")
    public void user_select_manage_customers() {
        Driver.wait(2);
        us_012_employeePage.manageCustomers.click();

    }
    // TC_1201
    @Given("user sees customer registrations information")
    public void userSeesCustomerRegistrationsInformation(io.cucumber.datatable.DataTable dataTable) {

        Assert.assertTrue(us_012_employeePage.columnList.get(0).getText().contains(dataTable.cell(0, 0)));
        System.out.println(us_012_employeePage.columnList.get(0).getText());

        Assert.assertTrue(us_012_employeePage.columnList.get(1).getText().contains(dataTable.cell(1,0)));
        System.out.println(us_012_employeePage.columnList.get(1).getText());

        Assert.assertTrue(us_012_employeePage.columnList.get(2).getText().contains(dataTable.cell(2,0)));
        System.out.println(us_012_employeePage.columnList.get(2).getText());

        Assert.assertTrue(us_012_employeePage.columnList.get(3).getText().contains(dataTable.cell(3,0)));
        System.out.println(us_012_employeePage.columnList.get(3).getText());

        Assert.assertTrue(us_012_employeePage.columnList.get(4).getText().contains(dataTable.cell(4,0)));
        System.out.println(us_012_employeePage.columnList.get(4).getText());

        Assert.assertTrue(us_012_employeePage.columnList.get(5).getText().contains(dataTable.cell(5,0)));
        System.out.println(us_012_employeePage.columnList.get(5).getText());

        Assert.assertTrue(us_012_employeePage.columnList.get(6).getText().contains(dataTable.cell(6,0)));
        System.out.println(us_012_employeePage.columnList.get(6).getText());

        Assert.assertTrue(us_012_employeePage.columnList.get(7).getText().contains(dataTable.cell(7,0)));
        System.out.println(us_012_employeePage.columnList.get(7).getText());

        Assert.assertTrue(us_012_employeePage.columnList.get(8).getText().contains(dataTable.cell(8,0)));
        System.out.println(us_012_employeePage.columnList.get(8).getText());
    }


    @Then("User sees all information populated")
    public void userSeesAllInformationPopulated() {
        Driver.wait(2);
        String actualfirstName=us_012_employeePage.firstName.getText();
        System.out.println(actualfirstName);
        String expectedfistName= ConfigReader.getProperty("firstName_12");
        String actualLastName=us_012_employeePage.lastName.getText();
        System.out.println(actualLastName);
        String expectedLastName=ConfigReader.getProperty("lastName_12");

        Assert.assertEquals(expectedfistName,actualfirstName);
        Assert.assertEquals(expectedLastName,actualLastName);


    }

    @And("User sees all registrations info")
    public void userSeesAllRegistrationsInfo(io.cucumber.datatable.DataTable dataTable) {

        Assert.assertTrue(us_012_employeePage.columnList.get(0).getText().contains(dataTable.cell(0, 0)));
        System.out.println(us_012_employeePage.columnList.get(0).getText());

        Assert.assertTrue(us_012_employeePage.columnList.get(1).getText().contains(dataTable.cell(1,0)));
        System.out.println(us_012_employeePage.columnList.get(1).getText());

        Assert.assertTrue(us_012_employeePage.columnList.get(2).getText().contains(dataTable.cell(2,0)));
        System.out.println(us_012_employeePage.columnList.get(2).getText());

        Assert.assertTrue(us_012_employeePage.columnList.get(3).getText().contains(dataTable.cell(3,0)));
        System.out.println(us_012_employeePage.columnList.get(3).getText());

        Assert.assertTrue(us_012_employeePage.columnList.get(4).getText().contains(dataTable.cell(4,0)));
        System.out.println(us_012_employeePage.columnList.get(4).getText());

        Assert.assertTrue(us_012_employeePage.columnList.get(5).getText().contains(dataTable.cell(5,0)));
        System.out.println(us_012_employeePage.columnList.get(5).getText());

        Assert.assertTrue(us_012_employeePage.columnList.get(6).getText().contains(dataTable.cell(6,0)));
        System.out.println(us_012_employeePage.columnList.get(6).getText());

        Assert.assertTrue(us_012_employeePage.columnList.get(7).getText().contains(dataTable.cell(7,0)));
        System.out.println(us_012_employeePage.columnList.get(7).getText());

        Assert.assertTrue(us_012_employeePage.columnList.get(8).getText().contains(dataTable.cell(8,0)));
        System.out.println(us_012_employeePage.columnList.get(8).getText());
    }

    @And("User click view button")
    public void userClickViewButton() {

        us_012_employeePage.viewButton.click();
    }

    @And("User sees edit button")
    public void userSeesEditButton() {

        Driver.wait(2);
        us_012_employeePage.viewButton.isDisplayed();
        Driver.wait(2);
    }

    @Then("User clicks edit button")
    public void userClicksEditButton() {
        us_012_employeePage.editButton.click();
    }

    @And("User sees all editable information populated")
    public void userSeesAllEditableInformationPopulated() {

        List<WebElement> edittableList=us_012_employeePage.editList;
        for (WebElement w: edittableList   ) {
            //  System.out.println(w.getText());
        }
        System.out.println(edittableList.get(0).getText());
        Assert.assertTrue(edittableList.get(0).getText().contains("ID"));
        Driver.wait(2);

    }

    @Then("User update information")
    public void userUpdateInformation() {

        us_012_employeePage.editButton.click();
        Driver.wait(2);
        us_012_employeePage.firstName2.clear();
        String expectedNewFirstName=ConfigReader.getProperty("new_firstname");
        us_012_employeePage.firstName2.sendKeys(ConfigReader.getProperty("new_firstname"));
        Driver.wait(2);
        String actual_new_firstname=us_012_employeePage.firstName2.getAttribute("value");
        Driver.wait(2);
        us_012_employeePage.lastName2.clear();
        String expectedNewLastName=ConfigReader.getProperty("new_lastname");
        Driver.wait(2);
        us_012_employeePage.lastName2.sendKeys(ConfigReader.getProperty("new_lastname"));
        Driver.wait(2);
        String actual_new_lastname=us_012_employeePage.lastName2.getAttribute("value");

        Assert.assertEquals(expectedNewFirstName,actual_new_firstname);
        Assert.assertEquals(expectedNewLastName,actual_new_lastname);

    }

    @And("User back customerHomePage")
    public void userBackCustomerHomePage() {
        us_012_employeePage.backButton.click();
        Driver.wait(2);

    }

    @When("User click delete button")
    public void userClickDeleteButton() {

        us_012_employeePage.delete.click();
        Driver.wait(2);
    }

    @Then("User sees confirm delete operation message")
    public void userSeesConfirmDeleteOperationMessage() {
        us_012_employeePage.confDeleteMessage.isDisplayed();
        Driver.wait(2);
    }

    @And("User click second delete button")
    public void userClickSecondDeleteButton() {
        us_012_employeePage.delete2.click();
        Driver.wait(2);

    }

    @And("User sees success edit message")
    public void userSeesSuccessEditMessage() {
        us_012_employeePage.deleteSuccesMessage.isDisplayed();
    }
}

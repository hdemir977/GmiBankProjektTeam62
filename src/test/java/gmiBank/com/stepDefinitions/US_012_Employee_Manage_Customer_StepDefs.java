package gmiBank.com.stepDefinitions;

import gmiBank.com.pages.HomePage;
import gmiBank.com.pages.LoginPage;
import gmiBank.com.pages.US_012_EmployeePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class US_012_Employee_Manage_Customer_StepDefs {
    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();
    US_012_EmployeePage us_012_employeePage=new US_012_EmployeePage();

    @And("User click Sign in option")
    public void userClickSignInOption() {
        homePage.homePageSignIn.click();

    }

    @And("User enter valid username")
    public void userEnterValidUsername() {

        loginPage.userName.sendKeys("team62employee");
    }

    @And("User enter valid password")
    public void userEnterValidPassword() {
        loginPage.newPassword.sendKeys("Team62employee.");

    }

    @And("User click Sign In Button")
    public void userClickSignInButton() {
        loginPage.singInLogin.click();
    }

    @And("User click My Operations option")
    public void userClickMyOperationsOption() {
        us_012_employeePage.myOperationsMenu.click();


    }

    @And("User select Manage Customers")
    public void userSelectManageCustomers() {
        us_012_employeePage.manageCustomersOption.click();

    }

    @Given("User sees all customer registration information")
    public void userSeesAllCustomerRegistrationInformation() {



    }
}

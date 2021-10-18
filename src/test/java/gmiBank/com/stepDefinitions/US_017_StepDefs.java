package gmiBank.com.stepDefinitions;

import com.github.javafaker.Faker;
import gmiBank.com.pages.AyhanUS010Page;
import gmiBank.com.pages.AyhanUS017Page;
import gmiBank.com.pages.HomePage;
import gmiBank.com.utilities.ConfigReader;
import gmiBank.com.utilities.Driver;
import gmiBank.com.utilities.JSUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.testng.Assert;

public class US_017_StepDefs {
    HomePage homePage = new HomePage();
    AyhanUS017Page ayhanUS017Page = new AyhanUS017Page();
    AyhanUS010Page ayhanUS010Page = new AyhanUS010Page();
    Faker faker = new Faker();




    @Given("User navigates to {string}")
    public void user_navigates_to(String string) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty(string));

    }

    @Then("enter valid admin username {string}")
    public void enter_valid_admin_username(String admin_username) throws InterruptedException {
        Thread.sleep(8000);
        ayhanUS017Page.adminUserName.sendKeys("shaina.gutmann");
    }

    @Then("enter valid admin password {string}")
    public void enter_valid_admin_password(String admin_newpassword) throws InterruptedException {
        Thread.sleep(3000);
        ayhanUS017Page.adminPassword.sendKeys("i$@D7EsAV7");
    }

    @Then("click on Administration")
    public void click_on_administration() throws InterruptedException {
        Thread.sleep(3000);
        ayhanUS017Page.administration.click();
    }

    @Then("click on user management")
    public void click_on_user_management() throws InterruptedException {
        Thread.sleep(3000);
        ayhanUS017Page.userManagement.click();
    }

    @Then("click on create a new user")
    public void click_on_create_a_new_user() throws InterruptedException {
        Thread.sleep(5000);
        ayhanUS017Page.createANewUser.click();
    }

    @Then("enter a login name {string}")
    public void enter_a_login_name(String adminname) {
        ayhanUS017Page.loginTextBox.sendKeys(adminname);
    }

    @Then("enter valid first name {string}")
    public void enter_valid_first_name(String string) {
        ayhanUS017Page.firstNameTextBox.sendKeys(faker.name().firstName());
    }

    @Then("enter a valid last name {string}")
    public void enter_a_valid_last_name(String string) {
        ayhanUS017Page.lastNameTextBox.sendKeys(faker.name().lastName());
    }

    @Then("enter a valid email address")
    public void enter_a_valid_email_address() {
        ayhanUS017Page.emailTextBox.sendKeys(faker.internet().emailAddress());
    }

    @Then("click on ROLE_USER")
    public void click_on_role_user() {
        ayhanUS017Page.roleUser.click();
    }

    @Then("click on Save button")
    public void click_on_save_button() {
        ayhanUS017Page.saveButton.click();
    }


    @Then("verify toast message as created")
    public void verify_toast_message_as_created() throws InterruptedException {
    //   Assert.assertTrue(ayhanUS017Page.toastMessage.isDisplayed());
        Thread.sleep(3000);
        String toastMessage = ayhanUS017Page.toastMessageMessage.getText();
        Thread.sleep(5000);
        System.out.println("toast message : " + toastMessage);
               Assert.assertTrue(toastMessage.contains("A new user is created"));

//        String toastMessage = ayhanUS010Page.toastMessage.getText();
//        Assert.assertFalse(toastMessage.contains("translation-not-found"));

    }

    @Then("click on Created date")
    public void click_on_created_date() throws InterruptedException {
      Thread.sleep(5000);
        JSUtils.scrollIntoVIewJS(ayhanUS017Page.createANewUser);
     ayhanUS017Page.createdDate.click();
     // Driver.waitForClickablility((By.xpath("(//th[@class='hand'])[5]")),20).click();
        Thread.sleep(5000);
    }

    @Then("click on view Button")
    public void click_on_view_button() {
        Driver.waitForClickablility((By.xpath("//a[@class='btn btn-info btn-sm']")),15).click();

    //    xpath = "//a[@class='btn btn-info btn-sm']"
      //  ayhanUS017Page.viewButton.click();
    }

    @Then("verify ROLE_USER text")
    public void verify_role_user_text() {
        String roleUserText = ayhanUS017Page.roleUser2.getText();
        Assert.assertEquals(roleUserText, "ROLE_USER");
    }

    @Then("click on Back button")
    public void click_on_back_button() {
        Driver.waitForClickablility((By.xpath("//span[@class='d-none d-md-inline']")),15).click();
     //  ayhanUS017Page.backButton.click();

    }

    @Then("click on Edit button")
    public void click_on_edit_button() {
        Driver.waitForClickablility((By.xpath("//a[@class='btn btn-primary btn-sm']")),15).click();
     //   ayhanUS017Page.editButton.click();
    }

    @Then("enter a text to Last name text box {string}")
    public void enter_a_text_to_last_name_text_box(String string) {
        Driver.waitForClickablility((By.xpath("//input[@name='lastName']")),15).sendKeys("Jordan23");
      //  ayhanUS017Page.lastNameTextBox.sendKeys("Jordan23");
    }

    @Then("verify toast message  as updated")
    public void verify_toast_message_as_updated() throws InterruptedException {
        Thread.sleep(3000);
     //   Assert.assertTrue(ayhanUS017Page.toastMessage.isDisplayed());
        String toastMessageText = ayhanUS017Page.toastMessageMessage.getText();
        Thread.sleep(3000);
        System.out.println("toastMessageText is " + toastMessageText);
        Assert.assertTrue(toastMessageText.contains("updated"));
    }

//    @Then("verify toast message as updated")
//    public void verify_toast_message_as_updated() {
//        //String toastMessageText = ayhanUS017Page.toastMessage.getText();
////        System.out.println(toastMessageText);
////        Assert.assertTrue(toastMessageText.contains("updated"));
//        Assert.assertTrue(ayhanUS017Page.toastMessage.isDisplayed());
//    }

   @Then("click on Delete button")
    public void click_on_delete_button() {
        Driver.waitForClickablility((By.xpath("//a[@class='btn btn-danger btn-sm']")),15).click();
    //    ayhanUS017Page.deleteButton.click();
    }

    @Then("click on Delete button in pop up")
    public void click_on_delete_button_in_pop_up() throws InterruptedException {
        Thread.sleep(3000);
        ayhanUS017Page.deleteButton2.click();
    }

    @Then("verify the toast message as deleted")
    public void verify_the_toast_message_as_deleted() throws InterruptedException {
        Thread.sleep(3000);
        String toastMessageText = ayhanUS017Page.toastMessageMessage.getText();
        Thread.sleep(3000);
        System.out.println(toastMessageText);
        Assert.assertTrue(toastMessageText.contains("deleted"));
    //    Assert.assertTrue(ayhanUS017Page.toastMessage.isDisplayed());
    }

    @Then("click on ROLE_EMPLOYEE")
    public void click_on_role_employee() {
        ayhanUS017Page.roleEmployee.click();
    }

    @Then("verify ROLE_EMPLOYEE text")
    public void verify_role_employee_text() {
        String roleEmployeeText = ayhanUS017Page.roleEmployee2.getText();
        Assert.assertEquals(roleEmployeeText, "ROLE_EMPLOYEE");
    }

    @Then("click on ROLE_MANAGER")
    public void click_on_role_manager() {
        ayhanUS017Page.roleManager.click();
    }

    @Then("verify ROLE_MANAGER text")
    public void verify_role_manager_text() {
        String roleManagerText = ayhanUS017Page.roleManager2.getText();
        Assert.assertEquals(roleManagerText, "ROLE_MANAGER");
    }

    @Then("click on ROLE_ADMIN")
    public void click_on_role_admin() {
        ayhanUS017Page.roleAdmin.click();
    }

    @Then("verify ROLE_ADMIN text")
    public void verify_role_admin_text() {
        String roleUserText = ayhanUS017Page.roleAdmin2.getText();
        Assert.assertEquals(roleUserText, "ROLE_ADMIN");
    }

}

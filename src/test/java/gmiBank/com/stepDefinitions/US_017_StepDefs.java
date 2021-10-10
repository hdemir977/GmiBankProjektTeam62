package gmiBank.com.stepDefinitions;

import gmiBank.com.pages.AyhanUS010Page;
import gmiBank.com.pages.AyhanUS017Page;
import gmiBank.com.pages.HomePage;
import gmiBank.com.utilities.ConfigReader;
import gmiBank.com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class US_017_StepDefs {
    HomePage homePage = new HomePage();
    AyhanUS017Page ayhanUS017Page = new AyhanUS017Page();
    AyhanUS010Page ayhanUS010Page = new AyhanUS010Page();

    @Given("User navigates to {string}")
    public void user_navigates_to(String string) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty(string));
        Thread.sleep(3000);
    }

    @Then("enter valid admin username {string}")
    public void enter_valid_admin_username(String admin_username) throws InterruptedException {
        Thread.sleep(3000);
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

    @Then("click on Edit button on the first line")
    public void click_on_edit_button_on_the_first_line() throws InterruptedException {
        Thread.sleep(3000);
    ayhanUS017Page.editButton.click();
    }

    @Then("click on Role_User in Profile box")
    public void click_on_role_user_in_profile_box() throws InterruptedException {
        Thread.sleep(3000);
    ayhanUS017Page.roleUser.click();
    }

    @Then("click on Save button")
    public void click_on_save_button() throws InterruptedException {
    ayhanUS017Page.saveButton.click();
    Thread.sleep(3000);
    }

    @Then("verify A user is updated with identifier... text in pop up")
    public void verify_a_user_is_updated_with_identifier_text_in_pop_up() throws InterruptedException {

        Assert.assertTrue(ayhanUS017Page.toastMessage.isDisplayed());
        Thread.sleep(3000);
    }

    @Then("click view button")
    public void click_view_button() throws InterruptedException {
        Thread.sleep(9000);
        ayhanUS017Page.viewButton.click();

    }

    @Then("verify Role_User Text")
    public void verify_role_user_text() {
       String string= ayhanUS017Page.roleUser2.getText();
       System.out.println(string);
       Assert.assertEquals(string,"ROLE_USER");

    }

    @Then("click on delete button")
    public void click_on_delete_button() throws InterruptedException {
        Thread.sleep(3000);
      ayhanUS017Page.delete.click();
    }

    @Then("click on delete2 button")
    public void click_on_delete2_button() throws InterruptedException {
        Thread.sleep(3000);
      ayhanUS017Page.delete2.click();
    }

    @Then("verify internal server error pop up")
    public void verify_internal_server_error_pop_up() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(ayhanUS017Page.toastMessage.isDisplayed());
    }



    //    @Then("click back button")
//    public void click_back_button() {
//        ayhanUS017Page.back.click();
//    }


}

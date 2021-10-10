package gmiBank.com.stepDefinitions;

import com.github.javafaker.Faker;
import gmiBank.com.pages.AyhanUS010Page;
import gmiBank.com.pages.HomePage;
import gmiBank.com.pages.LoginPage;
import gmiBank.com.pages.RegistrationPage;
import gmiBank.com.utilities.ConfigReader;
import gmiBank.com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import javax.net.ssl.ManagerFactoryParameters;

public class US_010_StepDefs {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    LoginPage loginPage = new LoginPage();
    AyhanUS010Page ayhanUS010Page = new AyhanUS010Page();
    Faker faker = new Faker();
  //  Select select = new Select();




    @Given("Given User navigates to {string}")
    public void given_user_navigates_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty(string));
    }



    @Given("click sign in option")
    public void click_sign_in_option() {
        homePage.homePageSignIn.click();
    }

    @Given("enter valid username {string}")
    public void enter_valid_username(String username_manager) {
        ayhanUS010Page.ManagerUserName.sendKeys(ConfigReader.getProperty(username_manager));
    }

    @Given("enter valid password {string}")
    public void enter_valid_password(String newpassword_manager) {
        ayhanUS010Page.ManagerNewPassword.sendKeys(ConfigReader.getProperty(newpassword_manager));
    }

    @Given("click on sign in button")
    public void click_on_sign_in_button() {
        ayhanUS010Page.singInLogin.click();
    }

    @Given("click on My Operations")
    public void click_on_my_operations() {
        ayhanUS010Page.myOperations.click();
    }

    @Given("click on Manage Customers")
    public void click_on_manage_customers() {
        ayhanUS010Page.manageCustomers.click();
    }

    @Given("click on Create a New Customer")
    public void click_on_create_a_new_customer() {
        ayhanUS010Page.createANewCustomer.click();
    }

    @Given("send {string} to SSN text box")
    public void send_to_ssn_text_box(String SSN) {
        ayhanUS010Page.ssnTextBox.sendKeys(ConfigReader.getProperty(SSN));
    }

    @Given("click on Search button")
    public void click_on_search_button() {
        ayhanUS010Page.searchButton.click();
    }

//    @Given("verify translation-not-found pop up text")
//    public void verify_translation_not_found_pop_up_text() {
//
//        Assert.assertTrue(ayhanUS010Page.popupAlert.isDisplayed());
//    }

    @Given("send {string} to Middle Initial text box")
    public void send_to_middle_initial_text_box(String middle_initial) {
        ayhanUS010Page.middleInitial.sendKeys(ConfigReader.getProperty(middle_initial));
    }

//    @Given("Enter a valid Mobile number")
//    public void enter_a_valid_mobile_number() {
//        ayhanUS010Page.phoneNumber.sendKeys(faker.phoneNumber().cellPhone());
//    }

    @Given("Enter a valid Phone number {string}")
    public void enter_a_valid_phone_number(String phone_number) {
        ayhanUS010Page.phoneNumber.sendKeys(ConfigReader.getProperty(phone_number));
    }

//    @Given("Enter a valid Phone number")
//    public void enter_a_valid_phone_number() {
//        ayhanUS010Page.phoneNumber.sendKeys(faker.phoneNumber().phoneNumber());
//    }

    @Given("Enter a valid Zip Code {string}")
    public void enter_a_valid_zip_code(String zip_code) {
        ayhanUS010Page.zipCode.sendKeys(ConfigReader.getProperty(zip_code));
    }

    @Given("Delete the text in Address Text Box")
    public void delete_the_text_in_address_text_box() {
        ayhanUS010Page.address.clear();
    }



//    @Given("click on City Text Box")
//    public void click_on_city_text_box() {
//
//        ayhanUS010Page.city.click();
//    }

//    @Given("delete the text in City text box")
//    public void delete_the_text_in_city_text_box() {
//    ayhanUS010Page.city.click();
//    }
//
//    @Then("verify This field is required text")
//    public void verify_this_field_is_required_text() {
//        Assert.assertTrue(ayhanUS010Page.errormessageAddress.isDisplayed());
//
//    }


//    @Given("select empty from county dropdown")
//    public void select_empty_from_county_dropdown() {
//
//            Select select = new Select(ayhanUS010Page.countrydropdown);
//            select.selectByIndex(2);
//    }

    @Given("delete the text in state text box")
    public void delete_the_text_in_state_text_box() {
        ayhanUS010Page.state.clear();
    }


    @Given("click on Save button2")
    public void click_on_save_button2() throws InterruptedException {
        ayhanUS010Page.savebutton.click();
        Thread.sleep(3000);
       }

    @Given("verify this field is required text under Address text box")
    public void verify_this_field_is_required_text_under_address_text_box() {
     String messageText = ayhanUS010Page.errormessageAddress.getText();
     System.out.println(messageText);
     Assert.assertEquals(messageText,"This field is required.");
    }

   @Given("verify this field is required text under city text box")
    public void verify_this_field_is_required_text_under_city_text_box() throws InterruptedException {
       Thread.sleep(3000);
        String messageText1 = ayhanUS010Page.errormessageCity.getText();
       Thread.sleep(3000);
        System.out.println(messageText1);
        Assert.assertEquals(messageText1,"This field is required.");

    }

}




//    public void selectByIndexTest() throws InterruptedException {
////        Step 1: Locating the dropdown element
//        WebElement dropdownElement= driver.findElement(By.id("dropdown"));
////        Step 2: use Select class to control the dropdown object
//        Select select = new Select(dropdownElement);
////        Step 3: I can now select any option by 3 different ways
////        selectByValue, selectByIndex, selectByVisibleText()
//        //1.Select and Print Option 1 using index
//        Thread.sleep(5000);
//        select.selectByIndex(1);
//        Thread.sleep(5000);
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
import org.testng.Assert;

public class US_10_StepDefs {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    LoginPage loginPage = new LoginPage();
    AyhanUS010Page ayhanUS010Page = new AyhanUS010Page();
    Faker faker = new Faker();
    String ssn;
    String password =" ";

    @Then("enter a valid ssn number {string}")
    public void enter_a_valid_ssn_number(String string) throws InterruptedException {
    ssn = faker.idNumber().ssnValid();
      System.out.println("SSN is: " + ssn);

        ayhanUS010Page.ssnTextBox.sendKeys("347-98-6792");


       }
    @Then("enter valid email address")
    public void enter_valid_email_address() throws InterruptedException {
        Thread.sleep(4000);
      ayhanUS010Page.emailTextBoxBox.sendKeys(faker.internet().emailAddress());
    }

    @Then("enter valid first name  {string}")
    public void enter_valid_first_name(String string) {
      registrationPage.firstNameTextBox.sendKeys(faker.name().firstName());
    }

    @Then("enter valid last name  {string}")
    public void enter_valid_last_name(String string) {
      registrationPage.lastNameTextBox.sendKeys(faker.name().lastName());
    }

    @Then("enter valid address   {string}")
    public void enter_valid_address(String string) {
        registrationPage.adressTextBox.sendKeys(faker.address().fullAddress());
    }

    @Then("enter valid phone number  {string}")
    public void enter_valid_phone_number(String string) {
      registrationPage.phoneNumberTextBox.sendKeys(faker.phoneNumber().cellPhone());
    }

    @Then("enter valid username  {string}")
    public void enter_valid_username(String string) {
       registrationPage.usernameTextBox.sendKeys(faker.name().username());
    }

    @Then("enter valid email with  {string}")
    public void enter_valid_email_with(String string) {
      registrationPage.emailTextBox.sendKeys(faker.internet().emailAddress());
    }

    @Then("enter new password with  {string}")
    public void enter_new_password_with(String string) throws InterruptedException {
       String password = faker.internet().password(7,15,true,true,true);
        System.out.println(password);
       registrationPage.firstPasswordTextBox.sendKeys(password);
        Thread.sleep(5000);
    }

    @Then("enter new password confirmation  {string}")
    public void enter_new_password_confirmation(String string) {
       registrationPage.secondPasswordTextBox.sendKeys(password);
        System.out.println(password);
       // Driver.waitAndSendText(registrationPage.secondPasswordTextBox,password,10);
    }

    @Then("click on Register button")
    public void click_on_register_button() {
        registrationPage.registerButton.click();
    }

    @Then("validates success message saved as {string}")
    public void validates_success_message_saved_as(String string) {
       registrationPage.savedMessage.isDisplayed();
    }


    @Given("Given User navigates to {string}")
    public void given_user_navigates_to(String string) {

        Driver.getDriver().get(ConfigReader.getProperty(string));
    }

    @Given("click sign in option")
    public void click_sign_in_option() {
        homePage.homePageSignIn.click();
    }

    @Given("enter valid manager username {string}")
    public void enter_valid_manager_username(String username_manager) {
        ayhanUS010Page.ManagerUserName.sendKeys(ConfigReader.getProperty(username_manager));
    }

    @Given("enter valid manager password {string}")
    public void enter_valid_manager_password(String newpassword_manager) {
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

    @Given("enter ssn to SSN text box {string}")
    public void enter_ssn_to_ssn_text_box(String string) throws InterruptedException {

      System.out.println("ssn is : " + ssn);
//       ayhanUS010Page.ssnTextBox1.click();
//        Thread.sleep(3000);
//        //Driver.waitAndSendText(ayhanUS010Page.ssnTextBox,ssn,5);
        ayhanUS010Page.ssnTextBox1.sendKeys("347-98-6792");

         }

    @Given("click on Search button")
    public void click_on_search_button() throws InterruptedException {
        Thread.sleep(8000);
        ayhanUS010Page.searchButton.click();
    }

    @Given("enter text to Middle Initial Text Box {string}")
    public void enter_text_to_middle_initial_text_box(String string) throws InterruptedException {
        Thread.sleep(8000);
       ayhanUS010Page.middleInitial.sendKeys("Ali");
    }

    @Given("enter a valid phone Number to phone number text box")
    public void enter_a_valid_phone_number_to_phone_number_text_box() {
      ayhanUS010Page.phoneNumber.sendKeys(faker.phoneNumber().phoneNumber());
    }

    @Given("enter a valid zip code to zip code text box {string}")
    public void enter_a_valid_zip_code_to_zip_code_text_box(String string) {

        ayhanUS010Page.zipCode.sendKeys("7649");
    }

    @Given("enter a city to city text box {string}")
    public void enter_a_city_to_city_text_box(String string) {

        ayhanUS010Page.city.sendKeys("Van");
    }

    @Given("click Save button")
    public void click_save_button() {

        ayhanUS010Page.savebutton.click();
    }

    @Given("verify translation not found toast message.")
    public void verify_translation_not_found_toast_message() {
       String toastMessage = ayhanUS010Page.toastMessage.getText();
        System.out.println("toast message + " + toastMessage);
        Assert.assertFalse(toastMessage.contains("translation-not-found"), "BUG-Address must contain Country and State");

    }














//    @Given("verify translation-not-found pop up text")
//    public void verify_translation_not_found_pop_up_text() {
//
//        Assert.assertTrue(ayhanUS010Page.popupAlert.isDisplayed());
//    }


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
//
//    @Given("delete the text in state text box")
//    public void delete_the_text_in_state_text_box() {
//        ayhanUS010Page.state.clear();
//    }
//
//
//    @Given("click on Save button2")
//    public void click_on_save_button2() throws InterruptedException {
//        ayhanUS010Page.savebutton.click();
//        Thread.sleep(3000);
//    }
//
//    @Given("verify this field is required text under Address text box")
//    public void verify_this_field_is_required_text_under_address_text_box() {
//        String messageText = ayhanUS010Page.errormessageAddress.getText();
//        System.out.println(messageText);
//        Assert.assertEquals(messageText,"This field is required.");
//    }
//
//    @Given("verify this field is required text under city text box")
//    public void verify_this_field_is_required_text_under_city_text_box() throws InterruptedException {
//        Thread.sleep(3000);
//        String messageText1 = ayhanUS010Page.errormessageCity.getText();
//        Thread.sleep(3000);
//        System.out.println(messageText1);
//        Assert.assertEquals(messageText1,"This field is required.");
//
//    }







}

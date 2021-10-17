package gmiBank.com.stepDefinitions;

import com.github.javafaker.Faker;
import gmiBank.com.pages.RegistrationPage;
import gmiBank.com.utilities.ConfigReader;
import gmiBank.com.utilities.Driver;
import gmiBank.com.utilities.JSUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

public class US_001_Registration2_StepDefs {

    RegistrationPage registrationPage=new RegistrationPage();
    Faker faker=new Faker();


    String ssn;
    String firstname;
    String lastname;
    String adress;
    String phonenumber;
    String username;
    String email;
    String firstPassword;
    String secondpassword;

    @Given("User navigates go to {string}")
    public void givenUserNavigatesGoTo(String string) {

        Driver.getDriver().get(ConfigReader.getProperty(string));
    }

    @Then("click menu icon")
    public void click_menu_icon() {

        registrationPage.menuIcon.click();
    }

    @Then("click register option")
    public void click_register_option() {
        registrationPage.registerOption.click();

    }
    @Then("enter valid ssn no {string}")
    public void enter_valid_ssn_no(String valid_ssn) {
        //  registrationPage.ssnTextBox.sendKeys(faker.idNumber().ssnValid());
        registrationPage.ssnTextBox.sendKeys(ConfigReader.getProperty("valid_ssn"));
    }
    @Then("user should not see the ssn error message")
    public void userShouldNotSeeTheErrorMessage() {
        try {
            Assert.assertFalse(registrationPage.registration_alertMessageSSN.isDisplayed());
        }catch (NoSuchElementException e){
            boolean  message = true;
        }
    }
    @Then("enter valid first name {string}")
    public void enter_valid_first_name(String valid_firstname) {
        // registrationPage.firstNameTextBox.sendKeys(faker.name().firstName());
        registrationPage.firstNameTextBox.sendKeys(ConfigReader.getProperty("valid_firstname"));
    }

    @Then("user should not see the firstname error message")
    public void userShouldNotSeeTheFirstnameErrorMessage() {
        try {
            Assert.assertFalse(registrationPage.registration_alertMessageFirstName.isDisplayed());
        }catch (NoSuchElementException e){
            boolean message=true;
        }
    }
    @Then("enter valid lastname {string}")
    public void enter_valid_last_name(String valid_lastname) {
        //registrationPage.lastNameTextBox.sendKeys(faker.name().lastName());
        registrationPage.lastNameTextBox.sendKeys(ConfigReader.getProperty("valid_lastname"));

    }

    @Then("user should not see the lastname error message")
    public void userShouldNotSeeTheLastnameErrorMessage() {
        try {
            Assert.assertFalse(registrationPage.registration_alertMessageLastName.isDisplayed());
        }catch (NoSuchElementException e){
            boolean message=true;
        }
    }
    @Then("enter valid adress {string}")
    public void enter_valid_adress(String valid_adress) {
        //registrationPage.adressTextBox.sendKeys(faker.address().fullAddress());
        registrationPage.adressTextBox.sendKeys(ConfigReader.getProperty("valid_adress"));

    }
    @Then("user should not see the adress error message")
    public void userShouldNotSeeTheAdressErrorMessage() {
        try {
            Assert.assertFalse(registrationPage.registration_alerMessageAdress.isDisplayed());
        }catch (NoSuchElementException e){
            boolean message=true;
        }
    }
    @And("enter valid phone number {string}")
    public void enterValidPhoneNumber(String phonenumber) {
        registrationPage.phoneNumberTextBox.sendKeys(ConfigReader.getProperty("valid_phonenumber"));
    }

    @Then("user should not see the phone number error message")
    public void userShouldNotSeeTheEmailErrorMessage() {
        try {
            Assert.assertFalse(registrationPage.registration_alertMessageMobileNumber.isDisplayed());
        }catch (NoSuchElementException e){
            boolean message=true;
        }
    }


    //================= TC_0107 son==========================
    @And("enter valid username {string}")
    public void enterValidUsername(String username) {
        registrationPage.usernameTextBox.sendKeys(ConfigReader.getProperty("valid_username"));

    }

    @Then("user should not see the username error message")
    public void userShouldNotSeeTheUsernameErrorMessage() {
        try {
            Assert.assertFalse(registrationPage.registration_alertMessageUsername.isDisplayed());
        }catch (NoSuchElementException e){
            boolean message=true;
        }
    }

    @And("enter valid email adress {string}")
    public void enterValidEmailAdress(String email) {
        registrationPage.emailTextBox.sendKeys(ConfigReader.getProperty("valid_email"));
        Driver.wait(2);
    }

    @Then("user should not see the email adress error message")
    public void userShouldNotSeeTheEmailAdressErrorMessage() {
        try {
            Assert.assertFalse(registrationPage.registration_alertMessageEmail.isDisplayed());
        }catch (NoSuchElementException e){
            boolean message=true;
        }
    }
    @Then("enter new password {string}")
    public void enter_new_pasword(String password) {

      //  JSUtils.scrollDownByJS();
        registrationPage.firstPasswordTextBox.click();
        Driver.wait(2);
        registrationPage.firstPasswordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        //us_001Page.firstPasswordTextBox.sendKeys(faker.internet().password(8,15,true,true));
        //String password=us_001Page.firstPasswordTextBox.getCssValue("password");
        //System.out.println(password);

    }
    @Then("enter new password confirmation {string}")
    public void enter_new_password_confirmation(String password) {
        registrationPage.secondPasswordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));

    }
    @Then("click register button")
    public void click_register_button() {
        registrationPage.registerButton.click();

    }
    @Then("see registration saved and verify success message")
    public void see_registration_saved() {

        String expectedMessage="Registration saved!";
        String actualMessage=registrationPage.registration_successMessage.getText();
        Driver.wait(2);
        System.out.println(actualMessage);
       // Assert.assertTrue(registrationPage.savedMessage.isDisplayed());
        Assert.assertEquals(actualMessage,expectedMessage);


    }

    @And("enter valid phone number")
    public void enterValidPhoneNumber() {

        registrationPage.phoneNumberTextBox.sendKeys(faker.phoneNumber().cellPhone());
    }

    @And("enter valid username")
    public void enterValidUsername() {
        registrationPage.usernameTextBox.sendKeys(faker.name().username());


    }


    // =========JAVA FAKER===============

    @And("enter valid ssn no  with JavaFaker {string}")
    public void enterValidSsnNoWithJavaFaker(String string) {

        registrationPage.ssnTextBox.sendKeys(faker.idNumber().ssnValid());
    }

    @And("enter valid first name with JavaFaker {string}")
    public void enterValidFirstNameWithJavaFaker(String string) {
        registrationPage.firstNameTextBox.sendKeys(faker.name().firstName());

    }

    @And("enter valid last name with JavaFaker {string}")
    public void enterValidLastNameWithJavaFaker(String string) {
        registrationPage.lastNameTextBox.sendKeys(faker.name().lastName());

    }

    @And("enter valid adress with JavaFaker {string}")
    public void enterValidAdressWithJavaFaker(String string) {
        registrationPage.adressTextBox.sendKeys(faker.address().fullAddress());
    }

    @And("enter valid phone number with JavaFaker {string}")
    public void enterValidPhoneNumberWithJavaFaker(String string) {

        registrationPage.phoneNumberTextBox.sendKeys(faker.phoneNumber().phoneNumber());
    }

    @And("enter valid username with JavaFaker {string}")
    public void enterValidUsernameWithJavaFaker(String string) {
        registrationPage.usernameTextBox.sendKeys(faker.name().username());

    }

    @And("enter valid email with JavaFaker {string}")
    public void enterValidEmailWithJavaFaker(String string) {
        registrationPage.emailTextBox.sendKeys(faker.internet().emailAddress());
    }

    @And("enter new password with JavaFaker {string}")
    public void enterNewPasswordWithJavaFaker(String passord) throws InterruptedException {

//        firstPassword=faker.internet().password(10,15,true,true,true);
//        this.firstPassword=firstPassword;
//      System.out.println(Driver.isValidPassword(passord));

//        if (Driver.isValidPassword(passord)==true) {
//            registrationPage.firstPasswordTextBox.sendKeys(passord);
//            System.out.println("Strong password " + firstPassword);
//        } else{
//            System.out.println("===password is weakness, and new password again===");
//            firstPassword=faker.internet().password(10,15,true,true,true);
//            this.firstPassword=firstPassword;
//            registrationPage.firstPasswordTextBox.sendKeys(passord);
//            System.out.println("second new password : " + firstPassword);
//        }
//

        Driver.waitAndSendText(registrationPage.firstPasswordTextBox,passord,10);

    }

    @And("enter new password confirmation with JavaFaker {string}")
    public void enterNewPasswordConfirmationWithJavaFaker(String password) throws InterruptedException {
        Thread.sleep(2000);

        //   this.firstPassword=secondpassword;

        Driver.waitAndSendText(registrationPage.secondPasswordTextBox,password,10);
        //  registrationPage.secondPasswordTextBox.sendKeys(secondpassword);
    }

    @And("user click on Register button and validates success message saved as {string}")
    public void userClickOnRegisterButtonAndValidatesSuccessMessageSavedAs(String string) {

        registrationPage.registerButton.click();
        Assert.assertTrue(registrationPage.savedMessage.isDisplayed());

        System.out.println("=======registration process is succesfull with valid credentials==========");


    }

    @Then("user close page")
    public void userClosePage() {
        Driver.closeDriver();
    }


    @And("see registration saved and verify {string}")
    public void seeRegistrationSavedAndVerify(String successMessage) {


    }
}

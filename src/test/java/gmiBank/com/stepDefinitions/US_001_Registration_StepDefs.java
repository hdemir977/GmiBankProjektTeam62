package gmiBank.com.stepDefinitions;

import com.github.javafaker.Faker;
import gmiBank.com.pages.RegistrationPage;
import gmiBank.com.utilities.ConfigReader;
import gmiBank.com.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class US_001_Registration_StepDefs {

    RegistrationPage registrationPage=new RegistrationPage();
    Faker faker=new Faker();
    String password;

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
    @Then("enter valid ssn no")
    public void enter_valid_ssn_no() {
        registrationPage.ssnTextBox.sendKeys(faker.idNumber().ssnValid());

    }
    @Then("enter valid first name")
    public void enter_valid_first_name() {
        registrationPage.firstNameTextBox.sendKeys(faker.name().firstName());

    }
    @Then("enter valid last name")
    public void enter_valid_last_name() {

        registrationPage.lastNameTextBox.sendKeys(faker.name().lastName());
    }
    @Then("enter valid adress")
    public void enter_valid_adress() {
        registrationPage.adressTextBox.sendKeys(faker.address().fullAddress());

    }
    @Then("enter valid email")
    public void enter_valid_email() {
        registrationPage.emailTextBox.sendKeys(faker.internet().emailAddress());

    }
    @Then("enter new password {string}")
    public void enter_new_pasword(String password) {

        registrationPage.firstPasswordTextBox.sendKeys(ConfigReader.getProperty(password));
        //        us_001Page.firstPasswordTextBox.sendKeys(faker.internet().password(8,15,true,true));
//        String password=us_001Page.firstPasswordTextBox.getCssValue("password");
//        System.out.println(password);

    }
    @Then("enter new password confirmation {string}")
    public void enter_new_password_confirmation(String password) {
        registrationPage.secondPasswordTextBox.sendKeys(ConfigReader.getProperty(password));

    }
    @Then("click register button")
    public void click_register_button() {
        registrationPage.registerButton.click();

    }
    @Then("see registration saved")
    public void see_registration_saved() {

        Assert.assertTrue(registrationPage.savedMessage.isDisplayed());

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
    public void enterNewPasswordWithJavaFaker(String string) throws InterruptedException {

        password=faker.internet().password(7,15,true,true,true);
        this.password=password;
        System.out.println("new password : " + password);
        registrationPage.firstPasswordTextBox.sendKeys(password);
        Thread.sleep(2000);

      //  registrationPage.secondPasswordTextBox.sendKeys(password);

    }

    @And("enter new password confirmation with JavaFaker {string}")
    public void enterNewPasswordConfirmationWithJavaFaker(String string) {

       Driver.waitAndSendText(registrationPage.secondPasswordTextBox,password,10);
        //registrationPage.secondPasswordTextBox.sendKeys(password);
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
}

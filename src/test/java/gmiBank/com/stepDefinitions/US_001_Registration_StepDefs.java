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


    @Given("Given User navigates go to {string}")
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


}

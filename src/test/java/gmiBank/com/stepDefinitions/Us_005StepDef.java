package gmiBank.com.stepDefinitions;

import com.github.javafaker.Faker;
import gmiBank.com.pages.Us_005_Page;
import gmiBank.com.utilities.ConfigReader;
import gmiBank.com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Us_005StepDef {
    //proba
    Us_005_Page Us_005 = new Us_005_Page();
    Faker faker=new Faker();

    @Given("user is on gmi_url")
    public void user_is_on_gmi_url() {

        Driver.getDriver().get(ConfigReader.getProperty("gmi_url"));
        Driver.wait(1);
    }

    @Then("click on Menu icon")
    public void click_on_menu_icon() {
        Us_005.MenuIcon.click();
    }

    @Then("click on SignIn")
    public void click_on_sign_in() {
        Us_005.SignInButton.click();
    }

    @Then("user click on username")
    public void user_click_on_username() {
        Us_005.UserNameButton.click();
    }

    @Then("enter a invalid username")
    public void enter_a_invalid_username() {
        Us_005.UserNameButton.sendKeys("MozeSveSamoNjegaNe");
    }

    @Then("user click on password")
    public void user_click_on_password() {
        Us_005.PasswordButton.click();
    }

    @Then("enter a valid password")
    public void enter_a_valid_password() {
        Us_005.PasswordButton.sendKeys("$Qc@4wVWbl2A*0", Keys.ENTER);
    }

    @Then("user verify the error message")
    public void user_verify_the_error_message() {
        String actual = Us_005.VerifyMessage.getText();
        Assert.assertTrue(actual.contains("Failed to sign in! Please check your credentials and try again."));
       // Assert.assertTrue(Us_005.VerifyMessage.isDisplayed());
        System.out.println(actual);
    }

//Scenario2:

    @Then("Kullanıcı adı tıklıyor")
    public void kullanici_adi_tikliyor() {
        Us_005.UserNameButton.click();
    }

    @Then("Valıd kullanıcı adı veriyor")
    public void valid_kullanici_adi_veriyor() {
        Us_005.UserNameButton.sendKeys("gerardo.schuppe");
    }

    @Then("Passwordu tıklıyor")
    public void passwordu_tikliyor() {
        Us_005.PasswordButton.click();
    }

    @Then("Yanlıs bır sıfreyı yazıyor")
    public void yanlis_bir_sifreyi_yaziyor() {
        Us_005.PasswordButton.sendKeys("123456789", Keys.ENTER);

    }

    @Then("Error messajı alıyor ve verıfe edıyor")
    public void error_messaji_aliyor_ve_verife_ediyor() {
        Assert.assertTrue(Us_005.VerifyMessage.isDisplayed());

    }

//Scenario3:

    @Then("Klikne na username")
    public void klikne_na_username() {
        Us_005.UserNameButton.click();
    }

    @Then("Pogresni username pise")
    public void pogresni_username_pise() {
        Us_005.UserNameButton.sendKeys("MozeSveSamoNjegaNe");
    }

    @Then("Klikne na password")
    public void klikne_na_password() {
        Us_005.PasswordButton.click();
    }

    @Then("Pise pogresn password")
    public void pise_pogresn_password() {
        Us_005.PasswordButton.sendKeys("123456789", Keys.ENTER);
    }

    @Then("Verifikuje error poruku")
    public void verifikuje_error_poruku() {
        Assert.assertTrue(Us_005.VerifyMessage.isDisplayed());



    }

    //Scenario4: You have to repeat actions from Scenario before


    @Then("Klikne opet na  username")
    public void Klikne_opet_na_username() {
        Us_005.UserNameButton.click();
    }

    @Then("unese lazno ime")
    public void unese_lazno_ime() {
        Us_005.UserNameButton.sendKeys("MozeSveSamoNjegaNe");
    }

    @Then("klikne na sifricu")
    public void klikne_na_sifricu() {
        Us_005.PasswordButton.click();
    }

    @Then("unese neku sifricu")
    public void unese_neku_sifricu() {
        Us_005.PasswordButton.sendKeys("123456789", Keys.ENTER);
    }

    @Then("verifikuje poruku")
    public void verifikuje_poruku() {
        Assert.assertTrue(Us_005.VerifyMessage.isDisplayed());

    }
    //Pocetak Scenaria 4:

    @Then("user click on Did you forget your password?")
    public void user_click_on_did_you_forget_your_password() {
        Us_005.DidYouForgetYourPassword.click();
    }

    @Then("click on email")
    public void click_on_email() {
        Us_005.EmailForResetButton.click();
    }

    @Then("enter a valid email")
    public void enter_a_valid_email() {
        Us_005.EmailForResetButton.sendKeys("najaavci@gmail.com");
    }

    @Then("click on Reset password")
    public void click_on_reset_password() {
        Us_005.ResetButton.click();
    }

    @Then("click on account menu")
    public void click_on_account_menu() {
        Us_005.menuIcon.click();
    }

    //Scenario5: treba da ides od sign in Ponovi scenario3

    @Then("Username Click")
    public void Username_Click() {
        Us_005.UserNameButton.click();
    }

    @Then("Usernamefill")
    public void Usernamefill() {
        Us_005.UserNameButton.sendKeys("Hello Bosnia!");
    }

    @Then("Password click")
    public void Password_click() {
        Us_005.PasswordButton.click();
    }

    @Then("Password fill")
    public void Password_fill() {
        Us_005.PasswordButton.sendKeys("Cao_Iz_Bosne");
    }

    @Then("Second SignIn Click")
    public void Second_SignIn_Click() {
        Us_005.SignInButtonSecond.click();
        Assert.assertTrue(Us_005.VerifyMessage.isDisplayed());
    }


    //Scenario 5 koraci:

    @Then("click on You don't have an account yet? Register a new account")
    public void click_on_you_don_t_have_an_account_yet_register_a_new_account() {
        Us_005.CreateAnAccount.click();
    }

    @Then("enter a valid ssn number")
    public void enter_a_valid_ssn_number() {
        Us_005.ssnTextBox.sendKeys(faker.idNumber().ssnValid());

    }

    @Then("Enter a valid First Name")
    public void enter_a_valid_first_name() {
        Us_005.firstNameTextBox.sendKeys(faker.name().firstName());

    }

    @Then("Enter a valid Last Name")
    public void enter_a_valid_last_name() {
        Us_005.lastNameTextBox.sendKeys(faker.name().lastName());
    }

    @Then("Enter a valid Address")
    public void enter_a_valid_address() {
        Us_005.adressTextBox.sendKeys(faker.address().fullAddress());

    }

    @Then("Enter a valid Phone Number")
    public void enter_a_valid_phone_number() {
        Us_005.phoneNumberTextBox.sendKeys("020 7183 8750");
    }

    @Then("Enter a username")
    public void enter_a_username() {
        Us_005.usernameTextBox.sendKeys(faker.name().username());
    }

    @Then("Enter a valid Email7")
    public void enter_a_valid_email7() {
        Us_005.emailTextBox.sendKeys(faker.internet().emailAddress());
    }

    @Then("Enter a New password")
    public void enter_a_new_password() {
        Us_005.firstPasswordTextBox.sendKeys("123456Pg_Try@");
    }

    @Then("Enter a New password confirmation")
    public void enter_a_new_password_confirmation() {
        Us_005.secondPasswordTextBox.sendKeys("123456Pg_Try@");
    }

    @Then("Click on Register")
    public void click_on_register() {
        Us_005.registerButton.click();
    }

    @Then("verify the saved message")
    public void verify_the_saved_message() {
        Assert.assertTrue(Us_005.savedMessage.isDisplayed());
    }

}

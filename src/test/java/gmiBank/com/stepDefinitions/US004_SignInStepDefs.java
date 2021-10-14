package gmiBank.com.stepDefinitions;

import gmiBank.com.pages.US_004SignInPage;
import gmiBank.com.utilities.ConfigReader;
import gmiBank.com.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class US004_SignInStepDefs {

    US_004SignInPage us_004SignInPage = new US_004SignInPage();

    @Given("go to homepage")
    public void goToHomepage() {
        Driver.getDriver().get(ConfigReader.getProperty("gmi_url"));
    }

    @And("Kullanıcı Menu tuşuna tıklar")
    public void kullanıcıMenuTuşunaTıklar() {
        us_004SignInPage.menuIconButton.click();
    }

    @And("Kullanıcı Sign in buttonunu tıklar")
    public void kullanıcıSignInButtonunuTıklar() {
        us_004SignInPage.signInbutton.click();
    }

    @Then("Kullanici Username basligini dogrular ve gecerli bir Username girer")
    public void kullaniciUsernameBasliginiDogrularVeGecerliBirUsernameGirer() {
        us_004SignInPage.usernameLogin.sendKeys(ConfigReader.getProperty("usernameHuse"));

    }

    @Then("Kullanici Password basligini dogrular ve gecerli bir Password girer")
    public void kullaniciPasswordBasliginiDogrularVeGecerliBirPasswordGirer() {
        us_004SignInPage.passwortLogin.sendKeys(ConfigReader.getProperty("passwordHuse"));
    }

    @And("Kullanici Sign in butonunu tiklar")
    public void kullaniciSignInButonunuTiklar() {
        us_004SignInPage.signInSubbutton.click();
    }

    @And("Kullanici adini dogrula {string}")
    public void kullaniciAdiniDogrula(String userName) {
        String text = us_004SignInPage.usurNameText.getText();
        System.out.println(text);
        Assert.assertEquals(text,userName);

    }

    @When("Kullanici Account ve Sign out tiklar")
    public void kullaniciAccountVeSignOutTiklar() {
        us_004SignInPage.usurNameText.click();

    }

    @Then("Kullanici menuden cikar ve Ana menuyü dogrular")
    public void kullaniciMenudenCikarVeAnaMenuyüDogrular() {
        us_004SignInPage.signOutButton.click();
        String text = us_004SignInPage.textOutContaier.getText();
        Assert.assertEquals(text,"THANK YOU FOR USING US...");


    }

    @When("Kullanici Cancel basligini dogrular ve Cancel butonunu tiklar")
    public void kullaniciCancelBasliginiDogrularVeCancelButonunuTiklar() {
        us_004SignInPage.cancelButton.click();
    }

    @Then("Kullanici menuden cikar ve Ana menuyü URL den dogrular")
    public void kullaniciMenudenCikarVeAnaMenuyüURLDenDogrular() {
        String text = Driver.getDriver().getCurrentUrl();
        System.out.println(text);
        Assert.assertEquals(text, "https://www.gmibank.com/");
    }


    @And("kullanici {string} ve {string} sisteme girer")
    public void kullaniciVeSistemeGirer(String username, String password) {
        us_004SignInPage.usernameLogin.clear();
        us_004SignInPage.usernameLogin.sendKeys(username);
        us_004SignInPage.passwortLogin.clear();
        us_004SignInPage.passwortLogin.sendKeys(password);

    }

    @When("{string} aciklamasini dogrular")
    public void aciklamasiniDogrular(String message) {
        Driver.waitForVisibility(us_004SignInPage.textFailedToSignIn,5);
        String text = us_004SignInPage.textFailedToSignIn.getText();
        System.out.println(text + " -> explanation");
        Assert.assertEquals(text,message,"Bug");

    }


    @Then("Acilan Pup-up ifadesinin {string} oldugunu dogrular")
    public void acilanPupUpIfadesininOldugunuDogrular(String message) {
        Driver.wait(1);
        String text = us_004SignInPage.pupUpMessage.getText();
        System.out.println(text + " -> pup up window");
        Assert.assertTrue(text.contains(message));

    }
}

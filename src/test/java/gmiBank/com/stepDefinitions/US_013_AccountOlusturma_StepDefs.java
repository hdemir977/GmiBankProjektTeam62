package gmiBank.com.stepDefinitions;

import gmiBank.com.pages.*;
import gmiBank.com.utilities.ConfigReader;
import gmiBank.com.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class US_013_AccountOlusturma_StepDefs {
    US_007_UserInfoPage us_007_userInfoPage=new US_007_UserInfoPage();
    US_013_AccountOlusturmaPage us_013_accountOlusturmaPage=new US_013_AccountOlusturmaPage();
    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();
    RegistrationPage registrationPage=new RegistrationPage();
    Actions actions=new Actions(Driver.getDriver());

    @Given("Kullanici {string} anasayfasina gider.")
    public void kullaniciAnasayfasinaGider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty(string));

    }
    @And("Kullanici sag ustte bulunan insan figurune tiklar.")
    public void kullanici_sag_ustte_bulunan_insan_figurune_tiklar() {
        registrationPage.menuIcon.click();
    }

    @Given("Kullanici sign in butonuna tiklar")
    public void kullanici_sign_in_butonuna_tiklar() {
        homePage.homePageSignIn.click();
    }

    @Given("Kullanici username textbox'ina {string} datasini girer.")
    public void kullanici_username_textbox_ina_datasini_girer(String string) {
        loginPage.userName.sendKeys(ConfigReader.getProperty(string));
    }

    @Given("Kullanici pasword textbox'ina {string} datasini girer.")
    public void kullanici_pasword_textbox_ina_datasini_girer(String string) {
        loginPage.newPassword.sendKeys(ConfigReader.getProperty(string));
    }

    @Given("Kullanici sign in butonunu tiklar.")
    public void kullanici_sign_in_butonunu_tiklar() {
        loginPage.singInLogin.click();
    }

    @And("Kullanici manage account butonunu tiklar.")
    public void kullaniciManageAccountButonunuTiklar() {
        us_013_accountOlusturmaPage.manageAccounts.click();
        Driver.wait(5);
    }

    @Then("Kullanici create new account botonunu tiklar.")
    public void kullaniciCreateNewAccountBotonunuTiklar() {
       us_013_accountOlusturmaPage.createNewAccount.click();
    }

    //TC_01
    @Then("Kullanici acilir pencere de description kismini bos birakirsa {string} mesajini almalidir.")
    public void kullaniciAcilirPencereDeDescriptionKisminiBosBirakirsaMesajiniAlmalidir(String string) {
        us_013_accountOlusturmaPage.descriptionBox.sendKeys(" ", Keys.ENTER);
        String expectedMessage=ConfigReader.getProperty(string);
        String actualMessage=us_013_accountOlusturmaPage.descriptioninvalidMessage.getText();
        Assert.assertEquals(actualMessage,expectedMessage);

    }
    //TC_02
    @Then("Kullanici acilir pencerede balance checkbox'ina {string} girebilmelidir.")
    public void kullaniciAcilirPenceredeBalanceCheckboxInaGirebilmelidir(String string) {
    }
}

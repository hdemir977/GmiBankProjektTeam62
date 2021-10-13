package gmiBank.com.stepDefinitions;

import gmiBank.com.pages.HomePage;
import gmiBank.com.pages.LoginPage;
import gmiBank.com.pages.RegistrationPage;
import gmiBank.com.pages.US_007_UserInfoPage;
import gmiBank.com.utilities.ConfigReader;
import gmiBank.com.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;


public class US_007_UserInfo_StepDefs {
    US_007_UserInfoPage us_007_userInfoPage=new US_007_UserInfoPage();
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

    @And("Kullanici isminin oldugu\\(Salih Sen)'i tiklar.")
    public void kullaniciIsmininOlduguSalihSenITiklar() {
        us_007_userInfoPage.accountMenu.click();
    }

    @Given("Kullanici user info butonunu tiklar.")
    public void kullanici_user_info_butonunu_tiklar() {
       us_007_userInfoPage.userInfo.click();
    }

    @And("Kullanici email checkbox'ina {string} girer.")
    public void kullaniciEmailCheckboxInaGirer(String string) {
        us_007_userInfoPage.emailBox.clear();
        us_007_userInfoPage.emailBox.sendKeys(ConfigReader.getProperty(string));

    }
    @Then("Kullanici gecersiz datayi girdikten sonra {string} mesajini almalidir.")
    public void kullanici_gecersiz_datayi_girdikten_sonra_mesajini_almalidir(String string) {
        us_007_userInfoPage.saveButon.click();
        String actualMessage=us_007_userInfoPage.invalidMessage.getText();
        String expectedMessage=ConfigReader.getProperty(string);
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @Then("Kullanici sayfayi kapatir.")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

     //TC_02


    @Given("Kullanici language butonunu tikladiginda sadece Ingilizce ve Turkce dil seceneklerini gormelidir.")
    public void kullaniciLanguageButonunuTikladigindaSadeceIngilizceVeTurkceDilSecenekleriniGormelidir() {

        Select selectListe=new Select(us_007_userInfoPage.lanquageSelect);
        List<WebElement> languesList=selectListe.getOptions();
        for (WebElement each:languesList) {
            System.out.println(each.getText());
            Assert.assertTrue(each.getText().contains("English") || each.getText().contains("Türkçe"));
        }
    }



}

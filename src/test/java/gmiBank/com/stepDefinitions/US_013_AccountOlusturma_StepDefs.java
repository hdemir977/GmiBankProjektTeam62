package gmiBank.com.stepDefinitions;

import gmiBank.com.pages.*;
import gmiBank.com.utilities.ConfigReader;
import gmiBank.com.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class US_013_AccountOlusturma_StepDefs {
    US_007_UserInfoPage us_007_userInfoPage = new US_007_UserInfoPage();
    US_013_AccountOlusturmaPage us_013_accountOlusturmaPage = new US_013_AccountOlusturmaPage();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    Actions actions = new Actions(Driver.getDriver());



    @And("Kullanici myOperation butonunu tiklar.")
    public void kullaniciMyOperationButonunuTiklar() {
        us_013_accountOlusturmaPage.myOperations.click();
    }

    @And("Kullanici manage account butonunu tiklar.")
    public void kullaniciManageAccountButonunuTiklar() {
        us_013_accountOlusturmaPage.manageAccounts.click();
    }

    @Then("Kullanici create new account botonunu tiklar.")
    public void kullaniciCreateNewAccountBotonunuTiklar() {
        us_013_accountOlusturmaPage.createNewAccount.click();

    }

    //TC_01
    @Then("Kullanici acilir pencere de description kismini bos birakirsa {string} mesajini almalidir.")
    public void kullaniciAcilirPencereDeDescriptionKisminiBosBirakirsaMesajiniAlmalidir(String string) {
        us_013_accountOlusturmaPage.descriptionBox.sendKeys(" ", Keys.ENTER);
        String expectedMessage = ConfigReader.getProperty(string);
        String actualMessage = us_013_accountOlusturmaPage.descriptioninvalidMessage.getText();
        Assert.assertEquals(actualMessage, expectedMessage);

    }

    //TC_02
    @Then("Kullanici acilir pencerede balance checkbox'ina {string} girebilmelidir.")
    public void kullaniciAcilirPenceredeBalanceCheckboxInaGirebilmelidir(String string) {
        us_013_accountOlusturmaPage.balanceBox.sendKeys(ConfigReader.getProperty("balancedeger")+ Keys.ENTER);
        String girilenDeger=us_013_accountOlusturmaPage.balanceBox.getAttribute("value");
        String expected=ConfigReader.getProperty("balancedeger");
        Assert.assertEquals(girilenDeger,expected,"ilgili alan bos");



    }

    //TC_03
    @Then("Kullanici acilir pencerede balance checkbox'ini bos birakirsa {string} mesajini almalidir.")
    public void kullaniciAcilirPenceredeBalanceCheckboxIniBosBirakirsaMesajiniAlmalidir(String string) {
        us_013_accountOlusturmaPage.balanceBox.sendKeys(" ", Keys.ENTER);
        String expectedBalanceMessage = ConfigReader.getProperty(string);
        String actualBalanceMessage = us_013_accountOlusturmaPage.balanceInvalidMessage.getText();
        Assert.assertEquals(actualBalanceMessage, expectedBalanceMessage);
    }

    //TC_04
    @Then("Kullanici account type'lerden bir {string} secebilmelidir.")
    public void kullaniciAccountTypeLerdenBirSecebilmelidir(String string) {
        Select select = new Select(us_013_accountOlusturmaPage.accountTypeSelect);
        select.selectByIndex(0);
        String actualType = select.getFirstSelectedOption().getText();
        System.out.println(select.getFirstSelectedOption().getText());
        String expectedType = ConfigReader.getProperty(string);
        Assert.assertEquals(actualType, expectedType);
    }

    @Then("Kullanici Hesap durumunu {string} ile tanimlayabilmelidir.")
    public void kullaniciHesapDurumunuIleTanimlayabilmelidir(String string) {
        Select select = new Select(us_013_accountOlusturmaPage.accountStatusTypeSelect);
        select.selectByIndex(0);
        String actualType = select.getFirstSelectedOption().getText();
        System.out.println(select.getFirstSelectedOption().getText());
        String expectedType = ConfigReader.getProperty(string);
        Assert.assertEquals(actualType, expectedType);
        //String secili=us_013_accountOlusturmaPage.accountStatusTypeSelect.getText();
        //System.out.println(secili);
        //Assert.assertFalse(secili.isEmpty(),"Ilgili alanda hesap durumu secilemedi.");
    }

    @Then("Kullanici employee kismindan istege bagli olarak {string} secebilir.")
    public void kullaniciEmployeeKismindanIstegeBagliOlarakSecebilir(String string) {
        Select select=new Select(us_013_accountOlusturmaPage.employeeSelect);

        String actual=select.getFirstSelectedOption().getText();

        System.out.println(actual);
        try{
            Assert.assertFalse(actual.isEmpty(),"Ilgili alan bos");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("BUGG var");
        }







    }
}
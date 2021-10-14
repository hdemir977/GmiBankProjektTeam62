package gmiBank.com.stepDefinitions;

import gmiBank.com.pages.US011_DateCheckPage;
import gmiBank.com.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.Map;

public class US011_DateCheckStepDefs {

    US011_DateCheckPage DateCheckPage = new US011_DateCheckPage();

    @And("Cikan sayfada sag uste My Operations a tikla")
    public void cikanSayfadaSagUsteMyOperationsATikla() {
        Driver.waitForClickablility(DateCheckPage.myOperationButton, 5).click();
    }

    @And("Manage Customers a tikla")
    public void manageCustomersATikla() {
        DateCheckPage.manageCustomersButton.click();
    }

    @Then("Sag uste cikan Create a new Customer butonuna tikla")
    public void sagUsteCikanCreateANewCustomerButonunaTikla() {
        DateCheckPage.createNewCustomerButton.click();
    }

    @And("SSN textbox a kayıtlı bir SSN no gir")
    public void ssnTextboxAKayıtlıBirSSNNoGir() {
        DateCheckPage.ssnTextBox.sendKeys("587-54-4321");
    }

    @And("Search butonuna tikla")
    public void searchButonunaTikla() {
        DateCheckPage.searchButton.click();

    }

    @And("Middle Initial textbox a data gir")
    public void middleInitialTextboxADataGir() {
        DateCheckPage.middleInitialTextBox.sendKeys("D");
    }

    @And("Phone Number textbox a data gir")
    public void phoneNumberTextboxADataGir() {
        DateCheckPage.phoneNumberTextBox.sendKeys("654-987-6321");
    }

    @And("Zip Code textbox a data gir")
    public void zipCodeTextboxADataGir() {
        DateCheckPage.zipCodeTextBox.sendKeys("98752");

    }

    @And("City textbox a data gir")
    public void cityTextboxADataGir() {
        DateCheckPage.cityTextBox.sendKeys("Frankfurt");
    }

    @And("Create Date textbox a şu andaki tarihi data gir")
    public void createDateTextboxAŞuAndakiTarihiDataGir() {
        DateCheckPage.createDateTextBox.sendKeys("15.10.2021");
    }

    @And("County den bir ulke sec")
    public void countyDenBirUlkeSec() {
//        List<WebElement> countries = Driver.getDriver().findElements((By) DateCheckPage.countrySelect);
//        System.out.println(countries);
        Driver.selectAnItemFromDropdown(DateCheckPage.countrySelect,"USA");
        DateCheckPage.stateTextBox.sendKeys("NewYork");
    }


    @And("Account dropdrowndan bir hesap sec")
    public void accountDropdrowndanBirHesapSec() {
        Driver.selectAnItemFromDropdown(DateCheckPage.accountSelect,"asd");


    }

    @Then("Save botonuna tikla")
    public void saveBotonunaTikla() {
        Driver.wait(6);
        DateCheckPage.saveButton.click();

    }


    @Then("Acilan Pup-up ifadesinin {string} oldugunu dogrularr")
    public void acilanPupUpIfadesininOldugunuDogrularr(String message) {
        Driver.wait(1);
        String text = DateCheckPage.pupUpAlert.getText();
        System.out.println(text + " -> pup up window");
        // Assert.assertEquals(text, message, "Bug");
        Assert.assertTrue(text.contains(message));

    }





    @And("Middle Initial textbox {string} gir")
    public void middleInitialTextboxGir(String arg0) {
        System.out.println(arg0);
    }

    @And("Phone Number textbox {string} gir")
    public void phoneNumberTextboxGir(String arg0) {
        System.out.println(arg0);
    }

    @And("Zip Code textbox {string} gir")
    public void zipCodeTextboxGir(String arg0) {
    }

    @And("City textbox {string} gir")
    public void cityTextboxGir(String arg0) {
    }

    @And("Create Date textbox a şu andaki tarihi {string} gir")
    public void createDateTextboxAŞuAndakiTarihiGir(String arg0) {
    }

    @And("County den bir {string} sec")
    public void countyDenBirSec(String arg0) {
    }

    @And("Account dropdrowndan bir {string} sec")
    public void accountDropdrowndanBirSec(String arg0) {
    }

    @And("user should fill to the fields")
    public void userShouldFillToTheFields(DataTable dataTable) {
        Map<String, String> map=dataTable.asMap(String.class, String.class);
        Driver.waitAndSendText(DateCheckPage.middleInitialTextBox,map.get("middleInitial"),2);
        Driver.waitAndSendText(DateCheckPage.phoneNumberTextBox,map.get("phoneNumber"),2);
        Driver.waitAndSendText(DateCheckPage.zipCodeTextBox,map.get("zipCode"),2);
        Driver.waitAndSendText(DateCheckPage.cityTextBox,map.get("city"),2);
        Driver.waitAndSendText(DateCheckPage.createDateTextBox,map.get("date"),2);
        Driver.waitAndSendText(DateCheckPage.countrySelect,map.get("ulke"),2);
        Driver.waitAndSendText(DateCheckPage.accountSelect,map.get("hesap"),2);


    }



    @And("Create Date textbox a eksik tarih gir")
    public void createDateTextboxAEksikTarihGir() {
    }

    @Then("Tarih Text Box class degerinin invalid oldugunu test et")
    public void tarihTextBoxClassDegerininInvalidOldugunuTestEt() {
    }

    @And("Zelle Enrolled box a tik at")
    public void zelleEnrolledBoxATikAt() {
    }
}

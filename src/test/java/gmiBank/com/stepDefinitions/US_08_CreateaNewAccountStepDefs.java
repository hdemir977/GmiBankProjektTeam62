package gmiBank.com.stepDefinitions;

import gmiBank.com.pages.US_08PasswordPage;
import gmiBank.com.pages.US_14CreateaNewAccountPAge;
import gmiBank.com.utilities.Driver;
import gmiBank.com.utilities.JSUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class US_08_CreateaNewAccountStepDefs {
    US_14CreateaNewAccountPAge createaccount=new US_14CreateaNewAccountPAge();
    US_08PasswordPage passpage =new US_08PasswordPage();
    String zelleEnrolled;
    String customerId;
    List<WebElement> accountList;
    int randaccountID;

    @And("User clicks to My Operations menu")
    public void userClicksToMyOperationsMenu() {
        createaccount.myOperationsButton.click();
    }

    @Then("User clicks to Manage Accounts button")
    public void userClicksToManageAccountsButton() {
        createaccount.manageAccountsButton.click();
    }

    @Then("User clicks to Create a new Account button")
    public void userClicksToCreateANewAccountButton() {
        createaccount.createnewAccountButton.click();
    }

    @Then("User enter {string} in the Description and {string} in the balance boxes")
    public void userEnterInTheDescriptionAndInTheBalanceBoxes(String description, String balance) {
        createaccount.descriptionInput.sendKeys(description);
        createaccount.balanceInput.sendKeys(balance);
    }

    @Then("User enter earlier Date in Create Date box.")
    public void userEnterEarlierDateInCreateDateBox() {
        createaccount.createDateInput.sendKeys("10/10/2020 12:00 AM");
    }

    @Then("User enter the later Date at the time of creation time.")
    public void userEnterTheLaterDateAtTheTimeOfCreationTime() {
        createaccount.closedDateInput.sendKeys("10/10/2022 12:00 AM");
    }

    @Then("User enter Save button.")
    public void userEnterSaveButton() {
        createaccount.saveButton.click();
        Driver.wait(10);
    }

    @And("User checks if new account has been created")
    public void userChecksIfNewAccountHasBeenCreated() {
        String currrentURL=Driver.getDriver().getCurrentUrl();
        System.out.println(currrentURL);
        try {
            Assert.assertTrue(currrentURL.equals("https://www.gmibank.com/tp-account/new"),"BAGGGG-The date typed earlier, in the past, at the time of creation an account");
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            passpage.accountButton.click();
            passpage.logoutButton.click();
        }

    }


    @Then("User create Date as month, day, year, hour and minute and click Enter")
    public void userCreateDateAsMonthDayYearHourAndMinuteAndClickEnter() {
        createaccount.createDateInput.sendKeys("11.20.2021 12:00 AM");
        createaccount.createDateInput.sendKeys(Keys.ENTER);
    }

    @And("Check the date in Create Date box")
    public void checkTheDateInCreateDateBox() {
        String DateInput=createaccount.createDateInput.getAttribute("value");
        System.out.println(DateInput);
        String DateExpected="2021-11-20T00:00";
        try {
            Assert.assertEquals(DateInput, DateExpected, " BAGGG-The date cannot be entered in the order requested. ");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            passpage.accountButton.click();
            passpage.logoutButton.click();
        }
    }

    @Then("User clicks to Manage Customer Button")
    public void userClicksToManageCustomerButton() {
        createaccount.manageCustomerButton.click();
    }

    @Then("User clicks to Create a new Customer button")
    public void userClicksToCreateANewCustomerButton() {
        createaccount.createnewCustomerButton.click();
    }

    @Then("User enter a valid SSN nummer {string} in SSN box")
    public void userEnterAValidSSNNummerInSSNBox(String SSNnumber) {
        createaccount.searchSSNInput.sendKeys(SSNnumber);
    }

    @Then("User clicks search button")
    public void userClicksSearchButton() {
        createaccount.searchCustomerButton.click();
        Driver.wait(3);
    }

    @And("Check it is not blank")
    public void checkItIsNotBlank() {
        String actualName=createaccount.fistNameInput.getAttribute("value");
        System.out.println(actualName);
        try {
            Assert.assertTrue(!actualName.isEmpty(), "BAGGG_Alan bos");
        } catch (Exception e){
        e.printStackTrace();
    }finally {
        passpage.accountButton.click();
        passpage.logoutButton.click();
    }

    }

    @Then("User select any random account and click on their id.")
    public void userSelectAnyRandomAccountAndClickOnTheirId() {

        System.out.println(createaccount.accountIds.size());
        Random rand=new Random();
        int randaccountID=rand.nextInt(createaccount.accountIds.size());
        System.out.println(randaccountID);
        createaccount.accountIds.get(randaccountID).click();


    }

    @And("Check this is an account")
    public void checkThisIsAnAccount() {
        String accountText=createaccount.accountHeader.getText();
        try {
            Assert.assertTrue(accountText.equals("Account"), "BAGGG_bu bir account degil");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            passpage.accountButton.click();
            passpage.logoutButton.click();
        }

    }

    @Then("user select any random customer and click on their id.")
    public void userSelectAnyRandomCustomerAndClickOnTheirId() {
        accountList=createaccount.accountIds;
        System.out.println(createaccount.accountIds.size());
        Random rand=new Random();
        randaccountID=rand.nextInt(createaccount.accountIds.size()-1);
        System.out.println(randaccountID);
        System.out.println(createaccount.accountIds.get(randaccountID).getText());
        customerId=createaccount.accountIds.get(randaccountID).getText();
        createaccount.accountIds.get(randaccountID).click();
    }

    @Then("User checks Zelle Enrolled box and clicks Edit buttonbuttons should be clickable")
    public void userChecksZelleEnrolledBoxAndClicksEditButtonbuttonsShouldBeClickable() {
        Driver.wait(2);
        JSUtils.scrollIntoVIewJS(createaccount.zelleEnrolledInfo);
        Driver.wait(3);
        System.out.println( createaccount.zelleEnrolledInfo.getText());
        zelleEnrolled=createaccount.zelleEnrolledInfo.getText();
        createaccount.editButton.click();

    }

    @Then("User clicks Zelle Enrolled button and save button")
    public void userClicksZelleEnrolledButtonAndSaveButton() {
        Driver.wait(3);
        JSUtils.scrollIntoVIewJS(createaccount.zelleEnrolledInput);
        createaccount.zelleEnrolledInput.click();
        createaccount.saveButton.click();
    }

    @And("Check Zelle Enrolled changed")
    public void checkZelleEnrolledChanged() {
        Driver.wait(20);
        //accountList=createaccount.accountIds;
        System.out.println(accountList.get(randaccountID).getText());
        JSUtils.scrollIntoVIewJS(accountList.get(randaccountID));
        JSUtils.clickElementByJS(accountList.get(randaccountID));
        JSUtils.scrollIntoVIewJS(createaccount.zelleEnrolledInfo);
        String actualZelleText=createaccount.zelleEnrolledInfo.getText();
        boolean actualZelleboolean = Boolean.parseBoolean( actualZelleText );


        System.out.println(actualZelleboolean);
        boolean expectedZelleEnrolled=Boolean.parseBoolean(zelleEnrolled);
        System.out.println(expectedZelleEnrolled);
        Assert.assertTrue(expectedZelleEnrolled!=actualZelleboolean, "BAGGG");



    }
}

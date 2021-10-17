package gmiBank.com.stepDefinitions;

import gmiBank.com.pages.AyhanUS010Page;
import gmiBank.com.pages.DemoPage;
import gmiBank.com.pages.RegistrationPage;
import gmiBank.com.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DemoSteps {
    RegistrationPage registrationPage=new RegistrationPage();
    AyhanUS010Page ayhanUS010Page=new AyhanUS010Page();
    DemoPage demopage=new DemoPage();

    @And("enter valid ssn no {string} demo")
    public void enterValidSsnNoDemo(String ssn) {
        registrationPage.ssnTextBox.sendKeys(ssn);
    }
//    @And("enter valid ssn no demo")
//    public void enterValidSsnNoDemo() {
//        registrationPage.ssnTextBox.sendKeys("345-23-8768");
//    }

    @And("enter new password {string} demo")
    public void enterNewPasswordDemo(String pass) {
        registrationPage.firstPasswordTextBox.sendKeys(pass);
    }

    @And("enter new password confirmation {string} demo")
    public void enterNewPasswordConfirmationDemo(String pass) {
        registrationPage.secondPasswordTextBox.sendKeys(pass);
    }

    @And("select from county dropdown")
    public void select_empty_from_county_dropdown() {

            Select select = new Select(ayhanUS010Page.countrydropdown);
           select.selectByIndex(5);
    }

    @And("enter text {string} in State")
    public void enterTextInState(String state) {
        demopage.stateInput.sendKeys(state);
    }

    @And("select from accounts  {string} and {string} accounts")
    public void selectFromAccountsAndAccounts(String account1, String account2) {

//        List<WebElement> accounts=demopage.accounts;
//        for (WebElement e:accounts) {
//            //System.out.println(e.getText());
//            if(e.getText().contains(account1) || e.getText().contains(account2))
//            {
//                System.out.println(e.getText());
//            e.click();
//           }
        Driver.wait(3);
        Select selectaccount=new Select(demopage.accountsSelect);
        selectaccount.selectByVisibleText(account1);

        selectaccount.selectByVisibleText(account2);
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor .executeScript ("window.scrollBy (0,500)");
        Driver.wait(8);

        }



    @And("User checks if new account has been created demo")
    public void userChecksIfNewAccountHasBeenCreatedDemo() {

        String currrentURL=Driver.getDriver().getCurrentUrl();
        System.out.println(currrentURL);
        try {
            Assert.assertTrue(currrentURL.equals("https://www.gmibank.com/tp-account?page=1&sort=id,asc"),"BAGGGG-The date typed earlier, in the past, at the time of creation an account");
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {

        }
    }

    @Then("User enter earlier Date in Create Date box demo")
    public void userEnterEarlierDateInCreateDateBoxDemo() {
        demopage.createDateInput.sendKeys("15/10/2021 07 ");
    }



//    @And("enter valid username demo")
//    public void enterValidUsernameDemo() {
//        registrationPage.usernameTextBox.sendKeys("Team62DemoUser");
//    }

    @And("click Activate button")
    public void clickActivateButton() {
        Driver.wait(3);
        demopage.activateButton.click();
    }

    @And("enter valid customer username {string}")
    public void enterValidCustomerUsername(String userName) {
        demopage.userName.sendKeys(userName);
    }

    @And("enter valid customer password {string}")
    public void enterValidCustomerPassword(String pass) {
        demopage.newPassword.sendKeys(pass);
    }


    @And("enter valid username {string} demo")
    public void enterValidUsernameDemo(String username) {
        registrationPage.usernameTextBox.sendKeys(username);
    }

    @And("click on sign in button demo")
    public void clickOnSignInButtonDemo() {
        Driver.wait(1);
        demopage.singInLogin.click();
    }

    @And("click Activate button {string}")
    public void clickActivateButton(String adres) {
        Driver.wait(3);
        demopage.userEdit(adres).click();
        //if (demopage.activatebox.getAttribute("value")=="false")
        demopage.activatebox.click();
        Driver.wait(5);
        demopage.singInLogin.click();
        //demopage.userActivation(adres).click();
        Driver.wait(5);
    }

    @And("click on My Operations and My Accounts")
    public void clickOnMyOperationsAndMyAccounts() {
        demopage.myOperationscustomer.click();
        demopage.myAccountsCustomer.click();
        Driver.wait(2);
    }

    @And("click on My Operations and Transfer Money")
    public void clickOnMyOperationsAndTransferMoney() {
        demopage.myOperationscustomer.click();
        demopage.transferMoneyButton.click();



    }

    @And("Select fromaccount {string} and toaccount {string}")
    public void selectFromaccountAndToaccount(String from, String to) {
        Select fromA=new Select(demopage.fromAccount);
        fromA.selectByIndex(1);
        Select toA=new Select(demopage.toAccount);
        toA.selectByIndex(1);
    }

    @And("enter {string} to balance box")
    public void enterToBalanceBox(String transfer) {
        demopage.balanceInput.sendKeys(transfer);
    }

    @And("enter {string} in description box")
    public void enterInDescriptionBox(String desc) {
        demopage.descriptionInput.sendKeys(desc);
    }

    @And("click make transfer button")
    public void clickMakeTransferButton() {
        demopage.makeTransferButton.click();
    }

    @And("click both viewTransaction buttons")
    public void clickBothViewTransactionButtons() {
        demopage.viewTransactionfirstButton.click();
        Driver.wait(3);
        demopage.viewTransactionsecondButton.click();
        Driver.wait(3);
    }
    @And("enter a valid phone Number to phone number text box demo")
    public void enterAValidPhoneNumberToPhoneNumberTextBoxDemo() {
        ayhanUS010Page.phoneNumber.sendKeys("123-987-9876");
    }
}

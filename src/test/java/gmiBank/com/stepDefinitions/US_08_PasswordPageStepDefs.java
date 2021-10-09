package gmiBank.com.stepDefinitions;

import gmiBank.com.pages.US_08PasswordPage;
import gmiBank.com.utilities.ConfigReader;
import gmiBank.com.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class US_08_PasswordPageStepDefs {

    US_08PasswordPage passpage=new US_08PasswordPage();

    @Given("Given User navigates go to {string}")
    public void givenUserNavigatesGoTo(String string) {

        Driver.getDriver().get(ConfigReader.getProperty(string));

    }
    @Then("click menu icon1")
    public void click_menu_icon() {
        passpage.menuIcon.click();
    }

    @Then("user logged in with a valid username and password")
    public void userLoggedInWithAValidUsernameAndPassword() {
    passpage.signinbutton.click();
    passpage.usernameInput.sendKeys(ConfigReader.getProperty("usernameEmployee"));
    passpage.passwordInput.sendKeys(ConfigReader.getProperty("passwordEmployee"));
    passpage.signInSubmitButton.click();

    }

    @Then("User clicks to account menu")
    public void userClicksToAccountMenu() {
    passpage.accountButton.click();
    }

    @Then("User clicks to password button")
    public void userClicksToPasswordButton() {
        passpage.passwordButton.click();
    }

    @Then("User enters the current password in the current and new password boxes")
    public void userEntersTheCurrentPasswordInTheCurrentAndNewPasswordBoxes() {
        passpage.currentPasswordInput.sendKeys(ConfigReader.getProperty("passwordEmployee"));
        passpage.newPasswordInput.sendKeys(ConfigReader.getProperty("passwordEmployee"));
    }

    @And("Check the fail-box message")
    public void checkTheFailBoxMessage() {
        passpage.confirmPasswordInput.click();
        Assert.assertEquals(passpage.failMessageBox.getText(),"New password should be different from the current one.","BAGGGG");
        System.out.println(passpage.failMessageBox.getText());
    }

    @Then("User enters {string} to use at least  {string} char for stronger password and see the level chart change accordingly")
    public void userEntersToUseAtLeastCharForStrongerPasswordAndSeeTheLevelChartChangeAccordingly(String pass, String exp) {
        passpage.newPasswordInput.sendKeys(pass);
        String colour=passpage.strengthBar.getCssValue("background-color");
        System.out.println(colour);
        Assert.assertTrue(colour.contains(ConfigReader.getProperty("orange")));
        System.out.println("User enters "+pass+" to use at least "+ exp+ " char for stronger password and see the level chart colour changed "+ConfigReader.getProperty(colour));

    }

    @And("user logged out")
    public void userLoggedOut() {
        passpage.accountButton.click();
        passpage.logoutButton.click();
    }

    @Then("User enters {string} to use at least  {string} char for stronger password and see the level chart colour {string} change  accordingly")
    public void userEntersToUseAtLeastCharForStrongerPasswordAndSeeTheLevelChartColourChangeAccordingly(String pass, String exp, String renk) {
        passpage.newPasswordInput.sendKeys(pass);
        String colour=passpage.strengthBar.getCssValue("background-color");
        System.out.println(colour);
        Assert.assertTrue(colour.contains(ConfigReader.getProperty(renk)),"User enters "+pass+" to use at least "+ exp+ " char for stronger password and can not see the level chart colour changed "+ConfigReader.getProperty(colour));
        System.out.println("User enters "+pass+" to use at least "+ exp+ " char for stronger password and see the level chart colour changed "+renk);



    }

    @Then("User enter old password in password box and a valid new password in new password and confirmation boxes")
    public void userEnterOldPasswordInPasswordBoxAndAValidNewPasswordInNewPasswordAndConfirmationBoxes() {
        passpage.currentPasswordInput.sendKeys(ConfigReader.getProperty("password"));
        passpage.newPasswordInput.sendKeys(ConfigReader.getProperty("newValidPass"));
        passpage.confirmPasswordInput.sendKeys(ConfigReader.getProperty("newValidPass"));

    }

    @Then("User should not see fail message under the new password box.")
    public void userShouldNotSeeFailMessageUnderTheNewPasswordBox() {

        Assert.assertTrue(passpage.failMessageBox.getText().isEmpty(),"BAGGGG-Fail message has seen-"+passpage.failMessageBox.getText());
        System.out.println("Fail message not detected");
    }
}

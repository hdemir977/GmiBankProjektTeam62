package gmiBank.com.stepDefinitions;

import gmiBank.com.pages.US003Page;
import gmiBank.com.utilities.ConfigReader;
import gmiBank.com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US003_Step {
    US003Page us_03_page = new US003Page();
    @Given("User go to the GMi Bank home page")
    public void user_go_to_the_g_mi_bank_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("gmi_url"));
    }

    @Given("Click on user button")
    public void click_on_user_button() {
        us_03_page.userButton.click();
    }

    @Given("You should navigate to registration page")
    public void you_should_navigate_to_registration_page() {
        us_03_page.registerButton.click();
    }

    @Given("Click on Password textbox")
    public void click_on_password_textbox() {
        us_03_page.firstPassBox.click();
    }

    @Given("Enter a password with {int} lowercase letter of at least {int} characters")
    public void enter_a_password_with_lowercase_letter_of_at_least_characters(Integer int1, Integer int2) {
        us_03_page.firstPassBox.sendKeys(ConfigReader.getProperty("lower_case"));
        String renk = us_03_page.line1.getCssValue("background-color");
        System.out.println(renk);
        Assert.assertTrue(renk.contains(ConfigReader.getProperty("red")));

    }



    @Given("Enter a password with {int} uppercase letter of at least {int} characters")
    public void enter_a_password_with_uppercase_letter_of_at_least_characters(Integer int1, Integer int2) {
        us_03_page.firstPassBox.sendKeys(ConfigReader.getProperty("upper_case"));
        String renk = us_03_page.line1.getCssValue("background-color");
        System.out.println(renk);
        Assert.assertTrue(renk.contains(ConfigReader.getProperty("orange")));
    }



    @Given("Enter a password with {int} digit of at least {int} characters")
    public void enter_a_password_with_digit_of_at_least_characters(Integer int1, Integer int2) {
        us_03_page.firstPassBox.sendKeys(ConfigReader.getProperty("digit"));
        String renk = us_03_page.line1.getCssValue("background-color");
        System.out.println(renk);
        Assert.assertTrue(renk.contains(ConfigReader.getProperty("lime")));
    }



    @Then("Enter to second textbox with {int} special char of at least {int} characters")
    public void enter_to_second_textbox_with_special_char_of_at_least_characters(Integer int1, Integer int2) {
        us_03_page.firstPassBox.sendKeys(ConfigReader.getProperty("special_char"));
        String renk = us_03_page.line1.getCssValue("background-color");
        System.out.println(renk);
        Assert.assertTrue(renk.contains(ConfigReader.getProperty("green")));
    }

    @Given("Enter a password with {int} chars")
    public void enter_a_password_with_chars(Integer int1) {
        us_03_page.firstPassBox.sendKeys(ConfigReader.getProperty("full_pass"));
        String renk = us_03_page.line1.getCssValue("background-color");
        System.out.println(renk);
        Assert.assertTrue(renk.contains(ConfigReader.getProperty("green")));
    }

    @Then("Enter to second textbox a password with {int} chars")
    public void enter_to_second_textbox_a_password_with_chars(Integer int1) {
        us_03_page.secondPassBox.click();
    }

}

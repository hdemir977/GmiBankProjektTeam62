package gmiBank.com.stepDefinitions;

import gmiBank.com.pages.US009Page;
import gmiBank.com.utilities.ConfigReader;
import gmiBank.com.utilities.Driver;
import io.cucumber.java.en.Given;

public class US009_Step {
    US009Page us_09_page = new US009Page();

    @Given("User navigates go to gmibank login page")
    public void user_navigates_go_to_gmibank_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("gmibank_login_url"));
    }

    @Given("send username to username box {string}")
    public void send_username_to_username_box(String string) {
        us_09_page.username.sendKeys(ConfigReader.getProperty("user03"));
    }

    @Given("send password to password box {string}")
    public void send_password_to_password_box(String string) {
        us_09_page.password.sendKeys(ConfigReader.getProperty("password03"));
    }

    @Given("click sign in")
    public void click_sign_in() {
        us_09_page.signInButton.click();
    }

    @Given("click to my operations")
    public void click_to_my_operations() {
        us_09_page.myOperations.click();
    }

    @Given("click to manage customers")
    public void click_to_manage_customers() {
        us_09_page.manageCustomers.click();
    }

    @Given("click to create a new customer")
    public void click_to_create_a_new_customer() {
        us_09_page.createANewCustomer.click();
    }

    @Given("type a valid SSN {string}")
    public void type_a_valid_ssn(String string) {
        us_09_page.ssnSearch.sendKeys("541-01-4572");
    }

    @Given("click search button")
    public void click_search_button() {
        us_09_page.search.click();

    }

    @Given("verify search button")
    public void verify_search_button() {
        Driver.wait(2);
        System.out.println(us_09_page.successMessage.getText());
        boolean clickable = us_09_page.search.isEnabled();
        System.out.println(clickable);
    }

    @Given("getAttribute from firstname box")
    public void get_attribute_from_firstname_box() {
        Driver.wait(2);
        System.out.println(us_09_page.firstName.getAttribute("value"));
    }

    @Given("getAttribute from lastname box")
    public void get_attribute_from_lastname_box() {
        Driver.wait(2);
        System.out.println(us_09_page.lastName.getAttribute("value"));
    }

    @Given("getAttribute from email box")
    public void get_attribute_from_email_box() {
        Driver.wait(2);
        System.out.println(us_09_page.emailBox.getAttribute("value"));
    }

    @Given("getAttribute from mobile phone number box")
    public void get_attribute_from_mobile_phone_number_box() {
        Driver.wait(2);
        System.out.println(us_09_page.mobilePhoneNumber.getAttribute("value"));
    }

    @Given("getAttribute from phone number box")
    public void get_attribute_from_phone_number_box() {

            Driver.wait(2);
            System.out.println(us_09_page.phoneNumber.getAttribute("value"));
        }

        @Given("getAttribute from phone ssn box")
        public void get_attribute_from_phone_ssn_box () {
            Driver.wait(2);
            System.out.println(us_09_page.ssnBox.getAttribute("value"));
        }




    }


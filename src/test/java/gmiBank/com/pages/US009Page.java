package gmiBank.com.pages;

import gmiBank.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US009Page {
    public US009Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "username")
    public WebElement username;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(id = "entity-menu")
    public WebElement myOperations;

    @FindBy(xpath= "//span[text() = 'Manage Customers']")
    public WebElement manageCustomers;

    @FindBy(id = "jh-create-entity")
    public WebElement createANewCustomer;

    @FindBy(id = "search-ssn")
    public WebElement ssnSearch;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement search;

    @FindBy(className = "Toastify__toast-body")
    public WebElement successMessage;

    @FindBy(name = "firstName")
    public WebElement firstName;

    @FindBy(name = "lastName")
    public WebElement lastName;

    @FindBy(name = "email")
    public WebElement emailBox;

    @FindBy(name = "mobilePhoneNumber")
    public WebElement mobilePhoneNumber;

    @FindBy(name = "phoneNumber")
    public WebElement phoneNumber;

    @FindBy(name = "ssn")
    public WebElement ssnBox;


}

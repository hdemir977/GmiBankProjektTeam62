package gmiBank.com.pages;

import gmiBank.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AyhanUS010Page {
    public AyhanUS010Page() {
        PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "//*[@name='username']")
    public WebElement ManagerUserName;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement ManagerNewPassword;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement singInLogin;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/a/span")
    public WebElement myOperations;

    @FindBy(xpath = "//*[.='Manage Customers']")
    public WebElement manageCustomers;

    @FindBy(xpath = "//*[.='Create a new Customer']")
    public WebElement createANewCustomer;

    @FindBy(xpath = "//input[@id='search-ssn']")
    public WebElement ssnTextBox;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement popupAlert;

    @FindBy(xpath = "//input[@name='middleInitial']")
    public WebElement middleInitial;

    @FindBy(xpath = "//input[@name='phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@name='zipCode']")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@name='address']")
    public WebElement address;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement errormessageAddress;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement city;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement errormessageCity;

    @FindBy(id = "tp-customer-country")
    public WebElement countrydropdown;

    @FindBy(id = "tp-customer-state")
    public WebElement state;

    @FindBy(id = "save-entity")
    public WebElement savebutton;











    }

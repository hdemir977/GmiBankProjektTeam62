package gmiBank.com.pages;

import gmiBank.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    public RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "account-menu")
    public WebElement menuIcon;

    @FindBy (xpath = "//a[@class='dropdown-item'][2]")
    public WebElement registerOption;

    @FindBy (xpath = "//input[@id='ssn']")
    public WebElement ssnTextBox;

    @FindBy (xpath = "//input[@id='firstname']")
    public WebElement firstNameTextBox;

    @FindBy (xpath = "//input[@id='lastname']")
    public WebElement lastNameTextBox;

    @FindBy (xpath = "//input[@name='address']")
    public WebElement adressTextBox;

    @FindBy (xpath = "//input[@id='mobilephone']")
    public WebElement phoneNumberTextBox;

    @FindBy (xpath = " //input[@id='username']")
    public WebElement usernameTextBox;

    @FindBy (xpath = "//input[@id='email']")
    public WebElement emailTextBox;

    @FindBy (xpath = "//input[@id='firstPassword']")
    public WebElement firstPasswordTextBox;

    @FindBy (xpath = "//input[@name='secondPassword']")
    public WebElement secondPasswordTextBox;

    @FindBy (id = "register-submit")
    public WebElement registerButton;

    @FindBy(xpath = "//div[@style='pointer-events: none;']")
    public WebElement savedMessage;

    ////div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']
    ////div[@style='pointer-events: none;']

}

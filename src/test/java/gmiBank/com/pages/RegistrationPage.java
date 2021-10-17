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

    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement registration_successMessage;
    @FindBy(xpath = "//*[contains(text(),'Your First Name is required')]")
    public WebElement registration_alertMessageFirstName;
    @FindBy(xpath = "//*[contains(text(),'Your Last Name is required')]")
    public WebElement registration_alertMessageLastName;
    @FindBy(xpath = "//div[(text() ='Your SSN is invalid')]")
    public WebElement registration_alertMessageSSN;
    @FindBy(xpath = "//div[(text() ='translation-not-found[Your SSN is required]')]")
    public WebElement registration_alertMessageSSN2;
    @FindBy(xpath = "//div[(text() ='Your mobile phone number is invalid')]")
    public WebElement registration_alertMessageMobileNumber;
    @FindBy(xpath = "//div[(text() ='Your username is required.')]")
    public WebElement registration_alertMessageUsername;
    @FindBy(xpath = "//div[(text() ='Your email is required.')]")
    public WebElement registration_alertMessageEmail;
    @FindBy(xpath = "//div[(text() ='Your password is required.')]")
    public WebElement registration_alertMessagePassword;
    @FindBy(xpath = "//div[(text() ='Your confirmation password is required.')]")
    public WebElement registration_alertMessageSecondPassword;
    @FindBy(xpath = "//div[.='Please enter your address.']")
    public WebElement registration_alerMessageAdress;


    ////div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']
    ////div[@style='pointer-events: none;']

}

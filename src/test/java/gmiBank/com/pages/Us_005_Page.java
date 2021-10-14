package gmiBank.com.pages;

import gmiBank.com.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Us_005_Page {


    public Us_005_Page () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement MenuIcon;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement SignInButton;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement UserNameButton;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement PasswordButton;

    @FindBy(xpath = "//div[@class='alert alert-danger fade show']")
    public WebElement VerifyMessage;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement SignInButtonSecond;

    @FindBy(xpath = "//a[@href='/account/reset/request']")
    public WebElement DidYouForgetYourPassword;



    @FindBy(xpath = "//input[@id='email']")
    public WebElement EmailForResetButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement ResetButton;

    //Registration Data Scenario5

    @FindBy(id = "account-menu")
    public WebElement menuIcon;

    @FindBy(xpath= ("(//a[@href='/account/register'])[2]"))
    public WebElement CreateAnAccount;
   // "//div[@class='alert alert-warning fade show'][2]"

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

    @FindBy (id ="register-submit")
    public WebElement registerButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement savedMessage;


}

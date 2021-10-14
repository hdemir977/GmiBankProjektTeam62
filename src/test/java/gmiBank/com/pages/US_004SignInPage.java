package gmiBank.com.pages;

import gmiBank.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_004SignInPage {

    public US_004SignInPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "account-menu")
    public WebElement menuIconButton;

    @FindBy(id="login-item")
    public WebElement signInbutton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameLogin;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwortLogin;

    @FindBy(xpath = "//label[@for='username']")
    public WebElement usernameLabel;

    @FindBy(xpath = "//label[@for='password']")
    public WebElement passwortLabel;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement signInSubbutton;

    @FindBy(xpath = "(//a[@class='dropdown-toggle nav-link'])[3]")
    public WebElement usurNameText;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[5]")
    public WebElement signOutButton;

    @FindBy(xpath = "(//div[@class='container'])//*")
    public WebElement textOutContaier;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement cancelButton;

    @FindBy(xpath = "(//div[@class='alert alert-danger fade show']//*)[1]")
    public WebElement textFailedToSignIn;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement pupUpMessage;

//    @FindBy(className = "invalid-feedback")
//    public WebElement failMessageBox;





}

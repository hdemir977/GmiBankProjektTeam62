package gmiBank.com.pages;

import gmiBank.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_08PasswordPage
{
    public US_08PasswordPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(id = "account-menu")
    public WebElement menuIcon;

    @FindBy(id="login-item")
    public WebElement signinbutton;

    @FindBy(id="username")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmitButton;

    @FindBy(id = "account-menu")
    public WebElement accountButton;

    @FindBy(xpath = "//a[@href='/account/password']")
    public WebElement passwordButton;

    @FindBy(xpath = "//input[@name='currentPassword']")
    public WebElement currentPasswordInput;

    @FindBy(xpath = "//input[@name='newPassword']")
    public WebElement newPasswordInput;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement confirmPasswordInput;


    @FindBy(className = "invalid-feedback")
    public WebElement failMessageBox;

    @FindBy(xpath = "//ul[@id='strengthBar']/li")
    public WebElement strengthBar;

    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement logoutButton;


}

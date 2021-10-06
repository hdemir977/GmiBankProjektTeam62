package gmiBank.com.pages;

import gmiBank.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@name='username']")
    public WebElement userName;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement newPassword;

    @FindBy(linkText = "Cancel")
    public WebElement cancelButton;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement singInLogin;


}

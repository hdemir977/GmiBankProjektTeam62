package gmiBank.com.pages;

import gmiBank.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_019_Naja {


    public US_019_Naja(){ PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id = "login-item")
    public WebElement signIn;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id ="password")
    public WebElement password;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement singInLoginButton;

    @FindBy(id = "tp-account-description")
    public WebElement DescriptionButton;

    @FindBy(id = "tp-account-balance")
    public WebElement BalanceButton;

    @FindBy(id = "tp-account-accountType")
    public WebElement AccountTypeButton;

    @FindBy(id = "tp-account-accountStatusType")
    public WebElement AccountStatusTypeButton;

    @FindBy(id = "tp-account-employee")
    public WebElement EmployeeButton;

}



package gmiBank.com.pages;

import gmiBank.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "account-menu")
    public WebElement menuIcon;

    @FindBy(partialLinkText = "Sign in")
    public WebElement homePageSignIn;

    @FindBy(partialLinkText = "Register")
    public WebElement homePageRegister;

}

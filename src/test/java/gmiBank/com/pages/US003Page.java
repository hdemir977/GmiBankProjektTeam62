package gmiBank.com.pages;

import gmiBank.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US003Page {
    public US003Page(){
     PageFactory.initElements(Driver.getDriver(),this);
}

    @FindBy(id = "account-menu")
    public     WebElement userButton;
    @FindBy (xpath = "//*[.='Register']")
    public WebElement registerButton;
    @FindBy (id = "firstPassword")
    public WebElement firstPassBox;
        @FindBy (id = "secondPassword")
    public WebElement secondPassBox;
    @FindBy (xpath = "(//li[@class='point'])[1]")
    public WebElement line1;


}

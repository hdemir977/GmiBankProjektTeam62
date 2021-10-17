package gmiBank.com.pages;

import gmiBank.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_007_UserInfoPage {

    public US_007_UserInfoPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (css = "#account-menu")
    public WebElement accountMenu;

    @FindBy (xpath = "(//a[@class='dropdown-item'])[3]")
    public WebElement userInfo;

    @FindBy (css= "#email")
    public WebElement emailBox;

    @FindBy (css="#langKey")
    public WebElement lanquageSelect;

    @FindBy(xpath = "//option[text()='English']")
    public WebElement english;

    @FindBy(xpath = "//option[text()='Türkçe']")
    public WebElement turkce;

    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement saveButon;

    @FindBy (className = "invalid-feedback")
    public WebElement invalidMessage;

}

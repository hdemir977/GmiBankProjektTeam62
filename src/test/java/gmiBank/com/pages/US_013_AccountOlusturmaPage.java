package gmiBank.com.pages;

import gmiBank.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_013_AccountOlusturmaPage {

    public US_013_AccountOlusturmaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id="entity-menu")
    public WebElement myOperations;

    @FindBy (xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement manageAccounts;

    @FindBy (id="jh-create-entity")
    public WebElement createNewAccount;

    @FindBy (css = "#tp-account-description")
    public WebElement descriptionBox;

    @FindBy (xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement descriptioninvalidMessage;

    @FindBy (css = "#tp-account-balance")
    public WebElement balanceBox;

    @FindBy (xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement balanceInvalidMessage;

    @FindBy (css = "#tp-account-accountType")
    public WebElement accountTypeSelect;

    @FindBy(css = "#tp-account-accountStatusType")
    public WebElement accountStatusTypeSelect;

    @FindBy(css ="#tp-account-employee")
    public WebElement employeeSelect;


}

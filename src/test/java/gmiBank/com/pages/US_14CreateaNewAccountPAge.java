package gmiBank.com.pages;

import gmiBank.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_14CreateaNewAccountPAge {


    public US_14CreateaNewAccountPAge() {        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement myOperationsButton;

    @FindBy(xpath = "//a[@href='/tp-account']")
    public WebElement manageAccountsButton;

    @FindBy(xpath = "//a[@href='/tp-account/new']")
    public WebElement createnewAccountButton;

    @FindBy(xpath = "//input[@name='description']")
    public WebElement descriptionInput;

    @FindBy(xpath = "//input[@name='balance']")
    public WebElement balanceInput;

    @FindBy(xpath = "//input[@name='createDate']")
    public WebElement createDateInput;

    @FindBy(xpath = "//input[@name='closedDate']")
    public WebElement closedDateInput;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(xpath = "//a[@href='/tp-customer']")
    public WebElement manageCustomerButton;

    @FindBy(xpath = "//a[@href='/tp-customer/new']")
    public WebElement createnewCustomerButton;

    @FindBy(id = "search-ssn")
    public WebElement searchSSNInput;

    @FindBy(className = "btn-secondary")
    public WebElement searchCustomerButton;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement fistNameInput;

    @FindBy(xpath = "//td/a")
    public List<WebElement> accountIds;

    @FindBy(xpath = "//h2/span")
    public WebElement accountHeader;

    @FindBy(xpath = "(//span[@id='zelleEnrolled']//ancestor::dt//following-sibling::dd)[1]")
    public WebElement zelleEnrolledInfo;

    @FindBy(className = "btn-primary")
    public WebElement editButton;

    @FindBy(xpath = "//input[@name='zelleEnrolled']")
    public WebElement zelleEnrolledInput;


}

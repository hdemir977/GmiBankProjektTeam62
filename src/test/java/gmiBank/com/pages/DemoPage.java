package gmiBank.com.pages;

import gmiBank.com.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DemoPage {

    public DemoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "account-menu")
    public WebElement menuIcon;

    @FindBy (xpath = "//a[@class='dropdown-item'][2]")
    public WebElement registerOption;

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

    @FindBy(xpath = "//div[@style='pointer-events: none;']")
    public WebElement savedMessage;

    //----------------------------------------//
    @FindBy (id = "tp-customer-state")
    public WebElement stateInput;

    @FindBy (xpath = "//select[@id='tp-customer-account']/option")
    public List<WebElement> accounts;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement toastMessageMessage;

    @FindBy(xpath = "//input[@name='createDate']")
    public WebElement createDateInput;

    @FindBy(xpath = "(//tr[@id='team62demouser01']//td)[4]")
    public WebElement activateButton;

    public WebElement userActivation(String adress){
        return Driver.getDriver().findElement(By.xpath("(//tr[@id='"+adress+"']//td)[4]"));
    }

    @FindBy(xpath = "//*[@name='username']")
    public WebElement userName;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement newPassword;

    @FindBy(linkText = "Cancel")
    public WebElement cancelButton;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement singInLogin;

    @FindBy (xpath = "//select[@id='tp-customer-account']")
    public WebElement accountsSelect;

    @FindBy (xpath = "//span[text()='My Operations']")
    public WebElement myOperationscustomer;

    @FindBy (xpath = "//a[text()='My Accounts']")
    public WebElement myAccountsCustomer;

    @FindBy (xpath = "//a[text()='Transfer Money']")
    public WebElement transferMoneyButton;

    @FindBy (id = "fromAccountId")
    public WebElement fromAccount;

    @FindBy (id = "toAccountId")
    public  WebElement toAccount;

    @FindBy (xpath = "//input[@name='balance']")
    public WebElement balanceInput;

    @FindBy (id = "description")
    public  WebElement descriptionInput;

    @FindBy (id = "make-transfer")
    public WebElement makeTransferButton;

    @FindBy (xpath = "(//button[text()='View Transaction'])[1]")
    public WebElement viewTransactionfirstButton;

    @FindBy (xpath = "(//button[text()='View Transaction'])[2]")
    public WebElement viewTransactionsecondButton;

    @FindBy (xpath = "//a[@href='/admin/user-management/team62demouser09/edit']")
    public WebElement editbuttonforcustomer;

    public WebElement userEdit(String adress){
        return Driver.getDriver().findElement(By.xpath("//a[@href='/admin/user-management/"+adress+"/edit']"));

    }

    @FindBy (id = "activated")
    public WebElement activatebox;
}


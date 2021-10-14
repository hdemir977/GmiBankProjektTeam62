package gmiBank.com.pages;

import gmiBank.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_012_EmployeePage {

    public US_012_EmployeePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//span[contains(text(), 'My Operations')]")
    public WebElement myOperationsMenu;

    @FindBy(xpath= "//span[text() = 'Manage Customers']")
    public WebElement manageCustomersOption;

    @FindBy(xpath = "//th[@class='hand']")
    public List<WebElement> idColumList;

    @FindBy(xpath = "//a[@class='btn btn-info btn-sm']")
    public WebElement viewButton;

    @FindBy(xpath = "(//span[text()='Edit'])[1]")
    public WebElement editButton;

    @FindBy(xpath ="//div[@class='form-group']")
    public List<WebElement> editList;

    @FindBy(xpath = "//td[text()='Alan']")
    public WebElement firstname;

    @FindBy(xpath = "//td[text()='Conroy']")
    public WebElement lastname;
    //td[text()='Conroy']

    @FindBy(xpath= "//span[text()='Edit']")
    public WebElement editButton1;

    @FindBy(xpath = "//input[@name='id']")
    public WebElement id;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName2;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName2;

    @FindBy(xpath = "//input[@name='middleInitial']")
    public WebElement middleInitial;

//delete
    @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm'])[1]")
    public WebElement delete1;

    @FindBy(xpath = "//span[contains(text(), 'Are you sure you want to delete Customer 51602?')]")
    public WebElement infoDeleteMessage;

    @FindBy(xpath = "//button[@id='jhi-confirm-delete-tPCustomer']")
    public WebElement deleteButton2;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement cancelButton2;

    @FindBy(xpath = "//a[@id='cancel-save']")
    public WebElement backButton;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement saveButton;



}

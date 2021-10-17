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



    @FindBy(id ="username")
    public WebElement loginPageUsernameTextBox;

    @FindBy(xpath = "//span[contains(text(), 'My Operations')]")
    public WebElement myOperations;

    @FindBy(xpath= "//span[text() = 'Manage Customers']")
    public WebElement manageCustomers;

    @FindBy(xpath ="//th[@class='hand']")
    public List<WebElement> columnList;

    @FindBy(xpath= "(//span[@class='d-none d-md-inline'])[1]")
    public WebElement viewButton;

    @FindBy(xpath= "(//span[@class='d-none d-md-inline'])[2]")
    public WebElement editButton;

    //div[@class='form-group']

    @FindBy(xpath ="//div[@class='form-group']")
    public List<WebElement> editList;

    @FindBy(xpath = "//*[text()='cxhdfbx']")
    public WebElement firstName;    //*[text()='Schiller']

    @FindBy(xpath = "//*[text()='Thiel']")
    public WebElement lastName;

    @FindBy(xpath = "//div[@class='col-md-8']")
    public List<WebElement> viewList;

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

//    @FindBy(xpath = "//a[@href='/tp-customer/1719/delete?page=1&sort=id,asc']")
//    public WebElement delete;

    @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm'])[2]")
    public WebElement delete;

//    @FindBy(xpath = "(//a[ contains(@href, 'delete?page=1&sort=id,asc')])[4]")
//    public WebElement delete;

    @FindBy(id ="gmibankfrontendApp.tPCustomer.delete.question")
    public WebElement confDeleteMessage;

    @FindBy(id="jhi-confirm-delete-tPCustomer")
    public WebElement delete2;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement deleteSuccesMessage;

    @FindBy(xpath = "//a[@class='btn btn-info']")
    public WebElement backButton;



}

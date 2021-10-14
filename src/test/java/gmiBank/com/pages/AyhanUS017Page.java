package gmiBank.com.pages;

import gmiBank.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AyhanUS017Page {
    public AyhanUS017Page() {PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "//input[@name='username']")
    public WebElement adminUserName;


    @FindBy(xpath = "//input[@name='password']")
    public WebElement adminPassword;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement singInLogin;

//    @FindBy(xpath = "(//a[@class='dropdown-toggle nav-link'])[2]")
//    public WebElement administration;
    @FindBy(xpath = "//*[.='Administration']")
    public WebElement administration;


    @FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
    public WebElement userManagement;
//    @FindBy(xpath = "//*[.='User management']")
//    public WebElement userManagement;


    @FindBy(xpath = "//*[.='Create a new user']")
    public WebElement createANewUser;

    @FindBy(id="login")
    public WebElement loginTextBox;

    @FindBy(id ="firstName")
    public WebElement firstNameTextBox;

//    @FindBy(id = "lastName")
//    public WebElement lastNameTextBox;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameTextBox;

    @FindBy(id = "email")
    public WebElement emailTextBox;

    @FindBy(xpath = "//option[@value='ROLE_USER']")
    public WebElement roleUser;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement toastMessageMessage;

//    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
//    public WebElement toastMessageMessage;

    @FindBy(xpath = "//span[@class='badge badge-info']")
    public WebElement roleUser2;

//    @FindBy(xpath = "//a[@class='btn btn-info']")
//    public WebElement backButton;

    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    public WebElement backButton;

//    @FindBy(xpath = "//*[.='Back']")
//    public WebElement backButton;

    @FindBy(xpath = "//span[text()='Created date']")
    public WebElement createdDate;

//    @FindBy(xpath = "(//svg[@class='svg-inline--fa fa-sort fa-w-10 '])[5]")
//    public WebElement createdDate;

//    @FindBy(xpath = "(//th[@class='hand'])[5]")
//    public WebElement createdDate;
    //*[@id="app-view-container"]/div[1]/div/div/div/div[1]/table/thead/tr/th[7]
    //*[@id="app-view-container"]/div[1]/div/div/div/div[1]/table/thead/tr/th[7]
//    @FindBy(xpath = "//*[.='Created date']")
//    public WebElement createdDate;

    @FindBy(xpath = "//a[@class='btn btn-info btn-sm']")
    public WebElement viewButton;


    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement editButton;

    @FindBy(xpath = "//a[@class='btn btn-danger btn-sm']")
    public WebElement deleteButton;

    @FindBy(xpath = "//option[@value='ROLE_EMPLOYEE']")
    public WebElement roleEmployee;

    @FindBy(xpath = "//span[@class='badge badge-info']")
    public WebElement roleEmployee2;

    @FindBy(xpath = "//option[@value='ROLE_MANAGER']")
    public WebElement roleManager;

    @FindBy(xpath = "//span[@class='badge badge-info']")
    public WebElement roleManager2;

    @FindBy(xpath = "//option[@value='ROLE_ADMIN']")
    public WebElement roleAdmin;

    @FindBy(xpath = "//span[@class='badge badge-info']")
    public WebElement roleAdmin2;


    @FindBy(xpath = "(//*[.='Delete'])[41]")
    public WebElement deleteButton2;





//    @FindBy(xpath = "(//a[@href='javascript:void(0)'])[8]")
//    public WebElement lastPage;
//
//    @FindBy(xpath = "(//a[@class='btn btn-info btn-sm'])[12]")
//    public WebElement viewButton;

    //    @FindBy(xpath = "//*[.='View']")
//    public WebElement viewButton;

//    @FindBy(xpath = "//a[@class='btn btn-info btn-sm']")
//    public WebElement viewButton;

//    @FindBy(xpath = "//*[@id=\"bekir\"]/td[10]/div/a[1]/span/span")
//    public WebElement viewButton;

//    @FindBy(id = "lastName")
//    public WebElement lastNameTextBox;

}

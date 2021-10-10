package gmiBank.com.pages;

import gmiBank.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AyhanUS017Page {
    public AyhanUS017Page() {PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "//*[@name='username']")
    public WebElement adminUserName;


    @FindBy(xpath = "//input[@name='password']")
    public WebElement adminPassword;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement singInLogin;

    @FindBy(xpath = "//*[.='Administration']")
    public WebElement administration;

    @FindBy(xpath = "//*[.='User management']")
    public WebElement userManagement;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement editButton;

    @FindBy(xpath = "//option[@value='ROLE_USER']")
    public WebElement roleUser;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement toastMessage;

//    @FindBy(xpath = "//*[.='View']")
//    public WebElement viewButton;

//    @FindBy(xpath = "//a[@class='btn btn-info btn-sm']")
//    public WebElement viewButton;

    @FindBy(xpath = "//*[@id=\"bekir\"]/td[10]/div/a[1]/span/span")
    public WebElement viewButton;

    @FindBy(xpath = "//span[@class='badge badge-info']")
    public WebElement roleUser2;

    @FindBy(xpath = "//a[@class='btn btn-danger btn-sm']")
    public WebElement delete;

    @FindBy(xpath = "(//button[@class='btn btn-danger'])[4]")
    public WebElement delete2;


//    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
//    public WebElement back;
}

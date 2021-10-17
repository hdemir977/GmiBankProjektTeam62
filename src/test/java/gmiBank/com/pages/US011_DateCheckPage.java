package gmiBank.com.pages;

import gmiBank.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US011_DateCheckPage {

    public US011_DateCheckPage()
        {
            PageFactory.initElements(Driver.getDriver(), this);
        }


    @FindBy(xpath = "//span[text()='My Operations']")       //  //span[text()='My Operations']
    public WebElement myOperationButton;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement manageCustomersButton;

    @FindBy(id = "jh-create-entity")
    public WebElement createNewCustomerButton;

    @FindBy(id = "search-ssn")
    public WebElement ssnTextBox;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchButton;

    @FindBy(id = "tp-customer-middleInitial")
    public WebElement middleInitialTextBox;

    @FindBy(id = "tp-customer-phoneNumber")
    public WebElement phoneNumberTextBox;

    @FindBy(id = "tp-customer-zipCode")
    public WebElement zipCodeTextBox;

    @FindBy(id = "tp-customer-city")
    public WebElement cityTextBox;

    @FindBy(id = "tp-customer-createDate")
    public WebElement createDateTextBox;

    @FindBy(id ="tp-customer-country")
    public WebElement countrySelect;

    @FindBy(id = "tp-customer-state")
    public WebElement stateTextBox;

    @FindBy(id = "tp-customer-account")
    public WebElement accountSelect;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(xpath = "(//div[@role='alert'])[1]")
    public WebElement pupUpAlert;

    @FindBy(id = "tp-customer-zelleEnrolled")
    public WebElement zelleEnrolledButton;





}

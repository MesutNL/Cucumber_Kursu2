package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "(//div[@class='ng-star-inserted']/span)[1]")
    public WebElement dashboard;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;


    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement name;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement code;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement save;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement succesMessage;

    @FindBy(xpath = "//div[contains(text(),'error')]")
    public WebElement errorMessage;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    public WebElement alreadyExist;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement searchInput;
    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;
    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogbtn;

    @FindBy(css = "div>mat-option>span")
    private List<WebElement> userTypesAllOptions;

    @FindBy(xpath = "//mat-chip-list//input")
    private WebElement userTypeclick;

    @FindBy(xpath = "(//div[@class='ps__rail-y'])[2]")
    private WebElement rightScroll;

@FindBy(xpath = "//tbody/tr/td[2]")
    public List<WebElement> nameList;


    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    private WebElement integrationcode;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']/input")
    private WebElement priority;

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;
    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editBtn;


    WebElement myElement;

    public void findAndSend(String elementname, String value) {
        switch (elementname) {
            case "username":
                myElement = username;
                break;

            case "password":
                myElement = password;
                break;

            case "name":
                myElement = name;
                break;

            case "code":
                myElement = code;
                break;

            case "shortName":
                myElement = shortName;
                break;
            case "searchInput":
                myElement = searchInput;
                break;
            case "integrationcode":
                myElement = integrationcode;
                break;
            case "priority":
                myElement = priority;
                break;


        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String elementname) {

        switch (elementname) {
            case "loginButton":
                myElement = loginButton;
                break;
            case "addButton":
                myElement = addButton;
                break;
            case "save":
                myElement = save;
                break;
            case "closeDialog":
                myElement = closeDialog;
                break;
            case "searchButton":
                myElement = searchButton;
                break;
            case "deleteButton":
                myElement = deleteButton;
                break;
            case "deleteDialogbtn":
                myElement = deleteDialogbtn;
                break;
            case "userTypeclick":
                myElement = userTypeclick;
                break;
            case "rightScroll":
                myElement = rightScroll;
                break;
            case "acceptCookies":
                myElement = acceptCookies;
                break;
            case "editBtn":
                myElement = editBtn;
                break;


        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String elementname, String msg) {

        switch (elementname) {
            case "succesMessage":
                myElement = succesMessage;
                break;
            case "errorMessage":
                myElement = errorMessage;
                break;
            case "rightScroll":
                myElement = rightScroll;
                break;

        }

        verifyContainsText(myElement, msg);
    }

    public void findAndDelete(String deleteString) {

        findAndSend("searchInput", deleteString);
        findAndClick("searchButton");

        //cop kovalari 5 den az olana kadar bekle search gozukene kadar bekle
        waitnumberOfElementsToBeLessThan(By.xpath("//ms-delete-button//button"), 5);

        findAndClick("deleteButton");
        findAndClick("deleteDialogbtn");
    }

    List<WebElement> mylist;

    public void SelectYserType(String listname, String option) {

        switch (listname) {
            case "userTypesAllOptions":
                mylist = userTypesAllOptions;
                break;
        }
        ListSelect(mylist, option);
    }

    public void findAndEdit(String oldWord, String newWord) {
        // tıklatma
        scrollToUpElement(rightScroll);
        findAndSend("searchInput", oldWord);
        findAndClick("searchButton");

        // çöp kovaları 5 den az olana kadar bekle: search sonucu gözükene kadar bekle
        waitnumberOfElementsToBeLessThan(By.xpath("//ms-delete-button//button"), 5);

        findAndClick("editBtn");

        findAndSend("name", newWord);
        findAndClick("save");
    }
}



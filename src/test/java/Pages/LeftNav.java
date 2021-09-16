package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeftNav extends Parent {

    public LeftNav() {

        PageFactory.initElements(BaseDriver.getDriver(), this);


    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement country;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement citizenShip;

    @FindBy(xpath = "(//span[text()='Inventory'])[1]")
    private WebElement inventory;

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    private WebElement setupTwo;

    @FindBy(xpath = "(//span[text()='Item Categories'])[1]")
    private WebElement itemCategories;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement Nationalities;

    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement Fees;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement SetupTwo;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement EntranceExam;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement EntranceExam2;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath = "//span[text()='Employees']")
    private WebElement Employees;


    WebElement myElement;

    public void findAndClick(String elementname) {

        switch (elementname) {
            case "setupOne":
                myElement = setupOne;
                break;
            case "parameters":
                myElement = parameters;
                break;
            case "country":
                myElement = country;
                break;
            case "citizenShip":
                myElement = citizenShip;
                break;
            case "inventory":
                myElement = inventory;
                break;
            case "setupTwo":
                myElement = setupTwo;
                break;

            case "itemCategories":
                myElement = itemCategories;
                break;
            case "Nationalities":
                myElement = Nationalities;
                break;
            case "Fees":
                myElement = Fees;
                break;

            case "SetupTwo":
                myElement = SetupTwo;
                break;
            case "EntranceExam":
                myElement = EntranceExam;
                break;
            case "EntranceExam2":
                myElement = EntranceExam2;
                break;
            case "humanResources":
                myElement = humanResources;
                break;
            case "Employees":
                myElement = Employees;
                break;


        }

        clickFunction(myElement);
    }


}

package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Locale;

public class Parent {

    public void sendKeysFunction(WebElement element, String value) {

        waitUntilVisible(element);//element gozukene kadar bekle.
        scrollToElement(element); // element e kadar java script ile kaydir
        element.clear(); // elementin icini temizle
        element.sendKeys(value); // degeri gonder.


    }

    public void clickFunction(WebElement element) {
        waitUntilClickable(element);//element clickable kadar bekle.
        scrollToElement(element);// element e kadar java script ile kaydir
        element.click(); // click yap

    }

    public static void waitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) BaseDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void scrollToUpElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) BaseDriver.getDriver();
        js.executeScript("arguments[0].setAttribute('style', 'top:0px')", element);
        js.executeScript("arguments[0].scrollIntoView();", element);
    }


    public void waitUntilClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), 30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public List<WebElement>  waitVisibleListAllElement(List<WebElement> elementList) {
        WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfAllElements(elementList));
        return elementList;
    }


    public static void delay(int second) {
        try {
            Thread.sleep(1000 * second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void verifyContainsText(WebElement element, String msg) {
        waitUntilVisible(element);//element clickable kadar bekle.
        Assert.assertTrue(element.getText().toLowerCase().contains(msg.toLowerCase()));

    }

    public void waitnumberOfElementsToBeLessThan(By selector, int number) {
        WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), 20);
        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(selector, number));
    }

    public void ListSelect(List<WebElement> userList, String option) {
        //List den istenen elemana click yapacak.
        for (WebElement user : userList) {
            if (user.getText().contains(option)) {
                user.click();
                break;
            }
        }

    }

    public void ESCClick() {
        try {
//            Robot r = new Robot();
//            r.keyPress(KeyEvent.VK_ESCAPE);
//            r.keyRelease(KeyEvent.VK_ESCAPE);
            Actions actions = new Actions(BaseDriver.getDriver());
            Action action = actions.sendKeys(Keys.ESCAPE).build();
            action.perform();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

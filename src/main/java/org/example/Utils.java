package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;

public class Utils extends BasePage {

        //Reusable method to Click on Web Element
        public static void clickOnElement(By by) {
        //Command to find element using locator and selenium will perform click action
        driver.findElement(by).click();
    }

        //Reusable method to Type
        public static void typeText(By by, String text) {
        //command to find element using locator and selenium will perform Type action.
        driver.findElement(by).sendKeys(text);
    }

        //Reusable method to get text from web element
        public static String getTextFromElement(By by) {
        //Command to find element using locator and get text
        return driver.findElement(by).getText();

    }

        //Reusable method to get Time Stamp
        public static String getTimeStamp() {
        return new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());

    }

        //Reusable method for explicit wait - wait for an element to be clickable
        public static void waitForElementToBeClickable(By by, int timeInSeconds) {
        //Command to wait explicitly until web element found and then click on it
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.elementToBeClickable(by));

    }

        //Reusable method for an element to be visible
        public static void waitForElementToBeVisible(By by, int timeInSeconds) {
        //Command to wait explicitly until web element visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

        //Reusable method for URL to be
        public static void waitForURLtoBe(String url, int timeInSeconds) {
        //Command to wait explicitly until URL
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.urlToBe(url));

    }

        //Reusable method to select web element from drop down by visible text
        public static void selectFromDropdownByVisibleText(By by, String text) {
        //Command to select web element from drop down by visible text
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

        //Reusable method to select web element from drop down by value
        public static void selectFromDropdownByValue(By by, String text) {
        //Command to select web element from drop down by value
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }

        //Reusable method to select web element from drop down by index
        public static void selectFromDropdownByIndex(By by, int index) {
        //Command to select web element from drop down by index
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }


}

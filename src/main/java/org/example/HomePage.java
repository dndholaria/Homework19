package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Utils {

    //Private variable for locator of Register button
    private By _registerButton = By.className("ico-register");


        public void verifyPresenceOfRegisterButtonOnHomePage() {
        //Assert to check boolean condition
        Assert.assertEquals(getTextFromElement(By.className("ico-register")), "Register", "Registered button is not present on home page");

    }

        //Method
        public void clickOnRegisterButton() {
        //Reusable method used to locate register button along with explicit wait 10 seconds
        waitForElementToBeClickable(_registerButton, 10);

        //Reusable method used to click register button
        clickOnElement(_registerButton);
    }

}

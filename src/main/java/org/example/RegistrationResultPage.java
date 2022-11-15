package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;


public class RegistrationResultPage extends Utils
{

        private By _registrationSuccessMessage = By.className("result");
        //Method for message displayed if registration is success
        public void registrationSuccessfulMessageDisplayed (){
        //Assert to match actual message against expected.
        Assert.assertEquals(getTextFromElement(_registrationSuccessMessage),"Your registration completed", "registration message is wrong ");
        //Print message
        String message = getTextFromElement(_registrationSuccessMessage);
        System.out.printf("Message after successful registration = " +message);
    }

}

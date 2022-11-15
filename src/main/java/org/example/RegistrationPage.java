package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationPage extends Utils
{       //Private variable for Male gender radio button
        private By _maleGenderField = By.id("gender-male");
        //Private variable for first name field
        private By _firstNameField = By.id("FirstName");
        //Private variable for last name field
        private By _lastNameField = By.id("LastName");
        //Private variable for day of Birthdate
        private By _DateOfBirthDay = By.name("DateOfBirthDay");
        //Private variable for month of Birthdate
        private By _DateOfBirthMonth = By.name("DateOfBirthMonth");
        //Private variable for year of Birthdate
        private By _DateOfBirthYear  = By.name("DateOfBirthYear");
        //Private variable for email field
        private By _emailField = By.id("Email");
        //Private variable for password field
        private By _passwordField = By.id("Password");
        //Private variable for confirm password field
        private By _confirmPasswordField = By.id("ConfirmPassword");
        //Private variable for




        //Method to verify user is on registration page
        public void verifyUserIsOnRegistrationPage(){
        //Assert boolean condition to verify user is on registration page
        Assert.assertTrue(driver.getCurrentUrl().contains("register"), "User is not on registration page");

    }



        //Method to enter registration details
        public void enterRegistrationDetails(){
            //Command to locate male radio button and click on it
            clickOnElement(_maleGenderField);
            //Command to locate first name and type DB on registration page
            typeText(_firstNameField,"DB");
            //Command to locate last name and type Patel on registration page
            typeText(_lastNameField, "Patel");
            //Command to select day of Birth date
            selectFromDropdownByValue(_DateOfBirthDay,"10");
            //Command to select month of Birth date
            selectFromDropdownByValue(_DateOfBirthMonth,"2");
            //Command to select year of Birth date
            selectFromDropdownByValue(_DateOfBirthYear,"1920");
            //Command to locate email by id and type email address as per sendKeys on registration page
            typeText(_emailField,"abc"+getTimeStamp()+"@gmail.com");
            //Command to locate password by id and type password as per sendKeys on registration page
            typeText(_passwordField,"123456");
            //Command to locate confirm password by id and type password as per sendKeys on registration page
            typeText(_confirmPasswordField,"123456");


        }

        //Method to click on Register button after filling registration details.
            public void clickOnRegisterButtonAfterRegistrationDetailIsEntered(){
            //  command to locate registration button by id locator and click on registration
            clickOnElement(By.id("register-button"));
    }


}

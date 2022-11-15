package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest{

    //Object of HomePage to call method from this Page
    HomePage homePage = new HomePage();
    //Object of registration page to call method from this Page
    RegistrationPage registrationPage = new RegistrationPage();
    // //Object of registration result to call method from this Page
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();


    @Test  //Annotation

    public void userShouldAbleToRegisterSuccessfully (){


        //Method called from homepage to verify presence of register button using object
        homePage.verifyPresenceOfRegisterButtonOnHomePage();
        //Method called from homepage to click on Register Button using object
        homePage.clickOnRegisterButton();
        ////Method called from Registration page to verify user is on registration page using object
        registrationPage.verifyUserIsOnRegistrationPage();
        //Method called from Registration page to verify user is on registration page using object
        registrationPage.enterRegistrationDetails();
        //Method called from registration page using object
        registrationPage.clickOnRegisterButtonAfterRegistrationDetailIsEntered();
        //Method called from registration result page using object
        registrationResultPage.registrationSuccessfulMessageDisplayed();




    }


















}

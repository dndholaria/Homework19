package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils {

    //Object created for DriverManager class
    DriverManager driverManager = new DriverManager();

        @BeforeMethod    //Annotation
        public void setUp() {
        //call open Browser method through object
        driverManager.openBrowser();
    }

        @AfterMethod   //Annotation
        public void tearDown() {
        //call close browser method through object
        driverManager.closeBrowser();
    }


}

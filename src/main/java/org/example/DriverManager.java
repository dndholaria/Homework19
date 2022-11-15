package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager extends Utils {

    public void openBrowser() {

        //method sets the system property indicated by the specified key.
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");

        //object driver for chromedriver - through typecasting
        driver = new ChromeDriver();

        //Command to maximise the window
        driver.manage().window().maximize();

        //command to open URL
        //waitForURLtoBe("https://demo.nopcommerce.com/", 5);
        driver.get("https://demo.nopcommerce.com/");


    }

        public void closeBrowser() {
        //command to open URL
        driver.close();
    }


}











































package com.project1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//Initiate Edge Driver
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.cbredev.com/#!/culture");

//Open social media icons by getting Element By Xpath
        By.xpath("/html/body/app-root/app-marketing-root/app-footer/nav/div/div[2]/div/div[4]/div[1]/a[1]/img").findElement(driver).click();

        By.xpath("/html/body/app-root/app-marketing-root/app-footer/nav/div/div[2]/div/div[4]/div[1]/a[3]/img").findElement(driver).click();

        By.xpath("/html/body/app-root/app-marketing-root/app-footer/nav/div/div[2]/div/div[4]/div[1]/a[4]/img").findElement(driver).click();

        List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));

// declare and initialize the variable to store the expected title of the webpage.
        String expectedTitle = "CBRE Dev - Home | Facebook";

//fetch the title of the web page and save it into a string variable
        String actualTitle = driver.getTitle();
        Thread.sleep(5000);

//compare the expected title of the page with the actual title of the page and print the result
        if (expectedTitle.equals(actualTitle))

        {

            System.out.println("Verification Successful - The correct title is displayed on the web page.");

        }

        else

        {

            System.out.println("Verification Failed - An incorrect title is displayed on the web page.");

        }


        driver.switchTo().window(browserTabs.get(2));

// declare and initialize the variable to store the expected title of the webpage.
        String expectedTitle1 = "CBRE Dev · GitHub";

//fetch the title of the web page and save it into a string variable

        String actualTitle1 = driver.getTitle();
        Thread.sleep(5000);

//compare the expected title of the page with the actual title of the page and print the result
        if (expectedTitle1.equals(actualTitle1))

        {

            System.out.println("Verification Successful - The correct title is displayed on the web page.");

        }

        else

        {

            System.out.println("Verification Failed - An incorrect title is displayed on the web page.");

        }


        driver.switchTo().window(browserTabs.get(3));

// declare and initialize the variable to store the expected title of the webpage.
        String expectedTitle2 = "CBRE Dev (@CBREDev) | Twitter";

//fetch the title of the web page and save it into a string variable

        String actualTitle2 = driver.getTitle();
        Thread.sleep(5000);

//compare the expected title of the page with the actual title of the page and print the result
        if (expectedTitle2.equals(actualTitle2))

        {

            System.out.println("Verification Successful - The correct title is displayed on the web page.");

        }

        else

        {

            System.out.println("Verification Failed - An incorrect title is displayed on the web page.");

        }

        System.out.println("Test Completed");

        Thread.sleep(5000);
        driver.quit();

    }
}
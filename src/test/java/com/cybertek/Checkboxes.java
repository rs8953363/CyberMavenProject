package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* Go to https://the-internet.herokuapp.com/forgot_password.
Verify enter email and submit. Verify email sent message on the next page. "Your email's been sent!"
*/
public class Checkboxes {
    public static void main(String[] args) {

        //setting driver path for chrome using the webdriver manager
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/forgot_password");
        WebElement input = driver.findElement(By.id("email"));
        input.sendKeys("somemail@somemail.com"+ Keys.ENTER);

        //or we can do the above step like this.
        input.sendKeys("somemail@somemail.com");
        input.submit();

        String expected = "Your email's been sent!";
        String actual = driver.findElement(By.id("content")).getText();
        if(actual.equals(expected)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actual = " + actual);
            System.out.println("expected = " + expected);
        }
        }
    }

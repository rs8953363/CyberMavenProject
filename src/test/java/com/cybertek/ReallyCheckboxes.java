package com.cybertek;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
/*
go to
http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox
verify monday is not selected
select monday
verify monday is selected
unselect monday
*/
public class ReallyCheckboxes {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //implicityWait only works when findElements works. If you have more than one findElement, it works for all of them.
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement monday = driver.findElement(By.id("gwt-debug-cwCheckBox-Monday-input"));
        System.out.println(monday.isSelected());
        monday.click();
        System.out.println(monday.isSelected());
        monday.click();
        System.out.println(monday.isSelected());

        if (!monday.isSelected()){
            monday.click();
        }
        System.out.println(monday.isSelected());
    }
}
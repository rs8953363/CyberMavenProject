package com.cybertek;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenTest {
    public static void main(String[] args) {
        Faker faker = new Faker();
        System.out.println(faker.address().city());
        System.out.println(faker.name().name());
        System.out.println(faker.phoneNumber().cellPhone());

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys((faker.name().title()+ Keys.ENTER));
    }
}

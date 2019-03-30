package com.techbeamers.test;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1_Negative {
    @Test
    public void TestCase1_Negative() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/rohan/Desktop/Temp/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com/");
        WebElement sighInButton = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
        sighInButton.click();
        driver.findElement(By.id("createAccountSubmit")).click();
//        WebElement apCustomerName = driver.findElement(By.id("ap_customer_name"));
//        apCustomerName.sendKeys("John");
        Thread.sleep(2000);
        WebElement apEmail = driver.findElement(By.id("ap_email"));
        apEmail.sendKeys("johndoe@gmail.com");
        Thread.sleep(2000);
        WebElement apPassword = driver.findElement(By.id("ap_password"));
        apPassword.sendKeys("Jd123456");
        Thread.sleep(2000);
        WebElement apPasswordCheck = driver.findElement(By.id("ap_password_check"));
        apPasswordCheck.sendKeys("Jd123456");
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
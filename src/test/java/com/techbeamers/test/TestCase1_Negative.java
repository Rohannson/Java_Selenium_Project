package com.techbeamers.test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;


public class TestCase1_Negative {

    public static ExtentReports extent;
    public ExtentTest test;

    @Test
    public void TestCase1_Negative() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/rohan/Desktop/Temp/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com/");
        WebElement sighInButton = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
        sighInButton.click();
        driver.findElement(By.id("createAccountSubmit")).click();
        Thread.sleep(2000);
        WebElement apEmail = driver.findElement(By.id("ap_email"));
        apEmail.sendKeys("johndoe@gmail.com");
        Thread.sleep(2000);
        WebElement apPassword = driver.findElement(By.id("ap_password"));
        apPassword.sendKeys("Jd123456");
        Thread.sleep(2000);
        WebElement apPasswordCheck = driver.findElement(By.id("ap_password_check"));
        apPasswordCheck.sendKeys("Jd123456");
        //Pressing the Button
        extent = new ExtentReports("/Users/rohan/ij_workspace/INFO6255/Java_Selenium/Java_Selenium_Project/Amazon_Selenium_Basic_Function_Test.html", true);
        test = extent.startTest("TestCase1_Negative");
        String urlBefore = driver.getCurrentUrl();
        driver.findElement(By.id("continue")).click();
        String urlAfter = driver.getCurrentUrl();
        assertEquals(urlBefore, urlAfter);
        if(urlAfter.equals(urlBefore)){
            test.log(LogStatus.PASS, "The Website prevent the Registration with invalid information");
        }
        else{
            test.log(LogStatus.FAIL, "Website fail to identify a failed Registration");
        }
        extent.endTest(test);
        extent.flush();
        driver.quit();
    }
}
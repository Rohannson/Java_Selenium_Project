package com.techbeamers.test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;


public class TestCase3 {
    public ExtentTest test;

    @Test
    public void TestCase3() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/rohan/Desktop/Temp/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.amazon.com/");
        Thread.sleep(4000);
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("chocolate");
        Thread.sleep(1000);
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input"));
        searchButton.click();
        Thread.sleep(4000);
        WebElement img = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div/div/div[2]/div[2]/div/div[1]/h5/a/span"));
        img.click();
        WebElement elementToClick = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + elementToClick.getLocation().y + ")");
        elementToClick.click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"smartShelfAddToCartNative\"]")).click();
        Thread.sleep(4000);
        String urlBefore = driver.getCurrentUrl();
        driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
        String urlAfter = driver.getCurrentUrl();
        Thread.sleep(5000);
        WebElement apEmail = driver.findElement(By.id("ap_email"));
        apEmail.sendKeys("wu.yuny@husky.neu.edu");
        Thread.sleep(4000);
        WebElement apPassword = driver.findElement(By.id("ap_password"));
        apPassword.sendKeys("Wxy19941026");
        Thread.sleep(4000);
        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(4000);
        test = TestCase1_Negative.extent.startTest("TestCase3");
        if (!urlAfter.equals(urlBefore)) {
            test.log(LogStatus.PASS, "The Website successfully proceed to Submit order page.");
        } else {
            test.log(LogStatus.FAIL, "Website fail to proceed to submit order page.");
        }
        TestCase1_Negative.extent.endTest(test);
        TestCase1_Negative.extent.flush();
        driver.quit();

    }


}

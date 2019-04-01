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



	public class TestCase1_Positive {

		public ExtentTest test;

	    @Test
	    public void TestCase1_Positive() throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "/Users/rohan/Desktop/Temp/chromedriver");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://www.amazon.com/");
	        Thread.sleep(4000);
	        WebElement sighInButton = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
	        sighInButton.click();
	        driver.findElement(By.id("createAccountSubmit")).click();
	        WebElement apCustomerName = driver.findElement(By.id("ap_customer_name"));
	        apCustomerName.sendKeys("DoeJohn");
	        Thread.sleep(4000);
	        WebElement apEmail = driver.findElement(By.id("ap_email"));
	        apEmail.sendKeys("rohantrex@126.com");
	        Thread.sleep(4000);
	        WebElement apPassword = driver.findElement(By.id("ap_password"));
	        apPassword.sendKeys("Jd123456");
	        Thread.sleep(4000);
	        WebElement apPasswordCheck = driver.findElement(By.id("ap_password_check"));
	        apPasswordCheck.sendKeys("Jd123456");
	        Thread.sleep(6000);
	        //Press the Button
			String urlBefore = driver.getCurrentUrl();
	        driver.findElement(By.id("continue")).click();
			String urlAfter = driver.getCurrentUrl();
			assertFalse(urlAfter == urlBefore);
			test = TestCase1_Negative.extent.startTest("TestCase1_Positive");
			if(!urlAfter.equals(urlBefore)){
				test.log(LogStatus.PASS, "The Website completed registration");
			}
			else{
				test.log(LogStatus.FAIL, "Website fail to complete the registration");
			}
			TestCase1_Negative.extent.endTest(test);
			TestCase1_Negative.extent.flush();
			Thread.sleep(2000);
	        driver.quit();
	    }
	}

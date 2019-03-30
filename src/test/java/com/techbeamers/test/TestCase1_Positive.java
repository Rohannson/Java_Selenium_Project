package com.techbeamers.test;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


	public class TestCase1_Positive {

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
	        driver.findElement(By.id("continue")).click();
	        Thread.sleep(4000);
	        driver.quit();
	    }
	}

package com.techbeamers.test;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
	 @Test
	    public void TestCase2() throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "/Users/rohan/Desktop/Temp/chromedriver");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://www.amazon.com/");
	        Thread.sleep(4000);
	        WebElement sighInButton = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
	        sighInButton.click();
	        WebElement apEmail = driver.findElement(By.id("ap_email"));
	        apEmail.sendKeys("wu.yuny@husky.neu.edu");
	        Thread.sleep(4000);
	        WebElement apPassword = driver.findElement(By.id("ap_password"));
	        apPassword.sendKeys("Wxy19941026");
	        Thread.sleep(4000);
	        driver.findElement(By.id("signInSubmit")).click();
	        Thread.sleep(4000);
	        driver.quit();

}
}

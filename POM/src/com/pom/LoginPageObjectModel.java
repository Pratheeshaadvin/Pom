package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.loginTestCase.LoginTestCase;
import com.loginTestCase.UpdateProfile;
import com.pagefactory.LoginPageFactory;

public class LoginPageObjectModel {
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\POM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://www.demo.guru99.com/V4/");
		Thread.sleep(3000);
		PageFactory.initElements(driver,LoginPageFactory.class);
		LoginPageFactory.userName.sendKeys("mngr495231");
		LoginPageFactory.password.sendKeys("judYpAn");
		LoginPageFactory.login.click();
		
		//UpdateProfile.profile(driver).sendKeys("");
		//UpdateProfile.phoneNumber(driver).sendKeys("");
		/*
		 * WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		 * username.sendKeys("mngr495231"); WebElement password =
		 * driver.findElement(By.xpath("//input[@type='password']"));
		 * password.sendKeys("judYpAn"); WebElement login =
		 * driver.findElement(By.xpath("//input[@type='submit']")); login.click();
		 */
	}
}

package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Pagefactorywithoutanotations {
	
	public static WebElement uid;
	public static WebElement password;
	public static WebElement btnLogin;
	@Test
	private void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\POM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://www.demo.guru99.com/V4/");
		Thread.sleep(3000);
		PageFactory.initElements(driver,Pagefactorywithoutanotations.class);
		uid.sendKeys("mngr495231");
		password.sendKeys("judYpAn");
		btnLogin.click();
		/*
		 * LoginPageFactory.userName.sendKeys("mngr495231");
		 * LoginPageFactory.password.sendKeys("judYpAn");
		 * LoginPageFactory.login.click();
		 */

	}

	
}

package com.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageFactory {
	@FindBy(xpath = "//input[@type='text']")
	public static WebElement userName;
	@FindBy(xpath = "//input[@type='password']")
	public static WebElement password;
	@FindBy(xpath = "//input[@type='submit']")
	public static WebElement login;
	
	
	
	
	
	
	/*
	 * public static WebElement userName(WebDriver driver) { return
	 * driver.findElement(By.xpath("//input[@type='text']"));
	 * 
	 * } public static WebElement password(WebDriver driver) { return
	 * driver.findElement(By.xpath("//input[@type='password']"));
	 * 
	 * } public static WebElement login(WebDriver driver) { return
	 * driver.findElement(By.xpath("//input[@type='submit']")); }
	 */
}

package com.loginTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTestCase {
	public static WebElement userName(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='text']"));

	}
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='password']"));

	}
	public static WebElement login(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='submit']"));
	}
}

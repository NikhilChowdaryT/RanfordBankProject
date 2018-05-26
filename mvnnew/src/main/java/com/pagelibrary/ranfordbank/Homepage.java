package com.pagelibrary.ranfordbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Homepage extends Base {

	
	public static WebElement Username_text(WebDriver driver){
		return driver.findElement(elements("Username_id"));
	}
	
	public static WebElement Password_text(WebDriver driver){
		return driver.findElement(elements("Password_id"));
	}
	
	public static WebElement Login_clk(WebDriver driver){
		return driver.findElement(elements("loginBtn_id"));
	}
}

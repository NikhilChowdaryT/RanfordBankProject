package com.pagelibrary.ranfordbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Roles extends Base{
	public static WebElement  Roles_clk(WebDriver driver){
		return driver.findElement((elements("Roles_xpath")));
	}
	
	public static WebElement NewRole_clk(WebDriver driver){
		return driver.findElement((elements("NewRole_id")));
	}
	

}

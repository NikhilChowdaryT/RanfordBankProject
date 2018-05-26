package com.pagelibrary.ranfordbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Employee extends Base {
	public static WebElement  Employee_clk(WebDriver driver){
		return driver.findElement((elements("Employee_xpath")));
	}
	public static WebElement  NewEmply_clk(WebDriver driver){
		return driver.findElement((elements("NewEmply_id")));
	}
}

package com.pagelibrary.ranfordbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import TestBase.Base;

public class New_User_Creation extends Base {

	public static Select  Role_srh(WebDriver driver){
		return new Select(driver.findElement((elements("Role_id"))));
	}
	public static Select  Branch_srh(WebDriver driver){
		return new Select(driver.findElement((elements("Branch_id"))));
	}
	public static Select  CustomerID_srh(WebDriver driver){
		return new Select(driver.findElement((elements("CustomerID_srh_id"))));
	}
	public static Select  CustomerName_txt(WebDriver driver){
		return new Select(driver.findElement((elements("CustomerName_id"))));
	}
	public static WebElement  UserName_txt(WebDriver driver){
		return driver.findElement((elements("UserName_id")));
	}
	public static WebElement  LoginPassword_txt(WebDriver driver){
		return driver.findElement((elements("LoginPassword_id")));
	}
	public static WebElement  Submit_clk(WebDriver driver){
		return driver.findElement((elements("Submit3_id")));
	}
	public static WebElement  Reset_clk(WebDriver driver){
		return driver.findElement((elements("Reset3_id")));
	}
	public static WebElement  Cancel_clk(WebDriver driver){
		return driver.findElement((elements("Cancel3_id")));
	}
}

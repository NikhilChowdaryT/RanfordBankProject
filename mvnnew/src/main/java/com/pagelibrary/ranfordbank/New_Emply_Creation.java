package com.pagelibrary.ranfordbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import TestBase.Base;

public class New_Emply_Creation extends Base {
	public static WebElement  EmployerName_txt(WebDriver driver){
		return driver.findElement((elements("EmployerName_id")));
	}
	public static WebElement  LoginPass_txt(WebDriver driver){
		return driver.findElement((elements("LoginPass_id")));
	}
	public static Select  Role_srh(WebDriver driver){
		return new Select(driver.findElement((elements("Role_srh_id"))));
	}
	public static Select  Branch_srh(WebDriver driver){
		return new Select (driver.findElement((elements("Branch_srh_id"))));
	}
	public static WebElement  Submit_clk(WebDriver driver){
		return driver.findElement((elements("Submit4_id")));
	}
	public static WebElement  Reset_clk(WebDriver driver){
		return driver.findElement((elements("Reset4_id")));
	}
	public static WebElement  Cancel_clk(WebDriver driver){
		return driver.findElement((elements("Cancel4_id")));
	}
}

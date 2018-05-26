package com.pagelibrary.ranfordbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import TestBase.Base;

public class Users extends Base {
	public static WebElement  Users_clk(WebDriver driver){
		return driver.findElement((elements("Users_xpath")));
	}
	
	public static Select Branch_srh(WebDriver driver){
		return new Select (driver.findElement((elements("Branchs_srh_id"))));
	}
	
	public static Select Roles_srh(WebDriver driver){
		return new Select(driver.findElement((elements("Roles_srh_id"))));
	}
	public static WebElement Search_clk(WebDriver driver){
		return driver.findElement((elements("Search_id")));
	}
	public static WebElement Clear_clk(WebDriver driver){
		return driver.findElement((elements("Clear_id")));
	}
	public static WebElement NewUser_clk(WebDriver driver){
		return driver.findElement((elements("NewUser_id")));
	}
	
}


package com.pagelibrary.ranfordbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import TestBase.Base;

public class New_Roles_Creation extends Base {
	public static WebElement RoleName_text(WebDriver driver){
		return driver.findElement((elements("RoleName_id")));
	}
	public static WebElement RoleDecs_text(WebDriver driver){
		return driver.findElement((elements("RoleDecs_id")));
	}
	public static Select RoleType_srh(WebDriver driver){
		return new Select (driver.findElement((elements("RoleType_srh_id"))));
	}
	public static WebElement Submit_clk(WebDriver driver){
		return driver.findElement((elements("Submit2_id")));
	}
	public static WebElement Reset_clk(WebDriver driver){
		return driver.findElement((elements("Reset2_id")));
	}
	public static WebElement Cancel_clk(WebDriver driver){
		return driver.findElement((elements("Cancel2_id")));
	}
}

package com.pagelibrary.ranfordbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import TestBase.Base;

public class New_Branch_Entry extends Base {
	public static WebElement  BrancheName_text(WebDriver driver){
		return driver.findElement((elements("BranchName_id")));
	}
	
	public static WebElement Addres1_text(WebDriver driver){
		return driver.findElement((elements("Address1_id")));
	}
	
	public static WebElement Addres2_text(WebDriver driver){
		return driver.findElement((elements("Address2_id")));
	}
	public static WebElement Addres3_text(WebDriver driver){
		return driver.findElement((elements("Address3_id")));
	}
	public static WebElement Area_text(WebDriver driver){
		return driver.findElement((elements("Area_id")));
	}
	public static WebElement Zipcode_txt(WebDriver driver){
		return driver.findElement((elements("ZipCode_id")));
	}
	public static Select Country_srh(WebDriver driver){
		return new Select(driver.findElement((elements("Country1_srh_id"))));
	}
	public static Select State_srh(WebDriver driver){
		return new Select(driver.findElement((elements("State1_srh_id"))));
	}
	public static Select City_srh(WebDriver driver){
		return new Select(driver.findElement((elements("City1_srh_id"))));
	}
	public static WebElement Submit_clk(WebDriver driver){
		return driver.findElement((elements("Submit1_id")));
	}
	public static WebElement Reset_clk(WebDriver driver){
		return driver.findElement((elements("Reset1_id")));
	}
	public static WebElement Cancel_clk(WebDriver driver){
		return driver.findElement((elements("Cancel1_id")));
	}
}

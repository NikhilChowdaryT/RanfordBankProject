package com.pagelibrary.ranfordbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import TestBase.Base;

public class BranchesPage extends Base {
	
	public static WebElement  Branches_clk(WebDriver driver){
		return driver.findElement(elements("Branches_xpath"));
	}
	
	public static Select Country_srh(WebDriver driver){
		return new Select(driver.findElement(elements("Country_srh_id")));
	}
	
	public static Select State_srh(WebDriver driver){
		return new Select(driver.findElement(elements("State_srh_id")));
	}
	public static Select City_srh(WebDriver driver){
		return new Select(driver.findElement(elements("City_srh_id")));
	}
	public static WebElement SearchBtn_clk(WebDriver driver){
		return driver.findElement(elements("SearchBtn_id"));
	}
	public static WebElement NewBranch_clk(WebDriver driver){
		return driver.findElement(elements("NewBranch_id"));
	}
	
	
	
	
	
	
}

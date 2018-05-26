package com.pagelibrary.ranfordbank;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenricClass {

	public static Alert Alert(WebDriver driver){
		Alert al = driver.switchTo().alert();
		return al;
	}
}

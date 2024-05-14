package com.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseTest;

public class FetchElement {

	public WebElement getWebElement(String locatorType, String locatorValue) {

		switch (locatorType) {
		case "XPATH":
			return BaseTest.driver.findElement(By.xpath(locatorValue));
		case "ID":
			return BaseTest.driver.findElement(By.id(locatorValue));
		case "NAME":
			return BaseTest.driver.findElement(By.name(locatorValue));
		case "CLASSNAME":
			return BaseTest.driver.findElement(By.className(locatorValue));
		default:
			return null;
		}
	}

	public List<WebElement> getWebElements(String locatorType, String locatorValue) {

		switch (locatorType) {
		case "XPATH":
			return BaseTest.driver.findElements(By.xpath(locatorValue));
        case "ID":
			return BaseTest.driver.findElements(By.id(locatorValue));
		case "NAME":
			return BaseTest.driver.findElements(By.name(locatorValue));
		case "CLASSNAME":
			return BaseTest.driver.findElements(By.className(locatorValue));
		default:
			return null;
		}
	}

}

package com.pageEvents;

import java.time.Duration;

import org.testng.Assert;
import com.base.BaseTest;
import com.pageObjects.LoginPageElements;
import com.utils.Constants;
import com.utils.FetchElement;

public class LoginPageEvents {
	FetchElement eleFetch = new FetchElement();

	// this method used to login to application
	public void enterCredentials() {
		eleFetch.getWebElement("ID", LoginPageElements.emailTextBox).sendKeys(Constants.uName);
		eleFetch.getWebElement("XPATH", LoginPageElements.passwordTextBox).sendKeys(Constants.pwd);
		BaseTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Assert.assertTrue(eleFetch.getWebElements("ID", LoginPageElements.continueButton).size() > 0,
				"Element Not Found");
		eleFetch.getWebElement("ID", LoginPageElements.continueButton).click();

	}
}

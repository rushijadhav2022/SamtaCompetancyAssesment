package com.pageEvents;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.pageObjects.HomePageElements;
import com.utils.FetchElement;

public class HomePageEvents {
	FetchElement eleFetch = new FetchElement();

	// This method used to validate home page is displayed or not
	public void verifyHomePageIsLoaded() {
		Assert.assertTrue(eleFetch.getWebElement("XPATH", HomePageElements.chatHeading).isDisplayed(),
				"Chat heading not displayed");
	}

	// This method used to verify message sent sucessfully or not....
	public void messageSentToUser() {
		Assert.assertTrue(eleFetch.getWebElement("XPATH", HomePageElements.reciever).isDisplayed(),
				"User is not displayed");
		eleFetch.getWebElement("XPATH", HomePageElements.reciever).click();
		eleFetch.getWebElement("XPATH", HomePageElements.messageTextBox).sendKeys("Hii,Omkar");
		eleFetch.getWebElement("XPATH", HomePageElements.sentButton).click();
		List<WebElement> messages = eleFetch.getWebElements("XPATH", HomePageElements.sentMessageText);
		for (WebElement message : messages) {
			String actual = message.getText();
			if (actual.equals("Hii,Omkar"))
				Assert.assertEquals("Hii,Omkar", actual);
		}
	}

	// this method validate that message take large message or not...
	public void verifySpecialCharacter() {
		Assert.assertTrue(eleFetch.getWebElement("XPATH", HomePageElements.reciever).isDisplayed(),
				"User is not displayed");
		eleFetch.getWebElement("XPATH", HomePageElements.reciever).click();
		eleFetch.getWebElement("XPATH", HomePageElements.messageTextBox).sendKeys("@Hii,Omkar#");
		eleFetch.getWebElement("XPATH", HomePageElements.sentButton).click();
		List<WebElement> messages = eleFetch.getWebElements("XPATH", HomePageElements.sentMessageText);
		for (WebElement message : messages) {
			String actual = message.getText();
			if (actual.equals("@Hii,Omkar#"))
				Assert.assertEquals("@Hii,Omkar#", actual);
		}
	}

	// this method validate that message take special character or not...
	public void verifyLongMessages() {
		Assert.assertTrue(eleFetch.getWebElement("XPATH", HomePageElements.reciever).isDisplayed(),
				"User is not displayed");
		eleFetch.getWebElement("XPATH", HomePageElements.reciever).click();
		eleFetch.getWebElement("XPATH", HomePageElements.messageTextBox).sendKeys(
				"An English paragraph for reading is a concise piece of text composed of one or more sentences that convey a specific idea, information, or story. It serves as a fundamental unit of written communication, allowing readers to engage with written content in manageable segments.");
		eleFetch.getWebElement("XPATH", HomePageElements.sentButton).click();
		List<WebElement> messages = eleFetch.getWebElements("XPATH", HomePageElements.sentMessageText);
		for (WebElement message : messages) {
			String actual = message.getText();
			if (actual.equals(
					"An English paragraph for reading is a concise piece of text composed of one or more sentences that convey a specific idea, information, or story. It serves as a fundamental unit of written communication, allowing readers to engage with written content in manageable segments."))
				Assert.assertEquals(
						"An English paragraph for reading is a concise piece of text composed of one or more sentences that convey a specific idea, information, or story. It serves as a fundamental unit of written communication, allowing readers to engage with written content in manageable segments.",
						actual);
		}
	}

	// this method is used to verify user logout sucessfully or not...
	public void logOut() {
		eleFetch.getWebElement("XPATH", HomePageElements.imageIcon).click();
		Assert.assertTrue(eleFetch.getWebElement("XPATH", HomePageElements.logOutButton).isDisplayed(),
				"Log out button is not displayed");
		eleFetch.getWebElement("XPATH", HomePageElements.logOutButton).click();
	}

}

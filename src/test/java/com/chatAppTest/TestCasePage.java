package com.chatAppTest;

import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pageEvents.HomePageEvents;
import com.pageEvents.LoginPageEvents;
import com.utils.FetchElement;

public class TestCasePage extends BaseTest {
	LoginPageEvents loginPageEvents = new LoginPageEvents();
	FetchElement eleFetch = new FetchElement();
	HomePageEvents homePageEvents=new HomePageEvents(); 
	
	@Test(priority=1)
	public void verifyUserLogin() {
		loginPageEvents.enterCredentials();
		logger.info("User entered the credentials");
		homePageEvents.verifyHomePageIsLoaded();
		logger.info("User navigate to homePage");
		homePageEvents.logOut();
		logger.info("User logout sucessfully");
	}

	@Test(priority=2)
	public void verifyMessageDelivery()
	{
		loginPageEvents.enterCredentials();
		logger.info("User entered the credentials");
		homePageEvents.verifyHomePageIsLoaded();
		logger.info("User navigate to homePage");
		homePageEvents.messageSentToUser();
		logger.info("message sent sucessfully");
		homePageEvents.logOut();
		logger.info("User logout sucessfully");
	}
	
	@Test(priority=3)
	public void verifySpecialCharacter()
	{
		loginPageEvents.enterCredentials();
		logger.info("User entered the credentials");
		homePageEvents.verifyHomePageIsLoaded();
		logger.info("User navigate to homePage");
		homePageEvents.verifySpecialCharacter();
		logger.info("message sent sucessfully");
		homePageEvents.logOut();
		logger.info("User logout sucessfully");
	}
	
	@Test(priority=4)
	public void verifyLongMessageText()
	{
		loginPageEvents.enterCredentials();
		logger.info("User entered the credentials");
		homePageEvents.verifyHomePageIsLoaded();
		logger.info("User navigate to homePage");
		homePageEvents.verifyLongMessages();
		logger.info("message sent sucessfully");
		homePageEvents.logOut();
		logger.info("User logout sucessfully");
	}
}

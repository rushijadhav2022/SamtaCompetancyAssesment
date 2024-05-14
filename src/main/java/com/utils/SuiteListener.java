package com.utils;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.base.BaseTest;

public class SuiteListener implements ITestListener {

	public void onTestFailure(ITestResult result) {

		String fileName = System.getProperty("user.dir") + File.separator + "ScreenShots" + File.separator
				+ result.getMethod().getMethodName();
		File file = ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File(fileName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

package com.listeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.screenshot.TakeScreenshots;

public class MyListener implements ITestListener {
	public void onTestFailure(ITestResult result) {
		TakeScreenshots takescreenshot = new TakeScreenshots();
		try {
			takescreenshot.captureFullPageScreenShot(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

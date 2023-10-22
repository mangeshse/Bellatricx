package com.waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.support.ui.FluentWait;

import com.base.BaseClass;

public class Wait {
	public void implicitWait() {
		BaseClass.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

	}

	public void fluentWait() {
		FluentWait wait = new FluentWait(BaseClass.driver);
		wait.pollingEvery(Duration.ofMillis(250));
		wait.withTimeout(Duration.ofSeconds(60));
		wait.ignoring(NoSuchElementException.class);
		wait.withMessage("Time Out ");
		
	}
	

}

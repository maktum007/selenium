package com.selenium.com;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import listener.RetryAnalyzer;
import listener.TestNgListener;
@Listeners(TestNgListener.class)
public class TakeScreenShot 
{
	WebDriver driver;
	@Test(retryAnalyzer=RetryAnalyzer.class)
	public void f() throws IOException
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\fireFox\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.get("http://www.google.co");
		 TakesScreenshot sc=(TakesScreenshot)driver;
		 File src=sc.getScreenshotAs(OutputType.FILE);
		 File des=new File("C:\\Users\\Maktum\\eclipse-workspace\\com.library.com\\target\\s.png");
		 FileUtils.copyFile(src, des);
	}

}

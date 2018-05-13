package com.selenium.com;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandlingBootstrapDropdown 
{

	WebDriver driver;
	@Test
	public void f() throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\fireFox\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		List<WebElement> lists=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));
		for(WebElement list:lists)
		{
			System.out.println(list.getText());
			if(list.getText().equals("CSS"))
				list.click();
		}
		
		
		
		
		
	}
}

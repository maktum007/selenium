package com.selenium.com;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrokenLink 
{
	WebDriver driver;
	@Test
	public void links() throws IOException
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\fireFox\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.google.co");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		for(WebElement link:links)
		{
			String url=link.getAttribute("href");
			validate(url);
		}
	}
	static public void validate(String url) throws IOException
	{
		URL Url=new URL(url);
		HttpURLConnection con=(HttpURLConnection)Url.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println(Url+" "+con.getResponseMessage());
		}
		if(con.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
		{
			System.out.println(Url+" "+con.getResponseMessage());
		}
	}
}

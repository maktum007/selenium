package headlessBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HtmlUnitBrowserDemo 
{
	WebDriver driver;
	@Test
	public void browser()
	{
		driver=new HtmlUnitDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}

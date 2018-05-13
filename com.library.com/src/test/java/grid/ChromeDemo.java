package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeDemo 
{
	WebDriver driver;
	@Test
	public void testGrid() throws MalformedURLException
	{
		DesiredCapabilities cap= DesiredCapabilities.chrome();
		String nodeUrl="http://localhost:4444/wd/hub";
		driver=new RemoteWebDriver(new URL(nodeUrl),cap);
		driver.get("https://www.google.com");
		
	}

}

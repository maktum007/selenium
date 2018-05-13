package wait;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ImplicitWait_ExplicitWait 
{
	WebDriver driver;
	@Test
	public void f() throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\fireFox\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Explicit Wait
		driver.findElement(By.xpath("//button[@onclick='timedText()']")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='demo']")));
		
	
	
	}

}

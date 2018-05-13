package wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class FluentWaitDemo 
{
	WebDriver driver;
	@Test
	public void f() 
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\fireFox\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Fluent Wait
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
			wait.pollingEvery(1, TimeUnit.SECONDS);
			wait.withTimeout(10, TimeUnit.SECONDS);
			wait.ignoring(NoSuchElementException.class);
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		public WebElement apply(WebDriver arg0) 
		{
				WebElement ele = arg0.findElement(By.xpath("//p[@id='demo']"));
				if (ele.getAttribute("innerHTML").equalsIgnoreCase("WebDriver")) 
		        {
					System.out.println("Value is >>> " + ele.getAttribute("innerHTML"));
					return ele;
		        }
				else 
				{
					System.out.println("Value is >>> " + ele.getAttribute("innerHTML"));
					return null;
				}
		}
		 
		});
		System.out.println("Final visible status is >>>>> " + element.isDisplayed());
	}
}

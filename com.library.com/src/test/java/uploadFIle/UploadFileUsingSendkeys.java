package uploadFIle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UploadFileUsingSendkeys 
{
	WebDriver driver;
	@Test
	public void f()
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\fireFox\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement upload=driver.findElement(By.xpath("//input[@type='file']"));
		upload.sendKeys("C:\\Users\\Maktum\\git\\com.library.com\\com.library.com\\Data\\0.jpg");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();
	}

}

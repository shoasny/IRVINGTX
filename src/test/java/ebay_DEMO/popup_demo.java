package ebay_DEMO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class popup_demo {
	static WebDriver driver;
	@Test
	public void popup() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.id("login1")).sendKeys("jkj");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}

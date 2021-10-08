package ebay_DEMO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSelenioum {

	public static void main(String[] args) throws Exception {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.id("gh-ac")).sendKeys("iPhone");
		driver.findElement(By.id("gh-btn")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		 

	}

}

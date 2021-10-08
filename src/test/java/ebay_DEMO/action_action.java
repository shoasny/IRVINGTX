package ebay_DEMO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class action_action {
	
	@Test
	public void actionss() {
System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		
		ac.moveToElement(driver.findElement(By.xpath("//button[text()=' Products ']"))).build().perform();
		
		 //driver.findElement(By.linkText("Gateways & Embedded PCs")).click();
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", driver.findElement(By.linkText("Gateways & Embedded PCs")));
		//Gateways & Embedded PCs
		driver.close();
		
	}
	
	
	//JavascriptExecutor executor = (JavascriptExecutor)driver;
	//executor.executeScript("arguments[0].click();", locator);

}

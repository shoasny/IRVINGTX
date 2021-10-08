package ebay_DEMO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selinium_secondClass {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("http://mrbool.com/");
		driver.manage().window().maximize();
		
		WebElement abc = driver.findElement(By.xpath("//a[@class='menulink']"));
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(abc).build().perform();
		
		WebElement hh = driver.findElement(By.xpath("//a[@href='http://mrbool.com/course']"));
		
		//ac.moveToElement(hh).click().build().perform();
		hh.click();
		
		//Thread.sleep(5000);
		
		
		driver.quit();
		
		// local variable and global variable
		
		// To handle dropdown we use select class
		// Selenium gave us Action class

	}

}

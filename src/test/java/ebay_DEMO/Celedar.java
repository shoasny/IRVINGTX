package ebay_DEMO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Celedar {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://www.southwest.com/");
		driver.manage().window().maximize();
		//((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
		  JavascriptExecutor date = (JavascriptExecutor) driver;

		  date.executeScript("document.getElementById('LandingAirBookingSearchForm_departureDate').value='06/25/2021'");
		  Thread.sleep(5000);
		  date.executeScript("document.getElementById('LandingAirBookingSearchForm_returnDate').value='06/30/2021'");
		  Thread.sleep(5000);

	}

}

package seleniumWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetTitleAndUrl {

	WebDriver driver;
	
	@BeforeTest
	public void openApplication() {
		 driver= new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void doTitleTest() {
		String expectedTitle=driver.getTitle();
		System.out.println("Facebook title is:    "+expectedTitle);
		
	}
	@AfterTest
	public void closeApplication() {
		
		driver.close();
		
	}
	
	

}

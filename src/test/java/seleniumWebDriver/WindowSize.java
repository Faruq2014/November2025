package seleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowSize {

	WebDriver driver;
	
	@BeforeTest
	public void openApplication() {
		 driver= new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 //driver.manage().window().minimize();
		 //driver.manage().window().fullscreen();
		 
	}
	
	
	@Test
	public void doLoginTest() {
		//driver.findElement(By.id("email")).sendKeys("kln@bbmail.com");
	}
	
	
	
	@AfterTest
	public void closeApplication() {
		
		driver.close();
		
	}
	
	

}

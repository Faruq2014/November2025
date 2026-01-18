package seleniumWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ManageTime {

	WebDriver driver;
	
	@BeforeTest
	public void openApplication() {
		 driver= new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 //driver.manage().window().minimize();
		 //driver.manage().window().fullscreen();
		// driver.manage().timeouts().getImplicitWaitTimeout();
		// driver.manage().timeouts().getImplicitWaitTimeout();
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 
	}
	
	
	@Test
	public void doLoginTest() {
		driver.findElement(By.id("email")).sendKeys("kln@bbmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("kln123");
		
		driver.findElement(By.name("login")).click();
		
	}
	
	
	
	@AfterTest
	public void closeApplication() {
		
		driver.close();
		
	}
	
	

}

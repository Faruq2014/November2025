package seleniumWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	/*
	 *    // open application
	 * open chrome browser
	 * open Facebook application
	 * 
	 *    // Do the logintest// Pass or Fail
	 * Enter user name
	 * Enter password
	 * click on login button    
	 * validate Nishat is logged in
	 * 
	 *   // close the application
	 * close the application
	 */
	
	
	WebDriver driver;
	
	@BeforeTest
	public void openApplication() {
		 driver= new ChromeDriver();
		 driver.get("https://www.facebook.com/");
	}
	
	
	@Test
	public void doLoginTest() {
		driver.findElement(By.id("email")).sendKeys("kln@bbmail.com");
	}
	
	
	
	@AfterTest
	public void closeApplication() {
		
		driver.close();
		
	}
	
	

}






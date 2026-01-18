package seleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenEdgeBrowser {	
	WebDriver driver; 
	//this is instance variable
	// WebDriver == data type
	// driver== variable name
	// new EdgeDriver();== value of the variable
	@BeforeTest
	public void openApp() {
		
		driver = new EdgeDriver();
		driver.get("https://www.macys.com/");
	}	
	@Test
	public void loginTest() {		
		driver.findElement(By.id("nav-deals")).click();
	}
	
	@AfterTest
	public void closeApp() {
		driver.close();
	}

}

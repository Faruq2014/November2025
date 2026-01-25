package elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Locators {

	WebDriver driver;

	@BeforeTest
	public void openApplication() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void idAndNameLocator() {
		//driver.findElement(By.id("email")).sendKeys("kln@bbmail.com");

		WebElement userName= driver.findElement(By.id("email"));
		userName.sendKeys("kln@bbmail.com");
	
	}
	@Test
	public void idPasswordLocator() {
	WebElement password=driver.findElement(By.id("pass"));
	password.sendKeys("djhfdhj");
	}
	
	
	@Test
	public void dynamicLoginButton() {
		// id is dynamic, it is session based id, it will always fail
		// WebElement loginButton =driver.findElement(By.id("u_0_5_ct"));
		// loginButton.click();

		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();

	}

	@AfterTest
	public void closeApplication() {

		driver.close();

	}

}

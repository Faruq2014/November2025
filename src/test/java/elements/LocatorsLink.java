package elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LocatorsLink {

	WebDriver driver;

	@BeforeMethod
	public void openApplication() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void linkTest() {
		WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
		createNewAccount.click();
	}

	@Test
	public void partialLinkTest() {
		WebElement forgotPassword = driver.findElement(By.partialLinkText("Forgot"));
		forgotPassword.click();
	}

	@AfterMethod
	public void closeApplication() {

		 driver.close();
	}

}

package elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LocatorsXpath {

	WebDriver driver;

	@BeforeTest
	public void openApplication() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void loginTest() {
		// user name
		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		userName.sendKeys("gh@bbmail.com");
		// password
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("jhhj");

		// login button
		WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
		loginButton.click();

	}

	@AfterTest
	public void closeApplication() {

		driver.close();

	}

}

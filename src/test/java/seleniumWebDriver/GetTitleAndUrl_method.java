package seleniumWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
//import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetTitleAndUrl_method {

	WebDriver driver;

	@BeforeMethod
	public void openApplication() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(priority=2)
	public void doTitleTest() {

		String actualTitle = "Facebook - log in or sign up123";
		String expectedTitle = driver.getTitle();
		System.out.println("Facebook title is:    " + expectedTitle);
		// actualTitle==expectedTitle=pass
		// actualTitle!=expectedTitle =fail
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@Test(priority=1)
	public void doUrlTest() {
		String actualUrl = "https://www.facebook.com/";
		String expectedUrl = driver.getCurrentUrl();
		System.out.println("Facebook url is:    " + expectedUrl);
		Assert.assertEquals(actualUrl, expectedUrl);
	}

	@AfterMethod
	public void closeApplication() {

		driver.close();

	}

}

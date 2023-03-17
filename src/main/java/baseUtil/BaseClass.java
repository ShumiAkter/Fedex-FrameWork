package baseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {
	// webdriver instantiate driver
	WebDriver driver;
	public HomePage homePage;

	// Before start a test we need to be done
	@BeforeMethod
	public void setup() {
		// first we need to recognize the location of driver
		System.setProperty("webdriver.chrome.driver","//Users/shumiakter/eclipse-workspace/com.fedex/driver/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options); // Then we need to instantiate the driver
		driver.manage().window().maximize(); // Maximize the window
		driver.manage().deleteAllCookies(); // Delete all cookies
		driver.get("https://www.fedex.com/en-us/home.html"); // get method trageted URL
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // Wait to load thr page for certain amount
																			// of time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Wait for a web element
		homePage = new HomePage(driver);

	}

	@AfterMethod
	public void tearUp() {
		driver.quit();
	}
}

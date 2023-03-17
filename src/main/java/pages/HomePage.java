package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//webdriver instantiate driver
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// PageFactory help to instaniate webelements
	}

	// 1st way: Most common way to write the webElement (@FindBy)
	// Use of 'ClassName' attribute as locator
	@FindBy(className = "fxg-user-options__sign-in-text")
	WebElement loginButton;

	@FindBy(id = "btnSingleTrack") // Use of 'Id' attribute as locator
	WebElement trackSearchButton;

	@FindBy(xpath = "//input[@name='trackingnumber']") // Use of 'ClassName' attribute as locator
	WebElement trackingID;

	// 2nd way to write the WebElement:
	@FindBy(how = How.XPATH, using = "//img[@class='fxg-header__logo']")
	WebElement logo;

	public void clickLoginButton() throws InterruptedException {
		loginButton.click();
		Thread.sleep(4000);
	}

	public void clicktrackSearchButton() throws InterruptedException {
		trackSearchButton.click();
		Thread.sleep(5000);
	}

	public void clickTrackingID() throws InterruptedException {
		trackingID.click();
		Thread.sleep(4000);
	}

	public void clickLgo() throws InterruptedException {
		logo.click();
		Thread.sleep(2000);
	}

}

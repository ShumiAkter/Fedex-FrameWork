package pageTest;

import org.testng.annotations.Test;


public class HomePageTest extends baseUtil.BaseClass {

	@Test (enabled = false, priority = 1)
	public void clickLoginButtonTest() throws InterruptedException {
		homePage.clickLoginButton();
	}
	@Test (enabled = false, priority = 2)
	public void clickSearchButtonTest() throws InterruptedException {
		homePage.clicktrackSearchButton();
	}
	@Test(enabled = false)
public void clicktrackingIDTest() throws InterruptedException {
		homePage.clickTrackingID();
	}
	@Test(enabled = true)
public void clickLogoTest() throws InterruptedException {
		homePage.clickLgo();
}
	
}

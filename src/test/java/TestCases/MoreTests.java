package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.loginPage;

public class MoreTests extends BaseTest {
	
	@Test
	public void incorrectLoginattemp() {
		loginPage lp = new loginPage(driver);	
		lp.enterUsername("standard_use343242r");
		lp.enterpassword("secret_sauc23234e");
		lp.clickLogin();
		String actualErr = lp.getError();
		String expectedErr = "Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(actualErr, expectedErr);
	}
	
}

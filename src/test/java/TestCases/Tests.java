package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.cartPage;
import Pages.checkoutPage;
import Pages.completePage;
import Pages.infoPage;
import Pages.loginPage;
import Pages.productsDetailsPage;
import Pages.productsPage;
import Utils.ReadConfig;

public class Tests extends BaseTest {
	
	@Test
	public void shopping() throws IOException {
	new loginPage(driver).enterUsername(new ReadConfig().getUsername());
	new loginPage(driver).enterpassword(new ReadConfig().getPassword());
	new loginPage(driver).clickLogin();
	String price = new productsPage(driver).getBackPackPrice(); 
	Assert.assertEquals(price, new ReadConfig().getPrice());
	new productsPage(driver).clickBackPack();
	new productsDetailsPage(driver).clickAddToCart();
	new cartPage(driver).clickCheckOut();
	new infoPage(driver).enterDetails();
	new checkoutPage(driver).clickFinish();
	String str = new completePage(driver).getHeaderText();
	new completePage(driver).clickbackToProducts();
	Assert.assertEquals(str, "Thank you for your order!");  
	}

}

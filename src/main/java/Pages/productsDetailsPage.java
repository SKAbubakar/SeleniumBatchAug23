package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsDetailsPage extends BasePage {

	
	public productsDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="add-to-cart-sauce-labs-backpack")
	private WebElement addToCart;
	
	@FindBy(className= "shopping_cart_badge")
	private WebElement shoppingBadge;
	
	public void clickAddToCart() {
		Click(addToCart);
		Click(shoppingBadge);
	}
	
	
}

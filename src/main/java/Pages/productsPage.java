package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsPage extends BasePage {
	
	public productsPage(WebDriver driver) {
		super(driver);
	}
	
	/*Page Elements*/
	
	@FindBy(id="item_4_title_link")
	private WebElement backPack;
	
	@FindBy(xpath="//div[text()='29.99']")
	private WebElement price;
	
	
	/*Page actions */
	public void clickBackPack() {
		Click(backPack);
	}
	public String getBackPackPrice() {
		return price.getText();
	}
	
}

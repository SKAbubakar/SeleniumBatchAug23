package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.ReadConfig;

public class infoPage  extends BasePage {

	public infoPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(name="firstName")
	private WebElement fName;
	
	@FindBy(name="lastName")
	private WebElement lName;

	@FindBy(id="postal-code")
	private WebElement zipCode;
	
	@FindBy(id="continue")
	private WebElement cont;
	
	public void enterDetails() throws IOException {
		sendKeys(fName, new ReadConfig().getFirstName());
		sendKeys(lName, new ReadConfig().getLastName());
		sendKeys(zipCode, new ReadConfig().getZipCode());
		Click(cont);
	}
	
	
	
}

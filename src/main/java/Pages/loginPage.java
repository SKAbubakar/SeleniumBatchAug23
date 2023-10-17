package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends BasePage {
	
	// 1. Page elements 2. page actions
		
	public loginPage(WebDriver driver) {
		super(driver);
	}
	

	@FindBy(id="user-name")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(id= "login-button")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//h3")
	private WebElement err;
	
	public void enterUsername(String str) {
		sendKeys(username, str);
	}

	public void enterpassword(String str) {
		sendKeys(pwd, str);
	}
	public void clickLogin() {
		Click(loginBtn);
	}
	
	public String getError() {
		return err.getText();
	}
	
}

package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void waitForElementVisibility(WebElement e) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(e));  // every 250ms
	}
	
	public void sendKeys(WebElement e, String text) {
		waitForElementVisibility(e);
		e.sendKeys(text);
	}
	
	public void Click(WebElement e) {
		waitForElementVisibility(e);
		e.click();
	}
	
	public void clear(WebElement e) {
		waitForElementVisibility(e);
		e.clear();
	}
		
	public String getText(WebElement e) {
		waitForElementVisibility(e);
		return e.getText();	
	}
	
	
	public void selectByIndex(WebElement e, int num) {
		waitForElementVisibility(e);
		Select select = new Select(e);
		select.selectByIndex(num);
	}
	
	
	
	
	

}

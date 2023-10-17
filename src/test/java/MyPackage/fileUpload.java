package MyPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class fileUpload {
	WebDriver driver;
	
	@Test
	public void upload() {
		driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.findElement(By.id("imagesrc")).sendKeys("fileLocation");
		driver.quit();
	}
	@Test
	public void seleniumWaits() {
		// 1. Implicit wait/Universal wait: 
		// 2. Explicit wait/specic wait: 
		driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		WebElement element = driver.findElement(By.xpath("//input[@type='tel']"));
		List<WebElement> list = driver.findElements(By.xpath("//select[@type='text']"));
		Wait<WebDriver> fluentwait = new FluentWait(driver)
	            .withTimeout(Duration.ofSeconds(10))
	               .pollingEvery(Duration.ofMillis(500)) // Polls every 500 milliseconds
	              .ignoring(org.openqa.selenium.NoSuchElementException.class);		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		fluentwait.until(ExpectedConditions.visibilityOf(element));
		fluentwait.until(ExpectedConditions.visibilityOfAllElements(list));
		driver.quit();
	}
	
	

}

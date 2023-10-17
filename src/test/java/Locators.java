import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com"); // 60 sec
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12)); //
		driver.findElement(By.id("user-name")).sendKeys("This is selenium");   
		driver.findElement(By.name("user-name")).clear();
		driver.findElement(By.className("login-box"));
		driver.findElement(By.tagName("title"));
		driver.findElement(By.cssSelector("input#login-button")); // 1. tagname#id 
		driver.findElement(By.cssSelector("input.btn_action"));    //2. tagname.className
		driver.findElement(By.xpath("//input[@name='login-button']"));  // tagname[@attributeName = 'value'] 
		driver.get("https://demoqa.com/links");
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.linkText("Home"));	 
		String s = driver.getTitle();
		String str = driver.getCurrentUrl();
		System.out.println(s);
		System.out.println(str);
		driver.quit();
	}

}

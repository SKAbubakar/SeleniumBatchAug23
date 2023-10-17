import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Demo {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");  //faster
		driver.navigate().to("https://emirates.com"); // slower
		System.out.println(driver.getTitle()); 
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.quit();
	}

}

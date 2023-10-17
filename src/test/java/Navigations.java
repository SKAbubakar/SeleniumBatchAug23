import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigations {
                          //Naviational commands in selenium
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com");
		driver.navigate().to("https://google.com");
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
	}

}

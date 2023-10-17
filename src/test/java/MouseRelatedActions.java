import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRelatedActions {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='More']"))).
		moveToElement(driver.findElement(By.xpath("//a[text()='File Download']"))).click().perform();
		act.contextClick().perform();
		driver.quit();
	}

}

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alertss {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.findElement(By.id("OKTab")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.id("CancelTab")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		Thread.sleep(500);
		driver.findElement(By.id("Textbox")).click();
		driver.switchTo().alert().sendKeys("Hey Selenium batch");
		driver.switchTo().alert().accept();
		driver.quit();
	}
}

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ElementActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		boolean x = driver.findElement(By.xpath("//h4[text()='Accepted usernames are:']")).isDisplayed();
		driver.findElement(By.id("login-button")).click();
		System.out.println(x);
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.xpath("//a[text()='Danish']")).click();
		driver.findElement(By.id("checkbox1")).click();
		boolean y = driver.findElement(By.id("checkbox1")).isSelected();
		System.out.println(y);
		boolean z = driver.findElement(By.id("checkbox1")).isEnabled();
		System.out.println(z);
		driver.quit();

	}

}

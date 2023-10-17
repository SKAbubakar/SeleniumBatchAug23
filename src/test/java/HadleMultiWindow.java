import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HadleMultiWindow {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.findElement(By.xpath("//button[text()='    click   ']")).click();
		Set<String> windowHandles = driver.getWindowHandles(); // 2 windows are active
		String firstTab = (String)windowHandles.toArray()[0];
		String lastTab = (String)windowHandles.toArray()[1];
		driver.switchTo().window(firstTab);
		driver.switchTo().window(lastTab);
		driver.quit();
	}

}

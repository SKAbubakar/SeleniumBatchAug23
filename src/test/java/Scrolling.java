import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrolling {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		WebElement e = driver.findElement(By.xpath("//a[text()='Careers']"));
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='Nike Shoes';", search);
		js.executeScript("arguments[0].scrollIntoView();", e);
		js.executeScript("javascript:window.scrollBy(1200,1200)"); //problem
		js.executeScript("arguments[0].click();", e);
		driver.quit();
	}
}

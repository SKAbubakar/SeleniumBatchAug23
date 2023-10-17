import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		WebElement start = driver.findElement(By.id("draggable"));
		WebElement end = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);  // double click, right click, d&d, moveToElement
		act.dragAndDrop(start, end).perform();
		act.contextClick(end).perform();
		act.doubleClick(end).perform();
		driver.quit();
	}

}

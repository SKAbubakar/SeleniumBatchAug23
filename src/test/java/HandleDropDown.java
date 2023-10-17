import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement e = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select sel = new Select(e);
		sel.selectByVisibleText("AutoCAD");
		sel.selectByValue("Certifications");
		sel.selectByIndex(5);
		Thread.sleep(3000);
		driver.get("https://demoqa.com/select-menu");
		Select multiSel = new Select(driver.findElement(By.id("cars")));
		multiSel.selectByIndex(1);
		multiSel.selectByVisibleText("Audi");
		multiSel.selectByValue("volvo");
		multiSel.deselectByValue("volvo");
		multiSel.deselectAll();
		driver.quit();
		
	}

}

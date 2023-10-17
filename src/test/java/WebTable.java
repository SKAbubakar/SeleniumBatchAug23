import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTable {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("C:\\Users\\PC\\Desktop\\page.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		List<WebElement> data = driver.findElements(By.xpath("//table[@name='BookTable']//tbody/tr/td"));
		System.out.println("All table data:"+ data.size()); // 24
		List<WebElement> headers = driver.findElements(By.xpath("//table[@name='BookTable']//tbody/tr//th"));
		System.out.println("All Table Headers"+ headers.size());
		for(WebElement e: headers) {
			if(e.getText().equalsIgnoreCase("bookname")) {
				System.out.println("Pass");
				break;
			} 
		}	
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tbody/tr"));
		System.out.println("All rows in the table: " + rows.size());
		driver.quit();
	}

}

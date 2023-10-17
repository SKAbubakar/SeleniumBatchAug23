package MyPackage;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNGFirst extends Annotation {
	
	//@BeforeMethod
	public void beforeMethod() {
		driver = new EdgeDriver();
		driver.manage().window().maximize(); //duplicate
	}
	
	//@AfterMethod
	public void afterMethod() {
		driver.quit(); 
	}
	
	//@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize(); //duplicate
	}
	
	//@AfterTest
	public void afterTest() {
		driver.quit(); 
	}
	
	@Test()
	public void fileUpload() {
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@id='imagesrc']")).sendKeys("C:\\Users\\PC\\Desktop\\page.html");
	}
	
	
	@Test()
	public void navigations() {
		driver.get("https://www.saucedemo.com");
		driver.navigate().to("https://google.com");	
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	
	
	@Test()
	public void incognito() {
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("inPrivate");  // 4+
		driver = new EdgeDriver(edgeOptions);
		driver.get("https://demo.automationtesting.in/Windows.html");
	}
	
	@Parameters({"url", "timeout"})
	@Test()
	public void dragAndDrop(String url, int timeout) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout)); //duplicate
		WebElement start = driver.findElement(By.id("draggable"));
		WebElement end = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);  // double click, right click, d&d, moveToElement
		act.dragAndDrop(start, end).perform();
		act.contextClick(end).perform();
		act.doubleClick(end).perform();
	}
	@Test
	public void findelement() {
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='First Name']"));	// What is element vs what are elements
		List<WebElement> checkboxes =  driver.findElements(By.xpath("//input[@type='checkbox']"));
		WebElement e1 = driver.findElement(By.id("checkbox3"));
		System.out.println(checkboxes.size());  //2 
		for(WebElement x: checkboxes ) {
			if(e1.getText().equals("Hockey")) {
				break;
			}
			x.click();

		}
	}
	
	@Parameters({"s1", "s2"})
	@Test
	public void testParameters(String s1, String s2) {
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.findElement(By.id("user-name")).sendKeys(s1);
		driver.findElement(By.id("password")).sendKeys(s2);
		driver.findElement(By.id("login-button")).click();
	}
	
	
}

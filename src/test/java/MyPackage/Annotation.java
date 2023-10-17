package MyPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Annotation {
	WebDriver driver;
	@BeforeClass
	public void beforeCls() {
		driver = new EdgeDriver();
		driver.manage().window().maximize(); //duplicate
	}
	
	@AfterClass
	public void afterCls() {
		driver.quit(); 
	}

}

package MyPackage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class advancedConcept {
	
	WebDriver driver;
	
	@Test
	public void captureScreenShot() throws IOException {
		driver = new EdgeDriver();
		driver.get("http://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            // Save the screenshot to a specific location
            FileUtils.copyFile(source, new File("screenshot.png"));
            System.out.println("Screenshot captured and saved successfully.");  
	driver.quit();
	}
	
}
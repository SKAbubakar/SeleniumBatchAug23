import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class incognito {

	public static void main(String[] args) {
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("inPrivate");  // 4+
		WebDriver driver = new EdgeDriver(edgeOptions);
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.quit();
	}

}

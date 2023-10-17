package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	static final String path = ".//src//main//resources//data//config.properties";
	Properties prop;
	public ReadConfig() throws IOException {
		prop = new Properties();
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);		
	}

	public String getUsername() {
		return prop.getProperty("username");
	}
	 
	public String getPassword() {
		return prop.getProperty("password");
	}
	
	public String getFirstName() {
		return prop.getProperty("fName");
	}
	
	public String getLastName() {
		return prop.getProperty("lName");
	}
	public String getZipCode() {
		return prop.getProperty("zipCode");
	}
	public String getPrice() {
		return prop.getProperty("price");
	}
	
	
}

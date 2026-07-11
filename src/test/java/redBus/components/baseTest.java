package redBus.components;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class baseTest {
	//hello world
	public WebDriver driver;
	
	public WebDriver initializaDriver() throws IOException {
		
		Properties properties=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\91956\\eclipse-workspace\\seleniumMasterClass2025-4-FW\\src\\main\\java\\redBus\\resources\\globalProp.properties");
		
		properties.load(fis);
		String browserName=properties.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			driver=new ChromeDriver();
			
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			driver=new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
		
	}
	
	public WebDriver launchApplication(String siteURL) throws IOException {
		
		driver=initializaDriver();
		driver.get(siteURL);
		return driver;
		
	}

}

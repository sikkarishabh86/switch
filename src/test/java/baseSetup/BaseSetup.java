package baseSetup;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.PropertyFileReader;

public class BaseSetup {
	
	static WebDriver driver;
	PropertyFileReader pfr = new PropertyFileReader();
	
	@Before
	public void setup(){
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-infobars");
		String browser = pfr.propertyFileReader().getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			
		}
		
	}
	
//	@After(order = 0)
	public void teardown() {
		driver.quit();
	}
	
	@After(order = 1)
	public void captureScreenshot(Scenario scenario) {
		 if (scenario.isFailed()) {
	            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(org.openqa.selenium.OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", "screenshot_name");
	        }
	}
	
	public WebDriver driver() {
		return driver;
	}

}

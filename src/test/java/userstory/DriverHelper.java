package userstory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverHelper {

private WebDriver driver;
	
	public WebDriver getDriver(String browser) {
		if (driver == null) {
			switch(browser) {
			case "Firefox":
				System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
				driver = new FirefoxDriver();
				break;
			case "Chrome":
				 System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
				 driver = new ChromeDriver();
				 break;
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		return driver;
	}

}

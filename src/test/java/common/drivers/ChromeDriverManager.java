package common.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager {
	private static WebDriver driver = null;

	public WebDriver getDriver() {
		return getInstance();
	}

	public static synchronized WebDriver getInstance() {
		if(driver == null) {
			driver = new ChromeDriver();
		}
		return driver;
	}
}
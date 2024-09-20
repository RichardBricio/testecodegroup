package common.hooks;

import java.io.File;
import java.util.Collection;
import common.drivers.DriverType;
import common.utils.DriverUtils;
import common.utils.TaskManagerUtils;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentReports;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks {
	private static WebDriver driver;
	private static ExtentReports extendReporter;
	private static Collection<String> taggs;
	private static Scenario scenario;
	private static String TempDriverLocation;
	private static File TempDriver;
	private static DriverType runningDriver;
	
	@BeforeAll
	@org.junit.Before
	public void runBeforeWithOrder() throws Throwable {
		Hooks.setScenario(scenario);
		keepScenarion(scenario);
	}

	public static void tearDown() throws InterruptedException {
		// String name = Hooks.getScenario().getName();
		extendReporter = DriverUtils.getExtentReport();
		driver = DriverUtils.getDriver();
		try {
			// if (name.contains("Accounting")) {
				// System.out.println(name + " - Scenario does not open Browser instance");
			// } else {
				extendReporter.flush();
				driver.manage().deleteAllCookies();
				driver.quit();
				if (getRunningDriver() == DriverType.CHROME) {
					TaskManagerUtils.killProcess("chromedriver.exe");
				} else if (getRunningDriver() == DriverType.FIREFOX) {
					TaskManagerUtils.killProcess("firefox.exe");
					TaskManagerUtils.killProcess("geckodriver.exe");
				}
			// }
		} catch (Exception e) {
			System.out.println("Methods Failed: tearDown, Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}

	@After
	public void ScreenshotOnFailure(Scenario scenario) throws InterruptedException {
		String name = getScenario().getName();
		driver = DriverUtils.getDriver();
		try {
			if (getScenario().isFailed()) {
				DriverUtils.takeScreenShot();
			} else if (name.contains("Accounting")) {
				System.out.println(name + " - Scenario does not open Browser instance");
			}
		} catch (Exception e) {
			System.out.println("Methods Failed: ScreenshotOnFailure, Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public void keepScenarion(Scenario scenario) {
		setTaggs(scenario.getSourceTagNames());
	}

	public static Collection<String> getTaggs() {
		return taggs;
	}

	public static void setTaggs(Collection<String> taggs) {
		Hooks.taggs = taggs;
	}

	public static Scenario getScenario() {
		return scenario;
	}

	public static void setScenario(Scenario scenario) {
		Hooks.scenario = scenario;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Hooks.driver = driver;
	}

	public static File getTempDriver() {
		return TempDriver;
	}

	public static void setTempDriver(File tempDriver) {
		TempDriver = tempDriver;
	}

	public static String getTempDriverLocation() {
		return TempDriverLocation;
	}

	public static void setTempDriverLocation(String tempDriverLocation) {
		TempDriverLocation = tempDriverLocation;
	}

	public static DriverType getRunningDriver() {
		return runningDriver;
	}

	public static void setRunningDriver(DriverType runningDriver) {
		Hooks.runningDriver = runningDriver;
	}

}
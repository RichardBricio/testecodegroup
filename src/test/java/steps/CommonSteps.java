package steps;

import java.io.IOException;
import common.drivers.DriverType;
import common.utils.DriverUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CommonSteps {

	private static final Logger logger = LogManager.getLogger(CommonSteps.class);
	public static String brw = "";
	
	static WebDriverWait wait;

	@Given("^That I am using the browser (CHROME|IE|FIREFOX)$")
	public void selectDriver(String browser) throws Throwable {
		logger.info("------ STARTING BATTERY OF TESTS ----------");
		switch (browser) {
		case "CHROME":
			DriverUtils.selectBrowser(DriverType.CHROME);
			logger.info(DriverType.CHROME + " browser selected and opened successfully");
			Assert.assertTrue(true);
			break;
		case "IE":
			DriverUtils.selectBrowser(DriverType.IE);
			logger.info(DriverType.IE + " browser selected and opened successfully");
			Assert.assertTrue(true);
			break;
		case "DOCKER_CHROME":
			DriverUtils.selectBrowser(DriverType.FIREFOX);
			logger.info(DriverType.FIREFOX + " browser selected and opened successfully");
			Assert.assertTrue(true);
			break;
		default:
			DriverUtils.selectBrowser(DriverType.CHROME);
			logger.info(DriverType.CHROME + " browser opened by default");
			Assert.assertTrue(true);
			break;
		}
		brw = browser;
	}

	@Then("^Print the screen$")
	public void takeScreenShot() throws IOException {
		DriverUtils.takeScreenShot();
	}
	
}

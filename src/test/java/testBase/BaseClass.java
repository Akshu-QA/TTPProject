package testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public Logger logger;
	public static WebDriver driver;
	public Properties p;

	@BeforeClass
	public void setup() throws IOException {
		logger = LogManager.getLogger(this.getClass());
		// FileReader file = new FileReader(".\\eclipse-workspace\\Project
		// WorkSpaces\\TTPautomation\\src\\test\\resources\\config.properties");
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/resources/config.properties");
		p = new Properties();
		p.load(file);

		driver = new ChromeDriver();
		driver.get(p.getProperty("appURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}

	@AfterClass
	public void teardown() {
		//driver.quit();
	}

	public String captureScreen(String tname) {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

		TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
		File sourceFile = takeScreenShot.getScreenshotAs(OutputType.FILE);

		String targetFilePath = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile = new File(targetFilePath);

		sourceFile.renameTo(targetFile);

		return targetFilePath;

	}

	public void implicitlyWaitMethod(int t) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(t));
	}

	public void explicitWaitMethod(WebElement element, int t) {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(t));
		w.until(ExpectedConditions.elementToBeClickable(element));

	}

}

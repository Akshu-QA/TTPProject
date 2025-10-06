package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgressBar extends BasePage {

	public ProgressBar(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//button[normalize-space()='Widgets']")
	WebElement widgetsMenu;

	@FindBy(xpath = "//a[normalize-space()='Progress Bar']")
	WebElement progressLink;

	@FindBy(xpath = "//button[@id='startProgressTimer']")
	WebElement startBtn;

	@FindBy(xpath = "//div[@role='progressbar']")
	WebElement progressBar;

	public void clickProgressBar() {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", widgetsMenu);
		w.until(ExpectedConditions.elementToBeClickable(widgetsMenu));
		js.executeScript("arguments[0].click();", widgetsMenu);

		// Scroll and click Progress Bar link
		js.executeScript("arguments[0].scrollIntoView(true);", progressLink);
		w.until(ExpectedConditions.elementToBeClickable(progressLink));
		js.executeScript("arguments[0].click();", progressLink);
	}

	public void clickStartBtn() {
		startBtn.click();
	}

	public String getProgressValue() {

		return progressBar.getAttribute("aria-valuenow");

	}
}

package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScollTop extends BasePage {

	public ScollTop(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//button[normalize-space()='Widgets']")
	WebElement widgetsMenu;

	@FindBy(xpath = "//a[normalize-space()='Scoll Top']")
	WebElement scollTopLink;

	@FindBy(xpath = "//button[@id='btn-back-to-top']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	WebElement arrowTopButton;

	public void openScrollTopPage() {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", widgetsMenu);
		w.until(ExpectedConditions.elementToBeClickable(widgetsMenu));
		js.executeScript("arguments[0].click();", widgetsMenu);

		js.executeScript("arguments[0].scrollIntoView(true);", scollTopLink);
		w.until(ExpectedConditions.elementToBeClickable(scollTopLink));
		js.executeScript("arguments[0].click();", scollTopLink);
	}

	public void scrollDownShowBtn() {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	public void clickBackToTop() {
		 WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		    w.until(ExpectedConditions.elementToBeClickable(arrowTopButton));
		    arrowTopButton.click();
	}
	
	public boolean isAtTop() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		    Double scrollPos = (Double) js.executeScript("return window.pageYOffset;");
		    return scrollPos == 0.0;
	}	
}

package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScollDown extends BasePage {

	public ScollDown(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//button[normalize-space()='Widgets']")
	WebElement widgetsMenu;

	@FindBy(xpath = "//a[normalize-space()='Scoll Down']")
	WebElement scollDownlLink;

	@FindBy(xpath = "//a[@class='scrollDown btn btn-primary btn-floating btn-lg']//*[name()='svg']")
	WebElement arrowDownButton;

	public void openScrollDownPage() {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", widgetsMenu);
		w.until(ExpectedConditions.elementToBeClickable(widgetsMenu));
		js.executeScript("arguments[0].click();", widgetsMenu);

		js.executeScript("arguments[0].scrollIntoView(true);", scollDownlLink);
		w.until(ExpectedConditions.elementToBeClickable(scollDownlLink));
		js.executeScript("arguments[0].click();", scollDownlLink);
	}

	public void scrollDownBtn() {

		 WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
	        w.until(ExpectedConditions.elementToBeClickable(arrowDownButton));
	        arrowDownButton.click();
	}
	
	 public void isAtBottom() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0, -1000);");
//		    Number scrollHeight = (Number) js.executeScript("return document.body.scrollHeight;");
//		    Number currentPos = (Number) js.executeScript("return window.pageYOffset + window.innerHeight;");
//		    return currentPos.intValue() >= scrollHeight.intValue();
	    }	
}

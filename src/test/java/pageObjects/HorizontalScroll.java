package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HorizontalScroll extends BasePage{

	public HorizontalScroll(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//button[normalize-space()='Widgets']")
	WebElement widgetsMenu;
	
	@FindBy(xpath="//a[normalize-space()='Horizontal Scroll']")
	WebElement horizontalScrollLink;
	
	public void openHorizontalPage() {
	
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", widgetsMenu);
		w.until(ExpectedConditions.elementToBeClickable(widgetsMenu));
		js.executeScript("arguments[0].click();", widgetsMenu);

		js.executeScript("arguments[0].scrollIntoView(true);", horizontalScrollLink);
		w.until(ExpectedConditions.elementToBeClickable(horizontalScrollLink));
		js.executeScript("arguments[0].click();", horizontalScrollLink);
	}
	public void scrollRight() {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(500, 0);");  // Scroll 500px to the right
	}

	public void scrollLeft() {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(-500, 0);"); // Scroll 500px to the left
	}

	public boolean isAtRightEnd() {
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    Number scrollWidth = (Number) js.executeScript("return document.body.scrollWidth;");
	    Number currentPos = (Number) js.executeScript("return window.scrollX + window.innerWidth;");

	    return currentPos.doubleValue() >= scrollWidth.doubleValue();
	}

	public boolean isAtLeftEnd() {
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    Number currentPos = (Number) js.executeScript("return window.scrollX;");
	    return currentPos.intValue() == 0;
	}

}

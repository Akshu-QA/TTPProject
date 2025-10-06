package pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Widgets extends BasePage {

	public Widgets(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//button[normalize-space()='Widgets']")
	WebElement widgetsLink;

	@FindBy(xpath = "//div[@class='accordion-collapse collapse show']")
	List<WebElement> widgetsSubField;

	public void clickWidgetsLink() {
		try {
			widgetsLink.click();
		} catch (Exception e) {

			((JavascriptExecutor) driver).executeScript("arguments[0].click();", widgetsLink);
		}
	}

	public List<WebElement> getWidgetSubField() {
		return widgetsSubField;

	}
}

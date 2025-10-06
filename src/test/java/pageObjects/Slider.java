package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Slider extends BasePage {

	public Slider(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//button[normalize-space()='Widgets']")
	WebElement widgetsMenu;

	@FindBy(xpath = "//a[normalize-space()='Slider']")
	WebElement sliderLink;

	@FindBy(xpath = "//input[@id='ageInputId']")
	WebElement slider;

	public void clickSliderLink() {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", widgetsMenu);
		w.until(ExpectedConditions.elementToBeClickable(widgetsMenu)).click();

		js.executeScript("arguments[0].scrollIntoView(true);", sliderLink);
		w.until(ExpectedConditions.elementToBeClickable(sliderLink)).click();
	}

	public void moveSlider(int xOffset) {
		Actions ac = new Actions(driver);
		ac.dragAndDropBy(slider, 1, 0).build().perform();
	}

	public String getSliderValue() {
		return slider.getAttribute("value");

	}
}

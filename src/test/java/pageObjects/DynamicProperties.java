package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicProperties extends BasePage {

	public DynamicProperties(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[normalize-space()='Dynamic Properties']")
	WebElement dynamicPropertiesLink;

	@FindBy(xpath = "//button[@id='colorChange']")
	WebElement colorChangeBtn;

	@FindBy(xpath = "//button[@id='visibleAfter']")
	WebElement visibleAfterBtn;

	public void clickDynamicProperties() {
		dynamicPropertiesLink.click();
	}

	public void clickColorChangeBtn() {
		colorChangeBtn.click();
	}

	public WebElement getVisibleAfterBtn() {
		return visibleAfterBtn;
	}

}

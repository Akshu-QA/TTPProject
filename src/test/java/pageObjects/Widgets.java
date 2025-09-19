package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Widgets extends BasePage{

	public Widgets(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath ="//button[normalize-space()='Widgets']")
	WebElement widgetsLink;

	public void clickWidgetsLink() {
		widgetsLink.click();
	}

}

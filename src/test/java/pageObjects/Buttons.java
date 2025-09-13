package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Buttons extends BasePage {

	public Buttons(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[@href='buttons.php']")
	WebElement buttons;
	
	@FindBy(css=".btn.btn-primary")
	WebElement clickMeBtn;
	
	@FindBy(css=".btn.btn-secondary")
	WebElement rightClickMeBtn;

}

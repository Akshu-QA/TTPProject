package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButton extends BasePage{

	public RadioButton(WebDriver driver) {
		super(driver);		
	}
	
	@FindBy(xpath="//a[@href='radio-button.php']")
	WebElement radioBtnLink;
	
	@FindBy(xpath="(//input[@value='igottwo'])")
	WebElement radioBtnYes;
	
	@FindBy(xpath="(//input[@value='igotthree'])")
	WebElement radioBtnImpressive;
	
	@FindBy(xpath="(//input[@value='option3'])")
	WebElement radioBtnDisable;
	
	public void clickRadioBtnLink() {
		radioBtnLink.click();
	}
	
	public void radioBtnClick() {
		radioBtnYes.click();
		radioBtnImpressive.click();
	}

}

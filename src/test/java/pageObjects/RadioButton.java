package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButton extends BasePage {
	String yesMsg;
	String impMsg;

	public RadioButton(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@href='radio-button.php']")
	WebElement radioBtnLink;

	@FindBy(xpath = "(//input[@value='igottwo'])")
	WebElement radioBtnYes;

	@FindBy(xpath = "(//input[@value='igotthree' and @type='radio'])")
	public WebElement radioBtnImpressive;

	@FindBy(xpath = "(//input[@value='option3'])")
	WebElement radioBtnDisable;

	@FindBy(xpath = "//div[@id='check']")
	WebElement yesTextMsg;

	@FindBy(xpath = "//div[@id='check1']")
	WebElement impTextMsg;

	public void clickRadioBtnLink() {
		radioBtnLink.click();
	}

	public void radioBtnYesClick() {
		radioBtnYes.click();
	}

	public void radioBtnImpressiveClick() {
		radioBtnImpressive.click();
	}

	public String yesTextMsgGet() {
		return yesMsg = yesTextMsg.getText();
	}

	public String impTextMsgGet() {
		return impMsg = impTextMsg.getText();
	}

}

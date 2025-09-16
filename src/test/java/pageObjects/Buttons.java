package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Buttons extends BasePage {
	String rightClick;

	public Buttons(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@href='buttons.php']")
	WebElement buttonsLink;

	@FindBy(css = ".btn.btn-primary")
	WebElement clickMeBtn;

	@FindBy(xpath = "//button[@class='btn btn-secondary']")
	public WebElement rightClickMeBtn;

	@FindBy(css = ".btn.btn-success")
	public WebElement doubleClickMeBtn;

	@FindBy(xpath = "//div[@id='welcomeDiv']")
	public WebElement clickMeTextLoc;

	@FindBy(xpath = "//p[@id='doublec']")
	public WebElement doubleClickMeTextLoc;

	public void btnLinkClick() {
		buttonsLink.click();
	}

	public void clickMeBtnClick() {
		clickMeBtn.click();
	}

	public void rightClickMeBtnMethod() {
		Actions ac = new Actions(driver);
		ac.contextClick(rightClickMeBtn).build().perform();
	}

	public void doubleClickMeBtnMethod() {
		Actions ac = new Actions(driver);
		ac.doubleClick(doubleClickMeBtn).build().perform();
	}

	public String getClickMeText() {
		return clickMeTextLoc.getText();
	}

	public String getDoubleClickMeTextMethod() {
		return doubleClickMeTextLoc.getText();

	}

}
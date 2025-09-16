package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Buttons extends BasePage {
	String rightClick;

	public Buttons(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[@href='buttons.php']")
	WebElement buttons;
	
	@FindBy(css=".btn.btn-primary")
	WebElement clickMeBtn;
	
	@FindBy(xpath="//button[@class='btn btn-secondary']")
	WebElement rightClickMeBtn;
	
	@FindBy(xpath="//div[@id='welcomeDiv']")
	public WebElement clickMeText;
	
	public void btnClick() {
		buttons.click();
	}	
	
	public String rightClickBtn() {
		Actions ac = new Actions(driver);		
		ac.contextClick(rightClickMeBtn).perform();
		return rightClick;
	}

}
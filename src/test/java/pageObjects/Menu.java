package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menu extends BasePage{

	public Menu(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Menu']")
	WebElement menuLink;
	
	@FindBy(xpath="//a[@role='button']")
	WebElement dropdownLink;
	
	public void clickMenu() {
		menuLink.click();
	}

}

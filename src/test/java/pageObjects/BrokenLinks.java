package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrokenLinks extends BasePage{

	public BrokenLinks(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath ="//a[normalize-space()='Broken Links - Images']")
	WebElement BrokenLinks;
	
	@FindBy(xpath ="//a[normalize-space()='Click Here for Broken Link']")
	WebElement BrokenLinks1;
	
	public void brokenLinkMethod() {
		
	}

}

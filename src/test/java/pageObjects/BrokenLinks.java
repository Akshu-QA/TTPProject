package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrokenLinks extends BasePage {

	public BrokenLinks(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[normalize-space()='Broken Links - Images']")
	WebElement brokenLinks;

	@FindBy(xpath = "//a[text()='Click Here for Broken Link']")
	WebElement brokenLinks1;

	@FindBy(linkText = "broken link")
	WebElement goBackLink;

	public void brokenLinkClick() {
		brokenLinks.click();
	}

	public void linkClick() {
		brokenLinks1.click();
	}

	public void goBackLinkClick() {
		goBackLink.click();
	}

}

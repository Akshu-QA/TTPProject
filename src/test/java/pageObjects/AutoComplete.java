package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoComplete extends BasePage{

	public AutoComplete(WebDriver driver) {
		super(driver);		
	}
	@FindBy(xpath="//a[normalize-space()='Auto Complete']")
	WebElement autoCompleteLink;
	
	@FindBy(xpath="//input[@id='tags']")
	WebElement tagsLink;
	
	public void openAutoComplete() {
		try {
		autoCompleteLink.click();
		tagsLink.click();
	}catch(Exception e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", autoCompleteLink);
		js.executeScript("arguments[0].click();", autoCompleteLink);		
	}
		tagsLink.sendKeys("testing");	
		
	}
}

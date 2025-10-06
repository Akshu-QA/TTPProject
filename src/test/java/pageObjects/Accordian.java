package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Accordian extends BasePage{

	public Accordian(WebDriver driver) {
		super(driver);		
	}
	
	@FindBy(xpath = "//button[normalize-space()='Widgets']")
	WebElement widgetsMenu;
	
	@FindBy(xpath="//a[normalize-space()='Accordion']")
	WebElement accordianLink;
	
	@FindBy(xpath= "//button[normalize-space()='What is Lorem Ipsum?']")
	WebElement firstPanelLink;
		
	public void openAccordianLink() {
		try {
		widgetsMenu.click();
		accordianLink.click();
	}catch(Exception e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",accordianLink );
		js.executeScript("arguments[0].click();", accordianLink);
	}
	}	
	
	public void expandFirstPanel() {
		firstPanelLink.click();
	}
}

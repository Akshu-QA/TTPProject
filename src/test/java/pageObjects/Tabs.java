package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tabs extends BasePage{

	public Tabs(WebDriver driver) {
		super(driver);		
	}
	
	@FindBy(xpath = "//button[normalize-space()='Widgets']")
	WebElement widgetsMenu;
	
	@FindBy(xpath="//a[normalize-space()='Tabs']")
	WebElement tabsLinks;
	
	@FindBy(xpath="//button[@id='nav-home-tab']")
	WebElement homeLinks;
	
	@FindBy(xpath="//button[@id='nav-profile-tab']")
	WebElement profileLinks;
	
	@FindBy(xpath="//button[@id='nav-contact-tab']")
	WebElement contactLinks;
	
	public void clickTabs() {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", widgetsMenu);
		w.until(ExpectedConditions.elementToBeClickable(widgetsMenu));
		js.executeScript("arguments[0].click();", widgetsMenu);

	
		js.executeScript("arguments[0].scrollIntoView(true);", tabsLinks);
		w.until(ExpectedConditions.elementToBeClickable(tabsLinks));
		js.executeScript("arguments[0].click();", tabsLinks);
	}
}

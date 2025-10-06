package pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InteractionMenu extends BasePage{

	public InteractionMenu(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//button[normalize-space()='Interaction']")
	WebElement interactionLink;
	
	@FindBy(xpath = "//div[@class='accordion-collapse collapse show']")
	List<WebElement> interactionSubField;
	
	public void clickInteractionLink() {
		try {
			interactionLink.click();
		}catch(Exception e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", interactionLink);	
		}
	}
	public List<WebElement> getInteractionSubField(){
		return interactionSubField;
	}
}

package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectMenu extends BasePage {

	public SelectMenu(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//button[normalize-space()='Widgets']")
	WebElement widgetsMenu;

	@FindBy(xpath = "//a[normalize-space()='Select Menu']")
	WebElement selectMenuLink;

	@FindBy(xpath = "//span[contains(@class,'mbsc-textfield mbsc-textfield-outline mbsc-select mbsc-textfield-stacked mbsc-textfield-outline-stacked mbsc-textarea')]")
	WebElement multiSelectDropdownLink;

	@FindBy(xpath = "//select[@id='inputGroupSelect03']")
	WebElement selectOnelink;

	public void clickSelectMenu() {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", widgetsMenu);
		w.until(ExpectedConditions.elementToBeClickable(widgetsMenu));
		js.executeScript("arguments[0].click();", widgetsMenu);

		js.executeScript("arguments[0].scrollIntoView(true);", selectMenuLink);
		w.until(ExpectedConditions.elementToBeClickable(selectMenuLink));
		js.executeScript("arguments[0].click();", selectMenuLink);
	}

	public void selectMultipleOptions() {
		Select sc = new Select(multiSelectDropdownLink);
		if (sc.isMultiple()) {
			sc.selectByVisibleText("Books");
			sc.selectByVisibleText("Books");
			sc.selectByVisibleText("Health & Beauty");
		}
	}

	public List<WebElement> getSelectedOption() {
		Select s = new Select(multiSelectDropdownLink);
		return s.getAllSelectedOptions();
	}

	public void deselectOption(String option) {
		Select select = new Select(multiSelectDropdownLink);
		select.deselectByVisibleText(option);

	}
}
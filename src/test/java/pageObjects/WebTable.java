package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTable extends BasePage {

	public WebTable(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@href='webtables.php']")
	WebElement webTable;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement addButton;

	@FindBy(xpath = "//input[@id='firstname']")
	WebElement fullName;

	public void clickWebtable() {
		webTable.click();
	}

	public void clickAddBtn() {
		addButton.click();
	}

	public void enterRefFormDetail() {
		fullName.sendKeys("test");
		
	}

}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBox extends BasePage {

	public CheckBox(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@href='check-box.php']")
	WebElement checkBoxLink;

	@FindBy(id = "c_bs_1")
	WebElement mainLeve1CB;

	@FindBy(xpath = "//li[@id=\"bs_1\"]/span[1]")
	WebElement mainLevelPlus1;

	@FindBy(xpath = "//li[@id='bf_1']/span[1]")
	WebElement subLevelPlus1;

	public void clickCheckBoxLink() {
		checkBoxLink.click();
	}

	public void cBoxClick() {
		mainLeve1CB.click();
	}

	public void plusBtnClick() {
		mainLevelPlus1.click();
		subLevelPlus1.click();
	}

}

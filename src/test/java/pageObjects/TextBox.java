package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBox extends BasePage {

	public TextBox(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@href='text-box.php']")
	WebElement textBoxLink;

	@FindBy(xpath = "//input[@id='fullname']")
	WebElement fullName;

	@FindBy(xpath = "//input[@id='email']")
	WebElement emailField;

	@FindBy(xpath = "//textarea[@id='address']")
	WebElement enterCurrentAdress;

	@FindBy(xpath = "//input[@id='password']")
	WebElement enterPassword;
	
	@FindBy(css= ".btn.btn-primary")
	WebElement submitBtn;

	public void clickTextBoxLink() {
		textBoxLink.click();
	}

	public void enterFullName(String fName) {
		fullName.sendKeys(fName);
	}

	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}
	
	public void clickSubmit() {
		submitBtn.click();
	}

}

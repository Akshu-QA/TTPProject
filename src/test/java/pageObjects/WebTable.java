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

	@FindBy(id = "lastname")
	WebElement lastName;

	@FindBy(id = "email")
	WebElement email;

	@FindBy(id = "age")
	WebElement age;

	@FindBy(id = "salary")
	WebElement salary;

	@FindBy(id = "deparment")
	WebElement deparment;

	@FindBy(css = "input[value='Login']")
	WebElement loginBtn;

	public void clickWebtable() {
		webTable.click();
	}

	public void clickAddBtn() {
		addButton.click();
	}

	public void enterRefFormDetail() {
		fullName.sendKeys("akshu");
		lastName.sendKeys("pawar");
		email.sendKeys("abc@gmail.com");
		age.sendKeys("12345");
		salary.sendKeys("10000005465465465465156156454bsdhggascgfxcacsxgfc ");
		deparment.sendKeys("QA");
	}

	public void clickLoginBtn() {
		loginBtn.click();
	}

}

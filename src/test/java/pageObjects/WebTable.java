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

	@FindBy(xpath = "//tbody//tr[1]//a[@class='edit-wrap']")
	WebElement row1Edit;

	@FindBy(xpath = "//input[@value='Submit']")
	public WebElement editSubmitBtn;

	@FindBy(xpath = "//tbody//tr[1]//td[7]//a[2]")
	WebElement deleteBtn;

	@FindBy(xpath = "//input[@placeholder='Type to Search']")
	WebElement searchField;

	@FindBy(css = ".btn.btn-outline-secondary")
	WebElement searchBtn;

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

	public void row1EditClick() {
		row1Edit.click();
	}

	public void editSubmitBtnClick() {
		editSubmitBtn.click();
	}

	public void deleteBtnClick() {
		deleteBtn.click();
	}

	public void searchFieldInput(String input) {
		searchField.sendKeys(input);
	}

	public void searchBtnClick() {
		searchBtn.click();
	}

}

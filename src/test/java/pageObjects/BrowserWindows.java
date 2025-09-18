package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrowserWindows extends BasePage {

	public BrowserWindows(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//button[@aria-controls='collapseThree']")
	WebElement alertFrameWindLink;

	@FindBy(xpath = "//a[@href='browser-windows.php']")
	WebElement browserWinLink;

	@FindBy(xpath = "//button[@title='New Tab']")
	WebElement newTabBtn;

	@FindBy(xpath = "//div//button[@class='btn btn-primary'][2]")
	WebElement newWindowBtn;

	@FindBy(xpath = "//div[@class='row d-flex justify-content-center logindiv bg-white rounded']")
	WebElement newTabText;

	@FindBy(xpath = "//h1[@class='mb-3 fw-normal border-bottom text-left pb-2 mb-4']")
	WebElement newWinText;

	@FindBy(xpath = "//h1[@class='mb-3 fw-normal border-bottom text-left pb-2 mb-4']")
	WebElement newWinMsgText;

	@FindBy(xpath = "//div//button[@class='btn btn-primary'][3]")
	WebElement newWinMsgBtn;

	public void alertFrameWindLinkClick() {
		alertFrameWindLink.click();
	}

	public void newTabBtnClick() {
		newTabBtn.click();
	}

	public void browserWinLinkClick() {
		browserWinLink.click();
	}

	public String newTabTextGet() {
		return newTabText.getText();
	}

	public void newWindowBtnClick() {
		newWindowBtn.click();
	}

	public String newWinTextGet() {
		return newTabText.getText();
	}

	public String newWinMsgTextGet() {
		return newWinMsgText.getText();
	}

	public void newWinMsgBtnClick() {
		newWinMsgBtn.click();
	}

}

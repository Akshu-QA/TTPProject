package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadandDownload extends BasePage{

	public UploadandDownload(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Upload and Download']")
	WebElement uploadDownloadLink;
	
	@FindBy(xpath="//a[@id='downloadButton']")
	WebElement downloadLink;
	
	@FindBy(xpath="//input[@id='uploadFile']")
	WebElement selectFileLink;
	
	public void uploadDowloadClick() {
		uploadDownloadLink.click();	
	}
	
	public void downloadBtn() {
		downloadLink.click();
	}
	
	public void chooseFile() {
		selectFileLink.click();
	}
}

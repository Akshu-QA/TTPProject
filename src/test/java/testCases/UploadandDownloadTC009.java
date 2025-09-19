package testCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.UploadandDownload;
import testBase.BaseClass;

public class UploadandDownloadTC009 extends BaseClass {

	@Test
	public void uploadDownloadMethod() {
		UploadandDownload ud = new UploadandDownload(driver);
		ud.uploadDowloadClick();
	}

	@Test
	public void selectFileMethod() {
		UploadandDownload ud = new UploadandDownload(driver);
		ud.chooseFile();
		String file = System.getProperty("user.home") + "\\OneDrive\\Desktop.docx";
	}
}

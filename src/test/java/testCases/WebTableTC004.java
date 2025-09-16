package testCases;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.WebTable;
import testBase.BaseClass;

public class WebTableTC004 extends BaseClass {

	@Test
	public void webTableMethod() {
		implicitlyWaitMethod(5);
		WebTable wb = new WebTable(driver);
		wb.clickWebtable();
		wb.clickAddBtn();
		wb.enterRefFormDetail();
		wb.clickLoginBtn();
		wb.row1EditClick();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(wb.editSubmitBtn));
		wb.editSubmitBtnClick();
		wb.deleteBtnClick();
		wb.searchFieldInput("alden");
		wb.searchBtnClick();

	}

}

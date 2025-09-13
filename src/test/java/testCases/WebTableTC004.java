package testCases;

import org.testng.annotations.Test;

import pageObjects.WebTable;
import testBase.BaseClass;

public class WebTableTC004 extends BaseClass{
	
	@Test
	public void webTableMethod() {
		WebTable wb = new WebTable(driver);
		wb.clickWebtable();
		wb.clickAddBtn();
		wb.enterRefFormDetail();
	}

}

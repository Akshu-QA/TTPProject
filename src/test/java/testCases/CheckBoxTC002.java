package testCases;

import org.testng.annotations.Test;

import pageObjects.CheckBox;
import testBase.BaseClass;

public class CheckBoxTC002 extends BaseClass {

	@Test(priority = 2)
	public void checkBoxMethod() {
		CheckBox cb = new CheckBox(driver);
		cb.clickCheckBoxLink();
		cb.cBoxClick();
		cb.plusBtnClick();
	}
}

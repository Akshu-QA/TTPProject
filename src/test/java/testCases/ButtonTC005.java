package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Buttons;
import testBase.BaseClass;

public class ButtonTC005 extends BaseClass {
	
	@Test
	public void btnClickMethod() {
		Buttons cb = new Buttons(driver);
		cb.btnClick();
	}
	@Test
	public void rightClickBtnMethod() throws InterruptedException {
		Buttons rcb = new Buttons(driver);
		rcb.rightClickBtn();	
		String text=rcb.clickMeText.getText().trim();
		Assert.assertEquals(text, "You have done a dynamic click");
	}
}

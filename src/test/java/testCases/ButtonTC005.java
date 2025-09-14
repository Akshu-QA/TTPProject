package testCases;

import org.testng.annotations.Test;

import pageObjects.Buttons;
import testBase.BaseClass;

public class ButtonTC005 extends BaseClass {
	
	@Test
	public void buttonsClick() {
		Buttons cb = new Buttons(driver);
		cb.btnClickMethod();

	}
}

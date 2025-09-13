package testCases;

import org.testng.annotations.Test;

import pageObjects.TextBox;
import testBase.BaseClass;

public class TextBoxTC001 extends BaseClass {

	@Test(priority = 1)
	public void textBoxMethod() {
		TextBox tb = new TextBox(driver);

		tb.clickTextBoxLink();
		tb.enterFullName("test");
		tb.enterEmail("test@gmail.com");
		tb.enterPW("123456");
		tb.clickSubmit();
	}
}

package testCases;

import org.testng.annotations.Test;

import pageObjects.Widgets;
import testBase.BaseClass;

public class WidgetsTC0011 extends BaseClass{
	
	@Test
	public void widgetsMethod() {
		Widgets w = new Widgets(driver);
		w.clickWidgetsLink();
	}
}

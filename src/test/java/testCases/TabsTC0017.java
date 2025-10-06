package testCases;

import org.testng.annotations.Test;

import pageObjects.Tabs;
import testBase.BaseClass;

public class TabsTC0017 extends BaseClass {

	@Test(priority = 20)
	public void tabsMethod() {
		Tabs t = new Tabs(driver);
		t.clickTabs();
	}
}

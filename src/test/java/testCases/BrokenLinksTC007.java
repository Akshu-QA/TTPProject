package testCases;

import org.testng.annotations.Test;

import pageObjects.BrokenLinks;
import testBase.BaseClass;

public class BrokenLinksTC007 extends BaseClass {

	@Test
	public void brokenLinksMethod() {
		BrokenLinks bl = new BrokenLinks(driver);
		bl.brokenLinkMethod();
	}
}

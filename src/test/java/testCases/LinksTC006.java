package testCases;

import org.testng.annotations.Test;

import pageObjects.Links;
import testBase.BaseClass;

public class LinksTC006 extends BaseClass {

	@Test(priority = 7)
	public void links() {
		Links l = new Links(driver);
		l.linksMethod();
	}
}

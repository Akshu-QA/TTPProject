package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HorizontalScroll;
import testBase.BaseClass;

public class HorizontalScrollTC0022 extends BaseClass{
	//pending
	@Test(priority = 25)
	public void horizntalScollMethod() {
		HorizontalScroll hs = new HorizontalScroll(driver);	
		hs.openHorizontalPage();
		 hs.scrollRight();
	     Assert.assertTrue(hs.isAtRightEnd(), "Page not scrolled to the right end");
	     hs.scrollLeft();
	     Assert.assertTrue(hs.isAtLeftEnd(), "Page not scrolled back to the left end");		
	}
}

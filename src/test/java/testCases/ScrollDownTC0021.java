package testCases;

import org.testng.annotations.Test;

import pageObjects.ScollDown;
import testBase.BaseClass;

public class ScrollDownTC0021 extends BaseClass{
	
	@Test(priority = 24)
	public void scollDownMethod() {
		ScollDown sd = new ScollDown(driver);
		sd.openScrollDownPage();
		sd.scrollDownBtn();
		sd.isAtBottom();	
	}
}

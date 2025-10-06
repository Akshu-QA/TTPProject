package testCases;

import org.testng.annotations.Test;
import pageObjects.Accordian;
import testBase.BaseClass;

public class Accordian0012 extends BaseClass{
	
	@Test(priority = 16)
	public void accordianMethod() {		
		Accordian al = new Accordian(driver);
		al.openAccordianLink();
		al.expandFirstPanel();
	}
}

package testCases;

import org.testng.annotations.Test;

import pageObjects.AutoComplete;
import testBase.BaseClass;

public class AutoCompleteTC0013 extends BaseClass{
	
	@Test(priority = 17)
	public void autoCompleteMethod() {
		AutoComplete ac = new AutoComplete(driver);
		ac.openAutoComplete();	
	}
}

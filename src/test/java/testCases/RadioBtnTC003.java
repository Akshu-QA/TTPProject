package testCases;

import org.testng.annotations.Test;

import pageObjects.RadioButton;
import testBase.BaseClass;

public class RadioBtnTC003 extends BaseClass{
	
	@Test
	public void radioBtnMethod() {
		RadioButton rb = new RadioButton(driver) ;		
		rb.radioBtnClick();	
		}
	}



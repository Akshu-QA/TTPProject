package testCases;

import org.testng.annotations.Test;

import pageObjects.DatePicker;
import testBase.BaseClass;

public class DatePickerTC0014 extends BaseClass{
	//pending
	@Test(priority = 18)
	public void datePickerMethod() throws InterruptedException {	
		DatePicker dp = new DatePicker(driver);
		dp.clickDatePickerLink();
		dp.openCalander();
		dp.selectDate("19", "December", "2025");
		System.out.println("date selected sucessfully");
	}
}

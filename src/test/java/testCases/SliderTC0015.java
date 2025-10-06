package testCases;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.Slider;
import testBase.BaseClass;

public class SliderTC0015 extends BaseClass {

	@Test(priority = 18)
	public void sliderMethod() {
		implicitlyWaitMethod(5);
		Slider s = new Slider(driver);
		s.clickSliderLink();
		s.moveSlider(80);
		String sliderValue =s.getSliderValue();
		System.out.println("slider moved to "+sliderValue);
		Assert.assertNotNull(sliderValue,"slider value should not be null");
		Assert.assertTrue(Integer.parseInt(sliderValue)>=80 ,"slider should move from default position");
	}		
}

package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.RadioButton;
import testBase.BaseClass;

public class RadioBtnTC003 extends BaseClass {

	@Test(priority = 3)
	public void aradioBtnMethod() {
		RadioButton rb = new RadioButton(driver);
		rb.clickRadioBtnLink();
		rb.radioBtnYesClick();
		String msg = rb.yesTextMsgGet().trim();
		Assert.assertEquals(msg, "You have checked Yes");
	}

	@Test(priority = 4)
	public void impressiveMethod() throws InterruptedException {
		implicitlyWaitMethod(5);
		RadioButton rb = new RadioButton(driver);
		explicitWaitMethod(rb.radioBtnImpressive, 5);
		Thread.sleep(2000);
		rb.radioBtnImpressiveClick();
		String msg = rb.impTextMsgGet().trim();
		Assert.assertEquals(msg, "You have checked Impressive");
		boolean yesDisp = rb.radioBtnImpressive.isEnabled();
		Assert.assertEquals(yesDisp, true);
	}
}

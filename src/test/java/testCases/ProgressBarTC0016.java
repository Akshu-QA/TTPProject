package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ProgressBar;
import testBase.BaseClass;

public class ProgressBarTC0016 extends BaseClass {
//pending
	@Test(priority = 19)
	public void progressBarMathod() throws InterruptedException {
		ProgressBar pb = new ProgressBar(driver);
		pb.clickProgressBar();
		pb.clickStartBtn();

		String pv = "";
		for (int i = 0; i < 20; i++) {
			//Thread.sleep(2000);
			pv=pb.getProgressValue();
			System.out.println("current value :"+pv + "%");
			if(pv.equals("100")) {
				break;
			}
		}
		Assert.assertEquals(pv, "100","progress bar did not complete");
	}
}

package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ScollTop;
import testBase.BaseClass;

public class ScollTopTC0020  extends BaseClass{

	@Test(priority = 23)
	public void scollTopMethod() {
		ScollTop st = new ScollTop(driver);
		st.openScrollTopPage();
		st.scrollDownShowBtn();
		st.clickBackToTop();
		Assert.assertTrue(st.isAtTop(), "page did not scroll back to top");
		System.out.println("scollTop functionality  verified  sucessfully");
	}
}

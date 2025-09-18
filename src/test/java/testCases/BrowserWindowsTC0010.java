package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.BrowserWindows;
import testBase.BaseClass;

public class BrowserWindowsTC0010 extends BaseClass {

	@Test(priority = 9)
	public void newTabMethod() {
		BrowserWindows bw = new BrowserWindows(driver);
		bw.alertFrameWindLinkClick();
		bw.browserWinLinkClick();

		String pwh = driver.getWindowHandle();
		String cwh = null;
		bw.newTabBtnClick();
		Set<String> allwh = driver.getWindowHandles();
		for (String ref : allwh) {
			if (!ref.equals(pwh)) {
				driver.switchTo().window(ref);
				cwh = driver.getWindowHandle();
			}
		}
		driver.switchTo().window(cwh);
		String newTabText = bw.newTabTextGet();
		Assert.assertTrue(newTabText.contains("New Tab"), "Sample New Tab");
		driver.switchTo().window(pwh);
	}

	@Test(priority = 10)
	public void newWinMethod() {
		BrowserWindows bw = new BrowserWindows(driver);
		// bw.alertFrameWindLinkClick();
		// bw.browserWinLinkClick();
		bw.newWindowBtnClick();
		String nwh = null;
		String pwh = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		for (String ref : allwh) {
			if (!ref.equals(pwh)) {
				driver.switchTo().window(ref);
				nwh = driver.getWindowHandle();
			}
		}
		driver.switchTo().window(nwh);
		driver.manage().window().maximize();
		Assert.assertTrue(bw.newWinTextGet().contains("New Window"), "New Window");
		driver.switchTo().window(pwh);
	}

	@Test(priority = 11)
	public void NewWinMsgMethod() {
		BrowserWindows bw = new BrowserWindows(driver);
		bw.newWinMsgBtnClick();
		String nwh = null;
		String pwh = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		for (String ref : allwh) {
			if (!ref.equals(pwh)) {
				driver.switchTo().window(ref);
				nwh = driver.getWindowHandle();
			}
		}
		driver.switchTo().window(nwh);
		driver.manage().window().maximize();
		Assert.assertTrue(bw.newWinTextGet().contains("New Window"), "New Window");
		driver.switchTo().window(pwh);

	}
}

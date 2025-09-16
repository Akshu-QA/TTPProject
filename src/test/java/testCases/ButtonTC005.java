package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.Buttons;
import testBase.BaseClass;

public class ButtonTC005 extends BaseClass {

	@Test
	public void buttonsClick() {
		implicitlyWaitMethod(5);
		Buttons cb = new Buttons(driver);
		cb.btnLinkClick();

		cb.clickMeBtnClick();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement clickMeText = wait.until(ExpectedConditions.visibilityOf(cb.clickMeTextLoc));
		String actualMsg1 = cb.getClickMeText();
		Assert.assertEquals(actualMsg1, "You have done a dynamic click");

		cb.rightClickMeBtnMethod();
		Actions ac = new Actions(driver);

		explicitWaitMethod(cb.doubleClickMeBtn, 5);
		cb.doubleClickMeBtnMethod();
		WebElement doubleClickMe = wait.until(ExpectedConditions.visibilityOf(cb.doubleClickMeTextLoc));
		String actualMsg2 = cb.getDoubleClickMeTextMethod();
		Assert.assertEquals(actualMsg2, "You have Double clicked");
		ac.contextClick(cb.doubleClickMeTextLoc).build().perform();
		ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build()
				.perform();
	}
}

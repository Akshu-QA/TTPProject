package testCases;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.DynamicProperties;
import testBase.BaseClass;

public class DynamicPropertiesTC008 extends BaseClass {

	@Test(priority = 13)
	public void dynamicPropertiesMethod() {
		DynamicProperties dp = new DynamicProperties(driver);
		dp.clickDynamicProperties();
		dp.clickColorChangeBtn();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement visibleBtn = wait.until(ExpectedConditions.visibilityOf(dp.getVisibleAfterBtn()));
		visibleBtn.click();
	}
}

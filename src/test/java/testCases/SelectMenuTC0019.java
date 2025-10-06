package testCases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.SelectMenu;
import testBase.BaseClass;

public class SelectMenuTC0019 extends BaseClass {
	@Test(priority = 22)
	public void selectMenuMethod() {
		SelectMenu sm = new SelectMenu(driver);
		sm.clickSelectMenu();
		sm.selectMultipleOptions();

		List<WebElement> selectedOptions = sm.getSelectedOption();
		System.out.println("✅ Selected values are:");
		for (WebElement option : selectedOptions) {
			System.out.println(option.getText());
		}
		Assert.assertEquals(selectedOptions.size(), 4, "not all options selected");
		sm.deselectOption("Books");
		Assert.assertEquals(sm.getSelectedOption().size(), 3, "Deselect did not work");
	}
}

package testCases;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.InteractionMenu;
import pageObjects.Widgets;
import testBase.BaseClass;

public class InteractionTC0023 extends BaseClass {
@Test
	public void interactionMethod() {
		InteractionMenu ac = new InteractionMenu(driver);
		ac.clickInteractionLink();
		List<WebElement> subField = ac.getInteractionSubField();
		for (WebElement ref : subField) {
			System.out.println(ref.getText());
		}
	}
}
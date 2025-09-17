package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Links extends BasePage {

	public Links(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@href='links.php']")
	WebElement links;

	@FindBy(xpath = "//div[@class='col-md-8 col-lg-8 col-xl-8']/p/a")
	List<WebElement> allLinks;

	@FindBy(xpath = "//a[@href='https://www.tutorialspoint.com/index.htm']")
	WebElement homeLinks;

	public void linksMethod() {
		links.click();
		List<WebElement> ls = allLinks;
		for (WebElement ref : ls) {
			System.out.println(ref.getText());
			String linkText = ref.getText().trim();
			//System.out.println("list of links:" + linkText);
			if (linkText.equalsIgnoreCase("Moved")) {
				ref.click();
			}
		}
	}
}

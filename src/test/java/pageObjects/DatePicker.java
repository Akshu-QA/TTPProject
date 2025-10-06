package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatePicker extends BasePage {

	public DatePicker(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"headingFour\"]")
	WebElement widgetsMenu;

	@FindBy(xpath = "//a[normalize-space()='Date Picker']")
	WebElement datePickerLink;

	@FindBy(xpath = "//input[@id='datetimepicker1']")
	WebElement inputDatePicker;

	@FindBy(xpath = "//div[@class='flatpickr-current-month']")
	WebElement monthYearHeader;

	@FindBy(xpath = "//span[@class='flatpickr-next-month']")
	WebElement nextButton;

	@FindBy(xpath = "//span[@class='flatpickr-prev-month']")
	WebElement prevButton;

	public void clickDatePickerLink() {
		// Istead of webdriver wait we can use java script executor
		try {
			widgetsMenu.click();
			datePickerLink.click();
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", datePickerLink);
			js.executeScript("arguments[0].click();", datePickerLink);
		}

	}

	public void openCalander() {
		inputDatePicker.click();
	}

	/*public void selectDate(String day, String month, String year) throws InterruptedException {
		while (true) {
			String disp = monthYearHeader.getText().trim();
			if (disp.contains(month.substring(0, 3)) && disp.contains(year)) {
				break;
			} else {
				nextButton.click();
				Thread.sleep(3000);
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		List<WebElement> days = driver.findElements(By.xpath(
				"//span[contains(@class,'flatpickr-day') and not(contains(@class,'prevMonthDay')) and not(contains(@class,'nextMonthDay'))]"));

		for (WebElement ref : days) {
			if (ref.getText().equals(day)) {
				ref.click();
				break;
			}
		}
	}
	*/
	
	public void selectDate(String day, String month, String year) throws InterruptedException {
		
			String disp = monthYearHeader.getText().trim();
			if (disp.contains(month.substring(0, 3)) && disp.contains(year)) {
				
			} else {
				nextButton.click();
				Thread.sleep(3000);
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		
		List<WebElement> days = driver.findElements(By.xpath(
				"//span[contains(@class,'flatpickr-day') and not(contains(@class,'prevMonthDay')) and not(contains(@class,'nextMonthDay'))]"));

		for (WebElement ref : days) {
			if (ref.getText().equals(day)) {
				ref.click();
				break;
			}
		}
	}
}

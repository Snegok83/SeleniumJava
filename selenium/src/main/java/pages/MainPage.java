package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

	@FindBy(id = "search_query_top")
	WebElement searchTop;
	@FindBy(name="submit_search")
	WebElement btnSubmit;
	
	WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void checkSearch(String searchWord) {

		searchTop.sendKeys(searchWord);
	}

	public void clickSearchBtn() {
		btnSubmit.click();
	}
	
	public void clickBack() {
		
		driver.navigate().back();
		
	}
}

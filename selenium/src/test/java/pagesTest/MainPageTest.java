package pagesTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import pages.MainPage;

public class MainPageTest {

	private static String driverType = "webdriver.chrome.driver";
	private static String pathToDriver = "C:\\tmp\\chromedriver.exe";
	WebDriver driver;

	private String searchWord = "test";

	@BeforeTest
	public void beforeTest() {
		System.setProperty(driverType, pathToDriver);

		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test
	public void checkSearch() {
		MainPage mp = PageFactory.initElements(driver, MainPage.class);
		mp.checkSearch(searchWord);
		mp.clickSearchBtn();
		mp.clickBack();

	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}

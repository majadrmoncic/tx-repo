import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;


public class InitTest {
	static WebDriver driver;

	public static String BASE_URL = "https://doodle.com/";

	CreatePollPage newPoll;
	SoftAssert sa;
	SuccessfulPollPage poll;

	@BeforeSuite
	public void setUpSuite() {

		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		
	}



	@BeforeTest
	public void instantiateClass() {
		newPoll = new CreatePollPage(driver);
		sa = new SoftAssert();
		poll = new SuccessfulPollPage(driver);
	}
	
	

	@AfterMethod
	public void afterMethod(ITestResult testResult) {
		if (testResult.getStatus() == ITestResult.FAILURE) {
			System.out.println(testResult.getName() + ": Failed");
		}
		if (testResult.getStatus() == ITestResult.SUCCESS) {
			System.out.println(testResult.getName() + ": Passed");
		}
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}


}
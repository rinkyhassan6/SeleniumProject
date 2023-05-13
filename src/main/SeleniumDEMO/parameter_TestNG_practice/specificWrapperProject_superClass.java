package parameter_TestNG_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class specificWrapperProject_superClass {

	public ChromeDriver driver;
		
	
	@BeforeMethod
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//WebDriverManager.firefoxdriver().setup();
	
		driver = new ChromeDriver();
	
		// maximize
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						
		// load URL
		driver.get("http://leaftaps.com/opentaps");

	
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
	
	
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");

		driver.findElementByXPath("//input[@value='Login']").click();

		// click crm/sfa link
		driver.findElementByLinkText("CRM/SFA").click();
		
		Thread.sleep(2000);
		// throw new RuntimeException();
		
	}
	
	
	
		@AfterMethod
		public void closebrower() {
		//close browser
		driver.close();	
		
	
		}	
		
		
}


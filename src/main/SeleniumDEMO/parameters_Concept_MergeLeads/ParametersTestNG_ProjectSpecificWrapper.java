package parameters_Concept_MergeLeads;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ParametersTestNG_ProjectSpecificWrapper {
	public ChromeDriver driver;

	@Parameters({"url","uname","pwd"})

	@BeforeMethod
	public void login(String url,String uname, String pwd) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//Create object ChromeDriver class
		driver = new ChromeDriver();

		//Maximize window
		driver.manage().window().maximize();

		//implicitly wait
		driver.manage().timeouts().implicitlyWait(02, TimeUnit.SECONDS);

		//Load/enter URL
		driver.get(url);

		//enter username
		driver.findElementById("username").sendKeys(uname);

		//enter password
		driver.findElementByName("PASSWORD").sendKeys(pwd);

		//click Login button
		driver.findElementByClassName("decorativeSubmit").click();

		//click CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();

		Thread.sleep(3000);
	}

	@AfterMethod
	public void closebrowser() {
		driver.quit();

	}
}
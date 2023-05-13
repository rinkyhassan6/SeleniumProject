package Wrapper_Inheritance_Concept_With_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class ProjectSpecificWrapper {
	
	//Declaring "ChromeDriver" as a variable
	
	public ChromeDriver driver;
	
	@BeforeMethod
	public void login() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	//Create object ChromeDriver class
	 driver = new ChromeDriver();
	
	//Maximize window
	driver.manage().window().maximize();
	
	//implicitly wait
	driver.manage().timeouts().implicitlyWait(02, TimeUnit.SECONDS);
	
	//Load/enter URL
	driver.get("http://leaftaps.com/opentaps/control/login");
	
	//enter username
	driver.findElementById("username").sendKeys("DemoSalesManager");
	
	//enter password
	driver.findElementByName("PASSWORD").sendKeys("crmsfa");
	
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

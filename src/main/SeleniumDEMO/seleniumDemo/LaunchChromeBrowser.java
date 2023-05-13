package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchChromeBrowser {
	
	@Test
	public void launchBrowser() throws InterruptedException {
	

	//public static void main(String[] args) {


		//Open/launch Chrome Browser
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//Create object ChromeDriver class
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize window
		driver.manage().window().maximize();
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Load/enter URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		Thread.sleep(2000);
		
		//enter username
		driver.findElementById("username").sendKeys("DemoCSR");
		
		//enter password
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		//click Login button
		driver.findElementByClassName("decorativeSubmit").click();
		
		//click CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
		
		//click create account link
		driver.findElementByPartialLinkText("Create Ac").click();
		
		//click create opportunites link
		driver.findElementByLinkText("Opportunities").click();
		
		//click create Marketing link
		driver.findElementByLinkText("Marketing").click();
		
		//close browser
		driver.close();
		

	}

}

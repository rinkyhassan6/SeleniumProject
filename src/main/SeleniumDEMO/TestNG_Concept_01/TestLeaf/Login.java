package TestNG_Concept_01.TestLeaf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	
	@Test
	public void login() throws InterruptedException {

	//public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Create object ChromeDriver class
		ChromeDriver driver = new ChromeDriver();
		
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
		//Close the browser (Do not log out)
		driver.close();
	}

}

package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Example_Walmart {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    //Create object of ChromeDriver Class
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("http://leaftaps.com/crmsfa/control/partnersMain");
	    
	   
	
		//Maximize window
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		
		

		
		//way-1 -Enter into the frame using ID or Name value
		driver.switchTo().frame("org.opentaps.gwt.common.webapp.webapp");
		
		System.out.println("Successfully enter into the frame");
		
		driver.findElementByXPath("//a[@text()='Create Partner']").click();
		//enter username
		driver.findElementById("username").sendKeys("DemoCSR");
		
		//enter password
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		//click Login button
		driver.findElementByClassName("decorativeSubmit").click();
	     
		driver.switchTo().parentFrame();

		driver.findElementByXPath("//a[@text()='Leads']").click();

	}

}

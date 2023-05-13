package parameter_TestNG_practice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class parameter_createLead_subClass extends specificWrapperProject_superClass {

	@Test
	public void createLead() throws InterruptedException {

		//click create Lead by using Text base Xpath 
				driver.findElementByXPath("//a[text()='Create Lead']").click();
				
				
				//Enter Company Name  - TCS  by using Partial Attribute base Xpath
				driver.findElementByXPath("//input[contains(@id,'createLeadForm_co')]").sendKeys("TCS");
				
				
				//Enter First Name	 Hema using by Attribute base X-path
				driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Hema");
				
				
				//Enter Last Name	 Ma using by Attribute base X-path
				driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Ma");
				
				
				
		// Click Create lead button
		driver.findElementByXPath("//input[@name='submitButton']").click();

		Thread.sleep(4000);
		// throw new RuntimeException();

	}

}

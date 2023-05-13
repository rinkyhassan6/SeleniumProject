package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreatLead_TestNG {

	//public static void main(String[] args) {
		
	@Test
	public void createLeadTestNG() {
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Create object ChromeDriver class
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize window
		driver.manage().window().maximize();
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(02, TimeUnit.SECONDS);
		
		//Load/enter URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//enter username using by Attribute base X-path
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		
		//enter password using by Attribute base X-path
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		
		//click Login button using by Attribute base X-path
		driver.findElementByXPath("//input[@value='Login']").click();

		
		//click CRM/SFA using by Parent to child navigation/travel X-path
		driver.findElementByXPath("//div[@id='button']/a").click();
		
		
		//click create Lead by using Text base Xpath 
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		
		
		//Enter Company Name  - TCS  by using Partial Attribute base Xpath
		driver.findElementByXPath("//input[contains(@id,'createLeadForm_co')]").sendKeys("TCS");
		
		
		//Enter First Name	 Hema using by Attribute base X-path
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Hema");
		
		
		//Enter Last Name	 Ma using by Attribute base X-path
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Ma");
		
		
		 // "selectByVisibleText" method from dropdown for Choose Source	Employee
		// by using 2.Partial Attribute base Xpath:
		 WebElement Source = driver.findElementByXPath("//select[contains(@id,'createLeadForm_da')]");
		 Select dd = new Select(Source);
		 dd.selectByVisibleText("Employee");
		
		 
		  //Enter Title	Ms.
		  driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Ms.");
		

		  // "selectByValue" method from dropdown Choose Industry	Computer Hardware
		  WebElement Industry = driver.findElementById("createLeadForm_industryEnumId");
		  Select dd1 = new Select(Industry);
		  dd1.selectByValue("IND_HARDWARE");
		
		
		  // "selectByIndex" method from dropdown Choose Ownership	Partnership
           WebElement Ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		   Select dd2 = new Select(Ownership);
		   dd2.selectByIndex(2);
		   
		  //Enter Description	 TCS
		   driver.findElementById("createLeadForm_description").sendKeys("TCS");
		   
		   
		  //Enter Country Code	1
		  driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys(" ");
		

		  //Enter  Department	MKT
		   driver.findElementById("createLeadForm_departmentName").sendKeys("MKT");
		   
		   
		 // Enter Number Of Employees	100
		   driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
		   
		   
		  //Enter Web Url	google.com
		  //get Current URL
	 	   driver.getCurrentUrl();
	 	   System.out.println(driver.getCurrentUrl());
		   
		
		   //"selectByIndex" method from dropdown Choose State/Province	Arizona
		   WebElement State = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		   Select dd3 = new Select (State);
		   dd3.selectByIndex(4);
		   
		   
		   //Choose Country	United States
		   driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("United States");
		   
		   
		   // Enter Zip/Postal Code	75061 
		   driver.findElementById("createLeadForm_generalPostalCode").sendKeys("75061");
		   
	
		   //"selectByIndex" method from dropdown Choose Marketing Campaign	Automobile 
		   WebElement Marketing_Campaign = driver.findElementById("createLeadForm_marketingCampaignId");
		   Select dd4 = new Select(Marketing_Campaign);
		   dd4.selectByIndex(2);
		   
		   
		   //Enter phone number	123456
		   driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("123456");
		   
		   
		   // Enter email address	abc@gmail.com
		   driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@gmail.com");


		   // Verify the first name	Not covered
		   
		   
		 //close browser
		  driver.close();
		   
		   
		   
		   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

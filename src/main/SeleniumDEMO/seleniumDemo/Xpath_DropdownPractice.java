package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_DropdownPractice {

	public static void main(String[] args) {
		
		
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
		
		
		//by using X-path : Text base Xpath 
		//click create Lead
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		
		//by using X-path : Partial Attribute base Xpath
		//Enter Company Name  - TCS
		driver.findElementByXPath("//input[contains(@id,'createLeadForm_co')]").sendKeys("TCS");
		
		
		
		//Enter First Name	 Hema
		driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
		
		//Enter Last Name	 Ma
		driver.findElementById("createLeadForm_lastName").sendKeys("Ma");
		
		
		 // "selectByVisibleText" method from dropdown for Choose Source	Employee
		 WebElement Source = driver.findElementById("createLeadForm_dataSourceId");
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

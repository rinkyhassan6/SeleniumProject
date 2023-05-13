package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_CreateLead_CssSelectorLocator_StringConcept {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// load URL
		driver.get("http://leaftaps.com/opentaps");

		// maximize
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.cssSelector("#username")).sendKeys("DemoSalesManager");

		driver.findElement(By.cssSelector("#password")).sendKeys("crmsfa");

		driver.findElement(By.cssSelector(".decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();


		// click leads link
		driver.findElement(By.linkText("Leads")).click();	

		// click create lead link
		driver.findElement(By.partialLinkText("Create")).click();

		// company name
		driver.findElement(By.cssSelector("#createLeadForm_companyName")).sendKeys("TCS");

		// enter firstName
		driver.findElement(By.cssSelector("input#createLeadForm_firstName")).sendKeys("Hema");

		// enter lastName		
		driver.findElement(By.cssSelector("input#createLeadForm_lastName")).sendKeys("Ma");

		// "selectByVisibleText" method from dropdown for Choose Source	Employee
		WebElement Source = driver.findElement(By.cssSelector("#createLeadForm_dataSourceId"));
		Select dd = new Select(Source);
		dd.selectByVisibleText("Employee");


		//Enter Title	Ms.
		driver.findElement(By.cssSelector("#createLeadForm_generalProfTitle")).sendKeys("Ms.");

		// "selectByValue" method from dropdown Choose Industry	Computer Hardware
		WebElement Industry = driver.findElement(By.cssSelector("#createLeadForm_industryEnumId"));
		Select dd1 = new Select(Industry);
		dd1.selectByValue("IND_HARDWARE");


		// "selectByIndex" method from dropdown Choose Ownership	Partnership
		WebElement Ownership = driver.findElement(By.cssSelector("#createLeadForm_ownershipEnumId"));
		Select dd2 = new Select(Ownership);
		dd2.selectByIndex(2);


		driver.findElement(By.cssSelector("#createLeadForm_description")).sendKeys("TCS");


		driver.findElement(By.cssSelector("#createLeadForm_primaryPhoneCountryCode")).sendKeys(" ");


		driver.findElement(By.cssSelector("#createLeadForm_departmentName")).sendKeys("MKT");


		driver.findElement(By.cssSelector("#createLeadForm_numberEmployees")).sendKeys("100");

		System.out.println("  --------------------------------------------------------------------- ");
		
		//get Current URL
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());


		//"selectByIndex" method from dropdown Choose State/Province	Arizona
		WebElement State = driver.findElement(By.cssSelector("#createLeadForm_generalStateProvinceGeoId"));
		Select dd3 = new Select (State);
		dd3.selectByIndex(4);


		//Choose Country	United States
		driver.findElement(By.cssSelector("#createLeadForm_primaryPhoneCountryCode")).sendKeys("United States");

		// Enter Zip/Postal Code	75061 
		driver.findElement(By.cssSelector("#createLeadForm_generalPostalCode")).sendKeys("75061");

		//"selectByIndex" method from dropdown Choose Marketing Campaign	Automobile 
		WebElement Marketing_Campaign = driver.findElement(By.cssSelector("#createLeadForm_marketingCampaignId"));
		Select dd4 = new Select(Marketing_Campaign);
		dd4.selectByIndex(2);


		//Enter phone number	123456
		driver.findElement(By.cssSelector("#createLeadForm_primaryPhoneNumber")).sendKeys("123456");

		// Enter email address	abc@gmail.com
		driver.findElement(By.cssSelector("#createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");

		// Click Create lead

		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		Thread.sleep(4000);
		// throw new RuntimeException();

		// Verify the first name	Not covered by using //String class Method


		String firstname = driver.findElement(By.cssSelector("#viewLead_firstName_sp")).getText();

		if(firstname.equals("Hem")) {

			System.out.println("Name is Matched");
		}else 

			System.out.println("name Not covered");



		//get Current Title
		driver.getTitle();
		System.out.println(driver.getTitle());

		Thread.sleep(4000);
		// throw new RuntimeException();

		//close browser
		driver.close();





	}

}

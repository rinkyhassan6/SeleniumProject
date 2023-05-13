package ParametrizationTestNG_Concept_Without_ExcelFile;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


public class ProjectSpecificWraper {

	public ChromeDriver driver;
	@Parameters({"url","uName","pWord"})

	@BeforeMethod
	public void login(String url, String uName, String pWord) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		driver = new ChromeDriver() ; 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// load URL,username and password
		//Load/enter URL
				driver.get(url);
				
				//enter username
				driver.findElementById("username").sendKeys(uName);
				
				//enter password
				driver.findElementByName("PASSWORD").sendKeys(pWord);
				
				//click Login button
				driver.findElementByClassName("decorativeSubmit").click();
				
				//click CRM/SFA
				driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(3000);
	}

	@AfterMethod
	public void closeBrower() {
		driver.close();
	}

	@DataProvider
	public String[][] employeeListSet() {

		String [][] employeeList = new String [3][3] ;

		employeeList [0][0] = "TCS";
		employeeList [0][1] = "Hema";
	    employeeList [0][2] = "Mali";
	    
		employeeList [1][0] = "ABC";
		employeeList [1][1] = "Sheewli";
	    employeeList [1][2] = "Ahmed";
	    
		employeeList [2][0] = "XYZ";
		employeeList [2][1] = "Ekram";
	    employeeList [2][2] = "Khan";
	    
	    return employeeList;
	    
	    
	    
	    
	    

	}
}
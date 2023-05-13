package ParametrizationTestNG_Concept_With_ExcelSheet;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificWraper_withExcel {

	public ChromeDriver driver;
	@Parameters({"url","uName","pWord"})

	@BeforeMethod
	public void login(String url, String uName, String pWord) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		driver = new ChromeDriver() ; 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// load URL,username and password
				driver.get(url);
				driver.findElementById("username").sendKeys(uName);
				driver.findElementByName("PASSWORD").sendKeys(pWord);
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
	public String[][] getData() throws IOException{
		
		ReadExcel r = new ReadExcel ();
		return r.readExcel();

	}
}

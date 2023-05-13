package Wrapper2_Inheritance_Concept_With_TestNG_Jquery;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificWrapper2 {

	
	public ChromeDriver driver;
	
	@BeforeMethod
	
	public ProjectSpecificWrapper2() throws InterruptedException {
	//public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver = new ChromeDriver();

		driver.get("https://jqueryui.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		Thread.sleep(3000);
	}
		
		@AfterMethod
		public void closebrowser() {
		driver.quit();
		
		
	}

}

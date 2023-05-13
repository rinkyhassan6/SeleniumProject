package Alert_Concept;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertHomeWork {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		
		ChromeDriver driver = new ChromeDriver();
	

		//Load URL
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
				
				
		// maximize
		driver.manage().window().maximize();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Click Submit 
		//driver.findElementByXPath("(//input[@id='searchBtn'])[1]").click();
		driver.findElementByXPath("//button[text()='Click for JS Alert']").click();
		
		
		//switch control to Alert from HTML page and get the Alert text
		String SimpleAlert = driver.switchTo().alert().getText();
		System.out.print(SimpleAlert);
		
		//print title of the current page 
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		
		//print result
		//String text = driver.findElement(By.id("result")).getText();
		//System.out.println(result);
		
		//driver.findElement(By.id("result")).getText();
		driver.findElement(By.id("result")).getText();
		
		
		
		//wait 3 seconds 
		Thread.sleep(3000);
		
		//Close the browser
		driver.close();
				
		
		
	}

}

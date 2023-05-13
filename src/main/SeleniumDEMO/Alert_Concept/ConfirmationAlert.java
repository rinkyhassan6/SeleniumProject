package Alert_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    
	    //Create object of ChromeDriver Class
	    ChromeDriver driver = new ChromeDriver();
	    
		//Load URL	
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//Maximize window
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		//Click Submit 
		//by using this Xpath (Locator)- //button[text()='Click for JS Alert']
		//driver.findElementByXPath("(//input[@id='searchBtn'])[1]").click();
		driver.findElementByXPath("//button[text()='Click for JS Confirm']").click();
		
		//By using Alert class
		//Alert confirmationAlert = driver.switchTo().alert();
		Alert confirmationAlert = driver.switchTo().alert();
		confirmationAlert.getText();
        System.out.println(confirmationAlert.getText());
        
        //wait 3 seconds 
        Thread.sleep(3000);
		
		//click cancel
        //rejecting the alert 
        confirmationAlert.dismiss();
		
        //driver.findElement(By.id("result")).getText();
        driver.findElement(By.id("result")).getText();
      	System.out.println(driver.findElement(By.id("result")).getText());
 		
 		//get Current URL
 		driver.getCurrentUrl();
 		System.out.println(driver.getCurrentUrl());
 		
      	//get Title
 		driver.getTitle();
 		System.out.println(driver.getTitle());
 		
		
	}

}

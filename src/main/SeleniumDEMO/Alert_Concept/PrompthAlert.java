package Alert_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrompthAlert {

	//public static void main(String[] args) throws InterruptedException {
	
	@Test
	public void promptAlert() throws InterruptedException {
		
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
		 driver.findElementByXPath("//button[text()='Click for JS Prompt']").click();
		
		 //By using Alert class
		 //Alert PrompthAlert = driver.switchTo().alert();
		 Alert PrompthAlert = driver.switchTo().alert();
		 PrompthAlert.getText();
		 System.out.println(PrompthAlert.getText());
		
         //wait 3 seconds 
         Thread.sleep(3000);
		
         //Type text in text field button for the alert box
         PrompthAlert.sendKeys("null");
        
		 //click cancel
         //rejecting the alert 
         PrompthAlert.dismiss();
		 
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

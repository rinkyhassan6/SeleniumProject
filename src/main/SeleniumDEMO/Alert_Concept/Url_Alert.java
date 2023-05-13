package Alert_Concept;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url_Alert {

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
	
		//wait 3 seconds 
		Thread.sleep(3000);
		
	
		//getTitle()
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

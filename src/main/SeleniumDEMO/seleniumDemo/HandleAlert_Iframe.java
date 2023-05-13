package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert_Iframe {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    //Create object of ChromeDriver Class
	    ChromeDriver driver = new ChromeDriver();
	    
		//Load URL	
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		
	
		/*a)	Click on “Try It” button from the new window
		b)	A alert box will appear 
		c)	Handle alert
		d)	Then check does it [Try It] under the frame?
		e)	If it is under the frame, then switch to Frame and perform the action, and finally back to main HTML window*/
		
		//Maximize window
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//way-1 -Enter into the frame using ID or Name value
		driver.switchTo().frame("iframeResult");
		
		System.out.println("Successfully enter into the frame");
		
		driver.findElementByXPath("//button[text()='Try it']").click();
	    
		//switch control to Alert from HTML page and get the Alert text
		String alert = driver.switchTo().alert().getText();
		System.out.println(alert);
		
		//Click on ok button
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		
		//wait 5 seconds 
		Thread.sleep(5000);
		
		//getTitle()
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		//Back to main/parent page
		driver.switchTo().parentFrame();
		
		driver.close();
		
		
		
	}

}

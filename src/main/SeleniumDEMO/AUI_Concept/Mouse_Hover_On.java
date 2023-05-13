package AUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_On {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//Create object of ChromeDriver Class
		ChromeDriver driver = new ChromeDriver();

		//Load URL	
		driver.get("http://mrbool.com/");
		//Maximize window
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//wait 3 seconds 
		Thread.sleep(3000);

		//getTitle()
		driver.getTitle();
		System.out.println(driver.getTitle());


		/*steps:
		 1)select Content element and store it in a variable
		 2)Create object of Actions class and pass the driver
		 3)perform moveToElement (Mouse Hover On) action, pass the element and use perform() method
		 4)Then click the Articles element / visible text by driver.findElement
		 5) Syntax of Actions class:
		   Actions action = new Actions();
		   Actions action/builder = new Actions(driver); */

		WebElement content = driver.findElementByClassName("menulink");

		Actions action = new Actions(driver);

		action.moveToElement(content).perform();

		driver.findElementByXPath("(//a[text()='Articles'])[1]").click();

		//wait 5 seconds
		Thread.sleep(5000);

		WebElement content1 = driver.findElementByClassName("menulink");

		Actions action1 = new Actions(driver);

		action1.moveToElement(content1).perform();
		

		driver.findElementByPartialLinkText("Courses").click();
		
		//wait 3 seconds
		Thread.sleep(3000);



		WebElement content2 = driver.findElementByClassName("menulink");

		Actions action2 = new Actions(driver);

		action2.moveToElement(content2).perform();
		
		
		driver.switchTo().frame("oauth2relay596090621");
		
		driver.findElementByXPath("//iframe[@id='oauth2relay596090621']").click();
		
		//wait 2 seconds
		Thread.sleep(2000);

		driver.switchTo().parentFrame();
		
		//close the browser
		driver.close();







	}

}

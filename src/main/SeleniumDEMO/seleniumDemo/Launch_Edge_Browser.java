package seleniumDemo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Launch_Edge_Browser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\rinky\\Drivers\\msedgedriver.exe");

		//Create object EdgeDriver class  //Open or launch Edge Browser and using as a Interface
		WebDriver driver = new EdgeDriver();

		//Maximize window
		driver.manage().window().maximize();

		//implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// load URL
		driver.get("http://leaftaps.com/opentaps");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.cssSelector("#username")).sendKeys("DemoSalesManager");
		driver.findElement(By.cssSelector("#password")).sendKeys("crmsfa");
		driver.findElement(By.cssSelector(".decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		System.out.println("===========using Edge Browser  as a Interface============= ");
		//get Current URL and //get Current Title 
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
		driver.getTitle();
		System.out.println(driver.getTitle());
		//close browser
		driver.close();















	}

}

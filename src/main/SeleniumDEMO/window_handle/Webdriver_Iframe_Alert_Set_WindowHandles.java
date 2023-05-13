package window_handle;

import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.geometry.spherical.twod.Edge;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Webdriver_Iframe_Alert_Set_WindowHandles {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rinky\\Drivers\\msedgedriver.exe");

		//Create object EdgeDriver class  //Open or launch Edge Browser and using as a Interface
		WebDriver driver = new EdgeDriver();

		//Maximize window
		driver.manage().window().maximize();

		//implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Load URL
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

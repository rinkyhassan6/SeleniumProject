package Wrapper2_Inheritance_Concept_With_TestNG_Jquery;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop extends ProjectSpecificWrapper2 {

	@Test
	public void draganddrop() throws InterruptedException { 

		//Switch to Frame
		driver.switchTo().frame(0);
		
		//select draggable and droppable elements and store in a variable
		//WebElement src = driver.findElementById("draggable");
		WebElement src = driver.findElementByXPath("//div[@id='draggable']");
		
		WebElement dest = driver.findElementById("droppable");
	
		//wait 3 sec
		Thread.sleep(3000);
		
		//Create object of Actions class and pass the driver 
		Actions action = new Actions(driver);
		
		//wait 3 sec		
		Thread.sleep(4000);
		
		//perform DragAndDrop action, pass the elements and use perform() method
		//action.dragAndDrop(src, dest).perform();
		//action.dragAndDrop(src, dest).perform();
		action.dragAndDrop(src, dest).perform();
		Thread.sleep(4000);
		//Switch back from frame
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
		//click Selectable
		driver.findElementByLinkText("Selectable").click();
					
		Thread.sleep(4000);
		driver.close();		
	}

}

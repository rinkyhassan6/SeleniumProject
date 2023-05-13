package Wrapper_Inheritance_Concept_With_TestNG;

import java.util.Set;

import org.testng.annotations.Test;

public class MergeLead extends ProjectSpecificWrapper {
	
	@Test
	public void mrgelead() throws InterruptedException {
	
	// click Leads link
	driver.findElementByLinkText("Leads").click();

	// click merge leads
	driver.findElementByLinkText("Merge Leads").click();

	// Click on Icon near From Lead
	driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();

	//Get first window reference
	String firstWin = driver.getWindowHandle();

	// Move to new window
	Set<String> allwin = driver.getWindowHandles();

	System.out.println(allwin);

	for (String eachwin : allwin) {

		driver.switchTo().window(eachwin);
		System.out.println(driver.getTitle());
	}

	// Enter Lead ID
	driver.findElementByXPath("//input[@type='text']").sendKeys("10158");

	// click on Find Leads button
	//driver.findElementByXPath("//button[text()='Find Leads']").click();
	//driver.findElementByXPath("//button[@type='button']").click();

	Thread.sleep(3000);

	//driver.switchTo().frame(0);
	// Click First Resulting lead
	String elefirstName = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
	System.out.println(elefirstName);

	driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();

	// switching/back to parent window i.e. main/primary window
	driver.switchTo().window(firstWin); // switch back to parent/primary window

	// Click on Icon near To Lead
	driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();

	// Move to new window
	Set<String> allwin1 = driver.getWindowHandles();
	//System.out.println(allwin1);

	for (String eachwin1 : allwin1) {
		driver.switchTo().window(eachwin1);
		System.out.println(driver.getTitle());
	}

	// Enter Lead ID
	driver.findElementByXPath("(//input[@type='text'])[1]").sendKeys("10318");

	// click on Find Leads button
	driver.findElementByXPath("//button[text()='Find Leads']").click();

	Thread.sleep(3000);
	// Click First Resulting lead
	String elefirstName1 = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
	//System.out.println(elefirstName1);

	driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();

	// switch back to primary window
	driver.switchTo().window(firstWin);

	// click on merge
	driver.findElementByLinkText("Merge").click();

	// Accept Alert
	String alertMessage = driver.switchTo().alert().getText();
	System.out.println(alertMessage);
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	//Click Find Leads
	driver.findElementByLinkText("Find Leads").click();
	//Enter From Lead ID
	driver.findElementByXPath("//input[@name='id']").sendKeys("10006");
	//Click Find Leads
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	//Verify error msg
	String errMsg = driver.findElementByXPath("//div[text()='No records to display']").getText();
	System.out.println(errMsg);
	if(errMsg.contains("No records")) {
		System.out.println("ErrMsg is matched");
	}else {
		System.out.println("ErrMsg not matched");
	}
	Thread.sleep(3000);
	
	}
}

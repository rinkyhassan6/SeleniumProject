package Wrapper_Inheritance_Concept_With_TestNG;

import org.testng.annotations.Test;

public class DuplicateLead extends ProjectSpecificWrapper {

	
	@Test
	public void duplicatelead() throws InterruptedException {
	
	// click Leads
			driver.findElementByLinkText("Leads").click();

			// click Find lead link
			driver.findElementByLinkText("Find Leads").click();

			// click on email
			driver.findElementByXPath("//span[text()='Email']").click();

			// enter email number
			driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("hema@gmail.com");
			

			// click Find leads button
			//driver.findElementByXPath("//button[text()='Find Leads']").click();
			

			Thread.sleep(3000);
			// Capture name of First Resulting lead
			String FirstResultingLead = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
			// String FirstResultingLead =	driver.findElementByXPath("(//a[@href='/crmsfa/control/viewLead?partyId=11447'])[1]").getText();
			System.out.println(FirstResultingLead);
			Thread.sleep(3000);
			// Click First Resulting lead
			driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();

			// Click Duplicate Lead
			driver.findElementByPartialLinkText("Duplicate Lead").click();

			// Verify the Title as 'Duplicate Lead'
			String Title = driver.getTitle();
			System.out.println(Title);

			if (Title.contains("Duplicate Lead")) {
				System.out.println("Title Matched");

			} else {
				System.out.println("Title not matched");
			}
			// click create Lead button
			driver.findElementByXPath("//input[@value='Create Lead']").click();

			// Confirm the duplicate lead name is same as captured name
			String DuplicateLeadName = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
			System.out.println(DuplicateLeadName);

			if (DuplicateLeadName.contains("Mark")) {
				System.out.println("Duplicate Lead name matched");
			} else {
				System.out.println(" Not matched");
			}
			Thread.sleep(3000);

}
}
package Starting_Point_Of_FrameWork_DeleteLeads;

import org.testng.annotations.Test;

public class DeleteLeads_TestClass_SubClass extends GenericWrapper_SuperClass {

	@Test

	public void DeleteLeads() throws InterruptedException {
		
		launchBrowser("http://leaftaps.com/opentaps");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByXpath("//input[@value='Login']");
		clickByLinkText("CRM/SFA");
		
		clickByLinkText("Leads");
		clickByLinkText("Find Leads");
		clickByXpath("//span[text()='Phone']");
		enterByXpath("//input[@name='phoneAreaCode']", "682");
		enterByXpath("//input[@name='phoneNumber']", "1234567890");
		
		Thread.sleep(4000);
		
		//Capture lead ID of 1st Resulting lead
		
		//getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]","10081");
		
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		clickByXpath("Text");
		
		//Click 1st Resulting lead
		
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		
		//Click Delete and Find Leads button
		clickByXpath("//a[text()='Delete']");
		clickByXpath("//button[text()='Find Leads']");
		
		//Enter captured lead ID and Click find leads button
		enterByXpath("//input[@name='id']", "10092");
		clickByXpath("//button[text()='Find Leads']");
		
		//Verify error message
		verifyMessgByXpath("//div[text()='No records to display']", "errorMsg");
		
		
		
		
		Thread.sleep(2000);
		
		closeBrowser();

}
}
package ParametrizationTestNG_Concept_Without_ExcelFile;
import org.testng.annotations.Test;

public class CreateLead_Dataprovider extends ProjectSpecificWraper {

	@Test(dataProvider = "employeeListSet")
	
	public void createLead(String cName, String fName, String lName) throws InterruptedException {

		//click create Lead by using Text base Xpath 
		driver.findElementByXPath("//a[text()='Create Lead']").click();

		driver.findElementByXPath("//input[contains(@id,'createLeadForm_co')]").sendKeys(cName);
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys(fName);
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys(lName);
		
		Thread.sleep(2000);
		// Click Create lead
		driver.findElementByXPath("//input[@name='submitButton']").click();

		Thread.sleep(4000);
	}
}

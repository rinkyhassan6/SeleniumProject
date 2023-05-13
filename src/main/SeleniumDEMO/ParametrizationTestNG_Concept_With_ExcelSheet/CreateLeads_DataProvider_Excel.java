package ParametrizationTestNG_Concept_With_ExcelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.annotations.Test;

public class CreateLeads_DataProvider_Excel extends ProjectSpecificWraper_withExcel {

	@Test(dataProvider = "getData")
	
	public void createLead(String cName, String fName, String lName ,String Dept, String Zipcode, String phnNumb ,String Email) throws InterruptedException, IOException {

		//click create Lead by using Text base Xpath 
		driver.findElementByXPath("//a[text()='Create Lead']").click();

		driver.findElementByXPath("//input[contains(@id,'createLeadForm_co')]").sendKeys(cName);
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys(fName);
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys(lName);
		
	
		   driver.findElementById("createLeadForm_departmentName").sendKeys(Dept);   
		   driver.findElementById("createLeadForm_generalPostalCode").sendKeys(Zipcode);
		   driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(phnNumb);
		   driver.findElementById("createLeadForm_primaryEmail").sendKeys(Email);
		   
		 //Take snapshot/ScreenShot
		   File source = driver.getScreenshotAs(OutputType.FILE);
		 //Pathblocation, where it will store after moved
		   File destination =new File ("C:\\Users\\rinky\\OneDrive\\Desktop\\SnapShots\\image.png");
		 //moved file source to destination(img or image file)   
		   FileUtils.copyFile(source, destination);
		   
		// Click Create lead
		driver.findElementByXPath("//input[@name='submitButton']").click();

		Thread.sleep(2000);
}
}
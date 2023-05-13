package ParametrizationTestNG_Concept_Without_ExcelFile;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SubClass extends SuperClass {

	@Test(dataProvider = "getData")
	public void creatlead(String cname, String fname, String lname) {
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		driver.findElement(By.cssSelector("input[id^='createLeadForm_c']")).sendKeys(cname);
		driver.findElement(By.cssSelector("#createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.cssSelector("input[id$='astName']")).sendKeys(lname);
		driver.findElement(By.cssSelector("input[value='Create Lead']")).click();
}
}
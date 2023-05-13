package ParametrizationTestNG_Concept_Without_ExcelFile;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SuperClass {

	
	public ChromeDriver driver;
	@Parameters({"setproperty","path","url","uname","pwd"})
	@BeforeMethod
	@Test
	public void login(String setproperty, String path, String url, String uname, String pwd) {
		System.setProperty(setproperty,path);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElementByXPath("//input[@id='username']").sendKeys(uname);
		driver.findElementByXPath("//input[@id='password']").sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();


	}
    @AfterMethod
    public void closedriver() {
    	driver.quit();	
    }
    @DataProvider
    public String [][] getData() throws IOException {
	String [][] data = new String[3][3];
		
		
		data[0][0] = "TCS";
		data[0][1] = "Hema";
		data[0][2] = "Mali";
		
		data [1][0] = "ABC";
		data [1][1] = "Rubel";
		data [1][2] = "Mia";
		
		data [2][0] = "XYZ";
		data [2][1] = "Ekram";
		data [2][2] = "Khan";
		
		return data;
}
}
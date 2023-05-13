package Starting_Point_Of_FrameWork_DeleteLeads;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWrapper_SuperClass implements WrapperMethods  {

	public ChromeDriver driver;

	public void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

	public void enterById(String locatorValue, String Data) {
		driver.findElementById(locatorValue).sendKeys(Data);
	}

	public void enterByClassName(String locatorValue, String Data) {
		driver.findElementByClassName(locatorValue).sendKeys(Data);	
	}

	public void clickByClassName(String locatorValue) {
		driver.findElementByClassName(locatorValue).click();
	}

	public void clickByLinkText(String locatorValue) {
		driver.findElementByLinkText(locatorValue).click();
	}

	public void clickByXpath(String locatorValue) {
		driver.findElementByXPath(locatorValue).click();
	}

	public void getTextByXpath(String locatorValue) {
		WebElement Text = driver.findElementById(locatorValue);
		System.out.println(Text);
	}

	public void enterByXpath(String locatorValue, String Data) {
		driver.findElementByXPath(locatorValue).sendKeys(Data);
	}

	public void verifyMessgByXpath(String locatorValue, String text) {
		String Message = driver.findElementByXPath(locatorValue).getText();
		
		if (Message.equals(text)) {
			System.out.println("Text is matched");
		} else {
			System.out.println("Text is NOT matched");
		}
		
		System.out.println(Message);
		
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		
	}

	public void getTextByXpath(String locatorValue, String text) {
		// TODO Auto-generated method stub
		
	}
}
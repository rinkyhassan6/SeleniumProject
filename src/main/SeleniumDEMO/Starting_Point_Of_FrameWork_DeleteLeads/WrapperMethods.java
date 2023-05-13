package Starting_Point_Of_FrameWork_DeleteLeads;

public interface WrapperMethods {

public void launchBrowser(String url);
	

	public void enterById(String locatorValue, String Data);
	public void enterByClassName(String locatorValue, String Data);
   public void clickByClassName(String locatorValue);
   public void clickByLinkText(String locatorValue);
   public void clickByXpath(String locatorValue);
  // public void verifyTextById(String locatorValue, String text);
   public void getTextByXpath(String locatorValue,String text);
   public void enterByXpath(String locatorValue, String Data);
   public void verifyMessgByXpath(String locatorValue,String text);
   
   public void closeBrowser();
}

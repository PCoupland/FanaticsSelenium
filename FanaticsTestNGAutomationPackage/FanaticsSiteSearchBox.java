package FanaticsTestNGAutomationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FanaticsSiteSearchBox {
	
//PAGE OBJECTS	
	
	private final By _btnSiteSearchBoxButton = By.xpath("//button[contains(.,'Search')]");
	private final By _txtSiteSearchBox = By.xpath("//input[@id='searchquery']");
	
	private final By _h2PeytonManningAutographText = By.xpath("//h2[contains(.,'Autographed Peyton Manning Footballs & Jerseys')]");
	

//PAGE INITS
	
	private WebDriver fanaticsSiteSearchBox;
	
	public void InitfanaticsSiteSearchBox(WebDriver driver)
	{
		fanaticsSiteSearchBox = driver;
	}
		
		
//OBJECT METHODS
	
	public void ClickSiteSearchBoxButton()
	{
		WebDriverWait wait = new WebDriverWait(fanaticsSiteSearchBox, 15);
		
		WebElement siteSearchBoxButton = wait.until(ExpectedConditions.elementToBeClickable(_btnSiteSearchBoxButton));	
		
		siteSearchBoxButton.click();					
	}
	
	public void EnterTextInSiteSearchBox()
	{
		WebDriverWait wait = new WebDriverWait(fanaticsSiteSearchBox, 15);
		
		WebElement txtSiteSearchBox = wait.until(ExpectedConditions.elementToBeClickable(_txtSiteSearchBox));	
		
		txtSiteSearchBox.sendKeys("peyton manning");						
	}
	
	public String PeytonManningAutographText()
	{
		WebDriverWait wait = new WebDriverWait(fanaticsSiteSearchBox, 15);
		
		WebElement peytonManningAutographText = wait.until(ExpectedConditions.elementToBeClickable(_h2PeytonManningAutographText));	
		
		String titleText = peytonManningAutographText.getText();
		return titleText;
				
	}

	

}

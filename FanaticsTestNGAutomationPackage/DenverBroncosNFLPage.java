package FanaticsTestNGAutomationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DenverBroncosNFLPage {
	
//PAGE OBJECTS	
	
	private final By _DenverBroncosShopPageTitle = By.xpath("//span[contains(.,'Denver Broncos Shop')]");
	

//PAGE INITS
	
	private WebDriver DenverBroncosNFLPage;
	
	public void InitDenverBroncosNFLPage(WebDriver driver)
	{
		DenverBroncosNFLPage = driver;
	}
		
		
//OBJECT METHODS
	
	public String GetDenverBroncosShopTitleText()
	{
		WebDriverWait wait = new WebDriverWait(DenverBroncosNFLPage, 15);
		
		WebElement denverBroncosShopPageTitle = wait.until(ExpectedConditions.elementToBeClickable(_DenverBroncosShopPageTitle));	
		
		String titleText = denverBroncosShopPageTitle.getText();
		return titleText;
				
	}

}

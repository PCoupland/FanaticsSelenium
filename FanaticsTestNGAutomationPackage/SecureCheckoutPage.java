package FanaticsTestNGAutomationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecureCheckoutPage {
	
//PAGE OBJECTS
	
	//Label Text
	private final By _h2SecureCheckoutTitle = By.xpath("//h2[contains(.,'Secure Checkout')]");
	
	//Buttons
	private final By _buttonRegisterAndCheckout = By.xpath("//a[@id='registerAndCheckoutButton']");
	


//PAGE INITS
	private WebDriver secureCheckoutPage;
	
	public void InitSecureCheckoutPage(WebDriver driver)
	{
		secureCheckoutPage = driver;
	}
		
		
//OBJECT METHODS
	
	
	//Text Getters
	public String GetSecureCheckoutTitleText()
	{
		WebDriverWait wait = new WebDriverWait(secureCheckoutPage, 15);
		
		WebElement secureCheckoutPageTitle = wait.until(ExpectedConditions.elementToBeClickable(_h2SecureCheckoutTitle));	
		
		String titleText = secureCheckoutPageTitle.getText();
		return titleText;
				
	}
	
	
	//Button Clicks
	public void ClickRegisterAndCheckoutButton()
	{
		WebDriverWait wait = new WebDriverWait(secureCheckoutPage, 15);
		
		WebElement registerAndCheckout_Button = wait.until(ExpectedConditions.elementToBeClickable(_buttonRegisterAndCheckout));	
		
		registerAndCheckout_Button.click();				
	}	

}

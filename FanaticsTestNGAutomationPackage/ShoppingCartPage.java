package FanaticsTestNGAutomationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCartPage {
	
//PAGE OBJECTS
	
	//Buttons
	private final By _buttonSecureCheckout = By.xpath("//a[contains(text(),'Secure Checkout Now')]");
	


//PAGE INITS
	private WebDriver shoppingCartPage;
	
	public void InitShoppingCartPage(WebDriver driver)
	{
		shoppingCartPage = driver;
	}
		
		
//OBJECT METHODS
	
	
	//Button Clicks 
	public void ClickSecureCheckoutButton()
	{
		WebDriverWait wait = new WebDriverWait(shoppingCartPage, 15);
		
		WebElement secureCheckout_Button = wait.until(ExpectedConditions.elementToBeClickable(_buttonSecureCheckout));	
		
		secureCheckout_Button.click();				
	}	

}

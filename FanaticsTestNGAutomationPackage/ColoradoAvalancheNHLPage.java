package FanaticsTestNGAutomationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ColoradoAvalancheNHLPage {
	
//PAGE OBJECTS	
	
	private final By _h2ColoradoAvalancheShopPageTitle = By.xpath("//span[contains(.,'Colorado Avalanche Shop')]");
	private final By _h2SecureCheckoutLabelText = By.xpath("//h2[contains(.,'Secure Checkout')]");			
	private final By _linkSweatshirts = By.xpath("//div[@id='landingPageContentContainer']/div[2]/div[2]/ul/li[5]/a/div/div[2]");	
	private final By _linkReebokStitchLaceHoodyNavy = By.xpath("//img[@alt='Colorado Avalanche Reebok Stitch Em Up Lace Hoodie - Navy']");
	private final By _linkSelectXL = By.xpath("//form[@id='pdpMainForm']/div[7]/div/div[3]/a[4]/span");
	private final By _buttonAddToCart = By.xpath("//a[@id='addToCart']/span");	
	private final By _buttonTailgateParty = By.xpath("//div[@id='landingPageContentContainer']/div[4]/div/ul/li[21]/a/div/div[2]");

//PAGE INITS
	
	private WebDriver ColoradoAvalancheNHLPage;
	
	public void InitColoradoAvalanceNHLPage(WebDriver driver)
	{
		ColoradoAvalancheNHLPage = driver;
	}
		
		
//OBJECT METHODS
	
	public String GetColoradoAvalancheShopPageTitleText()
	{
		WebDriverWait wait = new WebDriverWait(ColoradoAvalancheNHLPage, 15);
		
		WebElement coloradoAvalancheShopPageTitle = wait.until(ExpectedConditions.elementToBeClickable(_h2ColoradoAvalancheShopPageTitle));	
		
		String titleText = coloradoAvalancheShopPageTitle.getText();
		return titleText;
				
	}
	
	public String GetSecureCheckoutLabelText()
	{
		WebDriverWait wait = new WebDriverWait(ColoradoAvalancheNHLPage, 15);
		
		WebElement secureCheckoutLabelText = wait.until(ExpectedConditions.elementToBeClickable(_h2SecureCheckoutLabelText));	
		
		String titleText = secureCheckoutLabelText.getText();
		return titleText;
				
	}
	
	
	public void ClickSweatshirtsLink()
	{


		WebElement sweatshirts_Link = ColoradoAvalancheNHLPage.findElement(_linkSweatshirts);	
		sweatshirts_Link.click();				
		
	}
	
	public void ClickReebokStitchLaceHoodieNavyLink()
	{

		WebElement reebokStitchLaceHoodieNavy_Link = ColoradoAvalancheNHLPage.findElement(_linkReebokStitchLaceHoodyNavy);	
		reebokStitchLaceHoodieNavy_Link.click();			
		
	}
	
	
	public void ClickTailgatePartyLink()
	{

		WebDriverWait wait = new WebDriverWait(ColoradoAvalancheNHLPage, 15);
		
		WebElement buttonTailgateParty = wait.until(ExpectedConditions.elementToBeClickable(_buttonTailgateParty));	
		
		buttonTailgateParty.click();			
		
	}
	
	
	public void Select_XL()
	{

		WebDriverWait wait = new WebDriverWait(ColoradoAvalancheNHLPage, 15);
		
		WebElement xl_Link = wait.until(ExpectedConditions.elementToBeClickable(_linkSelectXL));	
		
		xl_Link.click();			
		
	}
	
	
	public void ClickAddToCart()
	{
		WebDriverWait wait = new WebDriverWait(ColoradoAvalancheNHLPage, 15);
		
		WebElement addToCart_Button = wait.until(ExpectedConditions.elementToBeClickable(_buttonAddToCart));	
		
		addToCart_Button.click();				
	}
	


}

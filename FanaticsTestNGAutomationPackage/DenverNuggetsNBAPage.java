package FanaticsTestNGAutomationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DenverNuggetsNBAPage {
	
//PAGE OBJECTS	
	private final By _h2DenverNuggetsShopPageTitle = By.xpath("//span[contains(.,'Denver Nuggets Shop')]");	
	private final By _radioShopForLadies = By.xpath("//a[contains(@href, '/NBA_Denver_Nuggets_Ladies')]");
	private final By _linkSelectSmallSize = By.xpath("(//a[contains(text(),'S')])[81]");
	private final By _linkAlyssaMilanoTouchAudreyVNeckTShirtPowderBlue = By.xpath("//a[@id='prod1682867']/img");
	private final By _textProductText = By.xpath("//h2[@itemprop='name']");
	private final By _spanSpanContainsLetterS = By.xpath("//span[@class='dynamic-size-display']");
	private final By _buttonAddToCart = By.xpath("//a[@id='addToCart']/span");	

//PAGE INITS
	
	private WebDriver DenverNuggetsNBAPage;
	
	public void InitDenverNuggetsNBAPage(WebDriver driver)
	{
		DenverNuggetsNBAPage = driver;
	}
		
		
//OBJECT METHODS
	
	public String GetDenverNuggetsShopPageTitleText()
	{
		WebDriverWait wait = new WebDriverWait(DenverNuggetsNBAPage, 15);
		
		WebElement denverNuggetsShopPageTitle = wait.until(ExpectedConditions.elementToBeClickable(_h2DenverNuggetsShopPageTitle));	
		
		String titleText = denverNuggetsShopPageTitle.getText();
		return titleText;
				
	}
	
	public void ClickShopForLadiesRadioButton()
	{

		WebDriverWait wait = new WebDriverWait(DenverNuggetsNBAPage, 15);
		
		WebElement radioButton_ShopForLadies = wait.until(ExpectedConditions.elementToBeClickable(_radioShopForLadies));	
		
		radioButton_ShopForLadies.click();			
		
	}
	
	public void SelectSmallSizeLink()
	{
		WebElement SmallSizeLink = DenverNuggetsNBAPage.findElement(_linkSelectSmallSize);	
		SmallSizeLink.click();			
		
	}
	
	
	public void ClickAlyssaMilanoTouchAudreyVNeckTShirtPowderBlue()
	{

		WebDriverWait wait = new WebDriverWait(DenverNuggetsNBAPage, 15);
		
		WebElement linkAlyssaMilanoTouchAudreyVNeckTShirtPowderBlue = wait.until(ExpectedConditions.elementToBeClickable(_linkAlyssaMilanoTouchAudreyVNeckTShirtPowderBlue));	
		
		linkAlyssaMilanoTouchAudreyVNeckTShirtPowderBlue.click();			
		
	}
	
	public String GetProductText()
	{
		WebDriverWait wait = new WebDriverWait(DenverNuggetsNBAPage, 15);
		
		WebElement productTextLabel = wait.until(ExpectedConditions.elementToBeClickable(_textProductText));	
		
		String productText = productTextLabel.getText();
		return productText;
				
	}
	
	
	public String GetSizeText()
	{
		WebDriverWait wait = new WebDriverWait(DenverNuggetsNBAPage, 15);
		
		WebElement SizeTextLabel = wait.until(ExpectedConditions.elementToBeClickable(_spanSpanContainsLetterS));	
		
		String sizeText = SizeTextLabel.getText();
		return sizeText;
				
	}
	
	
	
	
	
	public void ClickAddToCart()
	{
		WebDriverWait wait = new WebDriverWait(DenverNuggetsNBAPage, 15);
		
		WebElement addToCart_Button = wait.until(ExpectedConditions.elementToBeClickable(_buttonAddToCart));	
		
		addToCart_Button.click();				
	}
	
	

}

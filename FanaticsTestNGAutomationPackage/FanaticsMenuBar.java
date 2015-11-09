package FanaticsTestNGAutomationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FanaticsMenuBar {
	
//PAGE OBJECTS	
	
	//Site Menu Bar - League Links
	private final By _NFL_Link = By.xpath("//a[@title='NFL Shop']");
	private final By _NHL_Link = By.xpath("//a[contains(@title,'NHL Shop')]");
	private final By _NBA_Link = By.xpath("//a[contains(@title,'NBA Shop')]");
	
	//Team Links on Menu Bar Fly-out
	private final By _DenverBroncos_Link = By.xpath("//a[@title='Denver Broncos']");
	private final By _ColoradoAvalanche_Link = By.xpath("//a[@href='/NHL_Colorado_Avalanche']");
	private final By _DenverNuggets_Link = By.xpath("//a[contains(@href, '/NBA_Denver_Nuggets')]");
	

//PAGE INITS
	private WebDriver fanaticsSiteMenuBar;
	
	public void InitFanaticsMenuBar(WebDriver driver)
	{
		fanaticsSiteMenuBar = driver;
	}
		
		
//OBJECT METHODS
	
	
	//Site Menu Bar - League Link Click Methods 
	public void ClickNFLMenuLink()
	{
		WebDriverWait wait = new WebDriverWait(fanaticsSiteMenuBar, 15);
		
		WebElement nfl_Link = wait.until(ExpectedConditions.elementToBeClickable(_NFL_Link));	
		
		nfl_Link.click();		
				
	}
	
	
	public void ClickNHLMenuLink()
	{
		WebDriverWait wait = new WebDriverWait(fanaticsSiteMenuBar, 15);
		
		WebElement nhl_Link = wait.until(ExpectedConditions.elementToBeClickable(_NHL_Link));	
		
		nhl_Link.click();		
				
	}
	
	
	public void ClickNBAMenuLink()
	{
		WebDriverWait wait = new WebDriverWait(fanaticsSiteMenuBar, 15);
		
		WebElement nba_Link = wait.until(ExpectedConditions.elementToBeClickable(_NBA_Link));	
		
		nba_Link.click();		
				
	}	
	
	
	
	//NFL Team Links on Site Menu
	public void ClickDenverBroncosLink()
	{
		WebDriverWait wait = new WebDriverWait(fanaticsSiteMenuBar, 15);
		
		WebElement denverBroncos_Link = wait.until(ExpectedConditions.elementToBeClickable(_DenverBroncos_Link));	
		
		denverBroncos_Link.click();	
				
	}
	
	public void ClickColoradoAvalancheLink()
	{
		WebDriverWait wait = new WebDriverWait(fanaticsSiteMenuBar, 15);
		
		WebElement coloradoAvalanche_Link = wait.until(ExpectedConditions.elementToBeClickable(_ColoradoAvalanche_Link));	
		
		coloradoAvalanche_Link.click();	
				
	}
	
	public void ClickDenverNuggetsLink()
	{
		WebDriverWait wait = new WebDriverWait(fanaticsSiteMenuBar, 15);
		
		WebElement denverNuggets_Link = wait.until(ExpectedConditions.elementToBeClickable(_DenverNuggets_Link));	
		
		denverNuggets_Link.click();	
				
	}	

}

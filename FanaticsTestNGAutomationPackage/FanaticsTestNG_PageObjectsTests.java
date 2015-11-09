package FanaticsTestNGAutomationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FanaticsTestNG_PageObjectsTests {
	
	//TEST DATA
	
	//PAGES
	
	//Utility Pages
	WebDriver driver = new FirefoxDriver();
	FanaticsMenuBar menuBar = new FanaticsMenuBar();
	FanaticsSiteSearchBox searchBox = new FanaticsSiteSearchBox();
	
	//Team Pages
	DenverBroncosNFLPage broncosNFLPage = new DenverBroncosNFLPage();
	ColoradoAvalancheNHLPage avsNHLPage = new ColoradoAvalancheNHLPage();
	DenverNuggetsNBAPage nuggetsNBAPage = new DenverNuggetsNBAPage();
	
	//Shopping Cart Page
	ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
	
	//Secure Checkout Page
	SecureCheckoutPage secureCheckoutPage = new SecureCheckoutPage();
	

	
	
	//TESTS
		
  @Test
  public void TestNFLMenuSelections_DenverBroncos() throws InterruptedException {
	  
	  	String expectedText = "Denver Broncos Shop";
	  
	  	menuBar.InitFanaticsMenuBar(driver);
	  	broncosNFLPage.InitDenverBroncosNFLPage(driver);
		
	  	driver.get("http://www.fanatics.com/");
		driver.findElement(By.xpath("//img[@alt='Close']")).click();
		driver.manage().window().maximize();
		menuBar.ClickNFLMenuLink();
		menuBar.ClickDenverBroncosLink();
		
		String actualText = broncosNFLPage.GetDenverBroncosShopTitleText();
		
		Assert.assertEquals(actualText, expectedText);
		Thread.sleep(3000);
		driver.quit();
  }
  
  
  @Test
  public void Test_FanaticsSearch_Feature() throws InterruptedException {
	  
	  	String expectedText = "Autographed Peyton Manning Footballs & Jerseys";
	  
	  	searchBox.InitfanaticsSiteSearchBox(driver);
		driver.get("http://www.fanatics.com/");
		driver.findElement(By.xpath("//img[@alt='Close']")).click();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		searchBox.EnterTextInSiteSearchBox();
		Thread.sleep(3000);
		searchBox.ClickSiteSearchBoxButton();
		
		String actualText = searchBox.PeytonManningAutographText();
		
		Assert.assertEquals(actualText, expectedText);
		Thread.sleep(3000);
		driver.quit();
  }



@Test
public void ShoppingCart_PurchaseAvalancheSweatshirt() throws InterruptedException {
	  
		String expectedText = "Secure Checkout";
	  	menuBar.InitFanaticsMenuBar(driver);
	  	avsNHLPage.InitColoradoAvalanceNHLPage(driver);
	  	shoppingCartPage.InitShoppingCartPage(driver);
	  	secureCheckoutPage.InitSecureCheckoutPage(driver);
	  	
		driver.get("http://www.fanatics.com/");
		driver.findElement(By.xpath("//img[@alt='Close']")).click();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		menuBar.ClickNHLMenuLink();
		menuBar.ClickColoradoAvalancheLink();
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		menuBar.ClickNHLMenuLink();
		menuBar.ClickColoradoAvalancheLink();	
		
		Thread.sleep(1000);
		avsNHLPage.ClickSweatshirtsLink();
		
		Thread.sleep(1000);
		avsNHLPage.ClickReebokStitchLaceHoodieNavyLink();
		avsNHLPage.Select_XL();
		avsNHLPage.ClickAddToCart();
		
		Thread.sleep(3000);
		shoppingCartPage.ClickSecureCheckoutButton();
		
		Thread.sleep(5000);
		
		String actualText = secureCheckoutPage.GetSecureCheckoutTitleText();
		Thread.sleep(3000);
		Assert.assertEquals(actualText, expectedText);
		
		Thread.sleep(3000);
		driver.quit();
}


@Test
public void ShoppingCart_PurchaseSmallSizeAlyssaMilanoTouchAudreyVNeckTShirtPowderBlue() throws InterruptedException {
	  
		String expectedSizeText = "S";
	  	String expectedText = "Denver Nuggets Touch by Alyssa Milano Women's Audrey V-Neck T-Shirt – Powder Blue";
	  	menuBar.InitFanaticsMenuBar(driver);
	  	nuggetsNBAPage.InitDenverNuggetsNBAPage(driver);
		driver.get("http://www.fanatics.com/");
		driver.findElement(By.xpath("//img[@alt='Close']")).click();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		menuBar.ClickNBAMenuLink();
		menuBar.ClickDenverNuggetsLink();
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		menuBar.ClickNBAMenuLink();
		menuBar.ClickDenverNuggetsLink();	
		
		Thread.sleep(1000);
		nuggetsNBAPage.ClickShopForLadiesRadioButton();
		
		Thread.sleep(3000);
		nuggetsNBAPage.SelectSmallSizeLink();
		Thread.sleep(5000);
		nuggetsNBAPage.ClickAlyssaMilanoTouchAudreyVNeckTShirtPowderBlue();
		
		Thread.sleep(5000);
		String actualText = nuggetsNBAPage.GetProductText();
		Assert.assertEquals(actualText, expectedText);
		
		String actualSizeText = nuggetsNBAPage.GetSizeText();
		Assert.assertEquals(actualSizeText, expectedSizeText);
		
		nuggetsNBAPage.ClickAddToCart();
		
		Thread.sleep(3000);
		driver.quit();
}


}

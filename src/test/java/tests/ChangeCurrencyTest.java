package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class ChangeCurrencyTest extends Testbase{
	
	HomePage homeobject;
	ProductDetailsPage productobject;
	SearchPage searchobject;
	
	
	String pro ="Apple MacBook Pro 13-inch" ;
	
	@Test(priority = 1)
	
	public void userCanChangeCurrency()
	{
		
		homeobject = new  HomePage(driver);
		homeobject.changecurrency();
		
		
		
		
	}
	
	@Test(priority = 2)
	public void dedectChangeCurrency()
	{
		
		
		
		searchobject = new SearchPage(driver);
		productobject = new ProductDetailsPage(driver);
		
		searchobject.userCanSearchForProduct(pro);
		searchobject.openProductDetails();
		Assert.assertTrue(productobject.productprice.getText().contains("€"));
	}
	
	
	
	
	
	

}

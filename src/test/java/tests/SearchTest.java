package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.SearchPage;

public class SearchTest extends Testbase {
	
	
	
	
	String productname = "Apple MacBook Pro 13-inch";
	
	
	SearchPage searchobject;
	ProductDetailsPage productDetailsobject;
	@Test
	
	public void usercansearch()
	{
		
		searchobject = new SearchPage(driver);
		productDetailsobject = new ProductDetailsPage(driver);
		searchobject.userCanSearchForProduct(productname);
		searchobject.openProductDetails();
		Assert.assertTrue(productDetailsobject.ProductNamebreadcrumb.getText().contains("MacBook"));
		
	}
	

}

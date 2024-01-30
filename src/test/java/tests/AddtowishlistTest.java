package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductDetailsPage;
import pages.SearchPage;
import pages.WishListPage;

public class AddtowishlistTest extends Testbase{
	
	String product = "Apple MacBook Pro 13-inch";
	
	SearchPage searchobject;
	HomePage homeobject;
	ProductDetailsPage productobject;
	WishListPage wishlistobject;
	
	@Test(priority = 1)
	public void userSearch()
	{
		
		homeobject = new HomePage(driver);
		searchobject = new SearchPage(driver);
		searchobject.userCanSearchForProduct(product);
		searchobject.openProductDetails();
		
		
	}
	
	@Test(priority = 2)
	
	public void addtowishlistpage()
	{
		
		productobject = new ProductDetailsPage(driver);
		productobject.addtowishlist();
		driver.navigate().to("https://demo.nopcommerce.com/"+"wishlist");
		wishlistobject = new WishListPage(driver);
		Assert.assertTrue(wishlistobject.productName.getText().contains(" MacBook"));
		
	}
	
	@Test(priority = 3)
	public void removefromwishlist()
	{
		
		wishlistobject = new WishListPage(driver);
		wishlistobject.removefromwishlist();
		Assert.assertTrue(wishlistobject.emptymassage.getText().contains("empty"));
		
	}
	
	
	
	

}

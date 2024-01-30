package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ComparePage;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class AddtoComparelistTest extends Testbase{
	
	
	
	String pro1 = "Apple MacBook Pro 13-inch ";
	String pro2 = "Asus N551JK-XO076H Laptop ";
	SearchPage searchObject;
	ProductDetailsPage productobject;
	ComparePage compareObject;
	
	@Test(priority =  1)
	 public void usersearch() throws InterruptedException
	 {
		
		searchObject = new SearchPage(driver);
		productobject = new ProductDetailsPage(driver);
		searchObject.userCanSearchForProduct(pro1);
		searchObject.openProductDetails();
		productobject.addtoCompareList();
		searchObject.userCanSearchForProduct(pro2);
		searchObject.openProductDetails();
		productobject.addtoCompareList();
		Thread.sleep(10000);
		
		driver.navigate().to("https://demo.nopcommerce.com/"+"compareproducts");
		
		
		
	 }
	
	@Test(priority = 2)
	
	public void comparebetweenproduct()
	{
		
		compareObject = new ComparePage(driver);
		compareObject.compareProducts();
		compareObject.clearCompareProducts();
		Assert.assertTrue(compareObject.clearmsg.getText().contains("You have no items to compare."));
		
		
		
	}

}

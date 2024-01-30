package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.SearchPage;

public class SearchTestWithAutoComplete extends Testbase 
{

	SearchPage searchobject;
	ProductDetailsPage productobject;

	@Test
	public void usercansearchwithautocomplete() throws InterruptedException
	{

		searchobject = new SearchPage(driver);
		productobject = new ProductDetailsPage(driver);
		searchobject.productsearchwithautocomplete("mac");
		Thread.sleep(1000000000);
		Assert.assertTrue(productobject.ProductNamebreadcrumb.getText().contains("mac"));






	}







}

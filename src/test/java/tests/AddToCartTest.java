package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.SearchPage;
import pages.ShoppingCartPage;

public class AddToCartTest extends Testbase{



	String pro ="Apple MacBook Pro 13-inch ";

	SearchPage searchobject;
	ProductDetailsPage productobject;
	ShoppingCartPage cartobject;


	@Test(priority = 1)

	public void usersearch() throws InterruptedException
	{


		searchobject = new SearchPage(driver);
		productobject = new ProductDetailsPage(driver);
		cartobject = new ShoppingCartPage(driver);
		searchobject.userCanSearchForProduct(pro);
		searchobject.openProductDetails();
		productobject.addtocart();
		Thread.sleep(3000);

		driver.navigate().to("https://demo.nopcommerce.com/cart");
		Assert.assertTrue(cartobject.productName.getText().contains(" MacBook "));

	}


	@Test(priority = 2)

	public void usercanupdateCart()
	{
		cartobject = new ShoppingCartPage(driver);

		cartobject.updateCart("4");
		cartobject.clearCart();
		Assert.assertTrue(cartobject.massege.getText().contains("Your Shopping Cart is empty!"));

	}

}

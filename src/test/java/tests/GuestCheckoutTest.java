package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.OrderDetailsPage;
import pages.ProductDetailsPage;
import pages.SearchPage;
import pages.ShoppingCartPage;

public class GuestCheckoutTest extends Testbase {


	String pro = "Apple MacBook Pro 13-inch ";
	String country = "Egypt" ;
	SearchPage searchobject;
	ProductDetailsPage productobject;
	CheckoutPage checkoutobject;
	ShoppingCartPage shoppingobject;
	OrderDetailsPage orderobject;

	@Test (priority = 1)
	public void usercansearch()
	{
		searchobject = new SearchPage(driver);
		searchobject.userCanSearchForProduct(pro);
		searchobject.openProductDetails();


	}

	@Test(priority = 2)

	public void addtocartpage() throws InterruptedException
	{


		productobject = new ProductDetailsPage(driver);
		shoppingobject = new ShoppingCartPage(driver);
		productobject.addtocart();
		Thread.sleep(1000);
		driver.navigate().to("https://demo.nopcommerce.com/cart");
		shoppingobject.openCheckoutPage();
		shoppingobject.opencheckoutasguest();


	}

	@Test(priority = 3)

	public void guestusercancheckout() throws InterruptedException
	{


		checkoutobject = new CheckoutPage(driver);
		checkoutobject.guestuserCancheckoutProduct("gehad", "sallam", "gehad@orbit.com", country, "hurghada", "elkhawher", "123", "12324235");
		checkoutobject.userconfirmorder();
		Thread.sleep(1000);
		Assert.assertTrue(checkoutobject.sucessmsg.getText().contains("Your order has been successfully processed!"));

	}

	@Test(priority = 4)
	public void guestusercandownloadandprintorder() throws InterruptedException
	{
		checkoutobject =new CheckoutPage(driver);

		orderobject = new OrderDetailsPage(driver);
		checkoutobject.openorderdetailsPage();
		Thread.sleep(1000);
		orderobject.openorderPDF();
		orderobject.printorder();


	}



}

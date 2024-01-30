package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;
import pages.OrderDetailsPage;
import pages.ProductDetailsPage;
import pages.SearchPage;
import pages.ShoppingCartPage;
import pages.UserRegistrationPage;

public class Usercheckoutproducttest extends Testbase{



	String country1 ="Egypt";
	String pro = "Apple MacBook Pro 13-inch ";
	HomePage homeobject;

	SearchPage searchobject;
	UserRegistrationPage registrationobject;
	LoginPage loginObject;
	CheckoutPage checkoutobject;
	ProductDetailsPage productobject;
	ShoppingCartPage shoppingobject;

	OrderDetailsPage orderobject;




	@Test(priority = 1)
	public void usercanregister()
	{
		homeobject = new HomePage(driver);
		registrationobject = new UserRegistrationPage(driver);
		homeobject.openregistrationpage();
		registrationobject.userregistration("gehad", "sallam", "test42@yahoo.com", "123456");
		homeobject.openloginlink();
	}


	@Test(priority = 2)
	public void usercanlogin()
	{
		loginObject = new LoginPage(driver);
		loginObject.userlogin("test42@yahoo.com", "123456");


	}

	@Test (priority = 3)
	public void usercansearch()
	{
		searchobject = new SearchPage(driver);
		searchobject.userCanSearchForProduct(pro);
		searchobject.openProductDetails();
	}
	@Test(priority = 4)
	public void usercancheckoutforproduct() throws InterruptedException
	{
		productobject = new ProductDetailsPage(driver);
		checkoutobject = new CheckoutPage(driver);
		shoppingobject = new ShoppingCartPage(driver);

		productobject.addtocart();
		Thread.sleep(1000);
		driver.navigate().to("https://demo.nopcommerce.com/cart");
		shoppingobject.openCheckoutPage();
		checkoutobject.registerusercanCheckoutproduct(country1, "hurghada", "el khawther", "123", "2962232");
		checkoutobject.userconfirmorder();
		Thread.sleep(1000);
		Assert.assertTrue(checkoutobject.sucessmsg.getText().contains("Your order has been successfully processed!"));
	}

	@Test(priority = 5)
	public void userCanopenORDERPDFANDdownloadOrder() throws InterruptedException
	{
		checkoutobject = new CheckoutPage(driver);
		orderobject = new OrderDetailsPage(driver);
		checkoutobject.openorderdetailsPage();
		Thread.sleep(1000);
		orderobject.printorder();
		orderobject.openorderPDF();


	}



}

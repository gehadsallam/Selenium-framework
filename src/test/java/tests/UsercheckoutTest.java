package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductDetailsPage;
import pages.SearchPage;
import pages.ShoppingCartPage;
import pages.UserRegistrationPage;

public abstract class UsercheckoutTest extends Testbase {
	
	String country1 ="Egypt";
	String pro = "Apple MacBook Pro 13-inch ";
	HomePage homeobject;
	
	SearchPage searchobject;
	UserRegistrationPage registrationobject;
	LoginPage loginObject;
	CheckoutPage checkoutobject;
	ProductDetailsPage productobject;
	ShoppingCartPage shoppingobject;
	
	
	
	@Test(priority = 1)
	public void usercanregister()
	{
		homeobject = new HomePage(driver);
		registrationobject = new UserRegistrationPage(driver);
		homeobject.openregistrationpage();
		registrationobject.userregistration("gehad", "sallam", "test@yahoo.com", "123456");
		homeobject.openloginlink();
	}
	
	
	@Test(priority = 2)
	public void usercanlogin()
	{
		loginObject = new LoginPage(driver);
		loginObject.userlogin("test@yahoo.com", "123456");
		
		
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
		Assert.assertTrue(checkoutobject.sucessmsg.getText().contains("Your order has been successfully processed!"));
	}

}

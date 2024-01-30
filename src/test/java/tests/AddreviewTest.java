package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ProductDetailsPage;
import pages.ProductReviewPage;
import pages.SearchPage;
import pages.UserRegistrationPage;

public class AddreviewTest extends Testbase {
	HomePage homeobject;
	LoginPage loginobject;
	ProductDetailsPage productobject;
	SearchPage searchobject;
	ProductReviewPage reviewobject;
	UserRegistrationPage registrationobject;

	String product ="Apple MacBook Pro 13-inch";

	@Test(priority = 1)
	public void userregistration()
	{
		homeobject = new HomePage(driver);
		registrationobject = new UserRegistrationPage(driver);
		homeobject.openregistrationpage();
		registrationobject.userregistration("gehad", "sallam", "test@gmail.com", "123123");


	}


	@Test(priority = 2)
	public void userlogintosite()
	{
		homeobject = new HomePage(driver);
		loginobject = new LoginPage(driver);

		homeobject.openloginlink();
		loginobject.userlogin("test@gmail.com", "123123");




	}

	@Test(priority = 3)

	public void usersearchforproduct()
	{
		homeobject = new HomePage(driver);
		searchobject = new SearchPage(driver);
		productobject = new ProductDetailsPage(driver);

		searchobject.userCanSearchForProduct(product);
		searchobject.openProductDetails();
		productobject.addreview();



	}

	@Test (priority = 4)
	public void useraddreviewtoproduct()
	{
		reviewobject = new ProductReviewPage(driver);
		reviewobject.addreview("review to mac", "i think this product i good for sales man ");
		Assert.assertTrue(reviewobject.resultmsg.getText().contains("review "));




	}


}

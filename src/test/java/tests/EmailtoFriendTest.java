package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.EmailtoFreindPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductDetailsPage;
import pages.SearchPage;
import pages.UserRegistrationPage;

public class EmailtoFriendTest extends Testbase {
	
	
	
	HomePage homeobject;
	ProductDetailsPage productobject;
	SearchPage searchobject;
	UserRegistrationPage regeistrationobject;
	LoginPage loginobject;
	EmailtoFreindPage emailtofriendobject;
	
	String pro ="Apple MacBook Pro 13-inch";
	
	
	@Test(priority= 1)
	
	public void registration()
	{
		
		homeobject = new HomePage(driver);
		regeistrationobject = new UserRegistrationPage(driver);
		homeobject.openregistrationpage();
		regeistrationobject.userregistration("gehad", "sallam", "test2@gmail.com", "123456");
		
		
		
	}
	
	@Test(priority = 2)
	
	public void clicklogin()
	{
		homeobject = new HomePage(driver);
		homeobject.openloginlink();
		loginobject = new LoginPage(driver);
		loginobject.userlogin("test2@gmail.com","123456");
	
		
		
	}
	
	@Test(priority = 3)
	
	public void usercansearch()
	{
		searchobject = new SearchPage(driver);
		searchobject.userCanSearchForProduct(pro);
		searchobject.openProductDetails();
		productobject = new ProductDetailsPage(driver);
		
		productobject.openemailtofriend();
		
		
		
		
		
	}
	
	@Test(priority = 4)
	public void usercanemailtofriend()
	{
		emailtofriendobject = new EmailtoFreindPage(driver);
		
		emailtofriendobject.emailfriend("tt@mail.com", "hi we can tyst");
		Assert.assertTrue(emailtofriendobject.sucessmsg.getText().contains("message "));
		
		
	}
	
	
	
	
	

}

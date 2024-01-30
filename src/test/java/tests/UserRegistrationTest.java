package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.UserRegistrationPage;

public class UserRegistrationTest  extends Testbase{


	String Fname ="gehad";
	String Lname ="sallam";
	String Email = "test3@gmail.com";
	String Password = "123456";

	HomePage homeobject ;
	UserRegistrationPage regitobject;
	LoginPage loginobject;


	@Test(priority = 1 , alwaysRun = true)

	public void usercanregistersucceessfuly()
	{

		homeobject = new HomePage(driver);
		regitobject = new UserRegistrationPage(driver);

		homeobject.openregistrationpage();
		regitobject.userregistration(Fname, Lname, Email, Password);
		Assert.assertTrue(regitobject.massagetxt.getText().contains("registration"));


	}
	
	@Test(priority = 2)
	
	public void openloginpage()
	{
		
		homeobject = new HomePage(driver);
		loginobject = new LoginPage(driver);
		regitobject = new UserRegistrationPage(driver);
		
		homeobject.openloginlink();
		
		
		
		
	}
	
	@Test(priority = 4)
	
	public void usercanlogin()
	{
		loginobject = new LoginPage(driver);
		loginobject.userlogin(Email, Password);
		
	}
	
	//@Test(priority = 9)
///	public void usercanlogout()
	//{
		
	//	homeobject = new HomePage(driver);
	//	homeobject.userlogout();
		
//	}


}

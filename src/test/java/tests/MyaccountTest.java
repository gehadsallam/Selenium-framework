package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MyaccountPage;
import pages.UserRegistrationPage;

public class MyaccountTest extends Testbase {

	
	String Fname ="gehad";
	String Lname ="sallam";
	String Email = "test111@gmail.com";
	String Password = "123456";
	String Newpassword ="2962232";
	
	MyaccountPage myaccobject;
	UserRegistrationPage regitobject;
	LoginPage loginobject;
	HomePage homeobject;
	@Test(priority = 1 )

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
	
	@Test(priority = 5)
	
	public void usercanopenmyaccount()
	{
		homeobject = new HomePage(driver);
		homeobject.openmyaccount();
		
		
	}
	
	
	
	@Test(priority = 6)
	public void usercanchangepassword()
	{
		myaccobject = new MyaccountPage(driver);
		myaccobject.openchangepasspage();
		
		myaccobject.changepassword(Password, Newpassword);
		
	}
	
	
	
	
	
	
	
	
	
}

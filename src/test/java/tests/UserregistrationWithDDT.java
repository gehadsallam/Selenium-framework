package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.UserRegistrationPage;

public class UserregistrationWithDDT  extends Testbase{




	@DataProvider(name = "testData")
	public static Object [][]userdata()
	{

		return new 	Object	 [][] {
			{"gehad","sallam","test@yahoo.com","123456"},{"ahmed","khaled","ahmed@yahoo.com","123456"},{"ali","mohamed","ahli@gmail.com","2962232"}


		};

	}
	HomePage homeobject ;
	UserRegistrationPage regitobject;
	LoginPage loginobject;


	@Test(priority = 1 , alwaysRun = true , dataProvider = "testData")

	public void usercanregistersucceessfuly( String fname ,String lname ,String email ,String password)
	{

		homeobject = new HomePage(driver);
		regitobject = new UserRegistrationPage(driver);

		homeobject.openregistrationpage();
		regitobject.userregistration(fname,lname ,email ,password );
		Assert.assertTrue(regitobject.massagetxt.getText().contains("registration"));
		homeobject = new HomePage(driver);
		loginobject = new LoginPage(driver);
		regitobject = new UserRegistrationPage(driver);

		homeobject.openloginlink();
		loginobject = new LoginPage(driver);
		loginobject.userlogin(email, password);
		homeobject = new HomePage(driver);
		homeobject.userlogout();


	}




}

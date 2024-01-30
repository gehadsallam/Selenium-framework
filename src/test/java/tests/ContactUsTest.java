package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactusPage;
import pages.HomePage;

public class ContactUsTest extends Testbase {


	HomePage homeobject;
	ContactusPage contactobject;

	String name = "gehad said";
	String email = "test@orbit.com";
	String msg = "hi can conatct";
	@Test
	public void usercancontact()
	{

		homeobject = new HomePage(driver);
		contactobject = new ContactusPage(driver);
		homeobject.openContactUsPage();
		contactobject.contactus(name, email, email);
		Assert.assertTrue(contactobject.resultmsg.getText().contains(" enquiry"));



	}



}

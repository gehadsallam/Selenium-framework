package stepdefinitions;

import java.sql.Driver;

import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.UserRegistrationPage;
import tests.Testbase;

public class UserRegistration extends Testbase {


	HomePage homeobject;
	UserRegistrationPage userregistrationobject;




	@Given("the user in the home page")
	public void the_user_in_the_home_page() throws InterruptedException {

		homeobject = new HomePage(driver);
		homeobject.openregistrationpage();
		Thread.sleep(2000);

	}
	@When("i clicked in registe link")
	public void i_clicked_in_registe_link() {
		userregistrationobject = new UserRegistrationPage(driver);

		Assert.assertTrue(driver.getCurrentUrl().contains("register"));

	}
	@When("i entered the user data")
	public void i_entered_the_user_data() {
		userregistrationobject = new UserRegistrationPage(driver);
		userregistrationobject.userregistration("gehad", "sallam", "gehad@orbit.com", "123456");

	}
	@Then("the registeration page displayed succefully")
	public void the_registeration_page_displayed_succefully() {
		userregistrationobject = new UserRegistrationPage(driver);
		Assert.assertTrue(userregistrationobject.massagetxt.getText().contains("succefully"));

	}

}

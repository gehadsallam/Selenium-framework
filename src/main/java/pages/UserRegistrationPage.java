package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage  extends Pagebase{

	public UserRegistrationPage(WebDriver driver) {
		super(driver);

	}


	@FindBy (id = "gender-male")
	WebElement genderbtn;
	@FindBy (id = "FirstName")
	WebElement fnametxt;
	@FindBy(id = "LastName")
	WebElement lnametxt ;

	@FindBy(id = "Email")
	WebElement emailtxt;
	@FindBy(id = "Password")
	WebElement passwordtxt;
	@FindBy(id = "ConfirmPassword")
	WebElement conpasswordtxt;
	@FindBy(id = "register-button")
	WebElement registertxt;
	@FindBy(css = "div.result")
	public WebElement massagetxt;
	 
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[1]/h1")
	 public WebElement  registertext;

	



	public void userregistration(String fname , String lname , String email , String password)
	{

		clickButton(genderbtn);
		setTextElement(fnametxt, fname);
		setTextElement(lnametxt, lname);
		setTextElement(emailtxt, email);
		setTextElement(passwordtxt, password);
		setTextElement(conpasswordtxt, password);
		clickButton(registertxt);


	}


}

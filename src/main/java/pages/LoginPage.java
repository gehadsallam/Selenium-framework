package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Pagebase {

	public LoginPage(WebDriver driver) {
		super(driver);

	}


	@FindBy(id ="Email")
	WebElement emailtxt;

	@FindBy(id = "Password")
	WebElement passwordtxt;

	@FindBy(css = "button.button-1.login-button")
	WebElement loginbtn;

	public void userlogin (String email , String password)
	{

		setTextElement(emailtxt, email);
		setTextElement(passwordtxt,password);
		clickButton(loginbtn);

	}

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactusPage extends Pagebase {

	public ContactusPage(WebDriver driver) {
		super(driver);

	}


	@FindBy(id = "FullName")
	WebElement fullnametxt;
	@FindBy(id = "Email")
	WebElement emailtxt;
	@FindBy(id = "Enquiry")
	WebElement masagetxt;

	@FindBy(css = "button.button-1.contact-us-button")
	WebElement submitbtn;
	@FindBy(css = "div.result")
	public WebElement resultmsg;

	public void contactus(String FullName , String Email, String Massage)

	{

		setTextElement(fullnametxt, FullName);
		setTextElement(emailtxt, Email);
		setTextElement(masagetxt, Email);
		clickButton(submitbtn);


	}




}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailtoFreindPage extends Pagebase{

	public EmailtoFreindPage(WebDriver driver) {
		super(driver);

	}



	@FindBy(id = "FriendEmail")
	WebElement friendemailtxt;
	@FindBy(id = "YourEmailAddress")
	WebElement mymailtxt;
	@FindBy(id = "PersonalMessage")
	WebElement personalmsgtxt;
	@FindBy(css = "button.button-1.send-email-a-friend-button")
	WebElement submitbtn;
	@FindBy(css = "div.result")
	 public WebElement sucessmsg;



	public void emailfriend(String emailfriend , String massage)
	{

		setTextElement(friendemailtxt, emailfriend);
		setTextElement(personalmsgtxt, massage);
		clickButton(submitbtn);




	}





}

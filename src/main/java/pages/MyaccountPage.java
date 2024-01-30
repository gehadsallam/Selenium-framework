package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyaccountPage extends Pagebase {

	public MyaccountPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div[1]/div/div[2]/ul/li[7]/a")
	WebElement changepasslink;
	
	@FindBy (id = "OldPassword")
	WebElement oldpasstxt;
	@FindBy(id = "NewPassword")
	WebElement newpasstxt;
	@FindBy(id = "ConfirmNewPassword")
	WebElement confNpasstxt;
	@FindBy(css = "button.button-1.change-password-button")
	WebElement changpasswordbtn;
	
	
	public void openchangepasspage()
	{
		
		clickButton(changepasslink);
		
	}
	
	
	public void changepassword(String oldpass , String newpass)
	{
		
		setTextElement(oldpasstxt, oldpass);
		setTextElement(newpasstxt, newpass);
		clickButton(changpasswordbtn);
	}
}

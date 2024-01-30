package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends Pagebase{

	public HomePage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor)driver;
		action = new Actions(driver);

	}


	@FindBy(linkText = "Register")
	WebElement registerbtn;

	@FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement loginlink;

	@FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	public	WebElement logoutbtn;

	@FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
	WebElement myaccbtn ;

	@FindBy(linkText = "Contact us")
	WebElement contactuslink;
	@FindBy(id = "customerCurrency")
	WebElement currencydrl;
	@FindBy(linkText = "Computers ")
	WebElement computermenu;
	@FindBy(linkText = "Notebooks ")
	WebElement notebooks;



	public void openregistrationpage()
	{

		registerbtn.click();
	}


	public void userlogout()
	{

		clickButton(logoutbtn);
	}
	public void openloginlink()
	{

		clickButton(loginlink);
	}
	public void openmyaccount()
	{

		clickButton(myaccbtn);
	}

	public void openContactUsPage()
	{

		scrollToBottom();
		clickButton(contactuslink);

	}

	public void changecurrency()
	{
		select = new Select(currencydrl);
		select.selectByIndex(1);

	}

	public void hovertocomputermenu()
	{


		action.moveToElement(computermenu).click().build().perform();
	}

}

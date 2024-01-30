package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends Pagebase{

	public CheckoutPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id = "BillingNewAddress_FirstName")
	WebElement FirstNametxt;
	@FindBy(id = "BillingNewAddress_LastName")
	WebElement LastNametxt;
	@FindBy(id = "BillingNewAddress_Email")
	WebElement Emailtxt;
	
	
	@FindBy(id = "BillingNewAddress_CountryId")
	WebElement countylist;
	@FindBy(id = "BillingNewAddress_City")
	WebElement citytxt;
	@FindBy(id = "BillingNewAddress_Address1")
	WebElement addressTxt;
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement zipcodtxt;
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	WebElement phonenumtxt;
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/div/button[4]")
	WebElement continueBtn1;
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/button")
	WebElement continuebtn2;
	@FindBy(xpath = "//*[@id=\"payment-method-buttons-container\"]/button")
	WebElement continuebtn3;
	@FindBy(xpath = "//*[@id=\"payment-info-buttons-container\"]/button")
	WebElement contiunebtn4;
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[6]/div[2]/div[2]/button")
	WebElement confirmbtn;
	@FindBy(css = "div.title")
	 public WebElement sucessmsg;
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[2]/div[2]/a")
	WebElement orderdetailsLink ;
	
	public void registerusercanCheckoutproduct(String country , String city , String address , String zipcode , String phoneNum) throws InterruptedException
	{
		select = new Select(countylist);
		select.selectByVisibleText(country);
		setTextElement(citytxt, city);
		setTextElement(addressTxt, address);
		setTextElement(zipcodtxt, zipcode);
		setTextElement(phonenumtxt, phoneNum);
		clickButton(continueBtn1);
		Thread.sleep(1000);
		clickButton(continuebtn2);
		Thread.sleep(1000);
		clickButton(continuebtn3);
		Thread.sleep(1000);
		clickButton(contiunebtn4);
		
		
		
		
		
		
	}
	public void userconfirmorder() throws InterruptedException
	{
		
		Thread.sleep(1000);
		clickButton(confirmbtn);
		
	}
	 public void openorderdetailsPage()
	 {
		 
		 clickButton(orderdetailsLink);
	 }
	 
	 public void guestuserCancheckoutProduct(String fname , String lname , String email , String country , String city , String address , String zipcode ,String phonenum) throws InterruptedException
	 {
		setTextElement(FirstNametxt, fname);
		setTextElement(LastNametxt, lname);
		setTextElement(Emailtxt, email);
		select = new Select(countylist);
		select.selectByVisibleText(country);
		setTextElement(citytxt, city);
		setTextElement(addressTxt, address);
		setTextElement(zipcodtxt, zipcode);
		setTextElement(phonenumtxt, phonenum);
		clickButton(continueBtn1);
		Thread.sleep(1000);
		clickButton(continuebtn2);
		Thread.sleep(1000);
		clickButton(continuebtn3);
		Thread.sleep(1000);
		clickButton(contiunebtn4);
		
	 
		 
	 }

}

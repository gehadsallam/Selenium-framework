package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Pagebase{

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	
	}
	

	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[5]/input")
			WebElement quantitytxt;
	@FindBy(id = "updatecart")
	WebElement updateCartBtn;
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[7]/button")
	WebElement removeBtn;
	@FindBy(css = "div.no-data")
	public WebElement massege;
	
	@FindBy(css = "a.product-name")
	public WebElement productName;
	
	@FindBy(id = "termsofservice")
	WebElement agreeTermsCheckbox;
	@FindBy(id = "checkout")
	WebElement checkoutBtn;
	@FindBy(css = "button.button-1.checkout-as-guest-button")
	WebElement checkoutasguestBtn;
	
	
	
	public void updateCart(String quantity)
	{
		
	cleartext(quantitytxt);
	setTextElement(quantitytxt, quantity);
	clickButton(updateCartBtn);
		
		
	}
	
	
	
	public void clearCart()
	{
		
		clickButton(removeBtn);
		//clickButton(updateCartBtn);
		
	}
	
	public void openCheckoutPage()
	{
		clickButton(agreeTermsCheckbox);
		clickButton(checkoutBtn);
	}
	
	public void opencheckoutasguest()
	{
		
		clickButton(checkoutasguestBtn);
	}
	
	
	
	

}

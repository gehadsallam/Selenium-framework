package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends Pagebase{

	public WishListPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(css = "button.remove-btn")
	WebElement removebtn;
	@FindBy(css ="a.product-name")
	 public WebElement productName ;
	
	@FindBy (css = "div.no-data")
	public WebElement emptymassage;
	
	public void removefromwishlist()
	{
		
		
		clickButton(removebtn);
		
	}
	
	
	
}

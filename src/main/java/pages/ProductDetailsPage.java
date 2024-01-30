package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends Pagebase{

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(css = "strong.current-item")
	public WebElement ProductNamebreadcrumb; 
	
	
	@FindBy(css = "button.button-2.email-a-friend-button")
	WebElement emailfriendlink;
	@FindBy(id = "price-value-4")
	 public WebElement productprice;
	
	@FindBy(linkText = "Add your review")
	WebElement addreviewlink;
	@FindBy(id = "add-to-wishlist-button-4")
	WebElement addwishlistlink;
	@FindBy(css = "button.button-2.add-to-compare-list-button")
	WebElement addtocomparelistLink;
	@FindBy(id = "add-to-cart-button-4")
	WebElement addtoCartLink;
	
	
	
	public void openemailtofriend()
	{
		
		clickButton(emailfriendlink);
		
	}
	public void addreview()
	{
		
		clickButton(addreviewlink);
	}
	
	public void addtowishlist()
	{
		
		clickButton(addwishlistlink);
	}
	
	public void addtoCompareList()
	{
		
		
		clickButton(addtocomparelistLink);
	}
    
	public void addtocart()
	{
		
		clickButton(addtoCartLink);
		
		
	}
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductReviewPage extends Pagebase{

	public ProductReviewPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id = "AddProductReview_Title")
	WebElement reviewTitleTxt;
	@FindBy(id = "AddProductReview_ReviewText")
	WebElement reviewtxt;
	@FindBy(id = "addproductrating_4")
	WebElement productRatingradiobtn;
	@FindBy(css = "button.button-1.write-product-review-button")
	WebElement submitbtn;
	@FindBy(css = "div.result")
	public WebElement resultmsg ;
	public void addreview(String title , String review)
	{
		setTextElement(reviewTitleTxt, title);
		setTextElement(reviewtxt, review);
		clickButton(productRatingradiobtn);
		clickButton(submitbtn);
	}
	
	
	
	

}

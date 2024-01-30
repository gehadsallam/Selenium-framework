package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends Pagebase{

	public SearchPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(id = "small-searchterms")
	WebElement searchtxt;
	@FindBy(css = "button.button-1.search-box-button")
	WebElement searchbtn;
	@FindBy(linkText = "Apple MacBook Pro 13-inch")
	WebElement detailsproductlink;
	
	@FindBy(id ="ui-id-1")
	List<WebElement> proudctlist;
	 
	public void userCanSearchForProduct(String ProductName)
	{
		
		setTextElement(searchtxt, ProductName);
		clickButton(searchbtn);
		
	}
	
	
	public void productsearchwithautocomplete(String searchtxt1)
	{
		
		
		setTextElement(searchtxt, searchtxt1);
		proudctlist.get(0).click();
		
		
	}
	
	
	
	public void openProductDetails()
	{
		clickButton(detailsproductlink);
	}
	
	
	
	

}

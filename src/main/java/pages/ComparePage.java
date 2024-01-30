package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComparePage extends Pagebase {

	public ComparePage(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	@FindBy(css = "a.clear-list")
	WebElement clearListBtn;
	
	@FindBy(tagName = "tr")
	List<WebElement> allrows;
	@FindBy(tagName = "td")
	List<WebElement> allcol;
	@FindBy(css = "div.no-data")
	public WebElement clearmsg;
	
	
	
	public void clearCompareProducts()
	{
		
		clickButton(clearListBtn);
	}
	

	public void compareProducts()
	{
		
		System.out.println(allrows.size());
		
		// get all rows 
		for (WebElement row : allrows) {
			System.out.println(row.getText() + "\t");
			
			for (WebElement col : allcol) {
				
				
				System.out.println(col.getText() + "\t");
				
			}
			
		}
		
		
		
	}
	
}

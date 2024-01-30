package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderDetailsPage extends Pagebase {

	public OrderDetailsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy(css = "a.button-2.print-order-button")
	WebElement printorderBtn;

	@FindBy(css = "a.button-2.pdf-invoice-button")
	WebElement openorderPdfBtn;


	public void printorder()
	{

		clickButton(printorderBtn);
	}

	public void openorderPDF()
	{
		clickButton(openorderPdfBtn);

	}
}

package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utilities.Helper;

public class Testbase extends AbstractTestNGCucumberTests{


	public static WebDriver driver ;

	@BeforeSuite
	@Parameters({"browser"})

	public void startdriver(@Optional("chrome")String brwoserName)
	{


		if (brwoserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
			driver = new ChromeDriver() ;
		}

		else if (brwoserName.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.geko.driver",System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
			driver = new ChromeDriver() ;	
		}


		driver.manage().window().maximize();
		driver.navigate().to("https://demo.nopcommerce.com/");

	}


	@AfterSuite
	public void stopdriver()
	{


		driver.quit();
	}
	
	@AfterMethod
	
	public void screenshotonfaliure(ITestResult result)
	{
		
		
		if(result.getStatus()== ITestResult.FAILURE)
		{
			
			System.out.println("Falid!");
			System.out.println("Taking Screenshots........");
			Helper.capturescreenshot(driver, result.getName());
			
			
		}
	}

}

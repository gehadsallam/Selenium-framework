package tests;

import org.testng.annotations.Test;

import pages.HomePage;

public class HovermenuTest extends Testbase{
	
	
	HomePage homeobject;
	
	
	@Test
	public void hovertonootbooks()
	{
		
		homeobject = new HomePage(driver);
	    homeobject.hovertocomputermenu();
	    
		
		
		
	}
	
	
	
	

}

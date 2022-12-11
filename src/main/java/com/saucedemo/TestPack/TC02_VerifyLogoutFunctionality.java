package com.saucedemo.TestPack;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucedemo.POMpack.HomePOKMClass;



public class TC02_VerifyLogoutFunctionality extends TestBaseClass
{

	
	    
//	public class TC02_VerifyLogOutFunctionality extends TestBaseClass
//	{
	 
		@Test
		public void verifyLogOut()
		{
			HomePOKMClass hp = new HomePOKMClass(driver);
			hp.clickOnMenuButton();
			System.out.println("Clicked on menu Button");
			
			hp.clickOnLogOutButton();
			System.out.println("Clicked on logOut Button");
			
			//loginPage
			System.out.println("Went on LoginPage");
			
			//validation
			System.out.println("Apply validation");		
			String expectedTitle = "Swag Labs";   //BA/dev		
			String actaulTitle =driver.getTitle();	
			
			Assert.assertEquals(actaulTitle, expectedTitle);
					
		}
 
	 
		
		
		
		
		
		
		
     
		
		
		
		
	}



package com.saucedemo.TestPack;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC03_Verify_BagProduct_AddToCart_Functionality extends TestBaseClass
{

	
	
	  @Test
	    
	    public void VerifyLogout() 
	    {

		//validation
				System.out.println("Apply Validation");
				
				String exepctedProductCount = "1";

				String actualProductCount = driver.getTitle();
		
		 if(exepctedProductCount.equals(actualProductCount))
			    {
			    	System.out.println("Bag Product Test case is passed");
			    }
		 else
			    {
			    	System.out.println("Bag Product Test case is failed");
			    }
			
		 

		
	    }
		
		
		
		
		
		
		
}



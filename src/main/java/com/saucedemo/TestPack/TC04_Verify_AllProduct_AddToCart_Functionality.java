package com.saucedemo.TestPack;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC04_Verify_AllProduct_AddToCart_Functionality extends TestBaseClass
{

	
	
	 @Test
	    
	    public void VerifyLogout() 
	    {
						//validation
						System.out.println("Apply Validation");
								
						String exepctedProductCount = "6";	
						String actualProductCount = driver.getTitle();
						System.out.println("total products selected are->"+actualProductCount);
						
						
						if(exepctedProductCount.equals(actualProductCount))
					     {
							System.out.println("All Product Test case is passed");
					     }
					    else
					     {
							System.out.println("All  Product Test case is failed");
						 }

						
						//OR
//						Assert.assertEquals(exepctedProductCount, actualProductCount);
	    }
	 

}
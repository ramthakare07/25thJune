package com.saucedemo.TestPack;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucedemo.POMpack.LoginPomClass;

public class TC01_VerifyLoginFunctionality extends TestBaseClass
{

	WebDriver driver;   //-->declare GLOBALLY
	
	@BeforeMethod
	public void setup()
	{
	
		//Test Steps
System.setProperty("webdriver.chrome.driver","C:\\Users\\shind\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		driver =new ChromeDriver();              //dont declare here again
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	    driver.get("https://www.saucedemo.com/");
	    System.out.println("Url is open");
	    System.out.println("Went on LoginPage");
		
	    
	    //take SCREENSHOT
//	    UtilityClass.get
	    
	    
	    
	    
	    
	    
	    //LoginActivity
	    LoginPomClass lp = new LoginPomClass(driver);
		
		lp.sendusername();
		System.out.println("Username is entered");
		
		lp.sendpassword();
		System.out.println("Password is entered");
		
		lp.clickLoginButton();
		System.out.println("Clicked on login Button");
		
		
		//HOMEPAGE
		System.out.println("Went on HomePage");
	}
	
	
	
		
	@Test
	
	public void verifyLogin() 
	{
		//VALIDATION
		System.out.println("Apply validation");		
		String expectedTitle = "Swag Labs";   //BA/dev		
		String actaulTitle =driver.getTitle();	
		if(expectedTitle.equals(actaulTitle))
  		{
  			System.out.println("LogOut Test is passed");
  		}
  		else
  		{
  			System.out.println("LogOut Test is failed");
  		}
		
		//OR/INSTEAD USE
		//HARD ASSERTION
		//Assert Class-->static method
//		Assert.assertEquals(actaulTitle, expectedTitle);
		
	}
	
	
	@AfterMethod	
	public void tearDown()
	{
		driver.quit();

		System.out.println("browser is closed"); 
		
		
	}
	
	
}

package com.saucedemo.TestPack;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.beust.jcommander.Parameters;
import com.saucedemo.POMpack.LoginPomClass;

public class TestBaseClass {

WebDriver driver;   //-->declare GLOBALLY


//    @Parameters("browserName")
	@BeforeMethod
	
	public void setup()
	{
	
//		if(browserName.equals("chrome"))
//		{
		//Test Steps
System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver =new ChromeDriver();              //dont declare here again
		System.out.println("Browser is open");
//		}
//		else
//		{
//	    System.setProperty("webdriver.gecko.driver", 
//				"\"C:\\Users\\Public\\Desktop\\Firefox.lnk\\");	
//	    driver = new FirefoxDriver();

//		}
		
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
	
	
	@AfterMethod	
	public void tearDown()
	{
		driver.quit();

		System.out.println("browser is closed"); 
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

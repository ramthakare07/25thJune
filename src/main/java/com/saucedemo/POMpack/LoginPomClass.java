package com.saucedemo.POMpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPomClass {

	//WebElement and action on them
	
	//1.WebDriver declare only-->no value
	private WebDriver driver;   //-->Global
	private Actions act;        //-->GLOBAL declare
	
	//2.find Element
//	WebElement username=driver.findElement(By.xpath(""));
	//NOW REPLACE ABOVE METHOD OF FINDELEMENT
	
	//We will use ANNOTATION concept
	//@FindBy-->start with @-->annotation
	//its like method only
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
	
	//3.action on element-->perform encapsulation concept
	 
	public void sendusername()
	{
		username.sendKeys("standard_user");
	}
	
	
	@FindBy(xpath="//*[@id=\"password\"]")
	private WebElement password;
	
	public void sendpassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	
	@FindBy(xpath ="//input[@id='login-button']")
	private WebElement loginButton;
	
	//click method-->WebElement Interface
//	public void clickLoginButton()
//	{
//		loginButton.click();
//	}
	
	
	
	//Click method-->now MOUSE action
	public void clickLoginButton()
	{
		Actions act = new Actions(driver);
		act.click(loginButton).perform();		
	}
	
	
	
	
	//4.declare CONSTRUCTOR
	//public Classname
	
	public LoginPomClass(WebDriver driver)  //-->Local
	{
		this.driver = driver;
		//if same name -->then use this.
		PageFactory.initElements(driver,this);
		act = new Actions(driver);  //-->initialise here
	}
	
	
	
	//POM Steps
		//1.WebDriver declare
		//2.@FindBY ele find
		//3.method-Ele actions
		//4.const declare

	
	
	
	
	
	
	
	
	
	
	
}

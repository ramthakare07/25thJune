package com.saucedemo.POMpack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOKMClass {

	
 private WebDriver driver;
	
	//menuBtn
	@FindBy(xpath ="//button[@id='react-burger-menu-btn']")
	private WebElement menuButton;
	
	public void clickOnMenuButton()
	{
		menuButton.click();
	}

	//logOutBtn
	@FindBy(xpath ="//a[@id='logout_sidebar_link']")
	private WebElement logOutButton;
	
	public void clickOnLogOutButton()
	{
		logOutButton.click();
	}
	
	//bagEle
		@FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-backpack']")
		private WebElement bagProduct;
		
		public void clickAddToCartBagButton()
		{
			bagProduct.click();;
		}

	//add to cart ele
		@FindBy(xpath ="//a[@class='shopping_cart_link']")
		private WebElement addToCartLink;
		
		//String-->Return-->to get 
		public String getTextOfAddToCartButton()
		{
			String actualCount= addToCartLink.getText();
			return actualCount;
		}

	//all product add to cart
		//all product ele
		@FindBy(xpath ="//button[text()='Add to cart']")
		private List<WebElement> allProducts;
		//use LIST
		
		public void clickAllProducts()
		{
		//assignment 
		//use for each loop
			//below for loop is normal-->cannot be used for COLLECTION
			
			for(int i=0; i<allProducts.size();i++)
			{
				allProducts.get(i).click();
			}		
		}

		
    public HomePOKMClass(WebDriver driver)
    {
    	this.driver = driver;
    	PageFactory.initElements(driver,this);
    }

	
	
	
	
	
	
}

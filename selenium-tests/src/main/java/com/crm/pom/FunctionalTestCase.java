package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FunctionalTestCase 
{
	public FunctionalTestCase(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	private @FindBy(id="small-searchterms")
	WebElement searchbar ;
	public void searchBar(String name) 
	{
		searchbar.sendKeys(name);
	}
	
	
	 private @FindBy(xpath="//input[@value='Search']")
	 WebElement searchbutton;
	 public void searchButton() 
	 {
		 searchbutton.click();
	 }
	 
	 private @FindBy(xpath = "//input[@value='Add to cart']")
	 WebElement addtocart;
	 public void addToCart() {
		 addtocart.click();
	 }
	 
	 private @FindBy(id = "add-to-cart-button-72")
	 WebElement addtocart2;
	 public void addToCart2() {
		 addtocart2.click();
	 }
	 
	 private @FindBy(className = "cart-label")
	 WebElement shoppingcart;
	 public void shoppingCart() {
		 shoppingcart.click();
	 }
	 
	 private @FindBy(xpath =  "(//a[contains(text(),'Build your own cheap computer')])[2]")
	 WebElement verifycart;
	 public WebElement verifyCart() {
		 return verifycart;
	 }
	 
}

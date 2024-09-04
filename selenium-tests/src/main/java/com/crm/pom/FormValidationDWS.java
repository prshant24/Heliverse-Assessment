package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormValidationDWS 
{
	public FormValidationDWS(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(linkText  ="Register")
	WebElement registericon;	
	public void registerIcon() 
	{
		registericon.click();
	}
	
	private @FindBy(id="gender-male")
	WebElement male;
	public void genderMale() {
		male.click();
	}
	
	private @FindBy(id="FirstName")
	WebElement firstname;
	public void FirstName(String Fname) 
	{
		firstname.sendKeys(Fname);
		
	}
	
	private @FindBy(id="LastName")
	WebElement lastname;
	public void LastName(String Lname) 
	{
		lastname.sendKeys(Lname);
		
	}
	
	private @FindBy(id="Email")
	WebElement email;
	public void Email(String mail) 
	{
		email.sendKeys(mail);
		
	}
	
	private @FindBy(id="Password")
	WebElement password;
	public void PassWord(String pass) 
	{
		password.sendKeys(pass);
		
	}
	
	private @FindBy(id="ConfirmPassword")
	WebElement confermpass;
	public void ConfermPass(String conferm) 
	{
		confermpass.sendKeys(conferm);
		
	}
	
	private @FindBy(id="register-button")
	WebElement create;
	public void createAcc() 
	{
		create.click();
		
	}

}

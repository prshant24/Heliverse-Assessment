package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	private @FindBy(className = "ico-login")
	WebElement login_link;

	private@FindBy(id = "Email")
	WebElement username;

	private @FindBy(name = "Password")
	WebElement password;

	private @FindBy(xpath = "//input[@value='Log in']")
	WebElement login_button;
	private @FindBy(xpath = "//span[contains(text(),'Login was unsuccessful. Please correct the errors and try again.')]")
	WebElement msg;
	private @FindBy(className = "ico-logout")
	WebElement logout;


	public void login_link() {
		login_link.click();
	}
	public void username(String user) {
		username.sendKeys(user);
	}
	public void password(String pass) {
		password.sendKeys(pass);
	}
	public void login_button() {
		login_button.click();
	}
	public WebElement verifyCredential() {
		return msg;
	}
	public WebElement loginSuccessful() {
		return logout;
	} 
}

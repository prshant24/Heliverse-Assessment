package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UiTestCase {

	public UiTestCase(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	private @FindBy(id="small-searchterms")
	WebElement searchfield;	
	public WebElement searchField() {
		return searchfield;
	}
	private  @FindBy(className = "footer-menu-wrapper")
	WebElement footerarea;
	public WebElement footerArea() {
		return footerarea;
	} 
}

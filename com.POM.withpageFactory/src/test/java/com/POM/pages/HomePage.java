package com.POM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class HomePage extends TestBase{
	@FindBy(partialLinkText = "Welcome")
	WebElement clickOnprofile;
	@FindBy(linkText = "Logout")
	WebElement logutButton;
	 
	public HomePage() {
	
		PageFactory.initElements(driver,this);
	}
	
	public void logout() {
		clickOnprofile.click();
		logutButton.click();
		
	}
 
}

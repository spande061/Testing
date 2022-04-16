package com.Kite.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogoutPage {
	
private WebDriver driver;
	
	@FindBy(xpath="//div[@class='avatar']")
	WebElement dropdown;
	
	@FindBy(xpath="//span[@class='icon icon-exit']")
	WebElement logout;
	
	public KiteLogoutPage(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void dropdown() {
		dropdown.click();
	}
	
	public void logout() {
		logout.click();
	}


}

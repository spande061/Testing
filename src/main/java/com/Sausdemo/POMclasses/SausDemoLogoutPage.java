package com.Sausdemo.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SausDemoLogoutPage {

	
 private WebDriver driver;
	
	@FindBy(xpath=("//input[@name='user-name']"))
	private WebElement Username;
	@FindBy(xpath="//input[@name='password']")
	private WebElement pass;
	@FindBy(xpath="//input[@name='login-button']")
	private WebElement Login;
	@FindBy(xpath="//button[text()='Open Menu']")
	private  WebElement option;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	public SausDemoLogoutPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void senduser() {
		Username.sendKeys("standard_user");
	}

	public void semdpass() {
		pass.sendKeys("secret_sauce");
	}
	public void login() {
		Login.click();;
	}
	
	public void option() {
		option.click();
	}
	public void logout()
	{
		logout.click();
	}

}

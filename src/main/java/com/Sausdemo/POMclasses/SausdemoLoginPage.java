package com.Sausdemo.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SausdemoLoginPage {
	
		private WebDriver driver;
		
		@FindBy(xpath="//input[@name='user-name']")
		private WebElement username;
		
		@FindBy(xpath="//input[@name='password']")
		private WebElement password;
		
		@FindBy(xpath="//input[@name='login-button']")
		private WebElement LoginButton;
		
		@FindBy(xpath="//div[@class='avatar']")
	    WebElement Option;
		
		@FindBy(xpath="//span[@class='icon icon-exit']")
	    WebElement Logout;
		
		public SausdemoLoginPage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
		}
		
		public void sendusename()
	    {
			username.sendKeys("standard_user");
		}
		public void sendpass()
		{
			password.sendKeys("secret_sauce");
		}
	    public void Loginclick()
	    {
	    	LoginButton.click();
	    }

	    public String text() {
	    	String text = LoginButton.getText();
	    	return text;
	    }

}

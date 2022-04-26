package com.insta.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstaLoginPage {
	
	
	private WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	
	@FindBy(xpath="//button[text()='Not Now']")
	private WebElement notnow;
	
	@FindBy(xpath="//button[text()='Not Now']")
	private WebElement notnow1;
	
	@FindBy(xpath="(//div[@class='XrOey'])[2]")
	private WebElement msg;
	
	@FindBy(xpath="//div[text()='Rakshanda Kamble']")
	private WebElement rk;
	
	@FindBy(xpath="//textarea[@placeholder='Message...']")
	private WebElement mess;
	
	@FindBy(xpath="//button[text()='Send']")
	private WebElement send;
	
	
	public InstaLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void username() {
		username.sendKeys("9764320665");
	}
	
	public void password() {
		password.sendKeys("asandeep");
	}
	
	public void login() {
		login.click();
	}
	
	public void notnow() {
		notnow.click();
	}
	
	public void notnow1() {
		notnow1.click();
	}
	public void msg() {
		msg.click();
	}
	
	public void rk() {
		rk.click();
	}
	public void mess() {
		mess.sendKeys("I Love You Rk");
	}
	
	public void send() {
		send.click();
	}
	
	public String URl() {
		String expectedText = login.getText();
		return expectedText;
	}
	
}

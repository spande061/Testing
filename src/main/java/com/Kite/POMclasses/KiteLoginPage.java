package com.Kite.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {

	

	private WebDriver driver;
	
	@FindBy(xpath="//input[@autocapitalize='characters']")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Login;
	

	@FindBy(xpath="//input[@type='password']")
	WebElement pin;
	

	@FindBy(xpath="//button[@type='submit']")
	WebElement Pinclick;
	
	@FindBy(xpath="//div[@class='avatar']")
    WebElement Option;
	
	@FindBy(xpath="//span[@class='icon icon-exit']")
    WebElement Logout;
	
	public KiteLoginPage(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void username() {
		username.sendKeys("DPD624");
	}

	  public void password() {
		  password.sendKeys("9764320665");
	  }

     public void Login() {
    	 Login.click();
     }

    public void pin() {
    	pin.sendKeys("976432");
    }
 
    public void Pinclick() {
    	Pinclick.click();
    }
  
   
    
	public String text1() {
		Option.click();
		
		String text1 = Logout.getAriaRole();
		return text1;
	}
	
	public String text() {
		String text = Login.getText();
		return text;
	}


}

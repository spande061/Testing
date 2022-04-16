package com.Kite.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteAddToShare {
	
WebDriver driver;
	
	@FindBy(xpath="//a[@class='router-link-exact-active router-link-active']")
	WebElement marketwatch;
    
	@FindBy(xpath="//input[@type='text']")
	WebElement serch;
	
	@FindBy(xpath="(//span[text()='YESBANK'])[1]")
	WebElement serchButton;

	@FindBy(xpath="//li[@class='search-result-item selected']")
	WebElement IRFC;
	
    @FindBy(xpath="(//button[@type='button'])[1]")
    WebElement Buy;	
    
    @FindBy(xpath="(//label[text()='Market'])")
    WebElement Radio;
    
    @FindBy(xpath="//button[@type='submit']")
    WebElement submit;	
	
    @FindBy(xpath="(//input[@type='number'])[1]")
    WebElement count;	
    
   
    
    public KiteAddToShare(WebDriver driver){
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    	
    }
	
    
    public void marketwatch() {
    	marketwatch.click();
    	
    }
    
    public void serch() {
    	
    	
    	serch.sendKeys("IRFC");
    	
    }
    public void IRFC() {
    	IRFC.click();
    	Actions act = new Actions(driver);
    	act.click(IRFC).perform();
    	
    	
    }
    
    public void Buy() {
    	Buy.click();
    	
    }
    public void submit() {
    	submit.click();
    	
    }
    public void Radio() {
    	Radio.click();
    	
    }
    public void count() {
    	count.sendKeys("4");
    	
    }



}

package com.Sausdemo.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SausdempAddToCartPage {
	
private WebDriver driver;
	
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	WebElement addtocart;
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement Cart;
	@FindBy(xpath="//button[@name='checkout']")
	WebElement checkout;
	@FindBy(xpath="(//input[@name='firstName'])")
	WebElement Firstname;
	@FindBy(xpath="(//input[@name='lastName'])")
	WebElement LastName;
	@FindBy(xpath="(//input[@name='postalCode'])")
	WebElement PostalCode;
	@FindBy(xpath="//input[@name='continue']")
	WebElement Continue;
	@FindBy(xpath="(//button[@name='finish'])")
	WebElement Finish;
	
	public SausdempAddToCartPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void addtocart() {
		addtocart.click();
		
	}
	
	public void cart() {
	Cart.click();
	
	}
    
	public void checkout() {
		checkout.click();
	}
	public void FirstName() {
		Firstname.sendKeys("Sandeep");
	}
	public void LastName() {
		LastName.sendKeys("Pande");
	}
   public void PostalCode() {
	   PostalCode.sendKeys("411057");
	   
   }

   public void Continue() {
	   Continue.click();
	   
   }
   
   public void Finish() {
	   Finish.click();
   }
   


}

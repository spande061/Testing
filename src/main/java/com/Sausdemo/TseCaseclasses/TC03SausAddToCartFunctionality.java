package com.Sausdemo.TseCaseclasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Sausdemo.POMclasses.SausdemoLoginPage;
import com.Sausdemo.POMclasses.SausdempAddToCartPage;

public class TC03SausAddToCartFunctionality {

	

	WebDriver driver;
	
	@BeforeMethod
	   public void SetUpMethod() {
		
		
		System.setProperty("webdriver.chrome.driver",".//drivers////chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get("https://www.saucedemo.com/");
		   System.out.println("1.URL opened");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   SausdemoLoginPage x = new SausdemoLoginPage(driver);
		   
		   x.sendusename();
		   System.out.println("2.Username entered");
		   x.sendpass();
		   System.out.println("3.Password enetered");
		   x.Loginclick();
		   System.out.println("4.Logged in succesfully");
		   SausdempAddToCartPage y  = new  SausdempAddToCartPage(driver);
		   
		   y.addtocart();
		   System.out.println("5.iteam selected to cart");
		   y.cart();
		   System.out.println("6.go to cart");
		   y.checkout();
		   System.out.println("7.product checkout");
		   y.FirstName();
		   System.out.println("8.firstName netered");
		   y.LastName();
		   System.out.println("9.Last name eneterd");
		   y.PostalCode();
		   System.out.println("10.postal code enetred");
		   y.Continue();
		   System.out.println("11.clicked on continue");
		   y.Finish();
		   System.out.println("12.finish button clicked");
	}   
		  
	       @Test
	          public void AddToCartFunctionality() {
	
	       String ActualUrl = "https://www.saucedemo.com/checkout-complete.html";
		   
		   String ExpectedUrl = driver.getCurrentUrl();
		   
		   if(ActualUrl.endsWith(ExpectedUrl)) {
			   System.out.println("Test is Passed");
		   }else {
		   System.out.println("Test Case is failed");
		   
	}
	}

      @AfterMethod
         public void TearOutMethod() {
    	  driver.quit();
    	  System.out.println("13.browser closed");
      }

}

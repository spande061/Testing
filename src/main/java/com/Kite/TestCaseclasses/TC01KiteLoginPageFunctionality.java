package com.Kite.TestCaseclasses;


import java.io.IOException;

import java.time.Duration;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Kite.POMclasses.KiteLoginPage;

import Utiltiy.ScreenShot;

@Listeners(Utiltiy.Listeners.class)
public class TC01KiteLoginPageFunctionality {
	
public WebDriver driver;
Logger log;
	
	@BeforeMethod
	 public void SetUp() throws InterruptedException, IOException {
		
		log = Logger.getLogger("ss");
		PropertyConfigurator.configure("log4j.properties");
	
	System.setProperty("webdriver.chrome.driver", ".//drivers////chromedriver.exe");
	   driver = new ChromeDriver();
		driver.get("https://google.com/");
		driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		  
		 
		   KiteLoginPage x = new KiteLoginPage(driver);
		   log.info("URL opened");
		  // ScreenShot s = new ScreenShot(driver);
		//s.screen();
		   x.username();
		  //s.screen();
		   log.info("Username entered");
		   x.password();
		   Thread.sleep(2000);
		   //s.screen();
//		   log.info("password entered");
//		   x.Login();
//		   Thread.sleep(2000);
//		   //s.screen();
//		  log.info("succesfully logged in");
//		  
//		   Thread.sleep(5000);
//		   
//		   x.pin();
//		  // s.screen();
//		  log.info("Pin entered");
//		   x.Pinclick();
//		   log.info("welcome to homepage");
//		  
//		  //s.screen();
//		   
//		  
//		   System.out.println("14.Screenshot has been taken");
	 }   
		  @Test
		  public   void LoginPagefunctionality() {
			  
		  String ExpectedText = "one";
		  String ActualText1 = "none";
		   
		  Assert.assertEquals(ExpectedText, ActualText1);
	
		  }
 		@AfterMethod
      public void TearOut() {
 			
 		     driver.quit();
 			System.out.println("15.URL closed");
    	  
      }


}

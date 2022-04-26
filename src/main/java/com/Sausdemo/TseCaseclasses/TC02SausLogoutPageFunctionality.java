package com.Sausdemo.TseCaseclasses;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Sausdemo.POMclasses.SausDemoLogoutPage;
import com.Sausdemo.POMclasses.SausdemoLoginPage;


@Listeners(Utiltiy.Listeners.class)
public class TC02SausLogoutPageFunctionality {
	Logger log;
	WebDriver driver;
	@BeforeMethod
	  public void SetUp() {
		
		
		log = Logger.getLogger("ss");
		PropertyConfigurator.configure("log4j.properties");
		
		System.setProperty("webdriver.chrome.driver",".//drivers////chromedriver.exe");
		    driver = new ChromeDriver();
		   driver.get("https://www.saucedemo.com/");
		   driver.manage().window().minimize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  log.info("URl Opened");
		   SausdemoLoginPage y = new SausdemoLoginPage(driver);
		   y.sendusename();
		   log.info("Usernmae entered");
		   y.sendpass();
		   log.info("password enetered");
		   y.Loginclick();
		   log.info("Logged in succesfully");
		   
		   SausDemoLogoutPage x = new SausDemoLogoutPage(driver);
		   x.option();
		   log.info("dropdown selected");
		   x.logout();
		   log.info("logged out succesfully");
	}
	
	   @Test
	      public void LogOutPageFunctionality() {
		   SausdemoLoginPage x = new SausdemoLoginPage(driver);
		   
		   String ExpectedURL = x.text();
		   
		    String   ActualURL = "Loguo";
		
		    
		    Assert.assertEquals(ActualURL,ExpectedURL);
		
		   }	   
	

	   @AfterMethod
	       public void TareoutMethod() {

		   driver.quit();
		   log.info("browser closed");
		   
	   }   


}

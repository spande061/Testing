package com.Sausdemo.TseCaseclasses;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Sausdemo.POMclasses.SausdemoLoginPage;


@Listeners(Utiltiy.Listeners.class)
public class TC01SausLoginPageFunctionality  {
  
	 Logger log;
	public WebDriver driver;
	@BeforeMethod
	
	
	public void SetUp()
	{ 
            log = Logger.getLogger("ss");
            PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver",".//drivers////chromedriver.exe");
	    driver = new ChromeDriver();
	   driver.get("https://www.saucedemo.com/");
	   log.info("opened URL");
		   SausdemoLoginPage x = new SausdemoLoginPage(driver);
		   x.sendusename();
		   log.info("username entered");
		   x.sendpass();
		   log.info("password entred");
		   x.Loginclick();
		   log.info("Logged in succesfully");
	}	   
			@Test
			 public void TCo1LoginFunctionality() {
		   
	        String expectedHomePageUrl = "tps://www.saucedemo.com/";
	        String ActualURL = "https://www.saucedemo.com/";
	       
	        Assert.assertEquals(ActualURL, expectedHomePageUrl);
	        
			}
			
		   @AfterMethod
		   public void TearOut() {
			   
			   driver.quit();
			   log.info("browser closed");
		   }
		   

}

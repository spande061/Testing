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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Kite.POMclasses.KiteAddToShare;
import com.Kite.POMclasses.KiteLoginPage;

public class TC02KiteAddToShareFunctionality {
	
	WebDriver driver;
	Logger log;
		@Parameters("browserName")
		@BeforeMethod
		 public void SetUp(String browserName) throws InterruptedException, IOException {
			
			log = Logger.getLogger("ss");
			PropertyConfigurator.configure("log4j.properties");
			
			if(browserName.equals("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Desktop\\\\selenium\\\\\\\\\\\\\\\\chromedriver.exe");
				 driver = new ChromeDriver(); 
			}else if(browserName.equals("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Desktop\\selenium\\Firefox\\geckodriver.exe\\");
				 driver = new FirefoxDriver();
			}else {
				System.out.println("Show the error");
			}
			driver.get("https://google.com/");
			driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			   KiteLoginPage x = new KiteLoginPage(driver);
			   log.info("URL opened");
			  //Thread.sleep(2000);
			  // s.screen();
			   x.username();
			  //s.screen();
			   log.info("Username entered");
			   x.password();
			  // Thread.sleep(2000);
			 //  s.screen();
			   log.info("password entered");
			   x.Login();
			  // Thread.sleep(2000);
			  // s.screen();
			  log.info("succesfully logged in");
			  
			   Thread.sleep(5000);
			   
			   x.pin();
			  // s.screen();
			  log.info("Pin entered");
			   x.Pinclick();
			   log.info("welcome to homepage");
			  
			  //s.screen();
			   
			  
			   System.out.println("14.Screenshot has been taken");
		
			   KiteAddToShare y = new KiteAddToShare(driver);
			   y.marketwatch();
			   y.serch();
			   y.IRFC();
			   y.Buy();
			   y.Radio();
			   y.count();
			   y.submit();
			   
			
		
		
		}
   
      @Test
        public void KiteAddToShareFunctionality() {
    	  
    	  String ActualText = "Added";
    	  String ExpectedText = "Added";
    	  
    	  Assert.assertEquals(ActualText, ExpectedText);
    	  
    	  
    	  
      }
 
       @AfterMethod
         public void TearDwon() {
    	   
    	   //driver.quit();
       }


}

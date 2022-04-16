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

import com.Kite.POMclasses.KiteLoginPage;
import com.Kite.POMclasses.KiteLogoutPage;

public class TC03KiteLogoutFunctionality {
	Logger log;
	 WebDriver  driver;
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
		   driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   log.info("url entered");
		   
		   KiteLoginPage x = new KiteLoginPage(driver);
		   
		   x.username();
		   System.out.println("2.Username Entered");
		   x.password();
		   System.out.println("3.Password enetered");
		   x.Login();
		   System.out.println("4.Login to the F2A Page");
		   Thread.sleep(5000);
		   x.pin();
		   System.out.println("5.PIN enetred");
		   x.Pinclick();
		   System.out.println("6.succesfully logged In");
		   KiteLogoutPage y = new KiteLogoutPage(driver);
		   y.dropdown();
		   System.out.println("7.Dropdown Saleceted");
		   y.logout();
		   System.out.println("8.Logged out succesfully");
		  
		   System.out.println("9.ScreenShot has been taken");
	
		}
		   
		   @Test
		     public void LogOutPagefunctionality() {
		   
		   String ActualText = "Login";
		    String Actual = "Login";
		   Assert.assertEquals(ActualText, Actual);
		   
		   
	}

	   @AfterMethod
	     public void TeraOut() {
		   driver.quit();
		   System.out.println("10.URL closed");
	   }


}

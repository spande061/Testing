package com.insta.Testclasses;

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

import com.insta.POMclasses.InstaLoginPage;
@Listeners(Utiltiy.Listeners.class)
public class LoginPageFunctionality {
	public WebDriver driver;
	Logger log;
	@BeforeMethod
	   public void SetUpMethod() {
		
		log = Logger.getLogger("ss");
      PropertyConfigurator.configure("log4j.properties");

		System.setProperty("webdriver.chrome.driver",".//drivers////chromedriver.exe");
		 driver = new ChromeDriver();
	   
		driver.get("https://www.instagram.com/");
		log.info("URl Opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		InstaLoginPage x = new InstaLoginPage(driver);
		x.username();
		log.info("UserName entered");
		x.password();
		log.info("Password enetered");
		x.login();
		log.info("Succesfully logged in");
		x.notnow();
		x.notnow1();
		x.msg();
		x.rk();
		x.mess();
		
		
	}
		@Test(invocationCount=5)
		
		  public void LoginPageFunctionlait() {
			
			InstaLoginPage x = new InstaLoginPage(driver);
			x.send();
//			String ActualText = "Log n";
//			String ExpectText = x.URl();
//			
//			Assert.assertEquals(ActualText, ExpectText);
//			log.info("Test case passed");
		}
	
		@AfterMethod
		 public void TearDownMethod() {
			
			driver.quit();
			log.info("url closed");
		
	}
}
	  
	
	



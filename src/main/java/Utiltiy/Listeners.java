package Utiltiy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Kite.TestCaseclasses.TC01KiteLoginPageFunctionality;

public class Listeners implements ITestListener {
	
	WebDriver driver;
	
	public void onTestStart(ITestResult result) {
		System.out.println("Excution is started");
	}
	
	public void onTestsuccess(ITestResult result) {
		System.out.println("Test Is passed");
	}


	public void onTestFailure(ITestResult result)  {
		System.out.println("Test Is failed hence we have taken screenshot");
		this.driver = ((TC01KiteLoginPageFunctionality)result.getInstance()).driver;
		ScreenShot uc = new ScreenShot(driver);
		try {
			uc.screen();
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}

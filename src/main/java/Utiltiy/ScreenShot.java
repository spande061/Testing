package Utiltiy;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestListener;

public class ScreenShot  {
	
	WebDriver driver;
	
       public ScreenShot(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void screen() throws IOException {
		
		Date date = new Date();
	    DateFormat d = new SimpleDateFormat("DD-MM-YY & HH-MM-SS");
	    String NewDate = d.format(date);
	    
	    TakesScreenshot s = (TakesScreenshot)driver;
	    
	    File source = s.getScreenshotAs(OutputType.FILE);
	    File dest = new File(".//Screenshots//"+NewDate+".jpg");
	    FileHandler.copy(source, dest);
		
	}
	
	
	

}

package uistore;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reusablecomponents.ReadPropertyFile;
import pageobject.SigninPageDetails;


public class HomePage extends ReadPropertyFile{
	public static Logger log=Logger.getLogger(ReadPropertyFile.class.getName());
	
	@BeforeTest
	public void initialise() throws IOException {

		driver = DriverInitialisation();
	}

	 @AfterTest
	 public void close() {
	  
	  driver.close(); driver = null;
	  
	  }
	@Test
	public void signIn() throws InterruptedException, IOException {
		
		
		driver.get(p.getProperty("url"));
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		log.info("navigation to url");	
		
		SigninPageDetails s = new SigninPageDetails(driver);
		HashMap<String,String> data = s.getTestData();
		System.out.println(data.get(0));
		s.getSignin().click();
		Thread.sleep(5000);
	
		
		//popup
		System.setProperty("webdriver.chrome.driver", "//chrome path in system//");
	    ChromeOptions options  = new ChromeOptions();
	    options.setExperimentalOption("excludeSwitches", "disable-popup-blocking");
	    
	    for (Entry<String, String> entry : data.entrySet()) {
	    s.getEmail().sendKeys(entry.getKey());
	    Thread.sleep(2000);
	    s.getPassword().sendKeys(entry.getValue());
	    
	    }
	    Thread.sleep(3000);
		s.getSigninButton().click();
		Thread.sleep(2000);
	}
	 

}
package facebooklogin.com;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class login {

	public static WebDriver driver = new FirefoxDriver();
	String appURL = "http://google.com";

	@BeforeClass
	public void testSetUp() {
		
        System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe"); 
    	
    	DesiredCapabilities dc = DesiredCapabilities.firefox();
    	dc.setCapability("marionette", true);
    	
	}
	
	@Test
	public void verifyGooglePageTittle() {
		driver.navigate().to(appURL);
		String getTitle = driver.getTitle();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		Assert.assertEquals(getTitle, "Google");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	}



package com.qualiprobdd.e2etests.util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Setup {

	public static WebDriver driver;
	static DriverManager driverManager;

	@Before
	public static void setup() throws IOException {

		driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
		 //System.out.println("driver manager Started");
		driver = driverManager.getDriver();
		 System.out.println("Get driver Started");
		
	}

	
	@After
	/**
	 * Embed a screenshot in test report if test is marked as failed
	 */
	 public void afterScenario(Scenario scenario) {
		//afficher le nom et le valeur de tous les cookies
		/*Set<Cookie> cookieL = driver.manage().getCookies();
		for(Cookie temp_cookie : cookieL ){
			System.out.println("Name of the cookie : "+temp_cookie.getName()+
					" and its value : "+ temp_cookie.getValue());
		}*/
		//Cookie cookie1 = driver.manage().getCookieNamed("lan");
		//System.out.println("Name of the cookie : "+cookie1.getName()+
				//" and its value : "+ cookie1.getValue());
		 if(scenario.isFailed()){
	            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	            scenario.embed(screenshot, "image/png");
	        }
		// quit driver
         //if (driver != null)
           // driver.quit();

         // delete all "scoped_dir" temp folders 
         /*String tempfolder = System.IO.Path.GetTempPath();
         String[] tempfiles = Directory.GetDirectories(tempfolder, "scoped_dir*", SearchOption.AllDirectories);
         foreach (String tempfile in tempfiles)
         {
             try
             {
                 System.IO.DirectoryInfo directory = new System.IO.DirectoryInfo(tempfolder);
                 foreach (System.IO.DirectoryInfo subDirectory in directory.GetDirectories()) subDirectory.Delete(true);
             }
             catch (Exception ex)
             {
                 writeEx("File '" + tempfile + "' could not be deleted:\r\n" +
                         "Exception: " + ex.getMessage() + ".");
             }
         }*/
	}
}

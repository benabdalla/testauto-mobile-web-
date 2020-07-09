package com.qualipro.stepdef;


import com.qualipro.utils.DriverManager;
import com.qualipro.utils.GlobalParams;
import com.qualipro.utils.TestUtils;
import com.qualipro.utils.VideoManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.Connection;
import io.appium.java_client.android.connection.ConnectionState;
import io.appium.java_client.android.connection.ConnectionStateBuilder;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.screenrecording.CanRecordScreen;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import static org.testng.AssertJUnit.assertEquals;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Hooks {
	  static TestUtils utils = new TestUtils();
    public  static AndroidDriver<AndroidElement>driver;
    public AppiumDriver getDriver(){
        return driver;
    }
    @Before
    public void initialize() throws Exception {
/*        GlobalParams params = new GlobalParams();
        params.initializeGlobalParams();

        ThreadContext.put("ROUTINGKEY", params.getPlatformName() + "_"
                + params.getDeviceName());

        new ServerManager().startServer();
        new DriverManager().initializeDriver();*/
      //  new VideoManager().startRecording();


        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "mootez");
            capabilities.setCapability("platformVersion", "9.0");
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "5000");
            capabilities.setCapability("appWaitPackage", "com.saphirconsult.qualipro.myapplication");
            capabilities.setCapability("appWaitActivity", "com.saphirconsult.qualipro.myapplication.AjoutActionActivity");
           // capabilities.setCapability("automationName", "UiAutomator2");
             /* capabilities.setCapability("autoGrantPermissions", "true");
            capabilities.setCapability("skipDeviceInitialization", "true");
            capabilities.setCapability("skipServerInstallation", "true");
            capabilities.setCapability("noReset", "true");
            new URL("http://0.0.0.0:4723/wd/hub")
            */
            driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
            ((CanRecordScreen) driver).startRecordingScreen();
            utils.log().info("start video ");


            System.out.println("connected appium----->");

        } catch (Exception e) {
            System.out.println("appium  is  not  connected");
        }
    }
    public static  boolean getCon()
    {
    	ConnectionState state = driver.setConnection(new ConnectionStateBuilder()
    		      .withAirplaneModeDisabled()
    		      .build());
    		 
    	
    	utils.log().info("connection with "+state);
    	
    	 if(state.isWiFiEnabled()) {
 	    	utils.log().info("connection with wifi");

    		 return true;

 
    	 }
    			 
    	 else if(state.isDataEnabled()) {
  	    	utils.log().info("connection with data");

    		 return true;

    	 }else {

    return false;
    }
    	 }
    public void stopRecording(String scenarioName) throws IOException {
        GlobalParams params = new GlobalParams();
        String media = ((CanRecordScreen) driver).stopRecordingScreen();
        String dirPath = params.getPlatformName() + "_"
                + params.getDeviceName() + File.separator +"Videos";

        File videoDir = new File(dirPath);

        synchronized(videoDir){
            if(!videoDir.exists()) {
                videoDir.mkdirs();
            }
        }
        FileOutputStream stream = null;
        try {
            stream = new FileOutputStream(videoDir + File.separator + scenarioName + ".mp4");
            stream.write(Base64.decodeBase64(media));
            stream.close();
            utils.log().info("video path: " + videoDir + File.separator + scenarioName + ".mp4");
        } catch (Exception e) {
            utils.log().error("error during video capture" + e.toString());
        } finally {
            if(stream != null) {
                stream.close();
            }
        }
    }

    @After
    public void quit(Scenario scenario) throws IOException {
        if(scenario.isFailed()){
            byte[] screenshot = driver.getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png", scenario.getName());
        }

       stopRecording(scenario.getName());
        driver.quit();

/*        DriverManager driverManager = new DriverManager();
        if(driverManager.getDriver() != null){
            driverManager.getDriver().quit();
            driverManager.setDriver(null);
        }
        ServerManager serverManager = new ServerManager();
        if(serverManager.getServer() != null){
            serverManager.getServer().stop();
        }*/
    }
}

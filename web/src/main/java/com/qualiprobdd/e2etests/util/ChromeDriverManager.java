package com.qualiprobdd.e2etests.util;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeDriverManager extends DriverManager {

	private ChromeDriverService chService;

	@Override
	public void startService() {
		if (null == chService) {
			try {
				chService = new ChromeDriverService.Builder()
						.usingDriverExecutable(new File("C:\\Users\\mootez\\eclipse-workspace\\testauto-web-mobile\\main\\src\\main\\resources\\DriversExecutables\\chromedriver.exe"))
						.usingAnyFreePort().build();
				chService.start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override  
	public void stopService() {
		if (null != chService && chService.isRunning())
			chService.stop();
	}
 
	@Override
	public void createDriver() {
		String downloadFilepath = "C:\\Users\\mootez\\eclipse-workspace\\testauto-web-mobile\\main\\src\\main\\resources\\apercu";

		 HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		 chromePrefs.put("profile.default_content_settings.popups", 0);
		 chromePrefs.put("download.default_directory", downloadFilepath);
		 ChromeOptions options = new ChromeOptions();
		// options.setExperimentalOption("prefs", chromePrefs);



		//options.addArguments("--test-type");

		DesiredCapabilities cap = DesiredCapabilities.chrome();

		cap.setCapability(ChromeOptions.CAPABILITY, chromePrefs);

		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		cap.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(chService, cap);
		driver.manage().window().maximize();
		
	}

}

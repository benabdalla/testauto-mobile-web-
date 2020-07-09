package com.qualipro.runners;

import com.qualipro.stepdef.Hooks;
import com.qualipro.utils.DriverManager;
import com.qualipro.utils.GlobalParams;
import com.qualipro.utils.ServerManager;
import com.qualipro.utils.VideoManager;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.apache.logging.log4j.ThreadContext;
import org.testng.annotations.*;

public class RunnerBase {
    private static final ThreadLocal<TestNGCucumberRunner> testNGCucumberRunner = new ThreadLocal<>();

    public static TestNGCucumberRunner getRunner(){
        return testNGCucumberRunner.get();
    }

    private static void setRunner(TestNGCucumberRunner testNGCucumberRunner1){
        testNGCucumberRunner.set(testNGCucumberRunner1);
    }

    @Parameters({"platformName", "udid", "deviceName", "systemPort",
            "chromeDriverPort", "wdaLocalPort", "webkitDebugProxyPort"})
    @BeforeClass(alwaysRun = true)
    public void setUpClass(@Optional("Android") String platformName,  @Optional("04157df491723b34")String udid, @Optional("mootez")String deviceName, @Optional("10000") String systemPort,
                           @Optional("11000") String chromeDriverPort,
                           @Optional("iOS") String wdaLocalPort,
                           @Optional("iOS") String webkitDebugProxyPort) throws Exception {

        ThreadContext.put("ROUTINGKEY", platformName + "_" + deviceName);

        GlobalParams params = new GlobalParams();
        params.setPlatformName(platformName);
        params.setUDID(udid);
        params.setDeviceName(deviceName);

        switch(platformName){
            case "Android":
                params.setSystemPort(systemPort);
                params.setChromeDriverPort(chromeDriverPort);
                break;
            case "iOS":
                params.setWdaLocalPort(wdaLocalPort);
                params.setWebkitDebugProxyPort(webkitDebugProxyPort);
                break;
        }


new DriverManager().Setup();

        setRunner(new TestNGCucumberRunner(this.getClass()));
    }

    @Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
    public void scenario(PickleWrapper pickle, FeatureWrapper cucumberFeature) throws Throwable {
        getRunner().runScenario(pickle.getPickle());
    }


    @DataProvider
    public Object[][] scenarios() {
        return getRunner().provideScenarios();
    }


    @AfterClass(alwaysRun = true)
    public void tearDownClass()  {
        DriverManager driverManager = new DriverManager();
        if(new Hooks().driver != null){
            new Hooks().driver.quit();
           // driverManager.setDriver(null);
        }
        ServerManager serverManager = new ServerManager();
        if(serverManager.getServer() != null){
            serverManager.getServer().stop();

        }
        if(testNGCucumberRunner != null){
            getRunner().finish();
        }
    }
}

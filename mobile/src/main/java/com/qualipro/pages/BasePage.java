package com.qualipro.pages;

import static org.testng.AssertJUnit.assertEquals;
import com.qualipro.stepdef.Hooks;
import com.qualipro.utils.DriverManager;
import com.qualipro.utils.GlobalParams;
import com.qualipro.utils.TestUtils;
import io.appium.java_client.*;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.Connection;
import io.appium.java_client.android.connection.ConnectionState;
import io.appium.java_client.android.connection.ConnectionStateBuilder;
import io.appium.java_client.android.connection.HasNetworkConnection;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import static io.appium.java_client.android.AndroidMobileCommandHelper.getNetworkConnectionCommand;
import static io.appium.java_client.android.AndroidMobileCommandHelper.setConnectionCommand;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;

public class BasePage {
    public static AppiumDriver<?> driver;
    TestUtils utils = new TestUtils();
public static  String in="";

    public BasePage(){
        new DriverManager().Setup();
        this.driver = new Hooks().driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    
    public static int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public  String createRandomDate(int startYear, int endYear) {
        int day = createRandomIntBetween(1, 28);
        int month = createRandomIntBetween(1, 12);
        int year = createRandomIntBetween(startYear, endYear);
        
        LocalDate  dte=LocalDate.of(year, month, day);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd-MM-uuuu");
   String text = dte.format(formatters);
    return text;

    }
     
    
    
    public String randomString(int n) 
    { 
  
        // length is bounded by 256 Character 
        byte[] array = new byte[256]; 
        new Random().nextBytes(array); 
  
        String randomString 
            = new String(array, Charset.forName("UTF-8")); 
  
        // Create a StringBuffer to store the result 
        StringBuffer r = new StringBuffer(); 
  
        // Append first 20 alphanumeric characters 
        // from the generated random String into the result 
        for (int k = 0; k < randomString.length(); k++) { 
  
            char ch = randomString.charAt(k); 
  
            if (((ch >= 'a' && ch <= 'z') 
                 || (ch >= 'A' && ch <= 'Z') 
                 || (ch >= '0' && ch <= '9')) 
                && (n > 0)) { 
  
                r.append(ch); 
                n--; 
            } 
        } 
  
        // return the resultant string 
        return r.toString(); 
    } 
    public void waitForVisibility(MobileElement e) {
       // driver.manage().timeouts().implicitlyWait(80000, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, TestUtils.WAIT);
        wait.until(ExpectedConditions.visibilityOf(e));
    }
    public  Boolean findchikcbox( int i){
        boolean  ok=false;
        if( driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout["+i+"]/android.widget.RelativeLayout/android.widget.ImageButton").getText()!=null) {

            ok=true;
    }
        return ok;
    }
    public  int sizecheklist(By e){
        List<MobileElement> listchek=(List<MobileElement>)driver.findElements(e);

        return listchek.size();
    }
    public void clickable(MobileElement element,String msg){

        new WebDriverWait(driver, 4000).until(ExpectedConditions.elementToBeClickable(element)).click();
        utils.log().info(msg);

    }
    public void clickable(By e,String msg){

        new WebDriverWait(driver, 4000).until(ExpectedConditions.elementToBeClickable(e)).click();
        utils.log().info(msg);

    }
    public  void  kyeborad(){
        driver.hideKeyboard();
    }

    public void waitForVisibility(By e) {
        WebDriverWait wait = new WebDriverWait(driver, TestUtils.WAIT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(e));
    }

    public void clear(MobileElement e) {
        waitForVisibility(e);
        e.clear();
    }

    public void click(MobileElement e) {
        waitForVisibility(e);
        e.click();
    }

    public void click(MobileElement e, String msg) {
        //waitForVisibility(e);
        utils.log().info(msg);
        e.click();
    }

    public void click(By e, String msg) {
       // waitForVisibility(e);
        utils.log().info(msg);
        driver.findElement(e).click();
    }
    public boolean disabled(By e){
        return driver.findElement(e).isDisplayed();

    }
    public boolean enabled(By e){
        return driver.findElement(e).isEnabled();

    }
    public void sizeWindo(Boolean ok){
        Dimension dimensions = driver.manage().window().getSize();

        utils.log().info(dimensions);

        Double screenHeightStart = dimensions.getHeight() * 0.9;

        int scrollStart = screenHeightStart.intValue();

        Double screenHeightEnd = dimensions.getHeight() * 0.1;

        int  scrollEnd = screenHeightEnd.intValue();

        System.out.println("swipe");
        try{  swipe(0, scrollStart, 0, scrollEnd, 1000);

            utils.log().info("swipe");
            utils.log().info("swipe--->2");





        }catch(Exception e) {
            ok=false;


        }
    }



    public boolean selected(By e,String msg){
        waitForVisibility(e);
        utils.log().info(msg);
        return driver.findElement(e).isSelected();
    }

    public void sendKeys(MobileElement e, String txt) {
        waitForVisibility(e);
        e.sendKeys(txt);
    }
    public void sendKeys(By e, String txt,String msg) {
        waitForVisibility(e);
        utils.log().info(msg);
        driver.findElement(e).sendKeys(txt);
    }

    public void sendKeys(MobileElement e, String txt, String msg) {
      //  waitForVisibility(e);
      //  waitForVisibility(e);
        utils.log().info(msg);
        e.sendKeys(txt);
    }

    public String getAttribute(MobileElement e, String attribute) {
        waitForVisibility(e);
        return e.getAttribute(attribute);
    }
    

    public void  selected(int startx,int endx,int starty,int endy) {
    	int x= startx + (int) Math.round(Math.random() * (startx - endx));
		int y = starty + (int) Math.round(Math.random() * (starty-endy));
	     new TouchAction(driver).tap(PointOption.point(x, y)).waitAction(waitOptions(Duration.ofMillis(6000))).perform();
    }
    public void  swip(){
        Dimension dimensions = driver.manage().window().getSize();

        System.out.println(dimensions);

        Double screenHeightStart = dimensions.getHeight() * 0.9;

        int scrollStart = screenHeightStart.intValue();

        Double screenHeightEnd = dimensions.getHeight() * 0.1;

        int  scrollEnd = screenHeightEnd.intValue();

        utils.log().info("swipe");
        try{  swipe(0, scrollStart, 0, scrollEnd, 1000);

            System.out.println("swipe");
            System.out.println("swipe--->2");





        }catch(Exception e) {
            utils.log().info("swipe error");

        }
    }
    
    public  void save(){

        new TouchAction(driver).tap(PointOption.point(699, 2466)).waitAction(waitOptions(Duration.ofMillis(6000))).moveTo(PointOption.point(699, 2466)).release().perform();

    }


    public String getAttribute(By e, String attribute) {
        waitForVisibility(e);
        return driver.findElement(e).getAttribute(attribute);
    }

    public String getText(MobileElement e, String msg) {
        String txt;
        switch(new GlobalParams().getPlatformName()){
            case "Android":
                txt = getAttribute(e, "text");
                break;
            case "iOS":
                txt = getAttribute(e, "label");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + new GlobalParams().getPlatformName());
        }
        utils.log().info(msg + txt);
        return txt;
    }

    public String getText(By e, String msg) {
        String txt;
        switch(new GlobalParams().getPlatformName()){
            case "Android":
                txt = getAttribute(e, "text");
                break;
            case "iOS":
                txt = getAttribute(e, "label");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + new GlobalParams().getPlatformName());
        }
        utils.log().info(msg + txt);
        return txt;
    }

    public void closeApp() {
        ((InteractsWithApps) driver).closeApp();
    }

    public void launchApp() {
        ((InteractsWithApps) driver).launchApp();
    }
    public  void andScrollToElementUsingUiScrollable4() {
        // return (MobileElement) ((FindsByAndroidUIAutomator) driver).findElementByAndroidUIAutomator(
        //   "new UiScrollable(new UiSelector()" + ".scrollable(true)).scrollIntoView("
        //       + "new UiSelector()."+ childLocAttr +"(\"" + childLocValue + "\"));");
        MobileElement listelm= (MobileElement) ((FindsByAndroidUIAutomator) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"FRANCOIS DUPONT\").instance(0))");


        System.out.println(listelm.getLocation());
        //listelm.click();
        }

        public int sizel(By e){
            List<AndroidElement> list=(List<AndroidElement>)driver.findElements(e);
return list.size();

        }
        public int sizelist(){

            List<MobileElement> listConstat2= ( List<MobileElement>)driver.findElementsByClassName("android.widget.LinearLayout");
            utils.log().info(" ssize 2 :"+listConstat2.size());

            utils.log().info(" ssize 2 :"+listConstat2.toString());
        return listConstat2.size();
        }
    public  void andScrollToElementUsingUiScrollable7(MobileElement st) {
        MobileElement listelm= (MobileElement) ((FindsByAndroidUIAutomator) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                ".scrollIntoView(new UiSelector()." +
                "textContains(\"Treatment decision\").instance(0))");

in=getText(st,"recupere index");

        System.out.println(listelm.getLocation());
        listelm.click();}
    public  void andScrollToElementUsingUiScrollable6() {
        MobileElement listelm= (MobileElement) ((FindsByAndroidUIAutomator) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Rapport d'audit à valider\").instance(0))");


        System.out.println(listelm.getLocation());
        listelm.click();}
    public  void andScrollToElementUsingUiScrollable5() {

        MobileElement listelm= (MobileElement) ((FindsByAndroidUIAutomator) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Audit en tant qu'auditeur\").instance(0))");


        System.out.println(listelm.getLocation());
        listelm.click();}
    public  void andScrollToElementUsingUiScrollable() {
        MobileElement listelm= (MobileElement) ((FindsByAndroidUIAutomator) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))."+"scrollIntoView(new UiSelector().textContains(\"Action à réaliser\").instance(0))");


        System.out.println(listelm.getLocation());
        listelm.click();
    }
    public  void andScrollToElementUsingUiScrollable2() {

        MobileElement listelm= (MobileElement) ((FindsByAndroidUIAutomator) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))."+"scrollIntoView(new UiSelector().textContains(\"Action à suivre\").instance(0))");


        System.out.println(listelm.getLocation());
        listelm.click();
    }
    public  void andScrollToElementUsingUiScrollable3() {

        MobileElement listelm= (MobileElement)((FindsByAndroidUIAutomator) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Audit en tant qu'audité\").instance(0))");


        System.out.println(listelm.getLocation());
        listelm.click();
    }



    public MobileElement iOSScrollToElementUsingMobileScroll(MobileElement e) {
        RemoteWebElement element = ((RemoteWebElement) e);
        String elementID = element.getId();
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("element", elementID);
//	  scrollObject.put("direction", "down");
//	  scrollObject.put("predicateString", "label == 'ADD TO CART'");
//	  scrollObject.put("name", "test-ADD TO CART");
        scrollObject.put("toVisible", "sdfnjksdnfkld");
        driver.executeScript("mobile:scroll", scrollObject);
        return e;
    }

    public By iOSScrollToElementUsingMobileScrollParent(MobileElement parentE, String predicateString) {
        RemoteWebElement parent = (RemoteWebElement)parentE;
        String parentID = parent.getId();
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("element", parentID);
//	  scrollObject.put("direction", "down");
        scrollObject.put("predicateString", predicateString);
//	  scrollObject.put("name", "test-ADD TO CART");
//        scrollObject.put("toVisible", "sdfnjksdnfkld");
        driver.executeScript("mobile:scroll", scrollObject);
        By m = MobileBy.iOSNsPredicateString(predicateString);
        System.out.println("Mobilelement is " + m);
        return m;
    }

    public MobileElement scrollToElement(MobileElement element, String direction) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.5);
        int endX = (int) (size.width * 0.5);
        int startY = 0;
        int endY = 0;
        boolean isFound = false;

        switch (direction) {
            case "up":
                endY = (int) (size.height * 0.4);
                startY = (int) (size.height * 0.6);
                break;

            case "down":
                endY = (int) (size.height * 0.6);
                startY = (int) (size.height * 0.4);
                break;
        }

        for (int i = 0; i < 3; i++) {
            if (find(element, 1)) {
                isFound = true;
                break;
            } else {
                swipe(startX, startY, endX, endY, 1000);
            }
        }
        if(!isFound){
            throw new Exception("Element not found");
        }
        return element;
    }

    public By scrollToElement(By element, String direction) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.5);
        int endX = (int) (size.width * 0.5);
        int startY = 0;
        int endY = 0;
        boolean isFound = false;

        switch (direction) {
            case "up":
                endY = (int) (size.height * 0.4);
                startY = (int) (size.height * 0.6);
                break;

            case "down":
                endY = (int) (size.height * 0.6);
                startY = (int) (size.height * 0.4);
                break;
        }

        for (int i = 0; i < 3; i++) {
            if (find(element, 1)) {
                isFound = true;
                break;
            } else {
                swipe(startX, startY, endX, endY, 1000);
            }
        }
        if(!isFound){
            throw new Exception("Element not found");
        }
        return element;
    }

    public boolean find(final MobileElement element, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            return wait.until(new ExpectedCondition<Boolean>() {
                @Override
                public Boolean apply(WebDriver driver) {
                    if (element.isDisplayed()) {
                        return true;
                    }
                    return false;
                }
            });
        } catch (Exception e) {
            return false;
        }
    }

    public boolean find(final By element, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            return wait.until(new ExpectedCondition<Boolean>() {
                @Override
                public Boolean apply(WebDriver driver) {
                    if (driver.findElement(element).isDisplayed()) {
                        return true;
                    }
                    return false;
                }
            });
        } catch (Exception e) {
            return false;
        }
    }

    public void swipe(int startX, int startY, int endX, int endY, int millis)
            throws InterruptedException {
        TouchAction t = new TouchAction(driver);
        t.press(point(startX, startY)).waitAction(waitOptions(ofMillis(millis))).moveTo(point(endX, endY)).release()
                .perform();
    }
}

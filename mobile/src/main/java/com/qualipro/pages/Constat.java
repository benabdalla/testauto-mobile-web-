package com.qualipro.pages;


import com.qualipro.utils.ExcelUtils;



import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import static org.openqa.selenium.By.id;

public class Constat extends BasePage {

	private final static String pack = "com.saphirconsult.qualiproV3.myapplication:";

	@AndroidFindBy(id= pack+"id/txtobjconstat")
    public static AndroidElement objectconstat;
    @AndroidFindBy(id=pack+"id/txtdescconstat")
    public static AndroidElement descconstat ;
    
 
    @AndroidFindBy(id=pack+"id/autoCompleteTAC")
    public static AndroidElement typeAction;
    @AndroidFindBy(id=pack+"id/autoCompleteEmpC")
    public static AndroidElement concerne;
 

    @AndroidFindBy(id=pack+"id/autoCompleteTC")
    public static AndroidElement typeconstat ;

    @AndroidFindBy(id=pack+"id/autoCompleteGC")
    public static AndroidElement gravite ;
    

    @AndroidFindBy(id=pack+"id/autoCompleteCAC")
    public static AndroidElement champAudite;
    

    @AndroidFindBy(id=pack+"id/btnaddconsat")
    public static AndroidElement addconstat ;

   
    	    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")
    	    public static AndroidElement ajoutbtn ;
public Constat(){
	super();
}

public Constat saisirObjectConstat1() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	ExcelUtils.setExcelFile("Audit");
	utils.log().info(ExcelUtils.getCellData1(0, 4)+"-------------------------->");
	sendKeys(objectconstat,ExcelUtils.getCellData1(1, 4),"saisir object  constat");
	return this;
}

public Constat saisirOdescriptionDuConstat() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	ExcelUtils.setExcelFile("Audit");

	sendKeys(descconstat,ExcelUtils.getCellData1(1, 5),"saisir description constat");
return   this;
}


public Constat saisirTypeDAction() throws Throwable {
	ExcelUtils.setExcelFile("Audit");



sendKeys(typeAction,ExcelUtils.getCellData1(1, 17),"type  constat  ");
return  this;
}


public Constat saisirConcerne() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	ExcelUtils.setExcelFile("Audit");

 sendKeys(concerne,ExcelUtils.getCellData1(1,8),"concerne constat");
 return  this;
}

public  Constat saisirTypeConstat() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	ExcelUtils.setExcelFile("Audit");
	sendKeys(typeconstat,ExcelUtils.getCellData1(1,18),"type constat");
kyeborad();
return  this;
}

public Constat saisirGravite() throws Throwable {
	ExcelUtils.setExcelFile("Audit");

	sendKeys(gravite,ExcelUtils.getCellData1(1,19),"gravite");
	return  this;
}

public Constat saisirChampAudit() throws Throwable {
	ExcelUtils.setExcelFile("Audit");
	String  champ=ExcelUtils.getCellData1(1,2).substring(ExcelUtils.getCellData1(1,2).indexOf(",")+1,ExcelUtils.getCellData1(1,2).length());
	utils.log().info("-->"+champ);
	utils.log().info("-->"+disabled(id(pack+"id/autoCompleteCAC")));

	
	if(enabled(id(pack+"id/autoCompleteCAC"))) {
		//champAudite.sendKeys(champ);
		sendKeys(champAudite,champ,"saisir champ");
		
	}
	else {
	utils.log().info("--> isdesaible"+champ);

		
	}
return   this;
}

public  Constat cliquerSurValiderConstat() throws Throwable {

clickable(addconstat,"valider");
	clickable(ajoutbtn,"confirme");
	return  this;
}
    
    


  

  /*
    MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId("OpenCamera");
    el11.click();
    MobileElement el12 = (MobileElement) driver.findElementById("android:id/button3");
    el12.click();
    MobileElement el13 = (MobileElement) driver.findElementByXPath("//TouchEvSliderGroup[@content-desc=\"NONE\"]");
    el13.click();
    MobileElement el14 = (MobileElement) driver.findElementByXPath("//TouchEvSliderGroup[@content-desc=\"NONE\"]");
    el14.click();
    MobileElement el15 = (MobileElement) driver.findElementById("com.sec.android.app.camera:id/okay");
    el15.click();
    MobileElement el16 = (MobileElement) driver.findElementById("com.saphirconsult.qualipro.myapplication:id/crop_image_menu_crop");
    el16.click();
    MobileElement el17 = (MobileElement) driver.findElementById("android:id/button1");
    el17.click();*/

    

}

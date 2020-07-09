package com.qualipro.pages;





import com.qualipro.utils.ExcelUtils;
import com.qualipro.utils.TestUtils;

import org.testng.Assert;





import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import static io.appium.java_client.MobileBy.AccessibilityId;
import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class PncPage extends BasePage {
	TestUtils utils = new TestUtils();
    public final static String pack="com.saphirconsult.qualiproV3.myapplication:id/";
    
@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.TextView")
public static AndroidElement consulterPnc;


@AndroidFindBy(id=pack+"imageViewadd")
public static AndroidElement ajouterPnc;
@AndroidFindBy(id=pack+"autoCompleteSiteNC")
public static AndroidElement sitepnc;
@AndroidFindBy(id=pack+"txtdatedtectnc")
public static AndroidElement datectee;
@AndroidFindBy(id=pack+"autoCompleteEmpNC")
public static AndroidElement perdetcte;

@AndroidFindBy(id=pack+"autoCompleteTypeNC")
public static AndroidElement typePnc;
@AndroidFindBy(id=pack+"txtnc")
public static AndroidElement  nonConforme;

@AndroidFindBy(id=pack+"autoCompleteProduitNC")
public static AndroidElement produit;
@AndroidFindBy(id=pack+"txtquantitedetect")
public static AndroidElement quantite;
@AndroidFindBy(id=pack+"txtquantiteproduit")
public static AndroidElement qunproduit;

@AndroidFindBy(id=pack+"txtunitenc")
public static AndroidElement unite;

@AndroidFindBy(id=pack+"radioextern")
public static AndroidElement entern;
@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageView")
public static AndroidElement client;

@AndroidFindBy(id=pack+"btnSubmitaddnc")
public static AndroidElement ajoutPnc; 
@AndroidFindBy(xpath="hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
public static AndroidElement verfelPnc;
public static String codepnc="";





public PncPage consulter_PNC() throws Throwable {
click(consulterPnc,"cliquer sur  coonsulter  module actoin");
codepnc=verfelPnc.getText();
return  this;

}

public void cliquer_sur_ajouter_PNC() throws Throwable {
ajouterPnc.click();
}

public void saisir_site_PNC() throws Throwable {
	//driver.hideKeyboard();
	andScrollToElementUsingUiScrollable4();
	kyeborad();
	Thread.sleep(3000);

    
	ExcelUtils.setExcelFile("PNC");

    
sitepnc.sendKeys(ExcelUtils.getCellData1(1,0));

}

public void choisir_le_nom_de_celui_qui_a_detecte_la_PNC() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	ExcelUtils.setExcelFile("PNC");

	perdetcte.sendKeys(ExcelUtils.getCellData1(1,6));
}

public void saisir_date_de_detection() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	//datectee.sendKeys(ExcelUtils.getCellData1(1, 15));
	System.out.println(" date  now  ");
}


public void saisir_type_de_PNC() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	ExcelUtils.setExcelFile("PNC");

	typePnc.sendKeys(ExcelUtils.getCellData1(1,3));
}

public void saisir_Description_de_la_nonconformite() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	ExcelUtils.setExcelFile("PNC");

	nonConforme.sendKeys(ExcelUtils.getCellData1(1, 16));
}
public void saisir_produit() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	ExcelUtils.setExcelFile("PNC");

	produit.sendKeys(ExcelUtils.getCellData1(1, 2));
}
public void saisir_quantite_detectee() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	ExcelUtils.setExcelFile("PNC");

	quantite.sendKeys(ExcelUtils.getCellData1(1, 13));
	swip();

}

public void saisir_quantite_produite() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	ExcelUtils.setExcelFile("PNC");

	qunproduit.sendKeys(ExcelUtils.getCellData1(1, 13));
	
	
}

public void choisir_unite_PNC() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	ExcelUtils.setExcelFile("PNC");

	unite.sendKeys(ExcelUtils.getCellData1(1, 16));
}

public void saisir_actions_immediates(AndroidDriver driver) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//entern.click();
	ExcelUtils.setExcelFile("PNC");

	if(ExcelUtils.getCellData1(1, 9).equals("CLIENT")) {
	MobileElement el2 = (MobileElement) driver.findElementById(pack+"radioextern");
	el2.click();}else {
	MobileElement el3 = (MobileElement) driver.findElementById(pack+"radiointern");
	el3.click();}

	
}

public void cliquer_sur_valider_enregistrement() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	ajoutPnc.click();
}

public void verifier_PNC_et_ajoute() throws Throwable {
String str1,str2;

   str1=codepnc.substring(0,codepnc.indexOf(":"));
   System.out.println(str1);
   Thread.sleep(5000);
   str2=verfelPnc.getText().substring(0,verfelPnc.getText().indexOf(":"));
   System.out.println(str2);
   System.out.println("code recherche:"+str1);
    System.out.println("codever:"+str2);

    int result = 0;
    String code ="";
    try{  result = Integer.parseInt( str1);
       result=result+1;
         code= String.valueOf(result);
        System.out.println(result);

    } catch(Exception e){

       System.out.println(" Ne pas convertir"); }
    if(str2.equals("*")) {
    	try{Assert.assertTrue(str1.equals(code));
    System.out.println( "PNC a été ajoutée avec succès");
}
catch (AssertionError e){
    System.out.println("PNC ne pas  ajoutée");

}
    }else{
       try{Assert.assertTrue(str2.equals("*"));
           System.out.println( "Pnc a été ajoutée avec succès");

       }
        catch (AssertionError e){
           System.out.println("PNC ne pas  ajoutée");

       }
   }
    
  


 /*   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Revenir en haut de la page");
WaitUntilElementVisible(el1);
    el1.click();*/


	
	

}

@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]")
public static AndroidElement consulter;
@AndroidFindBy(id=pack+"txttraitnc")
public static AndroidElement traitmentNc;
@AndroidFindBy(id=pack+"autoCompleteTypeTrai")
public static AndroidElement typtraitement;
@AndroidFindBy(id=pack+"autoCompleteResTrai")
public static AndroidElement responsabletraitement;



@AndroidFindBy(id=pack+"txtdatetrait")
public static AndroidElement dateDNc;
@AndroidFindBy(id=pack+"autoCompleteResSuiv")
public static AndroidElement respoSuiv;
@AndroidFindBy(id=pack+"btnSubmitncdecision")
public static AndroidElement Submitncdecision;
@AndroidFindBy(id=pack+"ncdectrait")
public static AndroidElement index;
	@AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[3]/android.widget.LinearLayout[3]")
	public static AndroidElement traitmentdecision;

public static String verfidnc="";

public void cliquer_sur_Traitement_de_décision() throws Throwable {

	MobileElement td=scrollToElement(traitmentdecision,"down");
	verfidnc=getText(index,"recuper indice");
	click(td,"cliquer traitement  de decision");


      Thread.sleep(4000);

      click(AccessibilityId("‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎"),"retour");

     click(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[3]/android.widget.LinearLayout[3]/android.widget.TextView[2]"),"consulter");


 

			 //getText(index,"recupere");

  	consulter.click();
  	


}

public void saisir_le_responsable_de_traitement() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	System.out.println(ExcelUtils.getCellData1(1,6));
	ExcelUtils.setExcelFile("PNC");
	sendKeys(id(pack+"autoCompleteResTrai"),ExcelUtils.getCellData1(1,6),"saisir  respo de tritment");



	//respoSuiv.sendKeys(ExcelUtils.getCellData1(0,6));
}

public void saisir_délai_de_traitement() throws Throwable {
	ExcelUtils.setExcelFile("PNC");
sendKeys(id(pack+"txtdatetrait"),ExcelUtils.getCellData1(1,21),"saisir date   det  traitment ");
	//dateDNc.sendKeys();
    System.out.println("date");


}

public void saisir_le_traitement_de_NC() throws Throwable {
    // Write code here that turns the phrase above into concrete actionss
	ExcelUtils.setExcelFile("PNC");
	traitmentNc.sendKeys(ExcelUtils.getCellData1(1,3));
    System.out.println("traitment nc");
kyeborad();
	
}

public void saisir_le_type_de_traitement_de_NC() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	ExcelUtils.setExcelFile("PNC");
	
	typtraitement.sendKeys(ExcelUtils.getCellData1(1,4));
    System.out.println("type");

}

public void saisir_le_nom_du_responsable_de_suivi() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	ExcelUtils.setExcelFile("PNC");
	respoSuiv.sendKeys(ExcelUtils.getCellData1(1,6));
    System.out.println("respo suiv");

}

public void cliquer_sur_valider_décision() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	//Submitncdecision.click();
	click(id("com.saphirconsult.qualiproV3.myapplication:id/btnSubmitncdecision"),"save decision");
    //System.out.println("enri");

}

public void vérifier_la_décision_est_prise_en_considération() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	String str1 = "",str2;
	//android.widget.TextView[@content-desc="Sync"]

	click(xpath("//android.widget.TextView[@content-desc='Sync']"),"actualiser");
	   str2=getText(index,"recupere");
	   System.out.println(str2);
	   System.out.println("index1:"+verfidnc);
	    System.out.println("index 2:"+str2);

	    int result = 0;
	    String code ="";
	    try{  result = Integer.parseInt( verfidnc);
	       result=result+1;
	         code= String.valueOf(result);
	        System.out.println(result);

	    } catch(Exception e){

	       System.out.println(" Ne pas convertir"); }
	    try{Assert.assertTrue(str2.equals(code));
        System.out.println( "prendre décision avec succès");

    }
     catch (AssertionError e){
        System.out.println("N'a pas pris de décisions");

    }


}
	public PncPage log_out(){
		click(id("com.saphirconsult.qualiproV3.myapplication:id/action_logout"),"cliquer deconenxion");
		return this;
	}

@AndroidFindBy(id=pack+"btntoinvest")
public static AndroidElement btninvestigation;
@AndroidFindBy(id=pack+"autoCompleteResinvest")
public static AndroidElement respoInv;
@AndroidFindBy(id=pack+"txtdateinvest")
public static AndroidElement dateInvi;
@AndroidFindBy(id=pack+"txtinvestigation")
public static AndroidElement investigation;
@AndroidFindBy(id=pack+"autoCompleteApprInvest")
public static AndroidElement apprInvest;
@AndroidFindBy(id=pack+"btnSubmitncinvest")
public static AndroidElement saveInve;


	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout")
	public static AndroidElement consulterInvEffu;

	@AndroidFindBy(id=pack+"txtncrappinvest")
	public static AndroidElement txtncrappinvest;

	@AndroidFindBy(id=pack+"btnSubmitinvesteff")
	public static AndroidElement btnSubmitinvesteff;
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[3]/android.widget.LinearLayout[1]")
public static MobileElement investigationaeff;


public PncPage cliquer_sur_Nécessite_investigation() throws Throwable {
    // Write code here that turns the phrase above into concrete action
//
//	investigation.click();
	click(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")," need for investigation");
return  this;
}

public PncPage saisir_responsable_investigation() throws Throwable {
    // Write code here that turns,
	kyeborad();
	ExcelUtils.setExcelFile("PNC");

	sendKeys(respoInv,ExcelUtils.getCellData1(1,6),
		"responsabble investigation"+ExcelUtils.getCellData1(1,6));

return   this;

}

public PncPage saisir_délai_investigation() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	ExcelUtils.setExcelFile("PNC");

	sendKeys(dateInvi,ExcelUtils.getCellData1(1,21)
		,"date  investigation "+ExcelUtils.getCellData1(1,21));
return  this;
}

public PncPage saisir_investigation() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	ExcelUtils.setExcelFile("PNC");

	sendKeys(investigation,ExcelUtils.getCellData1(1,5),
			"investigation"+ExcelUtils.getCellData1(1,5));
return this;
}

public PncPage choisir_approbateur_invstigation() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	ExcelUtils.setExcelFile("PNC");

	sendKeys(apprInvest,ExcelUtils.getCellData1(1,6),
			"approbateur investigation"+ExcelUtils.getCellData1(1,6));
return this;
}

public PncPage valider_partie_investigation() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	//utils.log().info(getText(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button"),"valide investigation"));
click(saveInve,"valider investigation ");
return this;
}


public PncPage cliquer_sur_investigation_a_effectuer() throws Throwable {
    // Write code here that turns the phrase above into concrete actions

MobileElement el=scrollToElement(investigationaeff,"down");
	verfidnc=getText(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[3]/android.widget.LinearLayout[1]/android.widget.TextView[1]"),"recuper indice");
	click(el,"cliquer sur investigation effectuer");
	return this;
}

public PncPage consulter_la_fiche_à_investiger() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	//ExcelUtils.setExcelFile("PNC");

	click(consulterInvEffu,"consulter investigation effectuer");
//click(consulterInvEffu,"consulter investigation effcuter");

return  this;
}

public PncPage saisir_rapport_investigation() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	ExcelUtils.setExcelFile("PNC");

	sendKeys(txtncrappinvest,ExcelUtils.getCellData1(1,8)
		,"rapport  ivestigation  effcuter"+ExcelUtils.getCellData1(1,8));
return this;
}



public PncPage cliquer_sur_valider_investigation() throws Throwable {
    // Write code here that turns the phrase above into concrete actions

	click(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.Button"),"save ivestigation to  preform");
	//click(xpath("//android.widget.TextView[@content-desc='Sync']"),"actualiser");
return this;
}

public void verifier_passage_vers_l_approbateur_investigation() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	String str1 = "",str2;
	//android.widget.TextView[@content-desc="Sync"]

	click(xpath("//android.widget.TextView[@content-desc='Sync']"),"actualiser");
	str2=getText(index,"recupere");
	System.out.println(str2);
	System.out.println("index1:"+verfidnc);
	System.out.println("index 2:"+str2);

	int result = 0;
	String code ="";
	try{  result = Integer.parseInt( verfidnc);
		result=result+1;
		code= String.valueOf(result);
		System.out.println(result);

	} catch(Exception e){

		System.out.println(" Ne pas convertir"); }
	try{Assert.assertTrue(str2.equals(code));
		System.out.println( "prendre décision avec succès");

	}
	catch (AssertionError e){
		System.out.println("N'a pas pris de décisions");

	}

}

@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]")
public  static MobileElement  investigationApprove;
@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[3]/android.widget.LinearLayout[2]")
public  static MobileElement  investigationapprove;
@AndroidFindBy(id=pack+"checkapprinvest")
public  static MobileElement chekapprove;

@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.Button")
public  static MobileElement saveapprove;
	public PncPage cliquer_sur_ficher_à_approuver() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		click(investigationApprove,"consulter a ficher");
		click(chekapprove,"chek investigation approved");
		return this;
	}


	public void cliquer_sur_investigation_approuvé() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		MobileElement el=scrollToElement(investigationapprove,"down");
		verfidnc=getText(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[3]/android.widget.LinearLayout[2]/android.widget.TextView[1]"),"recuper indice ");
		click(el,"cliquer sur investigation effectuer");

	}


	public void verifier_etat_PNC() {
		click(saveapprove,"investigation to  approve");
		// Write code here that turns the phrase above into concrete actions
		String str1 = "",str2;
		//android.widget.TextView[@content-desc="Sync"]

		click(xpath("//android.widget.TextView[@content-desc='Sync']"),"actualiser");
		str2=getText(index,"recupere");
		System.out.println(str2);
		System.out.println("index1:"+verfidnc);
		System.out.println("index 2:"+str2);

		int result = 0;
		String code ="";
		try{  result = Integer.parseInt( verfidnc);
			result=result+1;
			code= String.valueOf(result);
			System.out.println(result);

		} catch(Exception e){

			System.out.println(" Ne pas convertir"); }
		try{Assert.assertTrue(str2.equals(code));
			System.out.println( "prendre décision avec succès");

		}
		catch (AssertionError e){
			System.out.println("N'a pas pris de décisions");


		}

}

	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[4]/android.widget.LinearLayout[1]")
	public  static MobileElement descisionavalide;
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]")
	public  static MobileElement consulterdescision;
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")
	public  static MobileElement validerDes;


	public void consulter_décision_à_valider() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		MobileElement el= scrollToElement(descisionavalide,"down");
		verfidnc=getText(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[3]/android.widget.LinearLayout[1]/android.widget.TextView[1]"),"recuper indice ");
		click(el,"cliquer sur investigation effectuer");
	}


	public void cliquer_sur_décison_à_valider() {
		// Write code here that turns the phrase above into concrete actions
		click(consulterdescision,"consulter desicion");
	}


	public void saisir_à_prendre(String string) {
		// Write code here that turns the phrase above into concrete actions
		if(string.equals("Validation")){click(validerDes,"valider rapport ");}else{
click(xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]"),"refuse");
		}
	}


	public void verifier_Etat_fiche_Pnc() {
		// Write code here that turns the phrase above into concrete actions
		String str1 = "",str2;
		//android.widget.TextView[@content-desc="Sync"]

		click(xpath("//android.widget.TextView[@content-desc='Sync']"),"actualiser");
		str2=getText(index,"recupere");
		System.out.println(str2);
		System.out.println("index1:"+verfidnc);
		System.out.println("index 2:"+str2);

		int result = 0;
		String code ="";
		try{  result = Integer.parseInt( verfidnc);
			result=result+1;
			code= String.valueOf(result);
			System.out.println(result);

		} catch(Exception e){

			System.out.println(" Ne pas convertir"); }
		try{Assert.assertTrue(str2.equals(code));
			System.out.println( "prendre décision avec succès");

		}
		catch (AssertionError e){
			System.out.println("N'a pas pris de décisions");


		}
	}

	@AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[4]/android.widget.LinearLayout[3]")
			public  static MobileElement  consulterPncAsuivre;
	@AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]")
	public  static MobileElement  consultepncasuivr;
	@AndroidFindBy(id=pack+"datencclot")
	public  static MobileElement dateclot;
	@AndroidFindBy(id=pack+"txtncrappclot")
	public  static MobileElement rappclot;
	@AndroidFindBy(id=pack+"btnSubmitnccloture")
	public  static MobileElement subclot;




	public void consulter_pnc_a_suivre() throws Exception {
		MobileElement el= scrollToElement(consulterPncAsuivre,"down");
		verfidnc=getText(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[4]/android.widget.LinearLayout[3]/android.widget.TextView[1]"),"recupere");
		click(el,"cliquer sur investigation effectuer");
	}

	public void saisir_date_clotureAction_N() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		click(consultepncasuivr,"consulter ficher");
		ExcelUtils.setExcelFile("PNC");

		sendKeys(dateclot,ExcelUtils.getCellData1(1,21),"date clot");
		kyeborad();
	}

	public void saisir_rapport_de_clôture() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		ExcelUtils.setExcelFile("PNC");

sendKeys(rappclot,ExcelUtils.getCellData1(1,8),"rapport clot");
	}

	public void cliquer_sur_valider_cloture() {
		// Write code here that turns the phrase above into concrete actions
click(subclot,"save clot");
	}

	public void la_fiche_PNC_est_cloturée() {
		// Write code here that turns the phrase above into concrete actions
String str2="";
		click(xpath("//android.widget.TextView[@content-desc='Sync']"),"actualiser");
		str2=getText(index,"recupere");
		System.out.println(str2);
		System.out.println("index1:"+verfidnc);
		System.out.println("index 2:"+str2);

		int result = 0;
		String code ="";
		try{  result = Integer.parseInt( verfidnc);
			result=result+1;
			code= String.valueOf(result);
			System.out.println(result);

		} catch(Exception e){

			System.out.println(" Ne pas convertir"); }
		try{Assert.assertTrue(str2.equals(code));
			System.out.println( "prendre décision avec succès");

		}
		catch (AssertionError e){
			System.out.println("N'a pas pris de décisions");

		}

	}

	@AndroidFindBy(id=pack+"datenctraitement")
	public  static MobileElement datenctraitement;
	@AndroidFindBy(id=pack+"txtcoutTraitnc")
	public  static MobileElement txtcoutTraitnc;
	@AndroidFindBy(id=pack+"txtqterejet")
	public  static MobileElement txtqterejet;
	@AndroidFindBy(id=pack+"txtqtedeclass")
	public  static MobileElement txtqtedeclass;
	@AndroidFindBy(id=pack+"txtpctdeprec")
	public  static MobileElement txtpctdeprec;
	@AndroidFindBy(id=pack+"txtqteaccept")
	public  static MobileElement txtqteaccept;
	@AndroidFindBy(id=pack+"txtraptrait")
	public  static MobileElement txtraptrait;
	@AndroidFindBy(id=pack+"btnSubmitnctraitement")
	public  static MobileElement btnSubmitnctraitement;


	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[4]/android.widget.LinearLayout[2]")
	public  static MobileElement traitmPnc;
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]")
	public  static MobileElement consultetraitPnc;


	public void cliquer_sur_Traitement_des_PNC() throws Exception {
		MobileElement el= scrollToElement(traitmPnc,"down");
		verfidnc=getText(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[4]/android.widget.LinearLayout[3]/android.widget.TextView[1]"),"recupere");
		click(el,"cliquer sur investigation effectuer");

	}


	public void cliquer_sur_phase_traitée() {
		click(consultetraitPnc,"consulter ficher  pnc traiter");

	}


	public void saisir_le_rapport_de_traitement() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		MobileElement el= scrollToElement(txtraptrait,"down");

		ExcelUtils.setExcelFile("PNC");
		sendKeys(el,ExcelUtils.getCellData1(1,8));	}


	public void saisir_la_date_de_traitement() throws Exception {
		// Write code here that turns the phrase above into concrete actions

		ExcelUtils.setExcelFile("PNC");
		sendKeys(datenctraitement,ExcelUtils.getCellData1(1,21),"saisir date  de   tritment");
 kyeborad();
	}



	public void saisir_le_cout_de_traitement() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		ExcelUtils.setExcelFile("PNC");
		sendKeys(txtcoutTraitnc,"0","cout de traitment ");
	}

	public void saisir_la_quantité_rejetée() {
		// Write code here that turns the phrase above into concrete actions
		sendKeys(txtqterejet,"0","cout de traitment ");


	}

	public void saisir_la_quantité_acceptée() {
		// Write code here that turns the phrase above into concrete actions
		sendKeys(txtqteaccept,"0","cout de traitment ");
		swip();
	}

	public void saisir_la_quantité_déclassee() {
		// Write code here that turns the phrase above into concrete actions
		sendKeys(txtqtedeclass,"0","cout de traitment ");
	}

	public void saisir_le_pourcentage_de_dépréciation() {
		// Write code here that turns the phrase above into concrete actions
		sendKeys(txtpctdeprec,"0","cout de traitment ");
	}

	public void vérifier_calcul_cout_traitement_et_valeur_déclassé() {
		// Write code here that turns the phrase above into concrete actionsc
		click(btnSubmitnctraitement,"valider");

	}




	public void fiche_PNC_traitée() {
		// Write code here that turns the phrase above into concrete actions
		String str2="";
		click(xpath("//android.widget.TextView[@content-desc='Sync']"),"actualiser");
		str2=getText(index,"recupere");
		System.out.println(str2);
		System.out.println("index1:"+verfidnc);
		System.out.println("index 2:"+str2);

		int result = 0;
		String code ="";
		try{  result = Integer.parseInt( verfidnc);
			result=result+1;
			code= String.valueOf(result);
			System.out.println(result);

		} catch(Exception e){

			System.out.println(" Ne pas convertir"); }
		try{Assert.assertTrue(str2.equals(code));
			System.out.println( "prendre décision avec succès");

		}
		catch (AssertionError e){
			System.out.println("N'a pas pris de décisions");

		}
	}

}

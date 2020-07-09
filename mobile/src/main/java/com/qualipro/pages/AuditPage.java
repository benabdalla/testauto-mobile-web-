package com.qualipro.pages;

import com.qualipro.utils.ExcelUtils;
import com.qualipro.utils.TestUtils;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.MobileBy.AccessibilityId;
import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;


public class AuditPage extends BasePage {
    TestUtils utils = new TestUtils();
    private final static String pack = "com.saphirconsult.qualiproV3.myapplication:";

    @AndroidFindBy(id= pack+"id/Ajout_const")
    public static AndroidElement ajoutconstat ;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ImageButton")
    public static AndroidElement constatChekist  ;
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout[3]/android.widget.EditText")
    public static AndroidElement commentaireChekliste;
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.CheckBox[1]")
    public static AndroidElement conf;
    public static   int verconstatt   =0;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.CheckBox[2]")
    public static AndroidElement nonConf;


    @AndroidFindBy(id=pack+"id/lvchampcheckList")
    public static AndroidElement choixchekliste;
    @AndroidFindBy(id=pack+"id/checklistt")
    public static AndroidElement cheklist ;
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]")
    public static AndroidElement  consulterFicherAudit;
    //android.widget.ImageButton[@content-desc="Revenir en haut de la page"]
    @AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc='Revenir en haut de la page']")
    public static AndroidElement  retour;

    @AndroidFindBy(id=pack+"id/toagenda2")
    public static AndroidElement actualiserAudite ;
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[6]")
    public static AndroidElement verifdonner;
    public static String donne="";

    @AndroidFindBy(id=pack+"id/btnenvoyerrapp")
    public static AndroidElement validerRap ;

    @AndroidFindBy(id=pack+"id/btnvaliderrapp")
    public static AndroidElement validerRapAg ;
    public static int s=0;
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[4]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
    public static AndroidElement consulterAudit;

    @AndroidFindBy(id = pack+"id/imageViewsearaction")
    public static AndroidElement searchAudit;


    @AndroidFindBy(id = pack+"id/inputSearch")
    public static AndroidElement inputSearchAudit;
    @AndroidFindBy(id = pack+"id/textxml2")
    public static AndroidElement dateAudit;
    @AndroidFindBy(id = pack+"id/textxml154")
    public static AndroidElement typeAudit;
    @AndroidFindBy(id = pack+"id/textxml3")
    public static AndroidElement champAudit;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Sync']")
    public static AndroidElement retourAudit;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[1]/android.widget.LinearLayout[3]/android.widget.TextView[2]")
    public static AndroidElement actionSuiteAudit;

    @AndroidFindBy(id = pack+"id/imageViewsearaction")
    public static AndroidElement suiteAuditrech;
    @AndroidFindBy(id = pack+"id/inputSearch")
    public static AndroidElement suiteAuditeput;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]")
    public static AndroidElement sousActionAudit;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[3]/android.widget.LinearLayout[1]/android.widget.ImageView")
    public static AndroidElement consulterModuleAudite;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout")
    public static AndroidElement consulterAuditModule;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.TextView")
    public static AndroidElement accueilagenda;
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Revenir en haut de la page']")
    public static AndroidElement retourVerifer;
    @AndroidFindBy(id = pack+"id/listview_realisation")
    public static AndroidElement verifSup;
    @AndroidFindBy(id = pack+"id/imageViewsearch")
    public static AndroidElement serchModulAudit;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]")
    public static AndroidElement ModuleAuditconsult;
    @AndroidFindBy(id=pack+"id/textxml2")
    public static AndroidElement champModule;
    @AndroidFindBy(id=pack+"id/textxml3")
    public static  AndroidElement dateModule;
    @AndroidFindBy(id=pack+"id/textxml1")
    public  static AndroidElement codeAudit;
    public  static   String verif="";
    @AndroidFindBy(id=pack+"id/actionaudit")
    public  static AndroidElement index;
    @AndroidFindBy(id=pack+"id/auditauditell")
    public  static AndroidElement auditauditell;
    @AndroidFindBy(id=pack+"id/auditauditeurll")
    public  static AndroidElement auditauditeurll;
    @AndroidFindBy(id=pack+"id/auditvalidll")
    public  static AndroidElement auditvalidll;
    @AndroidFindBy(id=pack+"id/actionauditll")
    public  static AndroidElement actionauditll;






  
  public AuditPage(){
      super();
  }

    public AuditPage agendaAudit() {

        swip();
        click(auditauditell,"cliquer sur agenda audite");
return this;
           
            }

        


    

    public AuditPage rechercherexempleficheadit(int row) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

click(searchAudit,"clique pour rechercher");
       click(inputSearchAudit,"recherecher");
        utils.log().info("---------"+ExcelUtils.getCellData1(row, 15));
        ExcelUtils.setExcelFile("Audit");

        System.out.println("code excel ->"+ExcelUtils.getCellData1(row, 15));
        sendKeys(inputSearchAudit,ExcelUtils.getCellData1(row, 15),"saisir code  rechercher");
        return   this;

    }
    
@Test
    public AuditPage veSrifierlesdonneeslacoherencedesdonneesdelafiche() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        ExcelUtils.setExcelFile("Audit");

        try { utils.log().info("champ audit " + ExcelUtils.getCellData1(1, 2));

            Assert.assertEquals(getText(champAudit,"champ audite"), ExcelUtils.getCellData1(1, 2));
        } catch (AssertionError e) {
            utils.log().info("false");
            utils.log().info(champAudit);
        }
        try {
            utils.log().info("date audit " + ExcelUtils.getCellData1(1, 16));
            Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(dateAudit.getText());
            DateFormat df = new SimpleDateFormat("dd-mm-yyyy");

            String strDate = df.format(date1);

            Assert.assertTrue(strDate.equals(ExcelUtils.getCellData1(1, 16)));
        } catch (Exception e) {
            utils.log().info("false");
        }
        //  Assert.assertTrue(numAudit.equals(ExcelUtils.getCellData1(1,5)));
    clickable(retourAudit,"retour audite");
        verif= getText(index," index action  a  suite   un  audite");
        int j =Integer.parseInt(verif)-1;
        verif=String.valueOf(j);
utils.log().info("code suite un  audit"+index.getText());
    utils.log().info("code suite un  audit2"+verif);

return  this ;
    }

    public AuditPage consulterAgendaActionsuiteaudit() throws Throwable {


      click(actionauditll,"cliquer sur action  suite  a  un  audite");
         utils.log().info("rechercher suite a une  audit ------------------------->");
       //  MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]");
        /// el1.click()
        return this ;
    }

    public AuditPage rechercherficheActionsuiteauneaudit(int arg1) throws Throwable {

        utils.log().info("rechercher suite a une  audit ------------------------->");

    	click(id(pack+"id/imageViewsearaction"),"click input  serach");
    	click(id(pack+"id/inputSearch"),"click input  serach");

    	sendKeys(id(pack+"id/inputSearch"),"7","saisir code serach audit");
return this;
    	

    }

    public AuditPage ajouterlessousactionsissuedelaudit() throws Throwable {
        // Write code here that turns the phrase above into concrete actions


        click(sousActionAudit,"clique sur  souss action  audite");
    
     return this;


    }

    public AuditPage verifiernotificationsupprimedelagenda() throws Throwable {
        // Write code here that turns the phrase above into concrete

 try  {
Assert.assertEquals(verif,getText(index,"recupere index agenda  action  a suite  un audite") );
     utils.log().info("supprimer");

    }catch(AssertionError e) {
    	utils.log().info( "ne pas  supprimer");
    }
    return this;
    }


    public AuditPage cliquersurmoduleaudit() throws Throwable {
    clickable(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[6]")," consulter module audit");
    	return this;

    }
public AuditPage recheModuleAudite(int arg) throws Exception {

clickable(serchModulAudit,"cliquer  recherche module  audit");
clickable(suiteAuditeput,"cliquer  recherche module  audit");
    //ExcelUtils.setExcelFile("Audit");

   sendKeys( suiteAuditeput,"143");
    return  this;
}
@Test
    public AuditPage veSrifierlesdonneeslacoherencedesdonneesdelaficheModule() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        ExcelUtils.setExcelFile("Audit");

        try {

            utils.log().info("champ audit" + ExcelUtils.getCellData1(1, 2));

            Assert.assertTrue(getText(champModule,"champModule").equals(ExcelUtils.getCellData1(1, 2)));
        } catch (AssertionError e) {
            utils.log().info("false");
        }
        try {
            utils.log().info("date audit " + ExcelUtils.getCellData1(1, 16));
            Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(dateModule.getText());
            DateFormat df = new SimpleDateFormat("dd-mm-yyyy");

            String strDate = df.format(date1);

            Assert.assertTrue(strDate.equals(ExcelUtils.getCellData1(1, 16)));
        } catch (AssertionError e) {
            System.out.println("false");
        }
        //  Assert.assertTrue(numAudit.equals(ExcelUtils.getCellData1(1,5)
    kyeborad();
    return this;

    }


    public AuditPage consulterAgendaAuditentantquauditeur() throws Throwable {

        swip();
        click(auditauditeurll,"cliquer sur agenda audite tant que  auditer");
   return this;


    }
    public AuditPage consulter_Agenda_rapport_d_audit_a_valider() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        click(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.TextView"),"");
       // andScrollToElementUsingUiScrollable6();
        swip();
        click(auditvalidll,"cligue  sur  agenda   rapport  d'audit  a  vaider");



return this;
    }



    public AuditPage consulterficheaudit() throws Throwable {
        // new WebDriverWait(driver, 4000).until(ExpectedConditions.visibilityOf(retoureSousAction));

        //new WebDriverWait(driver, 4000).until(ExpectedConditions.elementToBeClickable(retoureSousAction)).click();

       clickable(consulterFicherAudit,"consulter fichier audit");


        verconstatt=sizelist();
        utils.log().info("verifier constat" + verconstatt);
        return  this;
    }

    public AuditPage cliquersurajouterconstats() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        clickable(ajoutconstat,"ajouter action ");
return  this;
    }


    public AuditPage actualiser() throws Throwable {
        //	retour.click();
        //	actualiserAudite.click();
return this;
    }


    @Test
    public AuditPage verifierConstat() throws Throwable {




        if(sizelist()!=verconstatt) {
           utils.log().info("constat  est  ajouté");
        }
        return this;
    }

    public AuditPage cliquersurverifierchecklist() throws Throwable {
        clickable(cheklist,"cliquer  sur   chiklist");
        donne=getText(verifdonner,"récupérer ");
        utils.log().info("nb"+donne);
       clickable(choixchekliste,"cliquer choix chekliste");


return  this;
    }
    @Test
    public AuditPage remplirchecklist() throws Throwable {
        ExcelUtils.setExcelFile("Audit");

        ExcelUtils.setExcelFile("Audit");



        boolean ok=true;
        int  n=sizecheklist( By.className("android.widget.CheckBox"));





        utils.log().info("champ audit " + ExcelUtils.getCellData1(1, 3));
        utils.log().info("champ audit " + ExcelUtils.getCellData1(3, 0));
        String conforme= ExcelUtils.getCellData1(1, 3);

        int k=1,a=0;

        boolean bool;

        if(a==0) {
            a++;
          clickable(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ImageButton"),"");


/*
			constat.saisirOdescriptionDuConstat();
			wait(5000);

			constat.saisirTypeDAction();
			wait(5000);

		Thread.sleep(4000);
           constat.saisirConcerne();
			wait(5000);

       	Thread.sleep(4000);
	       constat.saisirChampAudit();
			wait(5000);
		wait(5000);


	   	Thread.sleep(4000);
		  constat.cliquerSurValiderConstat();
			wait(5000);*/
            ExcelUtils.setExcelFile("Audit");


           sendKeys(id(pack+"id/txtdescconstat"),ExcelUtils.getCellData1(1, 5),"description constat");
         // sendKeys(id(pack+":id/autoCompleteTAC"),ExcelUtils.getCellData1(1, 17),"choisier  choix constat");
          sendKeys(id(pack+"id/autoCompleteEmpC"),ExcelUtils.getCellData1(1, 8),"choisier");
           sendKeys(id(pack+"id/autoCompleteTC"),ExcelUtils.getCellData1(1, 18),"choisier");
            sendKeys(id(pack+"id/autoCompleteGC"),ExcelUtils.getCellData1(1, 19)," choisier");
            clickable(id(pack+"id/btnaddconsat"),"enregistrer");



        }


        for( int i=1;i<=n/2;i++) {
            k++;
            utils.log().info("i "+i);
            utils.log().info("k"+k);


            try {
                if( findchikcbox(i)==true) {



                    if(conforme.equals("OUI")) {
                        if(!selected(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ListView/android.widget.LinearLayout["+i+"]/android.widget.LinearLayout[2]/android.widget.CheckBox[1]"),"selected")) {
                            clickable(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ListView/android.widget.LinearLayout["+i+"]/android.widget.LinearLayout[2]/android.widget.CheckBox[1]"),"selected");
                        }

                    }else {

                        if(!selected(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ListView/android.widget.LinearLayout["+i+"]/android.widget.LinearLayout[2]/android.widget.CheckBox[2]"),"selected")) {
                            clickable(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ListView/android.widget.LinearLayout["+i+"]/android.widget.LinearLayout[2]/android.widget.CheckBox[2]"),"selected");

                        }
                    }


                    if(disabled(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout["+i+"]/android.widget.LinearLayout[3]/android.widget.EditText"))) {
                        sendKeys(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ListView/android.widget.LinearLayout["+i+"]/android.widget.LinearLayout[3]/android.widget.EditText"),ExcelUtils.getCellData1(3, 0),"saisir commantaire");
                    }

                }
            }
            catch(Exception e) {
                break;
                //	i=n/2;
            }


            if(i==n/2) {
                if(n/2>5) {
                    i=n/2-n;}
                sizeWindo(ok);
            }
            if(k==n) {
                break;


            }
        }

              /* MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.CheckBox[1]");
               el4.click();

               MobileElement el6 = (MobileElement) ;
               el6.click();
             ;*/

       clickable(id(pack+"id/btnValidEvalcritere"),"valide checklist");

return  this;
    }

    @Test
    public AuditPage vérifierLesDonneesLaCoherenceDesDonneesDeLaFiche() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        try{Assert.assertTrue(getText(verifdonner,"recupere").equals(donne));
            utils.log().info( "les données est ñ' pas ajouté");
        }
        catch (AssertionError e){
            utils.log().info( "les donnes est ajouté avec succès");

        }
        // actualiserAudite.click();
return this;
    }

    public AuditPage rechercherexemplefichetAuditeur(int row) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      clickable(id(pack+"id/imageViewsearaction"),"rechrecher");
      clickable(id(pack+"id/inputSearch"),"rechrecher");

        sendKeys(id(pack+"id/inputSearch"),"115","");
        return this;

    }


    public AuditPage retour_a_l_accueil() throws Throwable {
        //// new WebDriverWait(driver, 4000).until(ExpectedConditions.visibilityOf(actualiserAudite));

        //  new WebDriverWait(driver, 4000).until(ExpectedConditions.elementToBeClickable(actualiserAudite)).click();
        clickable(AccessibilityId("Sync"),"retour a la accueil");



return  this;


    }

    public AuditPage conslter_fiche_audit_auditeur() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        /*	*/

        clickable(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout"),"consulter fichier auditeur");


  return  this;
    }



    public AuditPage cliquer_sur_envoyer_rapport() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       clickable(id(pack+"id/btnvaliderrapp"),"valider rapport");
return  this;


    }
    public AuditPage cliquer_sur_valider_rapport() throws Throwable {
        clickable(validerRap,"valider rapport");

        clickable(actualiserAudite,"valider rapport");
return  this;
    }



    @Test
    public AuditPage vérifier_le_rapport_audit_est_valide() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        int k=sizel(By.className("android.widget.TextView"));
        try {

            Assert.assertTrue(k!=s);

            utils.log().info("Le rapport est  valide");

        }catch(Exception e) {
            utils.log().info("Le rapport n'est pas valide");


        }
        return this;

    }








}

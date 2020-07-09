package com.qualipro.pages;

import com.qualipro.utils.ExcelUtils;
import com.qualipro.utils.TestUtils;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.testng.Assert;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class Reclamation extends BasePage {
    TestUtils utils = new TestUtils();
    public final static String pack = "com.saphirconsult.qualiproV3.myapplication:id/";

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[3]")
    public static AndroidElement consulterRec;
    @AndroidFindBy(id = pack + "imageViewadd")
    public static AndroidElement ajouterRec;
    @AndroidFindBy(id = pack + "txtdaterecclt")
    public static AndroidElement ajouterDateRecla;
    @AndroidFindBy(id = pack + "autoCompleteTypeRec")
    public static AndroidElement ajoutertypeRec;
    @AndroidFindBy(id = pack + "txtrec")
    public static AndroidElement ajoutertextRec;
    @AndroidFindBy(id = pack + "autoCompleteclientREc")
    public static AndroidElement ajouterclientREc;
    @AndroidFindBy(id = pack + "autoCompleteSite")
    public static AndroidElement ajoutersiteREc;
    @AndroidFindBy(id = pack + "autoCompleteSiteProcessRec")
    public static AndroidElement ajouterprocessREc;

    @AndroidFindBy(id = pack + "autoCompleteRecp")
    public static AndroidElement ajouterrecepitoinaireREc;
    @AndroidFindBy(id = pack + "checkRetourClt")
    public static AndroidElement checkRetourClt;
    @AndroidFindBy(id = pack + "btnSubmitaddreclt")
    public static AndroidElement btnSubmitaddreclt;
    public static String codepnc = "";
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
    public static AndroidElement verfelPnc;
    public static String verfidnc = "";


    public void ajouter_un_réclamation_client() {
        // Write code here that turns the phrase above into concrete actions
        click(consulterRec, "consulter  reclamation");
        codepnc = verfelPnc.getText();
    }


    public void saisir_date_de_réclamation() {
        // Write code here that turns the phrase above into concrete actions
        click(ajouterRec, "ajouter reclamation");
    }


    public void choisir_le_type_de_la_réclamation() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        ExcelUtils.setExcelFile("ReclamationClient");
        sendKeys(ajoutertypeRec, ExcelUtils.getCellData1(1, 6), "type  de  reclamation");
    }


    public void saisir_la_réclamation() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        ExcelUtils.setExcelFile("ReclamationClient");

        sendKeys(ajoutertextRec, ExcelUtils.getCellData1(1, 14), "reclamation  client");
        kyeborad();
    }


    public void choisir_client() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        ExcelUtils.setExcelFile("ReclamationClient");
        sendKeys(ajouterclientREc, ExcelUtils.getCellData1(1, 5), "client   reclamation");
    }


    public void choisir_site_de_la_réclamation() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        ExcelUtils.setExcelFile("ReclamationClient");
        sendKeys(ajoutersiteREc, ExcelUtils.getCellData1(1, 0), "site  reclamation");

    }


    public void choisir_processus_de_la_réclamation() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        ExcelUtils.setExcelFile("ReclamationClient");
        sendKeys(ajouterprocessREc, ExcelUtils.getCellData1(1, 1), " process reclamation");
    }


    public void choisir_réceptionnaire() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        ExcelUtils.setExcelFile("ReclamationClient");
        sendKeys(ajouterrecepitoinaireREc, ExcelUtils.getCellData1(1, 2));
        swip();

    }

    public void choisir_Avec_retour_client() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        ExcelUtils.setExcelFile("ReclamationClient");
        if (ExcelUtils.getCellData1(1, 13).equals("OUI")) {
            click(checkRetourClt);
        }
    }


    public void cliquer_sur_valider_enregistrement_réclamation() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        click(btnSubmitaddreclt, "enrigester reclamatio  client");

    }


    public void verifier_Fiche_réclamation_client_est_ajoutée_sur_le_mobile() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        String str1, str2;

        str1 = codepnc.substring(0, codepnc.indexOf(":"));
        System.out.println(str1);
        Thread.sleep(2000);
        str2 = verfelPnc.getText().substring(0, verfelPnc.getText().indexOf(":"));
        System.out.println(str2);
        System.out.println("code recherche:" + str1);
        System.out.println("codever:" + str2);

        int result = 0;
        String code = "";
        try {
            result = Integer.parseInt(str1);
            result = result + 1;
            code = String.valueOf(result);
            System.out.println(result);

        } catch (Exception e) {

            System.out.println(" Ne pas convertir");
        }
        if (str2.equals("*")) {
            try {
                Assert.assertTrue(str1.equals(code));
                System.out.println("PNC a été ajoutée avec succès");
            } catch (AssertionError e) {
                System.out.println("PNC ne pas  ajoutée");

            }
        } else {
            try {
                Assert.assertTrue(str2.equals("*"));
                System.out.println("Pnc a été ajoutée avec succès");

            } catch (AssertionError e) {
                System.out.println("PNC ne pas  ajoutée");

            }
        }
    }


    public void verifier_Fiche_réclamation_client_est_ajoutée_sur_le_web() {
        // Write code here that turns the phrase above into concrete actions
    }

    @AndroidFindBy(id = pack + "dectraitrecll")
    public static AndroidElement dectraitrecll;
    @AndroidFindBy(id = pack + "dectraitrec")
    public static AndroidElement index;
    @AndroidFindBy(id = pack + "txttraitrec")
    public static AndroidElement txttraitrec;
    @AndroidFindBy(id = pack + "autoCompleteTypeDec")
    public static AndroidElement TypeDec;
    @AndroidFindBy(id = pack + "autoCompleteResTREC")
    public static AndroidElement ResTREC;
    @AndroidFindBy(id = pack + "txtdatetrait")
    public static AndroidElement txtdatetrait;
    @AndroidFindBy(id = pack + "autoCompleteResSREC")
    public static AndroidElement ResSREC;
    @AndroidFindBy(id = pack + "btnSubmitsuivi")
    public static AndroidElement btnSubmitsuivi;

    public void saisir_délai_deReclamation_traitement() throws Throwable {
        ExcelUtils.setExcelFile("ReclamationClient");
        sendKeys(txtdatetrait,ExcelUtils.getCellData1(1,16),"saisir date reclamation  traiter ");



    }

    public void consulter_reclamatin_a_décider() {
        // Write code here that turns the phrase above into concrete actions
        verfidnc = getText(index, "recupeur");
        click(dectraitrecll, "consulter  reclamation a decider");
    }

    public void consulter_fiche_reclamation_a_décider() {
        // Write code here that turns the phrase above into concrete actions
        click(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]"), "consulter la  ficher  reclamation");
    }

    public void saisir_rapport_traitement_de_réclamation() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        ExcelUtils.setExcelFile("ReclamationClient");
        sendKeys(txttraitrec, ExcelUtils.getCellData1(1, 14), "rapport traitment de  reclamation");
        kyeborad();
    }


    public void saisir_type_de_décision() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        ExcelUtils.setExcelFile("ReclamationClient");
        sendKeys(TypeDec, ExcelUtils.getCellData1(1, 8), "type de décision");
    }

    public void choisir_responsable_de_traitement() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        ExcelUtils.setExcelFile("ReclamationClient");
        sendKeys(ResTREC,ExcelUtils.getCellData1(1, 2), "responsable de traitment");
    }

    public void choisir_responsable_de_suivi() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        ExcelUtils.setExcelFile("ReclamationClient");
        sendKeys(ResSREC,ExcelUtils.getCellData1(1, 2), "responsable de traitment");    }

    public void valider_reclamation_a_décider() {
        // Write code here that turns the phrase above into concrete actions
        click(btnSubmitsuivi,"valider reclamation a décider");
    }

    public void vérifier_modification_du_statut_sur_le_web() {
        // Write code here that turns the phrase above into concrete actions
    }





    @AndroidFindBy(id = pack + "radionontraitrec")
    public static AndroidElement nofeedback;
    @AndroidFindBy(id = pack + "radioouitraitrec")
    public static AndroidElement ouifedback;
  @AndroidFindBy(id = pack + "txtraptrait")
    public static AndroidElement report;
    @AndroidFindBy(id = pack + "txtfrais")
    public static AndroidElement txtfrais;
    @AndroidFindBy(id = pack + "txtcoutP")
    public static AndroidElement txtcoutP;
    @AndroidFindBy(id = pack + "datetraitement")
    public static AndroidElement datetraitement;
    @AndroidFindBy(id = pack + "rectraitll")
    public static AndroidElement reclamationTraiter;
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout ")
    public static AndroidElement fichreclamationtraiter;
    @AndroidFindBy(id = pack + "btnSubmittraitement")
    public static AndroidElement btnSubmittraitement;

    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[2]/android.widget.LinearLayout[2]/android.widget.TextView[1]")
    public static AndroidElement index2;


    public void consulter_reclamatin_a_traiter() {
        // Write code here that turns the phrase above into concrete actions
        verfidnc = getText(index2, "recupeur");
        click(reclamationTraiter, "consulter  reclamation a traiter");
    }



    public void consulter_fiche_reclamation_a_traiter() {
        // Write code here that turns the phrase above into concrete actions
        click(fichreclamationtraiter, "consulter  reclamation a decider");
    }


    public void saisir_date_de_traitement() throws Exception {
        ExcelUtils.setExcelFile("ReclamationClient");
        sendKeys(datetraitement,ExcelUtils.getCellData1(1, 16), "date de traitment");
        kyeborad();

    }


    public void saisir_cout_de_penalite() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        ExcelUtils.setExcelFile("ReclamationClient");
        sendKeys(txtcoutP,ExcelUtils.getCellData1(1, 11), "responsable de traitment");


    }


    public void saisir_autre_frais() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        ExcelUtils.setExcelFile("ReclamationClient");
        sendKeys(txtfrais,ExcelUtils.getCellData1(1, 11), "text");    }


    public void saisir_rapport_de_traitement() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        ExcelUtils.setExcelFile("ReclamationClient");
        sendKeys(report,ExcelUtils.getCellData1(1, 2), "responsable de traitment");    }

    public void choisir_feedback() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        ExcelUtils.setExcelFile("ReclamationClient");

        if(ExcelUtils.getCellData1(1,13).equals("oui")){
    click(ouifedback,"avec feedback");
}else{
            click(nofeedback,"sans feedback");

}

    }


    public void valider_reclamation_a_traiter() {
        // Write code h0ere that turns the phrase above into concrete actions
click(btnSubmittraitement,"valide reclamation  a traiter");
    }

   public  void  vérifier_la_taritement (){

       String  str2;
       //android.widget.TextView[@content-desc="Sync"]

       click(xpath("//android.widget.TextView[@content-desc='Sync']"),"actualiser");
       str2=getText(index2,"recupere");
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
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[2]/android.widget.LinearLayout[3]/android.widget.TextView[1]")
    public static AndroidElement index3;

    @AndroidFindBy(id = pack + "recsuivll")
    public static AndroidElement reclamationasuiv;
    @AndroidFindBy(id = pack + "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]")
    public static AndroidElement consulterficheREclamationasuiv;
    @AndroidFindBy(id = pack + "txtrappclot")
    public static AndroidElement rapportfinal;
    @AndroidFindBy(id = pack + "btnSubmitcloture")
    public static AndroidElement validerReclamation;




public void consulter_reclamatin_a_suivre() {
    verfidnc = getText(index3, "recupeur");
    click(reclamationasuiv, "consulter  reclamation a suivr");
}

public void consulter_fiche_reclamation_a_suivre() {
    // Write code here that turns the phrase above into concrete actions
    click(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]"), "consulter  ficher reclamation a suivr");
}


public void saisir_date_de_cloture() throws Exception {
    // Write code here that turns the phrase above into concrete actions

}


public void saisir_Rapport_de_cloture() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    ExcelUtils.setExcelFile("ReclamationClient");
    sendKeys(rapportfinal,ExcelUtils.getCellData1(1,14),"rapport  final");}

public void valider_reclamation_a_suivre() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
click(validerReclamation,"valider reclamation  à suivi");

    String  str2;
    //android.widget.TextView[@content-desc="Sync"]
Thread.sleep(2000);
    click(xpath("//android.widget.TextView[@content-desc='Sync']"),"actualiser");
    str2=getText(index3,"recupere");
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

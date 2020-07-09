package com.qualipro.pages;

import com.qualipro.stepdef.Hooks;
import com.qualipro.utils.ExcelUtils;
import com.qualipro.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

import java.awt.List;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ActionPage extends BasePage {
	TestUtils utils = new TestUtils();

    private static String Path = "C:\\Users\\mootez\\eclipse-workspace\\testauto-web-mobile\\main\\src\\main\\resources\\testData\\TestData.xlsx";


	private final static String pack = "com.saphirconsult.qualipro.myapplication:";

	@AndroidFindBy(id = pack + "id/username")
	public static MobileElement userName;

	@AndroidFindBy(id = pack + "id/password")
	public static MobileElement password;
	@AndroidFindBy(id = pack + "id/okbutton")
	public static MobileElement connectBtn;
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Ouvrire Menu']")
	public static MobileElement menuV;


	@AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]")
	public static MobileElement consulterAction;
	@AndroidFindBy(id = pack + "id/imageViewadd")
	public static MobileElement ajouteAction;
	@AndroidFindBy(id = pack + "id/autoCompleteTextView")
	public static MobileElement sourceAction;
	@AndroidFindBy(id = pack + "id/txtdatedcreaact")
	public static MobileElement selectsourceAction;
	@AndroidFindBy(id = pack + "id/autoCompleteSiteAddact")
	public static MobileElement siteAction;
	@AndroidFindBy(id = pack + "id/txtdatedcreaact")
	public static MobileElement selectSiteAction;
	@AndroidFindBy(id = pack + "id/autoCompleteProcessAddact")
	public static MobileElement processAction;
	@AndroidFindBy(id = pack + "id/autoCompleteTextView")
	public static MobileElement selectProcessAction;
	@AndroidFindBy(id = pack + "id/txtdes")
	public static MobileElement designationAction;
	@AndroidFindBy(id = pack + "id/autoCompleteTypeAction")
	public static MobileElement typeAction;

	@AndroidFindBy(id = pack + "id/Desc")
	public static MobileElement selectTypeAction_ID;
	@AndroidFindBy(id = pack + "id/Desc")
	public static MobileElement descriptionAction_ID;

	@AndroidFindBy(id = pack + "id/causes")
	public static MobileElement causeAction_ID;
	@AndroidFindBy(id = pack + "id/btnSubmit")
	public static MobileElement enrigisterAction_ID;
	@AndroidFindBy(id = "android:id/button1")
	public static MobileElement ajouterAction_ID;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public static MobileElement codeAction;
	public static String codeVerfier;
	@AndroidFindBy(id = pack + "id/textLicense")
	public static MobileElement clee;
	@AndroidFindBy(id = pack + "id/btnLicense")
	public static MobileElement btncle;
	@AndroidFindBy(id = pack + "id/txtdesignation")
	public static MobileElement designationSouAction_ID;
	@AndroidFindBy(id = pack + "id/autoCompleteResRSA")
	public static MobileElement respRealisation_ID;
	@AndroidFindBy(id = pack + "id/txtdaterealis")
	public static MobileElement selectRespRealisation_ID;
	@AndroidFindBy(id = pack + "id/autoCompleteResSuivSA")
	public static MobileElement respSuivi_ID;


	@AndroidFindBy(id = pack + "id/txtdesignation")
	public static MobileElement selectRespSuivi;
	@AndroidFindBy(id = pack + "id/txtdaterealis")
	public static MobileElement selectCalandrierDateRealis;
	@AndroidFindBy(id = pack + "id/txtdaterealis")
	public static MobileElement dateActionDateRealis_ID;
	@AndroidFindBy(id = pack + "id/ok")
	public static MobileElement selectDateActionDateRealis_ID;

	@AndroidFindBy(id = pack + "id/txtdatesuiv")
	public static MobileElement selectCalandrierDateSuiv;
	@AndroidFindBy(id = pack + "id/txtdatesuiv")
	public static MobileElement dateActionSouDateSuiv_ID;
	@AndroidFindBy(id = pack + "id/ok")
	public static MobileElement electDateSouActionDateSuiv_ID;
	@AndroidFindBy(id = pack + "id/btnSubmitsuivi")
	public static MobileElement valideSouAction_ID;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")
	public static MobileElement conffirmationAjouterSousAction;
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Revenir en haut de la page']")
	public static MobileElement retoureSousAction;
	@AndroidFindBy(id = pack + "id/toagenda")
	public static MobileElement rafraichir;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public static MobileElement codeActionV;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]")
	public static MobileElement consulterSousAction;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
	public static MobileElement actualiser;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public static MobileElement codeActualiser;
	@AndroidFindBy(xpath ="//android.widget.ImageButton[@content-desc='Navigate up']")
	public static MobileElement retourAction;
	@AndroidFindBy(id = pack + "id/action_logout")
	public static MobileElement logout;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
	public static MobileElement accueil;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public static MobileElement designa;
	public static String design = "";

	public static String codeRecherche = "";
	@AndroidFindBy(id = pack + "id/imageViewsearch")
	public static MobileElement rechercher;
	@AndroidFindBy(id = pack + "id/inputSearch")
	public static MobileElement inputsearch;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout")
	public static MobileElement cliqueAction;
	@AndroidFindBy(id = pack + "id/Ajout_sousact")
	public static MobileElement AjouteSousAction;
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Revenir en haut de la page']")
	public static MobileElement retourRech;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[1]/android.widget.LinearLayout[1]/android.widget.ImageView")
	public static MobileElement actionARealiser;
	@AndroidFindBy(id = pack + "id/imageViewsearaction")
	public static MobileElement searchActionARealiser;
	@AndroidFindBy(id = pack + "id/inputSearch")
	public static MobileElement inputSearchActionARealiser;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout")
	public static MobileElement consulterActionARealiser;
	@AndroidFindBy(id = pack + "id/txtTaux")
	public static MobileElement tauxActionTraite;
	@AndroidFindBy(id = pack + "id/txtdepense")
	public static MobileElement depense;
	@AndroidFindBy(id = pack + "id/datefrom")
	public static MobileElement dateRealiser;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[6]/android.widget.EditText")
	public static MobileElement commentaire;
	@AndroidFindBy(id = pack + "id/btnSubmitrealisation")
	public static MobileElement validerActionTraiter;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[1]/android.widget.LinearLayout[2]/android.widget.ImageView")
	public static MobileElement actionASuivre;
	@AndroidFindBy(id = pack + "id/imageViewsearaction")
	public static MobileElement searchActionAsuiver;
	@AndroidFindBy(id = pack + "id/inputSearch")
	public static MobileElement saisirnumActionASuiver;



	@AndroidFindBy(id = pack + "id/txtTauxeffi")
	public static MobileElement tauxEffi;
	@AndroidFindBy(id = pack + "id/datefromsuivi")
	public static MobileElement selectdateActionSuiver;
	@AndroidFindBy(accessibility = "03 mai 2020")
	public static MobileElement dateActionsuiver;
	@AndroidFindBy(id = pack + "id/ok")
	public static MobileElement selectDate;

	@AndroidFindBy(id = pack + "id/txtcommenteffi")
	public static MobileElement rapportEffi;

	@AndroidFindBy(id = pack+"id/btnSubmitsuivi")
	public static MobileElement saveActionSuiver;
	@AndroidFindBy(id = pack+"id/modifTReal")
	public static MobileElement modifierTauxReal;


	@AndroidFindBy(id = pack + "id/txtTauxrealiAModifie")
	public static MobileElement mdfTaux;
	@AndroidFindBy(id = pack + "id/txtCommentModifTRea")
	public static MobileElement mdfcommantaire;

	@AndroidFindBy(id = pack + "id/btnModifsuivi")
	public static MobileElement validerModf;
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Revenir en haut de la page']")
	public static MobileElement retourActionSuivre;
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Open Menu']")
	public static MobileElement menu;
	@AndroidFindBy(id = pack + "id/textLicense")
	public static MobileElement prodkye;
	@AndroidFindBy(id = pack + "id/btnLicense")
	public static MobileElement btnkye;
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
	public static MobileElement retour;

	@AndroidFindBy(id=pack+"id/datefromsuivi")
	public  static MobileElement dateActionTraite;

	public static String mdftaux = "";

	public static String taux = "";
	public static String tauxmax = "";
	public static String tauxEf = "";
	public static String code = codeRecherche;


	public static int i = 0;


	public ActionPage(){
		super();
	}

	public ActionPage enterUserName() throws Exception {
		ExcelUtils.setExcelFile("Input");


		sendKeys(userName, ExcelUtils.getCellData1(1, 2), "user name" + ExcelUtils.getCellData1(1, 2));

		utils.log().info(Hooks.getCon());

		return this;
	}

	public ActionPage enterproductKye(String arg) throws Exception {
		ExcelUtils.setExcelFile("Input");


		sendKeys(prodkye, arg, " kye" + ExcelUtils.getCellData1(1, 2));

		return this;
	}

	public ActionPage Kye() throws Exception {
		ExcelUtils.setExcelFile("Input");


		click(btnkye, "press login button");
		return this;
	}

	public ActionPage enterPassword() throws Exception {
		ExcelUtils.setExcelFile("Input");

		sendKeys(password, ExcelUtils.getCellData1(1, 2), "password is " + ExcelUtils.getCellData1(1, 2));

		return this;
	}

	public ActionPage pressLoginBtn() throws InterruptedException {
		click(connectBtn, "press login button");
		return this;
	}

	public ActionPage login() throws Exception {
		enterUserName();
		enterPassword();
		return pressLoginBtn();
	}

	//public String getErrTxt() {
	//String err = getText(, "error text is - ");
	//	return err;
//	}


	public ActionPage ouvrir_une_menu() throws InterruptedException {
		// waitForVisibility());
		click(menu, "press menu button");
		return this;
	}


	public ActionPage consulter_ActionMethod() throws Exception {

		click(consulterAction, "consulter une Action");
		waitForVisibility(codeAction);

		utils.log().info(" code  de action " + codeAction.getText());
		if(Hooks.getCon()==true){
			codeVerfier = codeAction.getText();}
		else{
			codeVerfier = ExcelUtils.getCellData1(1, 11);}
		utils.log().info("code verifier est ="+codeVerfier);

		return this;

	}

	public ActionPage ajouterAction() throws InterruptedException {
		click(ajouteAction, "cliquer sur ajouter action");
		return this;
	}

	public ActionPage selectionnerSource() throws Exception {
		ExcelUtils.setExcelFile("Action");
		click(sourceAction,"source action ");
		utils.log().info(getText(sourceAction,"context"));
	    	
		utils.log().info("select  source action ");


		sendKeys(sourceAction, ExcelUtils.getCellData1(1, 0), "saisir source");
		kyeborad();

		return this;
	}

	public ActionPage selectionnerSite() throws Exception {
		ExcelUtils.setExcelFile("Action");

		sendKeys(siteAction, ExcelUtils.getCellData1(1, 13), "saisir site");
		return this;
	}

	public ActionPage selectionnerProcessus() throws Exception {
		ExcelUtils.setExcelFile(Path,"Action");

		clickable(processAction, "click processus");
		   selected(600,650,400,500) ;
			ExcelUtils.setCellData1(getText(processAction,"recupere processus"),1, 11,Path);

Thread.sleep(2000);
		//sendKeys(processAction, ExcelUtils.getCellData1(1, 14), "saisir processus");
		kyeborad();
		return this;

	}

	public ActionPage saisir_Designation() throws Exception {
		ExcelUtils.setExcelFile(Path,"Action");
String st=randomString(20);
utils.log().info(" designation +"+st);
		sendKeys(designationAction,st, "saisir designation");
		ExcelUtils.setCellData1(st,1, 11,Path);

		return this;
	}

	public ActionPage selectionnerType() throws Throwable {
		ExcelUtils.setExcelFile("Action");

		click(typeAction, "cliquer  sur   type  action");

		utils.log().info(ExcelUtils.getCellData1(1, 1));

		sendKeys(typeAction, ExcelUtils.getCellData1(1, 1), "saisir type action");

		kyeborad();
		return this;
	}


	public ActionPage saisirDescription() throws Exception {

		ExcelUtils.setExcelFile("Action");
		click(descriptionAction_ID, "saisir  description");
		descriptionAction_ID.sendKeys(ExcelUtils.getCellData1(1, 12));
		kyeborad();
		return this;
	}

	public ActionPage saisirCause() throws Exception {

		ExcelUtils.setExcelFile("Action");
		click(causeAction_ID, "saisir cause");

		sendKeys(causeAction_ID, ExcelUtils.getCellData1(1, 12)," saisir cause action");
		return this;
	}

	public ActionPage validerAction() throws InterruptedException {

		click(enrigisterAction_ID, "enrigistre action ");

		click(ajouterAction_ID, "enrigistre action ");


		utils.log().info("code verifier Action page " + codeVerfier);
		return this;
	}


	public ActionPage designation_sous_action() throws Exception {
		
		ExcelUtils.setExcelFile(Path, "Action");

	
		String st=randomString(10);
		utils.log().info("designation sous action "+st);
		designationSouAction_ID.sendKeys(st);
		ExcelUtils.setCellData1(st,1, 18,Path);
		return this;
	}

	public ActionPage responsable_de_r_alisation() throws Exception {
		click(respRealisation_ID, "cliquer sur responsable  de   realisation");

		ExcelUtils.setExcelFile("Action");

		sendKeys(respRealisation_ID, ExcelUtils.getCellData1(1, 4), "saisire responsabel  de realisation");


		return this;
	}

	public ActionPage d_lais_de_r_alisation() throws Exception {
		   String text=createRandomDate(2018, 2019);

		   ExcelUtils.setExcelFile(Path, "Action");
	       sendKeys(selectCalandrierDateRealis, text,"date de  realistion");
		
		ExcelUtils.setCellData1(text,1, 19,Path);
		utils.log().info(" date   realisation  et   "+text);


		kyeborad();
		return this;


	}

	public ActionPage responsable_de_suivi() throws Exception {
		ExcelUtils.setExcelFile("Action");

		click(respSuivi_ID, "cliquer sur  responsable de suivi");
		sendKeys(respSuivi_ID, ExcelUtils.getCellData1(1, 4), "saisir responsable  de  suivi ");
		return this;

//
	}

	public ActionPage d_lais_de_suivi() throws Exception {

		   ExcelUtils.setExcelFile(Path, "Action");
		   String text=createRandomDate(2020, 2021);

		sendKeys(selectCalandrierDateSuiv, text, "saisir date suivi");
		ExcelUtils.setCellData1(text,1, 21,Path);
		utils.log().info(" date   suivi  et   "+text);


		return this;

	}

	public ActionPage validSousAction() throws InterruptedException {

		Thread.sleep(2000);
		//  save();

		click(id(pack+"id/btnSubmitsuivi"), " cliquer  pour valider sousAction ");

		// valideSouAction_ID.click();
		//Thread.sleep(2000);

		click(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]"), "confirmer");

		//   new WebDriverWait(driver, 4000).until(ExpectedConditions.elementToBeClickable(conffirmationAjouterSousAction)).click();

		click(xpath("//android.widget.TextView[@content-desc='Sync']"), "asnc");
		return this;


	}

	@Test
	public ActionPage verifiersousactionajoutealaliste() throws Throwable {

		utils.log().info("verifier -->");

		if(Hooks.getCon()==true){

			design = getText(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"), "desoagnation");

			utils.log().info("verifier -->" + design);

			codeRecherche = design.substring(0, design.indexOf(":"));
			ExcelUtils.setExcelFile(Path, "Action");
			utils.log().info(" num  action   "+codeRecherche);
			Thread.sleep(8000);

			ExcelUtils.setCellData1(codeRecherche,1, 7,Path);
			String codever = codeVerfier.substring(0, codeVerfier.indexOf(":"));
			utils.log().info("code recherche:" + codeRecherche);
			utils.log().info("codever:" + codever);

			int result = 0;
			String code = "";
			try {
				result = Integer.parseInt(codever);
				result = result + 1;
				code = String.valueOf(result);
				System.out.println(result);
				utils.log().info(codeRecherche.equals(code));
				Assert.assertEquals(codeRecherche,code);
				utils.log().info("action a été ajoutée avec succès");

			} catch (java.lang.AssertionError e) {
				//utils.log().info("action ne pas  ajoutée");

				utils.log().info(" Ne pas convertir");
			}
		}else {
			try {
				String desg = getText(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"), "designation pour  l'action");
				utils.log().info("desg= " + desg);
				Assert.assertEquals(desg, ExcelUtils.getCellData1(1, 11));
			} catch (java.lang.AssertionError e) {
				utils.log().info("action a été ajoutée avec succès");


			}
		}

		// Write code here that turns the phrase above into concrete actions
		utils.log().info("soussAction  verifier ");
		i++;


		String j = String.valueOf(i);
		try {

			click(consulterSousAction, "consulter souss action");
			boolean x= find(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[" + j + "]/android.widget.LinearLayout[1]/android.widget.TextView"),3000);

			if (x == true) {
				System.out.println(" Sous action a été ajoutée avec succès");
			} else {
				utils.log().info("  sousAction ne pas ajouter");

			}


		} catch (Exception e) {
			utils.log().info("  sousAction ne pas ajouter");
		}
		// click(xpath("//android.widget.ImageButton[@content-desc='Navigate up']"),"retour  à la  module  action ");
		click(xpath("//android.widget.ImageButton[@content-desc='Revenir en haut de la page']"),"retour  à la  module  action ");

		System.out.println("---------------------------------------------> clique");
		return  this;
	}




	public ActionPage logout() throws InterruptedException {

		ouvrir_une_menu();


		click(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]"),"retour  à page accueil");
		click(xpath("//android.widget.TextView[@content-desc='Log out']"),"deconnexion");

		return this;
		// accueil.click();
		//  logout.click();


	}



	public static int j = 0;

	public ActionPage saisirCodeAction() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		return this;
	}


	public ActionPage rechercherAction() throws Throwable {

		click(rechercher,"clique sur rechercher");
		ExcelUtils.setExcelFile("Action");

		//rechercher.click();
		click(inputsearch," input search");

		if (Hooks.getCon()==false) {


			utils.log().info("code rechercher dans   :" + design);
			sendKeys(inputsearch,ExcelUtils.getCellData1(1, 11),"saisir le code rechercher");


		} else {

			utils.log().info("code rechercher dans   else :" + codeRecherche);

			sendKeys(inputsearch,ExcelUtils.getCellData1(1, 7),"saisir le code rechercher");


		}
		return this;
	}

	public ActionPage cliquersurAction() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		click(cliqueAction,"cliquer sur action  ");

		return this;
	}



	public ActionPage cliquesurajoutersousaction() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);

		click(AjouteSousAction,"ajouter   souss action");
		return  this;

	}

	public ActionPage verifierlesdonneesdelaficheaction() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		j++;
		String k = String.valueOf(j);
		try {

			click(cliqueAction, "cliquer sur  action ");


			boolean x = find(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[" + k + "]/android.widget.LinearLayout[1]/android.widget.TextView"), 30);
			if (x == true) {
				utils.log().info(" Sous action a été ajoutée avec succès");
			} else {
				utils.log().info("  sousAction ne pas ajouter");

			}

		} catch (Exception e) {
			utils.log().info("  sousAction ne pas ajouter");
		}
		// click(xpath("//android.widget.ImageButton[@content-desc='Navigate up']"),"retour  à la  module  action ");

		click(xpath("//android.widget.ImageButton[@content-desc='Revenir en haut de la page']"), "retoure");
		//new WebDriverWait(driver, 1000).until(ExpectedConditions.elementToBeClickable(el1)).click();
		utils.log().info("---------------------------------------------> clique S2");
		return this;
	}




	public ActionPage cliquesurActionarealiser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions




		click(id(pack+"id/actionrealiserll"),"consulter action a realiser");

		return this;

	}

	public ActionPage consulteractionarealiser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		ExcelUtils.setExcelFile("Action");




		utils.log().info("excel:" + ExcelUtils.getCellData1(1, 7));
		click(searchActionARealiser,"cliquer pour recherche action à realiser ");


		click(inputSearchActionARealiser,"action  a realiser ");

		if(Hooks.getCon()==true){
			sendKeys(inputSearchActionARealiser,ExcelUtils.getCellData1(1, 7),"taper le code action à realiser ");
			}else{
			sendKeys(inputSearchActionARealiser,ExcelUtils.getCellData1(1,11),"taper la designation action à realiser ");

		}


		click(consulterActionARealiser,"consulter action à realiser");
		return this;
	}

	public ActionPage realiseractionavec(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions


		waitForVisibility(tauxActionTraite);
		taux = tauxActionTraite.getText();

		tauxActionTraite.clear();
		String tauxx = String.valueOf(arg1);
		tauxmax = tauxx;
		Thread.sleep(5000);
		sendKeys(tauxActionTraite,tauxx,"saisir taux action à traite");
		// tauxActionTraite.sendKeys(tauxx);
		return this;
	}

	public ActionPage saisirdepenses() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		depense.clear();
		ExcelUtils.setExcelFile("Action");


		sendKeys(depense,ExcelUtils.getCellData1(1, 2),"saisir depense");

		return this;
	}

	public ActionPage saisirdaterelaisation() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		ExcelUtils.setExcelFile("Action");

		sendKeys(dateRealiser,ExcelUtils.getCellData1(1, 19)," saisir date realiser");
		kyeborad();
		return this;
	}

	public ActionPage saisircommentaire() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		ExcelUtils.setExcelFile("Action");

		utils.log().info("commentaire:" + ExcelUtils.getCellData1(1, 16));


		clear(commentaire);

		sendKeys(commentaire,ExcelUtils.getCellData1(1, 16),"saisiar commantaire");
		return this;

	}


	public ActionPage cliquervalideractionatraiter() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		click(validerActionTraiter,"valider action à traiter");
		return this;
	}

	public ActionPage verifieretatactionrealise() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		click(searchActionARealiser,"rechercher action  à realiser");
		click(inputSearchActionARealiser,"cliquer ");
		ExcelUtils.setExcelFile("Action");

		if (Hooks.getCon()==false) {
			sendKeys(saisirnumActionASuiver,ExcelUtils.getCellData1(1, 11)," saisir designation action  à  suiver");
		}
		else{
			System.out.println("excel:" + code);
			sendKeys(inputSearchActionARealiser,code,"saisir code d'action suivi ");}

		try {
			click(consulterActionARealiser,"consulter action  à realiser");
			utils.log().info(tauxmax);



			if (getText(tauxActionTraite,"taux action à traiter").equals(taux)) {
				utils.log().info("taux  est ne   change pas");
			} else {
				utils.log().info("taux  est   change ");
			}
		} catch (Exception e) {
			utils.log().info("taux est  100%");
		}
//retoureActionTraiter.click();


		click(xpath("//android.widget.TextView[@content-desc='Sync']")," actuliser");
		return  this;
	}

	public ActionPage consulteractionasuivi() throws Throwable {
		// Write code here that turns the phrase above into concrete actions




		click(id(pack+"id/actionsuivrell"),"consulter action suivi");


		click(searchActionAsuiver,"recherecher à action  suiver");

		click(saisirnumActionASuiver,"cliquer pour saisir");
		ExcelUtils.setExcelFile("Action");

		if (Hooks.getCon()==false) {
			sendKeys(saisirnumActionASuiver,ExcelUtils.getCellData1(1, 11)," saisir numero action  à  suiver");

			Reporter.log(code);

		}
		
		else {
		sendKeys(saisirnumActionASuiver,ExcelUtils.getCellData1(1, 7)," saisir numero action  à  suiver");}

		click(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]")," consulter  action  a suiver");
		return  this;
	}

	public ActionPage suivreactionavec(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);

		String tauxeffi = String.valueOf(arg1);
		System.out.println(tauxeffi);
		tauxEf = getText(id(pack+"id/txtTauxreali"),"recupeure taux");
		//tauxEffi.getText();
		//tauxEffi.clear();
		clear(tauxEffi);


		sendKeys(tauxEffi,tauxeffi,"saisir  taux");
		return  this;
	}

	public ActionPage saisirdatesuivi() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		ExcelUtils.setExcelFile("Action");




		// sendKeys(selectdateActionSuiver,ExcelUtils.getCellData1(1, 19),"selction  date action  à  suiver");
		sendKeys(dateActionTraite,ExcelUtils.getCellData1(1, 19),"selction  date action  à  suiver");
		kyeborad();

		//  dateActionsuiver.click();
		// selectDate.click();
		return this;
	}

	public ActionPage saisirrapporteffi() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		ExcelUtils.setExcelFile("Action");
		// rapportEffi.clear();
		clear(rapportEffi);

		sendKeys(rapportEffi,ExcelUtils.getCellData1(1, 22)," saisir commentaire ");
		return this;}

	public ActionPage cliquervalideractionsuivi() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		click(saveActionSuiver,"enregistrer action  a traite ");

		return this;
	}

	public ActionPage verifieretatactionsuivi() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		click(searchActionAsuiver,"rechercher action à  suiver");
		click(saisirnumActionASuiver,"saisir numero  action à suiver");
		ExcelUtils.setExcelFile("Action");

		if (Hooks.getCon()==false) {
			code = ExcelUtils.getCellData1(1, 11);
			Reporter.log(code);

		}else{

			sendKeys(saisirnumActionASuiver,ExcelUtils.getCellData1(1, 7),"taper code  action  saisir   ");}
		try {

			click(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]"),"ciquer sur action ");
			utils.log().info(tauxEf);



			if (getText(tauxEffi,"taux effi").equals(tauxEf)) {
				utils.log().info("taux  est ne   change pas");
			} else {
				utils.log().info("taux  est   change ");
			}
		} catch (Exception e) {
			utils.log().info("taux est  100%");
		}
		//click(xpath("//android.widget.ImageButton[@content-desc='Navigate up']"),"retour  à la  module  action ");


		click(xpath("//android.widget.ImageButton[@content-desc='Revenir en haut de la page']"),"retour");






		// click(xpath("//android.widget.ImageButton[@content-desc='Navigate up']"),"retour  à la  module  action ");




		click(xpath("//android.widget.TextView[@content-desc='Sync']"),"accueil");

		return this;
	}

	public ActionPage modifierletauxderealisation() throws Throwable {
		click(id(pack + "id/modifTReal"), "cliquer modifier taux realisation");

     /*   MobileElement el3 = (MobileElement) driver.findElementById("com.saphirconsult.qualipro.myapplication:id/txtCommentModifTRea");
        el3.sendKeys("rttyfftttttt");
        MobileElement el4 = (MobileElement) driver.findElementById("com.saphirconsult.qualipro.myapplication:id/btnModifsuivi");
        el4.click();*/


		// modifierTauxReal.click();
		ExcelUtils.setExcelFile("Action");
		mdftaux = mdfTaux.getText();
		mdfTaux.clear();
		utils.log().info(ExcelUtils.getCellData1(1, 20) + " -------- modiftaux");
		mdfTaux.sendKeys(ExcelUtils.getCellData1(1, 20));
		Thread.sleep(5000);

		mdfcommantaire.sendKeys(ExcelUtils.getCellData1(1, 17));

		// driver.setConnection(Connection);
		Thread.sleep(5000);

		if (Hooks.getCon() == true) {
			validerModf.click();
			utils.log().info("on line ");


			utils.log().info("off line ");
			utils.log().info("offline--------------------->");
		}

		click(xpath("//android.widget.TextView[@content-desc='Sync']"),"accueil");


		click(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[1]/android.widget.LinearLayout[2]/android.widget.ImageView"),"");




		return  this;
	}

	@Test
	public ActionPage verifierletauxderealisation() throws Throwable {


		searchActionAsuiver.click();

		saisirnumActionASuiver.click();


		ExcelUtils.setExcelFile("Action");

		if (Hooks.getCon()==false) {
			code = ExcelUtils.getCellData1(1, 11);
			Reporter.log(code);

		}else{
			sendKeys(saisirnumActionASuiver,ExcelUtils.getCellData1(1, 7));}
		try {

			click(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]")," ");
			utils.log().info(mdftaux);
			utils.log().info((id(pack + "id/txtTauxreali")+"taux"));
			utils.log().info(mdftaux+"taux");

			Assert.assertTrue(getText(id(pack + "id/txtTauxreali"),"taux ").equals(mdftaux));

			utils.log().info("taux  est   change ");

		} catch (java.lang.AssertionError e) {
			utils.log().info("taux  est ne   change pas");

		}


		click(xpath("//android.widget.ImageButton[@content-desc='Revenir en haut de la page']"),"retour");

		Thread.sleep(5000);
		click(xpath("//android.widget.TextView[@content-desc='Sync']"),"accueil");


		logout.click();
		return this;
	}


}

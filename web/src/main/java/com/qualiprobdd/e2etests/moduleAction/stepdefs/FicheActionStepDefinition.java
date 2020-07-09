package com.qualiprobdd.e2etests.moduleAction.stepdefs;



import static org.testng.Assert.assertTrue;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.qualiprobdd.e2etests.moduleAction.models.FicheActionModele;
import com.qualiprobdd.e2etests.moduleAction.pages.FicheActionPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import com.qualiprobdd.e2etests.util.RTFUtil;
import com.qualiprobdd.e2etests.util.Setup;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jdk.internal.net.http.common.Utils;
public class FicheActionStepDefinition {
	
	public WebDriver driver;
	public String  NumAction ="";
	public String taux;
	private static String Path = "src/main/resources/testData/TestData.xlsx";
	private boolean Etatcloture;
	private int row;
	
	private Common common = new Common();
	public FicheActionStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, FicheActionPage.class);
	}
	
	@And("^Consulter Action$")
	public void consulter_Action() throws Throwable {
		Thread.sleep(2000L);
		FicheActionModele.consulter_Action();		
		Thread.sleep(2000L);
	}
	
	@When("^cliquer sur ajouter Action détaillée$")
	public void cliquer_sur_ajouter_Action_détaillée() throws InterruptedException  {
		FicheActionModele.ajouter_action_détaillée();
		Thread.sleep(2000L);	
	}
	
	@When("^saisir (\\d+) action$")
	public void saisir_action(int arg1) throws Throwable {
			row=arg1;
		
	}

	@When("^Ajouter Source$")
	public void ajouter_Source() throws Throwable {
		FicheActionModele.selectionnerSourceModeleAction(row);
	}

	@When("^Saisir Date Création$")
	public void saisir_Date_Création() throws Throwable {
		FicheActionModele.choixDate(driver,row);
	}

	
	@When("^choisir Type Action$")
	public void choisir_Type_Action() throws Throwable {
		FicheActionModele.selectionnerTypeModeleAction(row);
	}
	
	@When("^Saisir Désignation$")
	public void saisir_Désignation() throws Throwable {
		FicheActionModele.designationModeleAction(row);
	}

	@When("^Saisir Description problème/objet$")
	public void saisir_Description_problème_objet() throws Throwable {
		FicheActionModele.saisirDescription(row);
	}
	
	@When("^Saisir A l origine de l action$")
	public void Saisir_A_l_origine_de_l_action() throws Throwable {
		FicheActionModele.origine_action();
	}
	
	@When("^choisir Produit$")
	public void choisir_Produit() throws Throwable {
		FicheActionModele.rattacher_produit(driver);
	}
	
	@When("^saisir Objectif$")
	public void saisir_Objectif() throws Throwable {
		FicheActionModele.objectif();
	}
	
	@When("^saisir référence Audit$")
	public void saisir_référence_Audit() throws Throwable {
		FicheActionModele.Ref_Audit(row);
	}

	@When("^choisir Types de causes$")
	public void choisir_Types_de_causes() throws Throwable {
		FicheActionModele.rattacher_Type_cause(driver,row);
	}

	@When("^Saisir Causes possibles$")
	public void saisir_Causes_possibles() throws Throwable {
		FicheActionModele.saisirCausesPossibles();
	}
	
	@When("^choisir Site$")
	public void choisir_Site() throws Throwable {
		FicheActionModele.selectionnerSiteModeleAction(driver,row);
	}

	@When("^Choisir Processus$")
	public void choisir_Processus() throws Throwable {
		FicheActionModele.selectionnerProcessus(driver,row);
	}

	@When("^choisir Activité$")
	public void choisir_Activité() throws Throwable {
		FicheActionModele.selectionnerActivite(driver,row);
	}

	@When("^choisir Direction$")
	public void choisir_Direction() throws Throwable {
		FicheActionModele.selectionnerDirection(driver,row);
	}
	
	@When("^choisir service$")
	public void choisir_service() throws Throwable {
		FicheActionModele.service(driver,row);
	}

	@When("^choisir un responsable de clôture$")
	public void choisir_un_responsable_de_clôture() throws Throwable {
		FicheActionModele.resp_cloture(row);
	}

	@When("^cliquer sur valider Action$")
	public void cliquer_sur_valider_Action() throws Throwable {
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton17_Valider"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", element);
		/*Actions action = new Actions(driver);
		action.moveToElement(FicheActionPage.btnValiderActionId).perform();
		Thread.sleep(500L);
		FicheActionModele.validerAjout();*/
		 Thread.sleep(500L);
	}

	@Then("^Fiche Action ajouté$")
	public void fiche_Action_ajouté() throws Throwable {
		
		Thread.sleep(1000L);
		WebElement num =driver.findElement(By.id("ctl00_ContentPlaceHolder1_nact"));
		String Num=num.getText();
		System.out.println("action numero: "+Num);
		Common.Exporter_visibilité("Fiche Action:"+Num);
		Common.Exporter_champ_A_masquer("Fiche Action: "+Num);
		Boolean vide;
		if(Num.contentEquals(""))
		{
			 vide=false;
		} 
		else
		{
			 vide=true;
		}
		assertTrue(vide);
		NumAction=Num;
		ExcelUtils.setExcelFile(Path, "Action");
		ExcelUtils.setCellData1(Num, row,7, Path) ;
	}
	@When("^choisir plusieurs responsables de suivi$")
	public void choisir_plusieurs_responsables_de_suivi() throws Throwable {
	    //FicheActionPage.objetXpath.click();
	  /* WebElement element = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_panelEnregHeading\"]/h4/a/span"));
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click()", element);
	    Thread.sleep(500L);*/
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Span1"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click()", element);
	    //FicheActionPage.palnActionXpath.click();
	    Thread.sleep(500L);
	    //driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadioButtonList3_1")).click();
	}
	
	@Then("^cliquer sur ajouter sous action$")
	public void cliquer_sur_ajouter_sous_action() throws Throwable {
		FicheActionModele.clickAjouterSousActionModeleAction(driver);
		Thread.sleep(1000L);
	}

	@When("^saisir désignation sous action$")
	public void saisir_désignation_sous_action() throws Throwable {
		
		FicheActionModele.saisirDesignationSousAct(row);
		
	}
	@When("^saisir responsable de réalisation$")
	public void saisir_responsable_de_réalisation() throws Throwable {
		
		FicheActionModele.selectionnerResponsableRealisation(row);
		Thread.sleep(1000L);
	}
	@When("^saisir délais de réalisation$")
	public void saisir_délais_de_réalisation() throws Throwable {

		FicheActionModele.choixDateSousActionModeleAction();
		Thread.sleep(1000L);
	  
	}
	
	@When("^choisir un responsable de suivi$")
	public void choisir_un_responsable_de_suivi() throws Throwable {

		FicheActionModele.selectionnerResponsableSuivi(row);
		Thread.sleep(3000L);
	  
	}
	@When("^choisir délais de suivi$")
	public void choisir_délais_de_suivi() throws Throwable {

		FicheActionPage.délais_suivi.click();
		Thread.sleep(1000L);
		FicheActionPage.choix_délais_suivi.click();
		Thread.sleep(1000L);
	}
	
	@When("^choisir gravité action$")
	public void choisir_gravité_action() throws Throwable {

		FicheActionModele.Gravite(row);
	}
	@When("^choisir Priorité SA$")
	public void choisir_Priorité_SA() throws Throwable {

		FicheActionModele.Priorite(row);
	}
	@When("^saisir cout previ SA$")
	public void saisir_cout_previ_SA() throws Throwable {

		FicheActionModele.Cout_Prev();
	}
	@When("^saisir Risque SA$")
	public void saisir_Risque_SA() throws Throwable {

		FicheActionModele.Risque();
	}

	@When("^cliquer sur valider sous action$")
	public void cliquer_sur_valider_sous_action() throws Throwable {
		
		FicheActionModele.validerSousAction();
		//Thread.sleep(4000L);
	    
	}

	@Then("^sous action ajouté a la liste des sous actions$")
	public void sous_action_ajouté_a_la_liste_des_sous_actions() throws Throwable {
		driver.findElement(By.id("spandetail")).click();
		Thread.sleep(200L);
		Actions action = new Actions(driver);
		action.moveToElement(FicheActionPage.desgSousActionModeleAction).perform();
		String verifDesignation = FicheActionPage.desgSousActionModeleAction.findElement(By.tagName("span")).getText();
		if(verifDesignation.contains("Designation Test Sous Action"))
		{
			System.out.println("sous action ajoute");
		}
	}
	
	
	@When("^Consulter agenda Action$")
	public void consulter_agenda_Action() throws Throwable {
		Thread.sleep(100L);
		Actions action = new Actions(driver);
		action.moveToElement(FicheActionPage.HomeID).perform();
		FicheActionPage.HomeID.click();
		Thread.sleep(1000L);
		FicheActionModele.cliqueAgenda(driver);
		Thread.sleep(1000L);
	}

	@And("^Réaliser Action$")
	public void Réaliser_Action() throws Throwable {
		FicheActionPage.ActionRealisationXpath.click();
		Thread.sleep(100L);
		ExcelUtils.setExcelFile(Path, "Action");
		String NumAction=ExcelUtils.getCellData(row,7);
		FicheActionModele.saisirNumActionRealisation(NumAction);
		FicheActionModele.rechercherNumActionRealisation();
		Thread.sleep(1000L);
		FicheActionModele.choixNumActionRealisation();
		Thread.sleep(1000L);
		FicheActionModele.saisirTauxRealisation();
		FicheActionModele.saisirDepenses();
		FicheActionModele.saisirCommentaire();
		FicheActionPage.dateRealisation.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		FicheActionPage.choixDateRealisation.click();
		FicheActionModele.validerRealisationAction();
		Thread.sleep(1000L);
	}
	
	@And("^Suivi Action$")
	public void Suivi_Action() throws Throwable {
		FicheActionPage.ActionSuivreXpath.click();
		Thread.sleep(1000L);
		ExcelUtils.setExcelFile(Path, "Action");
		String NumAction=ExcelUtils.getCellData(row,7);
		FicheActionModele.saisirNumActionSuivre(NumAction);
		FicheActionModele.rechercherNumActionSuivre();
		FicheActionModele.choixNumActionSuivren();
		FicheActionModele.saisirTauxEffi();
		FicheActionModele.saisirRapportEffi();
		Thread.sleep(1000L);
		FicheActionModele.validerSuivi();
		Thread.sleep(3000L);
		FicheActionModele.cliqueAgenda(driver);
		Thread.sleep(3000L);
	}
	
	@And("^Clôturée Action$")
	public void Clôturée_Action() throws Throwable {
		if(Etatcloture)
		{
		//FicheActionPage.ActionCloturerXpath.click();
		//Thread.sleep(2000L);
		//ExcelUtils.setExcelFile(Path, "Action");
		//String NumAction=ExcelUtils.getCellData(1,7);
		//FicheActionPage.rechercherActionCloturerXpath.sendKeys(NumAction);
		FicheActionModele.choixNumActionCloturee();
		Thread.sleep(1000L);
		//FicheActionPage.palnActionXpath.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		FicheActionModele.choixCloturee();
		FicheActionPage.palnActionXpath.click();
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_span_cloture")).click();
		FicheActionPage.rapportClotureID.sendKeys("Test Auto");
		FicheActionModele.validerCloturee();
		Thread.sleep(1000L);
		try {
			WebElement element=driver.findElement(By.id("ctl00_ContentPlaceHolder1_coutpre"));
			element.isDisplayed();
			WebElement element1=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td[16]")).findElement(By.tagName("span"));
			assertTrue(element.getAttribute("value").contains(element1.getText()));
			Common.Exporter_champ_A_masquer("le champ cout prev total est visible");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_champ_A_masquer("le champ cout prev total est invisible");
			}
		WebElement element=driver.findElement(By.id("ctl00_ContentPlaceHolder1_deptot"));
		element.isDisplayed();
		WebElement element1=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td[17]")).findElement(By.tagName("input"));
		assertTrue(element.getAttribute("value").contains(element1.getAttribute("value")));
		}else {
			FicheActionPage.HomeID.click();
		}
	}

	@When("^Consulter action a traiter$")
	public void consulter_action_a_traiter() throws Throwable {
		Thread.sleep(1000);
		FicheActionModele.cliqueAgenda(driver);
		Thread.sleep(1000L);
		FicheActionPage.ActionRealisationXpath.click();
		Thread.sleep(100L);
		ExcelUtils.setExcelFile(Path, "Action");
		String NumAction=ExcelUtils.getCellData(row,7);
		System.out.println("Action"+NumAction);
		FicheActionModele.saisirNumActionRealisation(NumAction);
		FicheActionModele.rechercherNumActionRealisation();
		Thread.sleep(100L);
		FicheActionModele.choixNumActionRealisation();
		Thread.sleep(1000L);
	}

	@When("^Réaliser action avec (\\d+)$")
	public void réaliser_action_avec(int arg1) throws Throwable {
		ExcelUtils.setExcelFile(Path, "Action");
		taux=Integer.toString(arg1);
		  final DateFormat dateFormat;
			Cookie cookie1 = driver.manage().getCookieNamed("lan");
			if(cookie1.getValue().equals("en-US")) {
				dateFormat = new SimpleDateFormat("MM/dd/yyyy");
			}else {
				dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			}
		FicheActionPage.tauxRealisation.clear();
		FicheActionPage.tauxRealisation.sendKeys(taux);
		ExcelUtils.setCellData1(taux, row,20,Path);
		FicheActionModele.saisirDepenses();
		FicheActionModele.saisirCommentaire();
		//FicheActionModele.rattacher_intervenant(driver);
		Date dt = new Date();
		Calendar c = Calendar.getInstance(); 
		c.setTime(dt); 
		c.add(Calendar.DATE,0);
		dt = c.getTime();
		String Sdate = dateFormat.format(dt);
	System.out.println("------"+Sdate);
	//	ExcelUtils.setCellData1(Sdate, row ,19,Path);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[1].value = arguments[0];",Sdate, FicheActionPage.SaisieDRealisation);
		Thread.sleep(500);
		String datesaisie=driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBox9")).getAttribute("value");
		//ExcelUtils.setCellData1(datesaisie, row ,23,Path);
		Thread.sleep(500L);
		FicheActionModele.validerRealisationAction();
	}
	

	
	@When("^Consulter action a suivre$")
	public void consulter_action_a_suivre() throws Throwable {
		Thread.sleep(1000L);
		FicheActionPage.ActionSuivreXpath.click();
		Thread.sleep(1000L);
		ExcelUtils.setExcelFile(Path, "Action");
		String NumAction=ExcelUtils.getCellData(row,7);
		FicheActionModele.saisirNumActionSuivre(NumAction);
		FicheActionModele.rechercherNumActionSuivre();
		Thread.sleep(1000L);
		FicheActionModele.choixNumActionSuivren();
		Thread.sleep(1000L);
	
	}

	@Then("^vérifier taux réalisation$")
	public void vérifier_taux_réalisation() throws Throwable {
		System.out.println(taux);
		System.out.println(FicheActionPage.AffTxReaId.getAttribute("value"));
		assertTrue(FicheActionPage.AffTxReaId.getAttribute("value").contains(taux));
	}
	
	@When("^suivre action avec (\\d+) et (\\d+)$")
	public void suivre_action_avec_et(int arg1, int arg2) throws Throwable {
		taux=Integer.toString(arg1);
		Thread.sleep(500);
		FicheActionPage.EditTxReaId.click();
		Thread.sleep(1000L);
		FicheActionPage.NouvTxReaId.clear();
		Thread.sleep(1000L);
		FicheActionPage.NouvTxReaId.sendKeys(taux);
		ExcelUtils.setCellData1(taux, row ,20,Path);
		FicheActionPage.CommNouvTxReaId.sendKeys("nécessite verification");
		Thread.sleep(500L);
		FicheActionPage.VldNvTxReaId.click();
		Thread.sleep(500L);
		taux=Integer.toString(arg2);
		FicheActionPage.TauxEffiID.clear();
		FicheActionPage.TauxEffiID.sendKeys(taux);
		ExcelUtils.setCellData1(taux, row ,22,Path);
		FicheActionPage.rapportEffiID.clear();
		FicheActionPage.rapportEffiID.sendKeys("rapport efficacité");
		String Sdate=driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBox10")).getAttribute("value");
		ExcelUtils.setCellData1(Sdate, row ,21,Path);
		ExcelUtils.setCellData1(Sdate, row ,19,Path);
		Thread.sleep(1000L);
		FicheActionModele.validerSuivi();

	}
	
	@Then("^vérifier taux réalisation responsable traitement$")
	public void vérifier_taux_réalisation_responsable_traitement() throws Throwable {
		
		assertTrue(FicheActionPage.tauxRealisation.getAttribute("value").contains(taux));
		FicheActionPage.QttRetour1Id.click();
		Thread.sleep(1000L);
		
	}
	
	@When("^Consulter (\\d+) a realiser$")
	public void consulter_a_realiser(int arg1) throws Throwable {
		ExcelUtils.setExcelFile(Path, "Action");
		String NumAction=ExcelUtils.getCellData(arg1,7);
		Thread.sleep(1000);
		FicheActionModele.cliqueAgenda(driver);
		Thread.sleep(1000L);
		FicheActionPage.ActionRealisationXpath.click();
		Thread.sleep(100L);
		FicheActionModele.saisirNumActionRealisation(NumAction);
		FicheActionModele.rechercherNumActionRealisation();
		Thread.sleep(100L);
		FicheActionModele.choixNumActionRealisation();
		Thread.sleep(1000L);
		}
	@When("^Consulter (\\d+) a suivre$")
	public void consulter_a_suivre(int arg1) throws Throwable {
		ExcelUtils.setExcelFile(Path, "Action");
		String NumAction=ExcelUtils.getCellData(arg1,7);
		FicheActionPage.HomeID.click();
		Thread.sleep(1000L);
		FicheActionModele.cliqueAgenda(driver);
		Thread.sleep(1000L);
		FicheActionPage.ActionSuivreXpath.click();
		Thread.sleep(1000L);
		FicheActionModele.saisirNumActionSuivre(NumAction);
		FicheActionModele.rechercherNumActionSuivre();
		Thread.sleep(1000L);
		FicheActionModele.choixNumActionSuivren();
		Thread.sleep(1000L);
	
	}
	
	@When("^Consulter fiche action$")
	public void consulter_fiche_action() throws Throwable {
		ExcelUtils.setExcelFile(Path, "Action");
		String NumAction=ExcelUtils.getCellData(row,7);
		FicheActionModele.consulter_fiche(NumAction);
	}

	@Then("^Exporter tracabilite$")
	public void exporter_tracabilite() throws Throwable {
		FicheActionPage.ExporterId.click();
		Screen s = new Screen();
		Screen s1 = new Screen();
		Screen s2 = new Screen();
		Screen s3 = new Screen();
		try {
			Pattern pattern = new Pattern("resources/imgs/Exporter_PV_reunion.PNG");
			Pattern pattern1 = new Pattern("resources/imgs/combo_exporter_pv_reunion.PNG");
			Pattern pattern2 = new Pattern("resources/imgs/Choix_combo_PV_reunion.PNG");
			Pattern pattern3 = new Pattern("resources/imgs/Btn_exporter_PV_reunion.PNG");
			s.click(pattern);
			s1.click(pattern1);
			s2.click(pattern2);
			s3.click(pattern3);
			Thread.sleep(4000);
			
		} catch (FindFailed e) {
			e.printStackTrace();
		}
		Runtime.getRuntime().exec("E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod\\resources\\Scripts\\EnregistrerFichier.exe");
		Thread.sleep(1000);
	}

	@Then("^Vérifier (\\d+) et (\\d+)$")
	public void vérifier_et(int arg1, int arg2) throws Throwable {
		List<String> informations = new ArrayList<String>();
		taux=Integer.toString(arg1);
		informations.add(taux);
		taux=Integer.toString(arg2);
		informations.add(taux);
		String path = "resources/Telechargement/CrystalReportViewer1.rtf";
		String fileData = null;
		//fileData = RTFUtil.ReadRTFFile(path);
		System.out.println("********************************TRACABILITE**************************************" + fileData);

		for (int i = 0; i < informations.size(); i++) {
			int j = i + 1;
			System.out.println("l'information " + j + ":" + informations.get(i));
			System.out.println("Existe: " + common.ExisteWord(path, informations.get(i)));
			assertTrue(common.ExisteWord(path, informations.get(i)));
		}
		driver.navigate().back();
		
	}
	

	@Then("^Vérifier etat action realisé$")
	public void vérifier_etat_action_realisé() throws Throwable {
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click()", FicheActionPage.HomeID);
	
			Thread.sleep(1000L);
			FicheActionModele.cliqueAgenda(driver);
			Thread.sleep(1000L);
			//FicheActionPage.ActionRealisationXpath.click();
			Thread.sleep(1000L);
			ExcelUtils.setExcelFile(Path, "Action");
			String NumAction=ExcelUtils.getCellData(row,7);
			
			if(Integer.parseInt(taux)<100)
			{
				FicheActionModele.saisirNumActionRealisation(NumAction);
				Thread.sleep(1000L);
				FicheActionModele.rechercherNumActionRealisation();
				Thread.sleep(2000L);
			assertTrue(FicheActionPage.ActionRealiserId.findElement(By.tagName("a")).getText().contains(NumAction));
			}else
			{
			//	FicheActionPage.FiltreRealiseId.sendKeys(NumAction);
				Thread.sleep(1000L);
				
			assertTrue(driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td")).getText().contains("Aucun élément à afficher")||driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td")).getText().contains("No matching records found"));
			}
	    
	}

	@When("^suivre action avec (\\d+)$")
	public void suivre_action_avec(int arg1) throws Throwable {
		FicheActionPage.ActionSuivreXpath.click();
		Thread.sleep(1000L);
		taux=Integer.toString(arg1);
		FicheActionPage.TauxEffiID.clear();
		FicheActionPage.TauxEffiID.sendKeys(taux);
		FicheActionModele.saisirRapportEffi();
		Thread.sleep(1000L);
		FicheActionModele.validerSuivi();

	}

	@Then("^Vérifier etat action suivi$")
	public void vérifier_etat_action_suivi() throws Throwable {
		Etatcloture=false;
		FicheActionPage.HomeID.click();
		Thread.sleep(1000L);
		FicheActionModele.cliqueAgenda(driver);
		Thread.sleep(1000L);
		ExcelUtils.setExcelFile(Path, "Action");
		String NumAction=ExcelUtils.getCellData(row,7);
		if(Integer.parseInt(taux)<100)
		{
			//FicheActionPage.ActionSuivreXpath.click();
			//Thread.sleep(1000L);
			FicheActionModele.saisirNumActionSuivre(NumAction);
			FicheActionModele.rechercherNumActionSuivre();
			Thread.sleep(1000L);
			
			assertTrue(FicheActionPage.choixNumActionSuivre.getText().contains(NumAction));
		}else {
			FicheActionPage.ActionCloturerXpath.click();
			Thread.sleep(1000L);
			FicheActionPage.rechercherActionCloturerXpath.sendKeys(NumAction);
			//FicheActionModele.choixNumActionCloturee();	
			Thread.sleep(1000);
			Etatcloture=true;
			assertTrue(FicheActionPage.choixActionCloturer.findElement(By.tagName("a")).getText().contains(NumAction));
			
		}
	}
	
	@When("^cliquer sur bilan des actions$")
	public void cliquer_sur_bilan_des_actions() throws Throwable {
		driver.get("http://10.66.245.30/w23/action/rapport/FiltreBilanAction.aspx");
		Thread.sleep(1000L);
		
	}
	
	@When("^récupérer filtre reporting$")
	public void récupérer_filtre_reporting() throws Throwable {
		FicheActionModele.initializer_filtre_Bilan_action(row);
	}
	
	
	@When("^saisir filtre reporting$")
	public void saisir_filtre_reporting() throws Throwable 
	{
		
		Iterator iterator = FicheActionModele.filtre_repor.entrySet().iterator();
        while (iterator.hasNext()) {
        	Map.Entry mapentry = (Map.Entry) iterator.next();
			Common.remplir_filtre_by_id(driver, mapentry.getKey().toString(), mapentry.getValue().toString());
		}
        
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton11")).click();
        Thread.sleep(500);
        WebElement element = driver.findElement(By.id("IconImg_CrystalReportViewer1_toptoolbar_export"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);

	   
	}

	@Then("^Exporter les données$")
	public void exporter_les_données() throws Throwable {		
		 Screen s = new Screen();
			Screen s1 = new Screen();
			Screen s2 = new Screen();
			Screen s3 = new Screen();
			try {
				Pattern pattern  = new Pattern("resources/imgs/Exporter_PV_reunion.PNG");
				Pattern pattern1 = new Pattern("resources/imgs/combo_exporter_pv_reunion.PNG");
				Pattern pattern2 = new Pattern("resources/imgs/Choix_combo_PV_reunion.PNG");
				Pattern pattern3 = new Pattern("resources/imgs/Btn_exporter_PV_reunion.PNG");
				s.click(pattern);
				s1.click(pattern1);
				s2.click(pattern2);
				s3.click(pattern3);
			} catch (FindFailed e) {
				e.printStackTrace();
			}
	}

	@Then("^vérifier les données rapport$")
	public void vérifier_les_données_rapport() throws Throwable {
	String name1 = "bilan_action";
	ExcelUtils.setExcelFile(Path, "Action");
	String num_action=ExcelUtils.getCellData(row,7);
	Common.Vérifier_données(name1,num_action);
	}
	
	@When("^Consulter reporting Etat des actions par responsable$")
	public void consulter_reporting_Etat_des_actions_par_responsable() throws Throwable {
		driver.get("http://10.66.245.30/w23/action/rapport/FiltreEtatResp.aspx");
		Thread.sleep(1000L); 
	}

	@When("^récupérer filtre reporting Etat action$")
	public void récupérer_filtre_reporting_Etat_action() throws Throwable {
		FicheActionModele.initializer_filtre_Etat_action(Path);
		
	}

	@Then("^vérifier les données rapport Etat action$")
	public void vérifier_les_données_rapport_Etat_action() throws Throwable {
		String name1 = "Etat_action";
		ExcelUtils.setExcelFile(Path, "Action");
		String num_action=ExcelUtils.getCellData(row,7);
		Common.Vérifier_données(name1,num_action);
	}
//Amira
	@When("^Consulter reporting liste des actions réalisées par personne$")
	public void consulter_reporting_liste_des_actions_réalisées_par_personne() throws Throwable {
		driver.get("http://10.66.245.30/w23/action/rapport/FilteEtatnbreactionparpersonne.aspx");
		Thread.sleep(1000L);		
	}

	@When("^récupérer filtre reporting liste des actions realisees par personne$")
	public void récupérer_filtre_reporting_liste_des_actions_realisees_par_personne() throws Throwable {
		FicheActionModele.initializer_filtre_action_par_personne(Path);
	}
	
	@Then("^vérifier les données rapport liste des actions realisees par personne$")
	public void vérifier_les_données_rapport_liste_des_actions_realisees_par_personne() throws Throwable {
		String name1 = "Liste_action_réalisée_par_personne";
		ExcelUtils.setExcelFile(Path, "Action");
		String num_action=ExcelUtils.getCellData(row,7);
		Common.Vérifier_données(name1,num_action);
	}
	

@When("^récupérer \"([^\"]*)\" reporting$")
public void récupérer_reporting(String arg1) throws Throwable {
	FicheActionModele.initializer_filtre_Bilan_action(Path,arg1);
}
}

	

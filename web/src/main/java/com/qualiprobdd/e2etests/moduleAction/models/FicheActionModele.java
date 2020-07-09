package com.qualiprobdd.e2etests.moduleAction.models;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qualiprobdd.e2etests.moduleAction.pages.ActSimplPage;
import com.qualiprobdd.e2etests.moduleAction.pages.FicheActionPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import com.qualiprobdd.e2etests.util.RandomValue;



public class FicheActionModele {

	static int i=1;
	public static List<String> informations = new ArrayList<String>();
	public static HashMap<String,String> filtre_repor = new HashMap<>();
	private static String Path = "C:\\Users\\mootez\\eclipse-workspace\\testauto-web-mobile\\main\\src\\main\\resources\\testData\\TestData.xlsx";
	public static void consulter_Action() throws InterruptedException {

		FicheActionPage.menuID.click();
		Thread.sleep(1000L);
		FicheActionPage.ActionSXpath.click();
		Thread.sleep(1000L);
		FicheActionPage.ActionXpath.click();
		Thread.sleep(1000L);
		
	}
	public static void ajouter_action_détaillée() throws InterruptedException {
		FicheActionPage.btnAjouterAction.click();
		Thread.sleep(1000L);
		FicheActionPage.btnajouter_action_detaillee.click();
		Thread.sleep(1000L);
		Common.Exporter_visibilité("Nouvelle Fiche Action");
		Common.Exporter_champ_A_masquer("Nouvelle Fiche Action");
	}
	public static void selectionnerSourceModeleAction(int row) throws Throwable {

		ExcelUtils.setExcelFile(Path, "Action");
		Select select = new Select(FicheActionPage.sourceId);
		select.selectByVisibleText(ExcelUtils.getCellData(row, 0));
		informations.add(ExcelUtils.getCellData(row,0));
		
		
	}
	
	public static void choixDate(WebDriver driver,int row) throws Throwable {

		FicheActionPage.calenrierId.click();
		FicheActionPage.choixDateId.click();
		String value=driver.findElement(By.id("ctl00_ContentPlaceHolder1_datcrea")).getAttribute("value");
		System.out.println(value);
		ExcelUtils.setExcelFile(Path, "Action");
		ExcelUtils.setCellData1(value, row ,8 , Path) ;
	}
	
	public static void origine_action() {
		try {
			FicheActionPage.ORIGINEId.isDisplayed();
			Select select = new Select(FicheActionPage.ORIGINEId);
			select.selectByVisibleText("AUTO");
			Common.Exporter_champ_A_masquer("le champ origine action est visible");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_champ_A_masquer("le champ origine action est invisible");
			}
	}
	public static void rattacher_produit(WebDriver driver) throws Throwable {
		try {
			FicheActionPage.AjtProdId.isDisplayed();
			FicheActionPage.AjtProdId.click();
			Thread.sleep(300);
			JavascriptExecutor  executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()",FicheActionPage.ChxProdId.findElement(By.tagName("input")));
			Thread.sleep(300);
			FicheActionPage.VldProdId.click();
			
			Thread.sleep(300);
			
			Common.Exporter_champ_A_masquer("le champ produit est visible");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_champ_A_masquer("le champ produit est invisible");
			}
	}
	public static void rattacher_Type_cause(WebDriver driver, int row) throws Throwable {
		try {
			
			FicheActionPage.AjtTypCauseId.isDisplayed();
			ExcelUtils.setExcelFile(Path, "Action");
			FicheActionPage.AjtTypCauseId.click();
			Thread.sleep(300);
			FicheActionPage.RechTypCauseId.sendKeys(ExcelUtils.getCellData(row, 9));
			FicheActionPage.GridTypCauseId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView9\"]/tbody/tr/td[1]")).findElement(By.tagName("input")).click();
			Thread.sleep(300);
			FicheActionPage.VldTypCauseId.click();
			Thread.sleep(300);
			Common.Exporter_champ_A_masquer("le champ type cause est visible");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_champ_A_masquer("le champ type cause est invisible");
			}
	}
	
	public static void rattacher_intervenant(WebDriver driver) throws Throwable {
		try {
			Thread.sleep(300);
			FicheActionPage.PanelIntervId.isDisplayed();
			List<WebElement> Exist=driver.findElements(By.id("ctl00_ContentPlaceHolder1_GridView_Intervenants"));
			if(Exist.size()==0)
			{
				FicheActionPage.PanelIntervId.click();
				Thread.sleep(300);
				FicheActionPage.AjtIntervId.click();
				Thread.sleep(300);
				FicheActionPage.RechInetervId.sendKeys("AUTO");
				Thread.sleep(300);
				FicheActionPage.ChxIntervId.findElement(By.tagName("input")).click();
				Thread.sleep(300);
				FicheActionPage.VldIntervId.click();
				Thread.sleep(300);
			}
			
			Common.Exporter_champ_A_masquer("le champ intervenant est visible");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_champ_A_masquer("le champ intervenant est invisible");
			}
	}
	public static void objectif() throws Throwable {
		try {
			FicheActionPage.ObjectifId.isDisplayed();
			FicheActionPage.ObjectifId.sendKeys("Objectif Action");
			Common.Exporter_champ_A_masquer("le champ objectif est visible");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_champ_A_masquer("le champ objectif est invisible");
			}
	}
	public static void Ref_Audit(int row) throws Throwable {
		try {
			FicheActionPage.RefAuditId.isDisplayed();
			ExcelUtils.setExcelFile(Path, "Action");
			Select select = new Select(FicheActionPage.RefAuditId);
			select.selectByVisibleText(ExcelUtils.getCellData(row, 10));
			Common.Exporter_champ_A_masquer("le champ ref audit est visible");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_champ_A_masquer("le champ ref audit est invisible");
			}
	}
	public static void Priorite(int row) throws Throwable {
		try {
			FicheActionPage.PrioriteId.isDisplayed();
			ExcelUtils.setExcelFile(Path, "Action");
			Select select = new Select(FicheActionPage.PrioriteId);
			select.selectByVisibleText(ExcelUtils.getCellData(row, 2));
			Common.Exporter_champ_A_masquer("le champ priorite est visible");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_champ_A_masquer("le champ priorite est invisible");
			}
	}
	
	public static void Gravite(int row) throws Throwable {
		try {
			FicheActionPage.GraviteId.isDisplayed();
			ExcelUtils.setExcelFile(Path, "Action");
			Select select = new Select(FicheActionPage.GraviteId);
			select.selectByVisibleText(ExcelUtils.getCellData(row,3 ));
			Common.Exporter_champ_A_masquer("le champ gravite est visible");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_champ_A_masquer("le champ gravite est invisible");
			}
	}
	
	public static void Risque() {
		try {
			FicheActionPage.RisqueId.isDisplayed();
			FicheActionPage.RisqueId.sendKeys("Risque sous action");
			Common.Exporter_champ_A_masquer("le champ risque est visible");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_champ_A_masquer("le champ risque est invisible");
			}
	}
	
	public static void Cout_Prev() {
		try {
			FicheActionPage.CoutPrevId.isDisplayed();
			FicheActionPage.CoutPrevId.sendKeys("1000");
			Common.Exporter_champ_A_masquer("le champ cout prévisionelle est visible");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_champ_A_masquer("le champ cout prévisionelle est invisible");
			}
	}
	public static void designationModeleAction(int row) throws Throwable {

		FicheActionPage.designationId.sendKeys(RandomValue.randomString(10));
		
		ExcelUtils.setExcelFile(Path, "Action");
		ExcelUtils.setCellData1(FicheActionPage.designationId.getAttribute("value") , row ,11 , Path) ;
		informations.add(ExcelUtils.getCellData(1,11));
	}
	public static void saisirCausesPossibles() {

		FicheActionPage.causesPossiblesId.sendKeys("Test Auto");
		informations.add(FicheActionPage.causesPossiblesId.getText());
	}
	public static void selectionnerTypeModeleAction(int row) throws Throwable {
	
		ExcelUtils.setExcelFile(Path, "Action");
		Select select = new Select(FicheActionPage.listeTypeId);
	
		select.selectByVisibleText(ExcelUtils.getCellData(row, 1));
		ExcelUtils.setExcelFile(Path, "Action");
		informations.add(ExcelUtils.getCellData(row,1));

		
	}
	
	public static void saisirDescription(int row) throws Throwable {

		FicheActionPage.descriptionObjetId.sendKeys(RandomValue.randomString(10));
		ExcelUtils.setExcelFile(Path, "Action");
		ExcelUtils.setCellData1(FicheActionPage.descriptionObjetId.getAttribute("value") , row ,12 , Path) ;
		informations.add(ExcelUtils.getCellData(1,12));
		
	}
	
	public static void selectionnerSiteModeleAction(WebDriver driver,int row) throws Throwable  {
		try {
			
			FicheActionPage.siteId.isDisplayed();
			Common.Exporter_visibilité("le site est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_lbsite2")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("le site est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("le site n'est pas obligatoire");
				
			}
			Select select = new Select(FicheActionPage.siteId);
			select.selectByVisibleText(ExcelUtils.getCellData(row, 13));
			Thread.sleep(500);
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("le site est invisible");
			}
		
	}
	
	public static void selectionnerProcessus(WebDriver driver,int row) throws Throwable {
		try {
			FicheActionPage.processusId.isDisplayed();
			Common.Exporter_visibilité("le processus est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblProcessus_")).getText();
			ExcelUtils.setExcelFile(Path, "Action");
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("le processus est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("le processus n'est pas obligatoire");
				
			}
			Thread.sleep(500);
			Select select = new Select(FicheActionPage.processusId);
			Thread.sleep(500);
			select.selectByVisibleText(ExcelUtils.getCellData(row,14));
			Thread.sleep(500);
			informations.add(ExcelUtils.getCellData(1,14));
			Thread.sleep(500);
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("le processus est invisible");
			}
	}
	
	public static void selectionnerActivite(WebDriver driver, int row) throws Throwable {
		try {
			FicheActionPage.activiteId.isDisplayed();
			Common.Exporter_visibilité("l'activité est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblDomaine_")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("l'activité est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("l'activité n'est pas obligatoire");
				
			}
			ExcelUtils.setExcelFile(Path, "Action");
			Select select = new Select(FicheActionPage.activiteId);
			select.selectByVisibleText(ExcelUtils.getCellData(row, 15));
			informations.add(ExcelUtils.getCellData(row,15));
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("l'activité est invisible");
			}
		
	}
	public static void selectionnerDirection(WebDriver driver,int row) throws Throwable {
		try {
			FicheActionPage.directionId.isDisplayed();
			Common.Exporter_visibilité("la direction est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LabelDir")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("la direction est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("la direction n'est pas obligatoire");
				
			}
			ExcelUtils.setExcelFile(Path, "Action");
			Select select = new Select(FicheActionPage.directionId);
			select.selectByVisibleText(ExcelUtils.getCellData(row, 16));
			informations.add(ExcelUtils.getCellData(row,16));
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("la direction est invisible");
			}

	}
	
	public static void service(WebDriver driver, int row) throws Exception {
		try {
			FicheActionPage.service.isDisplayed();
			Common.Exporter_visibilité("le service est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblService_")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("le service est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("le service n'est pas obligatoire");
			}
			ExcelUtils.setExcelFile(Path, "Action");
			Select select = new Select(FicheActionPage.service);
			select.selectByVisibleText(ExcelUtils.getCellData(row, 17));
			informations.add(select.getFirstSelectedOption().getText());
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("le service est invisible");
			}
	}

	public static void  resp_cloture(int row) throws Exception {
        
		ExcelUtils.setExcelFile(Path, "moduleAction");
		Select select = new Select(FicheActionPage.Respcloture);
		select.selectByVisibleText(ExcelUtils.getCellData(1,5));
		informations.add(select.getFirstSelectedOption().getText());
	}

	 public static void datecreation() throws Exception {
	     
		    ActSimplPage.DatecreationActSimplifiee.click();
			Thread.sleep(1000);
			ActSimplPage.agendacreation.click();
	  	}
	public static void validerAjout() {

		FicheActionPage.btnValiderActionId.click();
	}
	public static void cliqueAgenda(WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", FicheActionPage.agendatActionId);
		//FicheActionPage.agendatActionId.click();
		//FicheActionPage.agendatAction2Id.click();
	}
	public static void clickAjouterSousActionModeleAction(WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", FicheActionPage.btnAjouterSousActionModeleAction);
		
	}
	public static void selectionnerResponsableRealisation(int row) throws Throwable {
		ExcelUtils.setExcelFile(Path, "Action");
		Select select = new Select(FicheActionPage.responsableRealisationID);
		select.selectByVisibleText(ExcelUtils.getCellData(row,4));
		informations.add(ExcelUtils.getCellData(row,4));
	}
	public static void selectionnerResponsableSuivi(int row) throws Throwable {
		ExcelUtils.setExcelFile(Path, "Action");
		Select select = new Select(FicheActionPage.responsableSuiviID);
		select.selectByVisibleText(ExcelUtils.getCellData(row, 6));	
		informations.add(ExcelUtils.getCellData(row,6));
		
	}
	public static void saisirDesignationSousAct(int row) throws Throwable {
		
		FicheActionPage.designationSousAction.sendKeys("Designation Test Sous Action"+Integer.toString(i));
		i++;
		ExcelUtils.setExcelFile(Path, "Action");
		ExcelUtils.setCellData1(FicheActionPage.designationSousAction.getAttribute("value"), row ,18, Path) ;
		informations.add(ExcelUtils.getCellData(row,18));
		
	}
	
	public static void initializer_filtre_Bilan_action(int row) throws Throwable
	{
		ExcelUtils.setExcelFile(Path, "Action");
		filtre_repor.put(FicheActionPage.selec_source_id,ExcelUtils.getCellData(row,0));
		filtre_repor.put(FicheActionPage.selec_type_id,ExcelUtils.getCellData(row,1));
		filtre_repor.put(FicheActionPage.selec_Priorite_id,ExcelUtils.getCellData(row,2));
		filtre_repor.put(FicheActionPage.selec_gravite_id,ExcelUtils.getCellData(row,3));
		filtre_repor.put(FicheActionPage.selec_resp_rea_id,ExcelUtils.getCellData(row,4));
		filtre_repor.put(FicheActionPage.selec_resp_suivi_id,ExcelUtils.getCellData(row,6));
		filtre_repor.put(FicheActionPage.del_creation_1_id,ExcelUtils.getCellData(row,8));
		filtre_repor.put(FicheActionPage.del_creation_2_id,ExcelUtils.getCellData(row,8));
		filtre_repor.put(FicheActionPage.selec_type_cause_id,ExcelUtils.getCellData(row,9));
		filtre_repor.put(FicheActionPage.audit_id,ExcelUtils.getCellData(row,10));
		filtre_repor.put(FicheActionPage.designation_id,ExcelUtils.getCellData(row,11));
		filtre_repor.put(FicheActionPage.description_id,ExcelUtils.getCellData(row,12));
		filtre_repor.put(FicheActionPage.selec_site_id,ExcelUtils.getCellData(row,13));
		filtre_repor.put(FicheActionPage.selec_processus_id,ExcelUtils.getCellData(row,14));
		filtre_repor.put(FicheActionPage.selec_domaine_id,ExcelUtils.getCellData(row,15));
		filtre_repor.put(FicheActionPage.selec_direction_id,ExcelUtils.getCellData(row,16));
		filtre_repor.put(FicheActionPage.designsousact_id,ExcelUtils.getCellData(row,17));
		filtre_repor.put(FicheActionPage.del_real_1_id,ExcelUtils.getCellData(row,18));
		filtre_repor.put(FicheActionPage.del_real_2_id,ExcelUtils.getCellData(row,18));
		filtre_repor.put(FicheActionPage.taux_real_1_id,ExcelUtils.getCellData(row,19));
		filtre_repor.put(FicheActionPage.taux_real_2_id,ExcelUtils.getCellData(row,19));
		filtre_repor.put(FicheActionPage.del_suivi_1_id,ExcelUtils.getCellData(row,20));
		filtre_repor.put(FicheActionPage.del_suivi_2_id,ExcelUtils.getCellData(row,20));
		filtre_repor.put(FicheActionPage.taux_eff_1_id,ExcelUtils.getCellData(row,21));
		filtre_repor.put(FicheActionPage.taux_eff_2_id,ExcelUtils.getCellData(row,21));
	}
	
	public static void initializer_filtre_Etat_action(String Path) throws Throwable 
	{
		ExcelUtils.setExcelFile(Path, "Action");
		filtre_repor.put(FicheActionPage.selec_Site_Action_Par_Resp_id,ExcelUtils.getCellData(1,13));
		filtre_repor.put(FicheActionPage.selec_Processus_Action_Par_Resp_id,ExcelUtils.getCellData(1,14));
		filtre_repor.put(FicheActionPage.selec_Activité_Action_Par_Resp_id,ExcelUtils.getCellData(1,15));
		filtre_repor.put(FicheActionPage.selec_Direction_Action_Par_Resp_id,ExcelUtils.getCellData(1,16));
		filtre_repor.put(FicheActionPage.selec_Priorité_Action_Par_Resp_id,ExcelUtils.getCellData(1,2));
		filtre_repor.put(FicheActionPage.selec_GravitéAction_Action_Par_Resp_id,ExcelUtils.getCellData(1,3));
		filtre_repor.put(FicheActionPage.selec_RespRéalisation_Action_Par_Resp_id,ExcelUtils.getCellData(1,4));
		filtre_repor.put(FicheActionPage.del_DateCreation1_Action_Par_Resp_id,ExcelUtils.getCellData(1,8));
		filtre_repor.put(FicheActionPage.del_DateCreation2_Action_Par_Resp_id,ExcelUtils.getCellData(1,8));
		filtre_repor.put(FicheActionPage.del_DateRealisation1_Action_Par_Resp_id,ExcelUtils.getCellData(1,18));
		filtre_repor.put(FicheActionPage.del_DateRealisation2_Action_Par_Resp_id,ExcelUtils.getCellData(1,18));
	}
	

	
	public static void choixDateSousActionModeleAction() {

		FicheActionPage.dateSousAction.click();
		FicheActionPage.choixDateSousAction.click();
		
	}
	public static void validerSousAction() {

		FicheActionPage.btnValiderSousAction.click();
	}
	public static void saisirNumActionRealisation(String num) {

		FicheActionPage.numActionrealisation.sendKeys(num);
	}
	public static void rechercherNumActionRealisation() {

		FicheActionPage.rechercherNumActionrealisation.click();
		
	}	
	public static void choixNumActionRealisation() {

		FicheActionPage.choixNumActionrealisation.findElement(By.tagName("a")).click();
		
	}	
	public static void saisirTauxRealisation() {

		FicheActionPage.tauxRealisation.sendKeys("100");
	}
	public static void saisirDepenses() {
		try {
			FicheActionPage.depensesID.isDisplayed();
			FicheActionPage.depensesID.clear();
			FicheActionPage.depensesID.sendKeys("1000");
			Common.Exporter_champ_A_masquer("le champ cout est visible");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_champ_A_masquer("le champ cout est invisible");
			}
		
	}
	public static void saisirCommentaire() {
		FicheActionPage.commentaireID.clear();
		FicheActionPage.commentaireID.sendKeys("test auto");
	}
	public static void choixDateRealisation() {

		FicheActionPage.dateRealisation.click();
		
		FicheActionPage.choixDateRealisation.click();
		
	}
	public static void validerRealisationAction() {

		FicheActionPage.validerRealisation.click();
	}
	public static void saisirNumActionSuivre(String num) throws Throwable {
		
		FicheActionPage.numActionSuivre.sendKeys(num);
	}
	public static void rechercherNumActionSuivre() {

		FicheActionPage.rechercherNumActionSuivre.click();
		
	}	
	public static void choixNumActionSuivren() {

		FicheActionPage.choixNumActionSuivre.findElement(By.tagName("a")).click();
	}	
	public static void saisirTauxEffi() {

		FicheActionPage.TauxEffiID.sendKeys("100");
	}
	public static void saisirRapportEffi() {

		FicheActionPage.rapportEffiID.sendKeys("test Auto");
	}
	public static void validerSuivi() {

		FicheActionPage.validerSuivi.click();
	}
	public static void choixNumActionCloturee() {

		FicheActionPage.choixActionCloturer.findElement(By.tagName("a")).click();
	}	
	public static void choixCloturee() {

		FicheActionPage.choixCloturee.click();
	}	
	public static void choixDateCloture() {

		FicheActionPage.dateCloture.click();		
		FicheActionPage.choixDateCloture.click();
	}
	public static void validerCloturee() {

		FicheActionPage.validerCloture.click();
	}	
	
	public static void consulter_fiche(String NumFiche) throws Throwable{
		FicheActionPage.RechFiltreId.sendKeys(NumFiche);
		FicheActionPage.BtnRechFiltId.click();
		Thread.sleep(1000L);
		FicheActionPage.TableFiltreAction.findElement(By.tagName("a")).click();
		Thread.sleep(1000L);
		FicheActionPage.TracabiliteId.click();
		Thread.sleep(1000L);
		
	}
	
	public static void initializer_filtre_action_par_personne(String Path) throws Throwable {

			ExcelUtils.setExcelFile(Path, "Action");
			filtre_repor.put(FicheActionPage.selec_Site_Action_Par_Personne_id,ExcelUtils.getCellData(1,13));
			filtre_repor.put(FicheActionPage.selec_Processus_Action_Par_Personne_id,ExcelUtils.getCellData(1,14));
			filtre_repor.put(FicheActionPage.selec_Activité_Action_Par_Personne_id,ExcelUtils.getCellData(1,15));
			filtre_repor.put(FicheActionPage.selec_Direction_Action_Par_Personne_id,ExcelUtils.getCellData(1,16));
			filtre_repor.put(FicheActionPage.selec_Priorité_Action_Par_Personne_id,ExcelUtils.getCellData(1,2));
			filtre_repor.put(FicheActionPage.selec_GravitéAction_Action_Par_Personne_id,ExcelUtils.getCellData(1,3));
			filtre_repor.put(FicheActionPage.selec_Source_Action_Par_Personne_id,ExcelUtils.getCellData(1,0));
			filtre_repor.put(FicheActionPage.selec_RespRéalisation_Action_Par_Personne_id,ExcelUtils.getCellData(1,4));
			filtre_repor.put(FicheActionPage.del_DateRealisation1_Action_Par_Personne_id,ExcelUtils.getCellData(1,18));
			filtre_repor.put(FicheActionPage.del_DateRealisation2_Action_Par_Personne_id,ExcelUtils.getCellData(1,18));
			filtre_repor.put(FicheActionPage.del_DateSaisieRealisation1_Action_Par_Personne_id,ExcelUtils.getCellData(1,22));
			filtre_repor.put(FicheActionPage.del_DateSaisieRealisation2_Action_Par_Personne_id,ExcelUtils.getCellData(1,22));
		}
	
	public static void initializer_filtre_Bilan_action(String Path,String Filtre) throws Throwable
	{
		ExcelUtils.setExcelFile(Path, "Action");
		if(Filtre.equals("source")) 
		{
			filtre_repor.put(FicheActionPage.selec_source_id,ExcelUtils.getCellData(1,0));
		}else if(Filtre.equals("type")) {
			filtre_repor.put(FicheActionPage.selec_type_id,ExcelUtils.getCellData(1,1));
		}else if(Filtre.equals("priorité")) {
			filtre_repor.put(FicheActionPage.selec_Priorite_id,ExcelUtils.getCellData(1,2));
		}else if(Filtre.equals("gravité")) {
			filtre_repor.put(FicheActionPage.selec_gravite_id,ExcelUtils.getCellData(1,3));
		}else if(Filtre.equals("Resp réalisation")) {
			filtre_repor.put(FicheActionPage.selec_resp_rea_id,ExcelUtils.getCellData(1,4));
		}else if(Filtre.equals("Resp suivi")) {
			filtre_repor.put(FicheActionPage.selec_resp_suivi_id,ExcelUtils.getCellData(1,6));
		}else if(Filtre.equals("date création")) {
			filtre_repor.put(FicheActionPage.del_creation_1_id,ExcelUtils.getCellData(1,8));
			filtre_repor.put(FicheActionPage.del_creation_2_id,ExcelUtils.getCellData(1,8));
		}else if(Filtre.equals("type cause")) {
			filtre_repor.put(FicheActionPage.selec_type_cause_id,ExcelUtils.getCellData(1,9));
		}else if(Filtre.equals("Ref Audit")) {
			filtre_repor.put(FicheActionPage.audit_id,ExcelUtils.getCellData(1,10));
		}else if(Filtre.equals("Designation")) {
			filtre_repor.put(FicheActionPage.designation_id,ExcelUtils.getCellData(1,11));
		}else if(Filtre.equals("Description")) {
			filtre_repor.put(FicheActionPage.description_id,ExcelUtils.getCellData(1,12));
		}else if(Filtre.equals("site")) {
			filtre_repor.put(FicheActionPage.selec_site_id,ExcelUtils.getCellData(1,13));
		}else if(Filtre.equals("processus")) {
			filtre_repor.put(FicheActionPage.selec_processus_id,ExcelUtils.getCellData(1,14));
		}else if(Filtre.equals("domaine")) {
			filtre_repor.put(FicheActionPage.selec_domaine_id,ExcelUtils.getCellData(1,15));
		}else if(Filtre.equals("direction")) {
			filtre_repor.put(FicheActionPage.selec_direction_id,ExcelUtils.getCellData(1,16));
		//}else if(Filtre.equals("service")) {
			//filtre_repor.put(FicheActionPage.selec_service_id,ExcelUtils.getCellData(1,17));
		}else if(Filtre.equals("des sous act")) {
			filtre_repor.put(FicheActionPage.designsousact_id,ExcelUtils.getCellData(1,18));
		}else if(Filtre.equals("date réalisation")) {
			filtre_repor.put(FicheActionPage.del_real_1_id,ExcelUtils.getCellData(1,19));
			filtre_repor.put(FicheActionPage.del_real_2_id,ExcelUtils.getCellData(1,19));
		}else if(Filtre.equals("taux réalisation")) {
			filtre_repor.put(FicheActionPage.taux_real_1_id,ExcelUtils.getCellData(1,20));
			filtre_repor.put(FicheActionPage.taux_real_2_id,ExcelUtils.getCellData(1,20));
		}else if(Filtre.equals("date suivi")) {
			filtre_repor.put(FicheActionPage.del_suivi_1_id,ExcelUtils.getCellData(1,21));
			filtre_repor.put(FicheActionPage.del_suivi_2_id,ExcelUtils.getCellData(1,21));
		}else if(Filtre.equals("taux efficacité")) {
			filtre_repor.put(FicheActionPage.taux_eff_1_id,ExcelUtils.getCellData(1,22));
			filtre_repor.put(FicheActionPage.taux_eff_2_id,ExcelUtils.getCellData(1,22));
		}
	}
	

}

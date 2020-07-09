package com.qualiprobdd.e2etests.moduleAction.models;

//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.qualiprobdd.e2etests.moduleAction.pages.ActSimplPage;
import com.qualiprobdd.e2etests.moduleAction.pages.FicheActionPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;

public class ActSimplModel {

	/* Public methods */

	private static String Path = "C:\\Users\\mootez\\eclipse-workspace\\testauto-web-mobile\\main\\src\\main\\resources\\testData\\TestData.xlsx";

	public static void consulterFiltreActionsSimplifiée() throws InterruptedException {
		FicheActionPage.btnAjouterAction.click();
		Thread.sleep(1000L);
		ActSimplPage.AjouterActSimplifiee.click();
		Thread.sleep(1000L);
		Common.Exporter_visibilité("Nouvelle Fiche Action Simplifie");
		Common.Exporter_champ_A_masquer("Nouvelle Fiche Action Simplifie");
	}

	public static void service() throws Exception {
  		ExcelUtils.setExcelFile(Path, "ActSimpl");
		Select select = new Select(ActSimplPage.serviceActSimplifiee);
		select.selectByVisibleText(ExcelUtils.getCellData(1, 0));
	}

	public static void  resp_cloture() throws Exception {
        
		ExcelUtils.setExcelFile(Path, "ActSimpl");
		Select select = new Select(ActSimplPage.Respcloture);
		select.selectByVisibleText(ExcelUtils.getCellData(1, 1));
	}

	public static void validationActSimpl() throws InterruptedException {
		ActSimplPage.VldenregactSimplifiee.click();
		Thread.sleep(1000L);
	}

	 public static void datecreation() throws Exception {
	     
		    ActSimplPage.DatecreationActSimplifiee.click();
			Thread.sleep(1000);
			ActSimplPage.agendacreation.click();
	  	}
	 
	 public static void ResponsableSuivi(int row) throws Exception {
		 ActSimplPage.VolDetailsActionId.click();
		 Thread.sleep(1000);
		  ActSimplPage.TypeRespSuiviId.click();
			Thread.sleep(1000);
			ExcelUtils.setExcelFile(Path, "Action");
			Select select = new Select(ActSimplPage.RespSuiviId);
			select.selectByVisibleText(ExcelUtils.getCellData(row,6));
	 }
	 public static void DateSuivi() throws Exception {
		   ActSimplPage.DelaiSuiviId.click();
					Thread.sleep(1000);
					ActSimplPage.DateSuiviId.click();
					ActSimplPage.BtnVldRespSuiviId.click();
					Thread.sleep(1000);
		 
	 }
	 
	 public static void VérifierRespSuivi() throws Exception {
			boolean VerifRespSuivi=FicheActionPage.responsableSuiviID.isDisplayed();
			System.out.println(VerifRespSuivi);
			if(VerifRespSuivi)
			{
				Select select = new Select(FicheActionPage.responsableSuiviID);
				System.out.println(select.getFirstSelectedOption().getText());
			}
	 }
	 
	 public static void VérifierDateSuivi() throws Exception {
			boolean VerifDateSuivi=ActSimplPage.AFFDateSuiviId.isDisplayed();
			System.out.println(VerifDateSuivi);
			if(VerifDateSuivi)
			{
				System.out.println(ActSimplPage.AFFDateSuiviId.getText());
			}
		 
	 }
		public static void clickAjouterSousActionModeleAction() {

			  ActSimplPage.btnAjouterSousActionModeleAction.click();
		}
	 
	 
	 




	
}

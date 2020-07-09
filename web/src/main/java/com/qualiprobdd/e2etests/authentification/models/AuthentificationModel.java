package com.qualiprobdd.e2etests.authentification.models;

import com.qualiprobdd.e2etests.authentification.pages.AuthentificationPage;
import com.qualiprobdd.e2etests.util.ExcelUtils;

public class AuthentificationModel {

	/* Public methods */
	private static String Path = "C:\\Users\\mootez\\eclipse-workspace\\testauto-web-mobile\\main\\src\\main\\resources\\testData\\TestData.xlsx";

	public static void saisirLogin(int RowNum,int RowCol) throws Exception {

		ExcelUtils.setExcelFile(Path, "Input");

		AuthentificationPage.loginID.sendKeys(ExcelUtils.getCellData(RowNum, RowCol));
	
	}
	
	public static void saisirLogin1(String id)
	{
		AuthentificationPage.loginID.sendKeys(id);
		
	}
	public static void sasirpw1(String id)
	{
		AuthentificationPage.motDePasse.sendKeys(id);
		
	}

	public static void saisirPW(int RowNum,int RowCol) throws Exception {
		ExcelUtils.setExcelFile(Path, "Input");
		AuthentificationPage.motDePasse.sendKeys(ExcelUtils.getCellData(RowNum, RowCol));
		
	}

	public static void clickOuvrirSession() throws Exception{

		AuthentificationPage.Valider.click();
		Thread.sleep(2000L);
	}
	
	public static void Changer_Compte(String username) throws Exception
	{
		
		
		ExcelUtils.setExcelFile(Path, "Input");
		//String NewUser="nada";
		int RowNum=ExcelUtils.GetLigneData(username);
		System.out.println("num ligne"+RowNum);
		saisirLogin(RowNum, 2);
		saisirPW(RowNum, 3);
		clickOuvrirSession();
		//Thread.sleep(2000L);
	}
	
	public static void Changer_Compte(String module, int col, int row) throws Exception
	{
		ExcelUtils.setExcelFile(Path, module);
		String username=ExcelUtils.getCellData(row, col);
		if(!(username.equals("")))
		{
		ExcelUtils.setExcelFile(Path, "Input");
		int RowNum=ExcelUtils.GetLigneData(username);
		//System.out.println("num ligne"+RowNum);
		saisirLogin(RowNum, 2);
		saisirPW(RowNum, 3);
		clickOuvrirSession();
		}
	}
	public static void changer_langue() throws Throwable 
	{
		AuthentificationPage.utilitaireID.click();
		Thread.sleep(500);
		AuthentificationPage.englisId.click();
		Thread.sleep(1000);
		
	}
	
}

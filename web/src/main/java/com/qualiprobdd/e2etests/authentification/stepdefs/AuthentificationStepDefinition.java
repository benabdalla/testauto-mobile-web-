package com.qualiprobdd.e2etests.authentification.stepdefs;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.qualiprobdd.e2etests.authentification.models.AuthentificationModel;
import com.qualiprobdd.e2etests.authentification.pages.AuthentificationPage;
import com.qualiprobdd.e2etests.util.AbstractPage;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import com.qualiprobdd.e2etests.util.Setup;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDefinition {

	protected static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);
	private static String Path = "C:\\Users\\mootez\\eclipse-workspace\\testauto-web-mobile\\main\\src\\main\\resources\\testData\\TestData.xlsx";
	public WebDriver driver;
	public static String lan;
	public AuthentificationStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AuthentificationPage.class);
	}
	@Given("^Ouvrir le site QualiProWeb$")
	public void ouvrirQualiProWeb() throws Throwable {
		ExcelUtils.setExcelFile(Path, "Input");
		logger.info("Begin : Ouvrir l'application QualiProWeb ");
		driver.get(ExcelUtils.getCellData(1, 0));
		Thread.sleep(1000L);
		//Cookie cookie = new Cookie("lan", lan);
		//driver.manage().addCookie(cookie);
	
	}

	@When("^saisir Login et PW$")
	public void saisirLoginPW() throws Throwable {
		logger.info("saisi login et mot de passe");
		AuthentificationModel.saisirLogin(1,2);
		Thread.sleep(200L);
		AuthentificationModel.saisirPW(1,3);
		Thread.sleep(200L);
	}

	
	@When("^saisir Login \"([^\"]*)\"$")
	public void saisir_Login(String arg1) throws Throwable {
		AuthentificationModel.saisirLogin1(arg1);
		Thread.sleep(200L);
	}

	@When("^saisir password \"([^\"]*)\"$")
	public void saisir_password(String arg1) throws Throwable {
		AuthentificationModel.sasirpw1(arg1);
		Thread.sleep(200L);
	}

	@When("^cliquer sur ouvrir une session$")
	public void clickOuvrirSession() throws Throwable {
		logger.info("click sur ouvrir une session");
		AuthentificationModel.clickOuvrirSession();
		
		Thread.sleep(2000L);
	}
	@When("^Connecter en tant que (\\d+) de l (\\d+) du \"([^\"]*)\"$")
	public void connecter_en_tant_que_de_l_du(int arg1, int arg2, String arg3) throws Throwable {
		AuthentificationModel.Changer_Compte(arg3, arg1, arg2);
	}
	
	@And("^changer la langue en anglais$")
	public void changer_la_langue_en_anglais() throws Throwable {
		AuthentificationModel.changer_langue();
	}

	@Then("^redirection vers compte$")
	public void redirectionCompte() throws Throwable {

		logger.info("redirection vers compte");

		System.out.println("Connexion reussite");
	}
}

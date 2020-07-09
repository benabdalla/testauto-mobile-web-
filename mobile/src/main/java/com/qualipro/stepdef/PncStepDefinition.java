package com.qualipro.stepdef;

import com.qualipro.pages.ActionPage;
import com.qualipro.pages.PncPage;
import com.qualipro.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PncStepDefinition {
	TestUtils utils = new TestUtils();


	@When("^Consulter module PNC$")
	public void consulter_PNC() throws Throwable {
		//PncPage pncPage=new PncPage();
		new PncPage().consulter_PNC();

	}

	@When("^cliquer sur ajouter PNC$")
	public void cliquer_sur_ajouter_PNC() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		//PncPage pncPage=new PncPage();
		new PncPage().cliquer_sur_ajouter_PNC();


	}

	@When("^saisir site PNC$")
	public void saisir_site_PNC() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//PncPage pncPage=new PncPage();
		new PncPage().saisir_site_PNC();



	}

	@When("^choisir le nom de celui qui a detecte la PNC$")
	public void choisir_le_nom_de_celui_qui_a_detecte_la_PNC() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//PncPage pncPage=new PncPage();
		new PncPage().choisir_le_nom_de_celui_qui_a_detecte_la_PNC();

	}

	@When("^saisir date de detection$")
	public void saisir_date_de_detection() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//PncPage pncPage=new PncPage();
		new PncPage().saisir_date_de_detection();

	}

	@When("^saisir type de PNC$")
	public void saisir_type_de_PNC() throws Throwable {
		//PncPage pncPage=new PncPage();
		new PncPage().saisir_type_de_PNC();


	}

	@When("^Saisir Description de la nonconformite$")
	public void saisir_Description_de_la_nonconformite() throws Throwable {

		//PncPage pncPage=new PncPage();
		new PncPage().saisir_Description_de_la_nonconformite();
	}

	@When("^saisir produit$")
	public void saisir_produit() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//PncPage pncPage=new PncPage();
		new PncPage().saisir_produit();
	}

	@When("^saisir quantite detectee$")
	public void saisir_quantite_detectee() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//PncPage pncPage=new PncPage();
		new PncPage().saisir_quantite_detectee();


	}


	@When("^saisir quantite produite$")
	public void saisir_quantite_produite() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//PncPage pncPage=new PncPage();
		new PncPage().saisir_quantite_produite();
	}

	@When("^choisir unite PNC$")
	public void choisir_unite_PNC() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//PncPage pncPage=new PncPage();
		new PncPage().choisir_unite_PNC();
	}

	@When("^Saisir actions immediates$")
	public void saisir_actions_immediates() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		PncPage pncPage = new PncPage();
	}

	@When("^cliquer sur valider enregistrement$")
	public void cliquer_sur_valider_enregistrement() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//PncPage pncPage=new PncPage();
		new PncPage().cliquer_sur_valider_enregistrement();
	}

	@Then("^verifier PNC et  ajoute$")
	public void verifier_PNC_et_ajoute() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//PncPage pncPage=new PncPage();
		new PncPage().verifier_PNC_et_ajoute();
	}


	@When("^cliquer sur Traitement de décision$")
	public void cliquer_sur_Traitement_de_décision() throws Throwable {
		// Write code here that turns the phrase above into concrete actions*
		new PncPage().cliquer_sur_Traitement_de_décision();
	}

	@And("^saisir le responsable de traitement$")
	public void saisir_le_responsable_de_traitement() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().saisir_le_responsable_de_traitement();
	}

	@And("^saisir délai de traitement$")
	public void saisir_délai_de_traitement() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().saisir_délai_de_traitement();
	}

	@And("^saisir le traitement de NC$")
	public void saisir_le_traitement_de_NC() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().saisir_le_traitement_de_NC();


	}

	@And("^saisir le type de traitement de NC$")
	public void saisir_le_type_de_traitement_de_NC() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().saisir_le_type_de_traitement_de_NC();

	}

	@And("^saisir le nom du responsable de suivi$")
	public void saisir_le_nom_du_responsable_de_suivi() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().saisir_le_nom_du_responsable_de_suivi();

	}

	@When("^cliquer sur valider décision$")
	public void cliquer_sur_valider_décision() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().cliquer_sur_valider_décision();
	}

	@Then("^vérifier la décision est prise en considération$")
	public void vérifier_la_décision_est_prise_en_considération() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		new PncPage().vérifier_la_décision_est_prise_en_considération();
	}

	@Then("deconnexion agenda")
	public void deconnexion() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().log_out();
	}


	@And("^cliquer sur Nécessite investigation$")
	public void cliquer_sur_Nécessite_investigation() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().cliquer_sur_Nécessite_investigation();
	}

	@And("^saisir responsable investigation$")
	public void saisir_responsable_investigation() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().saisir_responsable_investigation();
	}

	@And("^saisir délai investigation$")
	public void saisir_délai_investigation() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().saisir_délai_investigation();
	}

	@And("^saisir investigation$")
	public void saisir_investigation() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().saisir_investigation();
	}

	@And("^choisir approbateur  invstigation$")
	public void choisir_approbateur_invstigation() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().choisir_approbateur_invstigation();
	}

	@And("^valider partie investigation$")
	public void valider_partie_investigation() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		new PncPage().valider_partie_investigation();
	}


	@And("^cliquer sur investigation a effectuer$")
	public void cliquer_sur_investigation_a_effectuer() throws Throwable {
		// Write code here that turns the phrase above into concrete action

		new PncPage().cliquer_sur_investigation_a_effectuer();
	}

	@And("^consulter la fiche à investiger$")
	public void consulter_la_fiche_à_investiger() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		new PncPage().consulter_la_fiche_à_investiger();
	}

	@And("^saisir rapport investigation$")
	public void saisir_rapport_investigation() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		new PncPage().saisir_rapport_investigation();
	}


	@And("^cliquer sur valider investigation$")
	public void cliquer_sur_valider_investigation() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		new PncPage().cliquer_sur_valider_investigation();
	}

	@Then("^verifier passage vers l approbateur investigation$")
	public void verifier_passage_vers_l_approbateur_investigation() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().verifier_passage_vers_l_approbateur_investigation();
	}

	@When("cliquer sur investigation à approuver")
	public void cliquer_sur_investigation_à_approuver() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().cliquer_sur_investigation_approuvé();

	}

	@When("consulter la fiche à approver")
	public void consulter_la_fiche_à_approuver() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().cliquer_sur_ficher_à_approuver();

	}

	@When("cliquer sur investigation approuvé")
	public void cliquer_sur_investigation_approuvé() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().cliquer_sur_valider_investigation();

	}

	@Then("verifier etat PNC")
	public void verifier_etat_PNC() {
		new PncPage().verifier_etat_PNC();
	}


	@When("consulter décision à valider")
	public void consulter_décision_à_valider() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().consulter_décision_à_valider();
	}

	@When("cliquer sur décison à valider")
	public void cliquer_sur_décison_à_valider() {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().cliquer_sur_décison_à_valider();
	}

	@When("saisir {string} à prendre")
	public void saisir_à_prendre(String string) {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().saisir_à_prendre(string);
	}

	@Then("vérifier Etat fiche PNC")
	public void vérifier_Etat_fiche_PNC() {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().verifier_Etat_fiche_Pnc();
	}

	@When("consulter pnc  a suivre")
	public void consulter_pnc_a_suivre() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().consulter_pnc_a_suivre();
	}

	@When("saisir date clotureAction N°")
	public void saisir_date_clotureAction_N() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().saisir_date_clotureAction_N();
	}

	@When("saisir rapport de clôture")
	public void saisir_rapport_de_clôture() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().saisir_rapport_de_clôture();
	}

	@When("cliquer sur valider cloture")
	public void cliquer_sur_valider_cloture() {
		// Write code here that t.urns the phrase above into concrete actions
		new PncPage().cliquer_sur_valider_cloture();
	}

	@Then("la fiche PNC est cloturée")
	public void la_fiche_PNC_est_cloturée() {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().la_fiche_PNC_est_cloturée();
	}

	@When("cliquer sur Traitement des PNC")
	public void cliquer_sur_Traitement_des_PNC() throws Exception {
		// Write code here that turns the phrase above into concrete actions
new PncPage().cliquer_sur_Traitement_des_PNC();
	}

	@When("cliquer sur phase traitée")
	public void cliquer_sur_phase_traitée() {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().cliquer_sur_phase_traitée();}

	@When("saisir le rapport de traitement")
	public void saisir_le_rapport_de_traitement() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().saisir_le_rapport_de_traitement();	}

	@When("saisir la date de traitement")
	public void saisir_la_date_de_traitement() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().saisir_la_date_de_traitement();
	}



	@When("saisir le cout de traitement")
	public void saisir_le_cout_de_traitement() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().saisir_le_cout_de_traitement();
	}

	@When("saisir la quantité rejetée")
	public void saisir_la_quantité_rejetée() {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().saisir_la_quantité_rejetée();
	}

	@When("saisir la quantité acceptée")
	public void saisir_la_quantité_acceptée() {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().saisir_la_quantité_acceptée();	}

	@When("saisir la quantité déclassee")
	public void saisir_la_quantité_déclassee() {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().saisir_la_quantité_déclassee();}

	@When("saisir le pourcentage de dépréciation")
	public void saisir_le_pourcentage_de_dépréciation() {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().saisir_le_pourcentage_de_dépréciation();	}


	@When("cliquer sur valider traitement")
	public void cliquer_sur_valider_traitement() {
		// Write code here that turns the phrase above into concrete actions
		new PncPage().vérifier_calcul_cout_traitement_et_valeur_déclassé();
	}

	@Then("Fiche PNC traitée")
	public void fiche_PNC_traitée() {
		// Write code here that turns the phrase above into concrete actions
new PncPage().fiche_PNC_traitée();
	}


}
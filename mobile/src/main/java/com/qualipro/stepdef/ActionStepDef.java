package com.qualipro.stepdef;

import com.qualipro.pages.ActionPage;
import com.qualipro.utils.TestUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActionStepDef {
TestUtils utils =new TestUtils();

    @Given("^Ouvrir le application QualiProMobile$")
    public void ouvrir_le_application_QualiProMobile() throws Throwable {
       utils.log().info("application mobile  qualipro ");
    }

    @When("saisir cle {string}")
    public void saisir_cle(String string) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().enterproductKye(string);
        new ActionPage().Kye();

    }

    @When("^saisir Login  et PW$")
    public void saisir_Login_et_PW() throws Throwable {
        new ActionPage().enterUserName();
        new ActionPage().enterPassword();
        new ActionPage().pressLoginBtn();


    }

    @When("^cliquer sur ouvrir une menu$")
    public void cliquer_sur_ouvrir_une_menu() throws Throwable {
        new ActionPage().ouvrir_une_menu();

    }


    @When("Consulter Action")
    public void consulter_Action() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().consulter_ActionMethod();
    }


    @When("Cliquer sur ajouter")
    public void cliquer_sur_ajouter() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().ajouterAction();
    }


    @When("Selectionner source")
    public void selectionner_source() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().selectionnerSource();
    }


    @When("Selectionner Site")
    public void selectionner_Site() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().selectionnerSite();

    }


    @When("Selectionner Processus")
    public void selectionner_Processus() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().selectionnerProcessus();
    }


    @When("Saisir Designation")
    public void saisir_Designation() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().saisir_Designation();
    }


    @When("Selectionner type")
    public void selectionner_type() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().selectionnerType();
    }


    @When("Saisir description")
    public void saisir_description() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().saisirDescription();
    }


    @When("Saisir Cause")
    public void saisir_Cause() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().saisirCause();
    }


    @When("Cliquer valider action")
    public void cliquer_valider_action() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().validerAction();
    }


    @When("saisir designation sous action")
    public void saisir_designation_sous_action() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().designation_sous_action();

    }


    @When("saisir responsable de realisation")
    public void saisir_responsable_de_realisation() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().responsable_de_r_alisation();

    }


    @When("saisir responsable de suivi")
    public void saisir_responsable_de_suivi() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().responsable_de_suivi();
    }


    @When("saisir delais de realisation")
    public void saisir_delais_de_realisation() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().d_lais_de_r_alisation();
    }


    @When("saisir delais de suivi")
    public void saisir_delais_de_suivi() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().d_lais_de_suivi();

    }


    @When("cliquer sur valider sous action")
    public void cliquer_sur_valider_sous_action() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().validSousAction();
    }


    @Then("verifier action ajoute a la liste")
    public void verifier_action_ajoute_a_la_liste() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().verifiersousactionajoutealaliste();
    }


    @Then("deconnexion")
    public void deconnexion() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().logout();
    }

    @When("Saisir Code Action")
    public void saisir_Code_Action() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().saisirCodeAction();
    }

    @When("Rechercher Action")
    public void rechercher_Action() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().rechercherAction();
    }

    @When("cliquer sur Action")
    public void cliquer_sur_Action() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().cliquersurAction();
    }


    @When("clique sur ajouter sous action")
    public void clique_sur_ajouter_sous_action() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().cliquesurajoutersousaction();
    }

    @Then("Verifier les donnees de la fiche action")
    public void verifier_les_donnees_de_la_fiche_action() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().verifiersousactionajoutealaliste();
    }

    @When("clique sur Action a realiser")
    public void clique_sur_Action_a_realiser() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().cliquesurActionarealiser();
    }

    @When("Consulter action a realiser")
    public void consulter_action_a_realiser() throws Throwable {
        // Write code here that turns the phrase above
        new ActionPage().consulteractionarealiser();
    }

    @When("Realiser action avec {int}")
    public void realiser_action_avec(Integer int1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().realiseractionavec(int1);
    }

    @When("saisir depenses")
    public void saisir_depenses() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        new ActionPage().saisirdepenses();
    }

    @When("saisir date relaisation")
    public void saisir_date_relaisation() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().saisirdaterelaisation();
    }

    @When("^saisir  commentaire$")
    public void saisir_commentaire() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().saisircommentaire();

    }


    @When("^Cliquer valider  action a traiter$")
    public void cliquer_valider_action_a_traiter() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().cliquervalideractionatraiter();
    }

    @Then("^Verifier etat action a traiter$")
    public void verifier_etat_action_realise() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().verifieretatactionrealise();

    }

    @Then("^Consulter action a suivi$")
    public void consulter_action_a_suivi() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().consulteractionasuivi();

    }

    @When("^cliquer sur Action a suivi$")
    public void cliquer_sur_Action_a_suivi() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^suivre action avec (\\d+)$")
    public void suivre_action_avec(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().suivreactionavec(arg1);

    }

    @When("^saisir date suivi$")
    public void saisir_date_suivi() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().saisirdatesuivi();
    }

    @When("^saisir rapport effi$")
    public void saisir_rapport_effi() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().saisirrapporteffi();
    }

    @When("^Cliquer valider action  suivi$")
    public void cliquer_valider_action_suivi() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().cliquervalideractionsuivi();

    }

    @Then("^Verifier etat action suivi$")
    public void verifier_etat_action_suivi() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().verifieretatactionsuivi();
    }


    @Then("^modifier le taux  de realisation$")
    public void modifier_le_taux_de_realisation() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().modifierletauxderealisation();

    }

    @Then("^verifier le taux  de  realisation$")
    public void verifier_le_taux_de_realisation() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        new ActionPage().verifierletauxderealisation();
    }
}
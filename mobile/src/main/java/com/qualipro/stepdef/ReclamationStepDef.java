package com.qualipro.stepdef;

import com.qualipro.pages.PncPage;
import com.qualipro.pages.Reclamation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReclamationStepDef {



    @When("ajouter  un réclamation client")
    public void ajouter_un_réclamation_client() {
        // Write code here that turns the phrase above into concrete actions
new Reclamation().ajouter_un_réclamation_client();
    }

    @When("Saisir date de réclamation")
    public void saisir_date_de_réclamation() {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().saisir_date_de_réclamation();

    }

    @When("choisir le type de la réclamation")
    public void choisir_le_type_de_la_réclamation() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().choisir_le_type_de_la_réclamation();

    }

    @When("Saisir la réclamation")
    public void saisir_la_réclamation() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().saisir_la_réclamation();
    }

    @When("choisir client")
    public void choisir_client() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().choisir_client();
    }

    @When("choisir site de la réclamation")
    public void choisir_site_de_la_réclamation() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().choisir_site_de_la_réclamation();

    }

    @When("choisir processus de la réclamation")
    public void choisir_processus_de_la_réclamation() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().choisir_processus_de_la_réclamation();

    }

    @When("Choisir réceptionnaire")
    public void choisir_réceptionnaire() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().choisir_réceptionnaire();
    }

    @When("choisir Avec retour client")
    public void choisir_Avec_retour_client() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().choisir_Avec_retour_client();
    }

    @When("cliquer sur valider enregistrement réclamation")
    public void cliquer_sur_valider_enregistrement_réclamation() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().cliquer_sur_valider_enregistrement_réclamation();
    }

    @Then("verifier Fiche réclamation client est ajoutée sur le mobile")
    public void verifier_Fiche_réclamation_client_est_ajoutée_sur_le_mobile() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().verifier_Fiche_réclamation_client_est_ajoutée_sur_le_mobile();    }

    @Then("verifier Fiche réclamation client est ajoutée sur le web")
    public void verifier_Fiche_réclamation_client_est_ajoutée_sur_le_web() {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().verifier_Fiche_réclamation_client_est_ajoutée_sur_le_web();    }


    @When("Consulter reclamatin a décider")
    public void consulter_reclamatin_a_décider() {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().consulter_reclamatin_a_décider();
    }

    @When("consulter fiche reclamation a décider")
    public void consulter_fiche_reclamation_a_décider() {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().consulter_fiche_reclamation_a_décider();    }

    @When("saisir rapport traitement de réclamation")
    public void saisir_rapport_traitement_de_réclamation() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().saisir_rapport_traitement_de_réclamation();
    }

    @When("saisir type de décision")
    public void saisir_type_de_décision() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().saisir_type_de_décision();    }

    @When("choisir responsable de traitement")
    public void choisir_responsable_de_traitement() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().choisir_responsable_de_traitement();
    }
    @And("^saisir délai de reclamation traitement$")
    public void saisir_délai_de_reclamation_traitement() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().saisir_délai_deReclamation_traitement();
    }

    @When("choisir responsable de suivi")
    public void choisir_responsable_de_suivi() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().choisir_responsable_de_suivi();
    }

    @Then("valider reclamation a décider")
    public void valider_reclamation_a_décider() {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().valider_reclamation_a_décider();
    }

    @Then("vérifier modification du statut sur le web")
    public void vérifier_modification_du_statut_sur_le_web() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("Consulter reclamatin a traiter")
    public void consulter_reclamatin_a_traiter() {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().consulter_reclamatin_a_traiter();
    }

    @When("consulter fiche reclamation a traiter")
    public void consulter_fiche_reclamation_a_traiter() {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().consulter_fiche_reclamation_a_traiter();
    }

    @When("saisir date de traitement")
    public void saisir_date_de_traitement() throws Exception {
        // Write code here that turns the phrase above into concrete actions
new Reclamation().saisir_date_de_traitement();
    }

    @When("saisir cout de penalite")
    public void saisir_cout_de_penalite() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().saisir_cout_de_penalite();    }

    @When("saisir autre frais")
    public void saisir_autre_frais() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().saisir_autre_frais();
    }

    @When("saisir rapport  de  traitement")
    public void saisir_rapport_de_traitement() throws Exception {
        // Write code here that turns the phrase above into concrete actions

        new Reclamation().saisir_rapport_de_traitement();    }

    @When("choisir feedback")
    public void choisir_feedback() throws Exception {
        new Reclamation().choisir_feedback();
    }

    @Then("valider reclamation a traiter")
    public void valider_reclamation_a_traiter() {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().valider_reclamation_a_traiter();
    }


    @Then("vérifier la taritement est prise en considération")
    public void vérifier_la_taritement_est_prise_en_considération() {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().vérifier_la_taritement ();  }

        @When("Consulter reclamatin a suivre")
    public void consulter_reclamatin_a_suivre() {
        // Write code here that turns the phrase above into concrete actions
            new Reclamation().consulter_reclamatin_a_suivre();
    }

    @When("consulter fiche reclamation a suivre")
    public void consulter_fiche_reclamation_a_suivre() {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().consulter_fiche_reclamation_a_suivre();    }

    @When("saisir date de cloture")
    public void saisir_date_de_cloture() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("saisir Rapport de cloture")
    public void saisir_Rapport_de_cloture() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().saisir_Rapport_de_cloture();    }

    @Then("valider reclamation a suivre")
    public void valider_reclamation_a_suivre() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        new Reclamation().valider_reclamation_a_suivre();
    }




}

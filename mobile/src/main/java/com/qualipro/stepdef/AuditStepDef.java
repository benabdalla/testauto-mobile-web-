package com.qualipro.stepdef;

import com.qualipro.pages.AuditPage;
import com.qualipro.pages.Constat;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuditStepDef {








        @When("^Consulter Agenda Audit en tant qu audite$")
        public void consulter_Agenda_Audit_en_tant_qu_audite() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
           new AuditPage().agendaAudit();

        }


        @When("^rechercher (\\d+) fiche audit agenda$")
        public void rechercher_exemple_fiche_audit_agenda(int row) throws Throwable {
            new AuditPage().rechercherexempleficheadit(row);
        }

        @Then("^Verifier les donnees la coherence des donnees de la fiche$")
        public void verifier_les_donnees_la_coherence_des_donnees_de_la_fiche() throws Throwable {
            new AuditPage().veSrifierlesdonneeslacoherencedesdonneesdelafiche();
        }

        @When("^Consulter Agenda Action suite audit$")
        public void consulter_Agenda_Action_suite_audit() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            new AuditPage().consulterAgendaActionsuiteaudit();

        }


        @When("^ajouter les sous actions issue de l audit$")
        public void ajouter_les_sous_actions_issue_de_l_audit() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            new AuditPage().ajouterlessousactionsissuedelaudit();
        }

        @Then("^verifier notification supprime de lagenda$")
        public void verifier_notification_supprime_de_lagenda() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            new AuditPage().verifiernotificationsupprimedelagenda();

        }






        @When("^cliquer sur module audit$")
        public void cliquer_sur_module_audit() throws Throwable {
            new AuditPage().cliquersurmoduleaudit();

        }
        @When("^rechercher (\\d+) fiche audit module$")
        public void rechercher_exemple_fiche_audit_module(int row) throws Throwable {
            new AuditPage().recheModuleAudite(row);
        }
        @Then("^Verifier les donnees la coherence des donnees de la fiche Module$")
        public void verifier_les_donnees_la_coherence_des_donnees_de_la_fiche_Module() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            new AuditPage().veSrifierlesdonneeslacoherencedesdonneesdelaficheModule();
        }


        @And("^conslter fiche audit module$")
        public void conslter_fiche_audit_module() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            new AuditPage().consulterficheaudit();
        }

        @And("^cliquer sur  ajouter  constats$")
        public void cliquer_sur_ajouter_constats() throws Throwable {
            new AuditPage().cliquersurajouterconstats();

        }


        @When("^saisir object constat$")
        public void saisirObjectConstat() throws Throwable {
            new  Constat().saisirObjectConstat1();


        }

        @When("^saisir odescription du constat$")
        public void saisirOdescriptionDuConstat() throws Throwable {
            new  Constat().saisirOdescriptionDuConstat();
        }

        @When("^saisir type d action$")
        public void saisirTypeDAction() throws Throwable {
            new  Constat().saisirTypeDAction();

        }

        @When("^saisir concerne$")
        public void saisirConcerne() throws Throwable {
            new  Constat().saisirConcerne();
        }

        @When("^saisir type constat$")
        public void saisirTypeConstat() throws Throwable {
            new  Constat().saisirTypeConstat();

        }

        @When("^saisir gravite$")
        public void saisirGravite() throws Throwable {
            new  Constat().saisirGravite();


        }

        @When("^saisir champ audit$")
        public void saisirChampAudit() throws Throwable {
            new  Constat().saisirChampAudit();
        }

        @When("^cliquer sur valider constat$")
        public void cliquerSurValiderConstat() throws Throwable {
            new  Constat().cliquerSurValiderConstat();
        }
        @And("^actualiser$")
        public void actualiser() throws Throwable {
            new AuditPage().actualiser();
        }
        @Then("^verifier constat$")
        public void verifier_constat() throws Throwable {
            new AuditPage().verifierConstat();}

        @Then("^cliquer sur verifier checklist$")
        public void cliquerSurVerifierChecklist() throws Throwable {
            new AuditPage().cliquersurverifierchecklist();
        }

        @Then("^Remplir checklist$")
        public void remplirChecklist() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            new AuditPage().remplirchecklist();
        }

        @Then("^Verifier les donnees la coherence des donnees de la fiche auditeur$")
        public void verifierLesDonneesLaCoherenceDesDonneesDeLaFicheAuditeur() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            new AuditPage().vérifierLesDonneesLaCoherenceDesDonneesDeLaFiche();
        }



        @When("^consulter Agenda Audit en tant qu auditeur$")
        public void consulter_Agenda_Audit_en_tant_qu_auditeur() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            new AuditPage().consulterAgendaAuditentantquauditeur();

        }

        @And("^rechercher (\\d+) fiche audit auditeur$")
        public void rechercher_fiche_audit_auditeur(int arg1) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            new AuditPage().rechercherexemplefichetAuditeur(arg1);
        }
        @Then("^retour a l accueil$")
        public void retour_a_l_accueil() throws Throwable {
            // Write code here that turns the phrase above into concrete actions

            new AuditPage().retour_a_l_accueil();
        }

        @And("^conslter fiche audit  auditeur$")
        public void conslter_fiche_audit_auditeur() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            new AuditPage().conslter_fiche_audit_auditeur();

        }



        @When("^cliquer sur envoyer rapport$")
        public void cliquer_sur_envoyer_rapport() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            new AuditPage().cliquer_sur_valider_rapport();}


        @When("^retour a la page daccueil$")
        public void retour_a_la_page_daccueil() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            new AuditPage().retour_a_l_accueil();

        }


        @When("^cliquer sur valider rapport$")
        public void cliquer_sur_valider_rapport() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            new AuditPage().cliquer_sur_envoyer_rapport();


        }


        @Then("^vérifier le rapport audit est valide$")
        public void vérifier_le_rapport_audit_est_valide() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            new AuditPage().vérifier_le_rapport_audit_est_valide();
        }


        @When("^Consulter  rapport d audit a valider$")
        public void consulter_rapport_d_audit_a_valider() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            new AuditPage().consulter_Agenda_rapport_d_audit_a_valider();
        }


    }



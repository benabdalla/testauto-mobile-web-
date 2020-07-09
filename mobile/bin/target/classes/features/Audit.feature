Feature: Qualipro- Test fiche audit-En tant que utilisateur je souhaite remplir une fiche audit et décrire les details de réalisation




  @AuditeEnTantQuAuditeur
  Scenario Outline: Qualipro-test en tant qu auditeur
    Given Ouvrir le application QualiProMobile
    And saisir Login  et PW
    And consulter Agenda Audit en tant qu auditeur
    And rechercher <exemple> fiche audit auditeur
    And conslter fiche audit  auditeur
    And cliquer sur  ajouter  constats
    And saisir object constat
    And saisir odescription du constat
    And saisir type d action
    And saisir concerne
    And saisir type constat
    And saisir gravite
    And  saisir champ audit
    And cliquer sur valider constat
    And cliquer sur verifier checklist
    And Remplir checklist
    Then Verifier les donnees la coherence des donnees de la fiche auditeur
    And retour a l accueil
    And cliquer sur ouvrir une menu
    And cliquer sur module audit
    And rechercher <exemple> fiche audit module
    And conslter fiche audit module
    And cliquer sur  ajouter  constats
    And saisir object constat
    And saisir odescription du constat
    And saisir type d action
    And saisir concerne
    And saisir type constat
    And saisir gravite
    And  saisir champ audit

    And cliquer sur valider constat
    Then verifier constat
    And cliquer sur verifier checklist
    And Remplir checklist
    And retour a l accueil
    And deconnexion

    Examples:
      | exemple |
      |       1 |



  @AuditEnTantquAudite
  Scenario Outline: Qualipro-test en tant  qu  audite
    Given Ouvrir le application QualiProMobile
    And saisir Login  et PW
    When Consulter Agenda Audit en tant qu audite
  #  And rechercher <exemple> fiche audit agenda
    Then Verifier les donnees la coherence des donnees de la fiche
    When Consulter Agenda Action suite audit
    And ajouter les sous actions issue de l audit
    When saisir designation sous action
    And saisir responsable de realisation
    And saisir responsable de suivi
    And saisir delais de realisation
    And saisir delais de suivi
    When cliquer sur valider sous action
    Then verifier notification supprime de lagenda
    When cliquer sur ouvrir une menu
    And cliquer sur module audit
   # And rechercher <exemple> fiche audit module
    Then Verifier les donnees la coherence des donnees de la fiche Module
    Then deconnexion


    Examples:
      | exemple |
      |       1 |
  @AuditEnTantQueResponsableValidation
  Scenario Outline: Qualipro-Test Le rapport d'audit à valider
    Given Ouvrir le application QualiProMobile
    And saisir Login  et PW
    And cliquer sur ouvrir une menu
    And cliquer sur module audit
   # And rechercher <exemple> fiche audit module
    And conslter fiche audit module
   # And cliquer sur envoyer rapport
    And retour a la page daccueil
    And cliquer sur ouvrir une menu
    When Consulter  rapport d audit a valider
  #  And rechercher <exemple> fiche audit auditeur
    And conslter fiche audit  auditeur
    And cliquer sur valider rapport
    Then vérifier le rapport audit est valide
    And retour a la page daccueil
    Then deconnexion
    Examples:
      | exemple |
      |       1 |



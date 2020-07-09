Feature: Test Workflow Réclamation Client, En tant qu’utilisateur je souhaite ajouter une fiche réclamation client

  @AjoutReclamationClient
  Scenario: Qualipro   Test Ajouter fiche Réclamation client
    Given Ouvrir le application QualiProMobile
    When saisir Login  et PW
    When cliquer sur ouvrir une menu
    And  ajouter  un réclamation client
    And  Saisir date de réclamation
    And  choisir le type de la réclamation
    And  Saisir la réclamation
    And  choisir client
    And  choisir site de la réclamation
    And  choisir processus de la réclamation
    And  Choisir réceptionnaire
    And  choisir Avec retour client
    When cliquer sur valider enregistrement réclamation
    Then verifier Fiche réclamation client est ajoutée sur le mobile
    Then verifier Fiche réclamation client est ajoutée sur le web
    Then deconnexion

  @Décisiondetraitement
  Scenario: Qualipro- Test décider le traitement d une fiche Réclamation
    Given Ouvrir le application QualiProMobile
    When saisir Login  et PW
    When Consulter reclamatin a décider
    And consulter fiche reclamation a décider
    And saisir rapport traitement de réclamation
    And  saisir type de décision
    And  choisir responsable de traitement
     And saisir délai de reclamation traitement
    And  choisir responsable de suivi
    Then  valider reclamation a décider
    Then vérifier la décision est prise en considération
    Then  vérifier modification du statut sur le web
    And deconnexion agenda

  @Traitement
  Scenario: Qualipro- Test Ajouter fiche Réclamation à traiter
    Given Ouvrir le application QualiProMobile
    When saisir Login  et PW
    When Consulter reclamatin a traiter
    And consulter fiche reclamation a traiter
    And saisir date de traitement
    And  saisir cout de penalite
    And  saisir autre frais
    And   saisir rapport  de  traitement
    And  choisir feedback
    Then  valider reclamation a traiter
    Then vérifier la taritement est prise en considération
    Then  vérifier modification du statut sur le web
    And deconnexion agenda

  @Suivi
  Scenario: Qualipro- Test Ajouter fiche Réclamation à suivre
    Given Ouvrir le application QualiProMobile
    When saisir Login  et PW
    When Consulter reclamatin a suivre
    And consulter fiche reclamation a suivre
    And saisir date de cloture
    And saisir Rapport de cloture
    Then  valider reclamation a suivre
    Then  vérifier modification du statut sur le web
    And deconnexion agenda







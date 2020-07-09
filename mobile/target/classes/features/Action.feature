Feature: Module Action
@AjouterActionSouAction
  Scenario: Ajouter Action avec  souss action
    Given Ouvrir le application QualiProMobile
   #  When  saisir cle "0eD2otVO2nnzuiK"
    When saisir Login  et PW
    When cliquer sur ouvrir une menu
    When Consulter Action
    And Cliquer sur ajouter
    And Selectionner source
    And Selectionner Site
    And Selectionner Processus
    And Saisir Designation
    And Selectionner type
    And Saisir description
    And Saisir Cause
    And Cliquer valider action
    When  saisir designation sous action
    And   saisir responsable de realisation
    And   saisir responsable de suivi
    And   saisir delais de realisation
    And   saisir delais de suivi
    When  cliquer sur valider sous action
    Then verifier action ajoute a la liste
    Then deconnexion

@RechercherAction
  Scenario: rechereche et consultation dune Action
    Given Ouvrir le application QualiProMobile
    When saisir Login  et PW
    When cliquer sur ouvrir une menu
    When Consulter Action
    When Saisir Code Action
    When Rechercher Action
    When cliquer sur Action
    And clique sur ajouter sous action
    When  saisir designation sous action
    And   saisir responsable de realisation
    And   saisir responsable de suivi
    And   saisir delais de realisation
    And   saisir delais de suivi
    When  cliquer sur valider sous action
    Then Verifier les donnees de la fiche action
    Then deconnexion
@ActionRealiserSuivi
  Scenario Outline:
  Qualipro- En tant que responsable je souhaite traiter et suivre l action avec des taux differents
    Given Ouvrir le application QualiProMobile
    When saisir Login  et PW
    When  clique sur Action a realiser
    When   Consulter action a realiser
    And    Realiser action avec <taux>
    And    saisir depenses
    And    saisir date relaisation
    And saisir  commentaire
    And Cliquer valider  action a traiter
    Then   Verifier etat action a traiter
    And    Consulter action a suivi
    When cliquer sur Action a suivi
    And   suivre action avec <tauxsuivi>
    And saisir date suivi
    And saisir rapport effi
    And Cliquer valider action  suivi
    Then   Verifier etat action suivi
    When  Consulter action a suivi
    When cliquer sur Action a suivi
    Then  modifier le taux  de realisation
    And  verifier le taux  de  realisation
    Examples:
      | taux | tauxsuivi |
      | 55   | 70        |
      | 100  | 100       |






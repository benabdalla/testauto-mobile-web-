Feature: Qualipro- Test fiche PNC-En tant que utilisateur je souhaite remplir une fiche PNC


  @PNC
  Scenario: Qualipro-test fiche PNC
    Given Ouvrir le application QualiProMobile
    When saisir Login  et PW
    When cliquer sur ouvrir une menu
    When Consulter module PNC
    And cliquer sur ajouter PNC
    And saisir site PNC
    And choisir le nom de celui qui a detecte la PNC
    And saisir date de detection
    And saisir type de PNC
    And Saisir Description de la nonconformite
    And saisir produit
    And saisir quantite detectee
    And saisir quantite produite
    And choisir unite PNC
    And Saisir actions immediates
    When cliquer sur valider enregistrement
    Then verifier PNC et  ajoute
    Then deconnexion

  @DécisionDeTraitementSansInvestigation
  Scenario: Qualipro-test:En tant que décideur de traitement,  je souhaite remplir la partie décison de traitement

    Given Ouvrir le application QualiProMobile
    When saisir Login  et PW
    And cliquer sur Traitement de décision

    And saisir le traitement de NC
    And saisir le type de traitement de NC

    And saisir le responsable de traitement
    And saisir délai de traitement

    And saisir le nom du responsable de suivi
    When cliquer sur valider décision
    Then vérifier la décision est prise en considération
    And deconnexion agenda
  @DécisionDeTraitementAvecInvestigation
  Scenario: Qualipro-test:En tant que décideur de traitement,
  je souhaite remplir la partie décison de traitement en considérant la nécessité d investigation
    Given Ouvrir le application QualiProMobile
    When saisir Login  et PW
    And cliquer sur Traitement de décision
    And cliquer sur Nécessite investigation
    And saisir responsable investigation
    And saisir délai investigation
    And saisir investigation
    And choisir approbateur  invstigation
    And valider partie investigation
    And saisir le traitement de NC
    And saisir le type de traitement de NC

    And saisir le responsable de traitement
    And saisir délai de traitement

    And saisir le nom du responsable de suivi
    When cliquer sur valider décision
    Then vérifier la décision est prise en considération
    And deconnexion agenda


  @InvestigationPNC
  Scenario: Qualipro-test:En tant que responsable inestigation
  je souhaite traiter la non conformite

    Given Ouvrir le application QualiProMobile
    When saisir Login  et PW
    And cliquer sur investigation a effectuer
    And consulter la fiche à investiger
    And saisir rapport investigation
    #And joindre rapport investigation
    And cliquer sur valider investigation
    Then verifier passage vers l approbateur investigation
    And deconnexion agenda


  @ApprobationInvestigationPNC
  Scenario: Qualipro-test:En tant que responsable inestigation
  je souhaite traiter la non conformite

    Given Ouvrir le application QualiProMobile
    When saisir Login  et PW
    And cliquer sur investigation à approuver
    And consulter la fiche à approver
    And cliquer sur investigation approuvé
    Then verifier etat PNC
    And deconnexion agenda



  @ValiderDécisionTraitement
  Scenario Outline: Qualipro-test:En tant que responsable validation  traitement paramétré au niveau du (type traitement, site, processus), je veux valider la décision de traitement

    Given Ouvrir le application QualiProMobile
    When saisir Login  et PW
    And consulter décision à valider
    And cliquer sur décison à valider
    And saisir <type décision> à prendre
    Then vérifier Etat fiche PNC
    And deconnexion agenda

    Examples:
      |type décision|
      |"Validation"|
      #|"Refus"|




  @TraiterPNC
  Scenario: Qualipro-test:En tant que responsable traitement
  je souhaite traiter la non conformité

    Given Ouvrir le application QualiProMobile
    When saisir Login  et PW
    And cliquer sur Traitement des PNC
    And cliquer sur phase traitée
    And saisir la date de traitement
    When saisir le cout de traitement
    And saisir la quantité rejetée
    And saisir la quantité déclassee
    And saisir le pourcentage de dépréciation
    And saisir la quantité acceptée
    And saisir le rapport de traitement
    When cliquer sur valider traitement
    Then Fiche PNC traitée
    And deconnexion agenda

  @SuiviPNC
  Scenario: Qualipro-test:En tant que responsable suivi je souhaite cloture la non conformité
    Given Ouvrir le application QualiProMobile
    When saisir Login  et PW
    And  consulter pnc  a suivre
    And saisir date clotureAction N°
    And saisir rapport de clôture
    When cliquer sur valider cloture
    Then la fiche PNC est cloturée
    And deconnexion agenda




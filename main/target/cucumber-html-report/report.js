$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/mootez/eclipse-workspace/testauto-web-mobile/web/src/specs/features/moduleAction/Action.feature");
formatter.feature({
  "line": 1,
  "name": "Qualipro- Test fiche Action",
  "description": "En tant que utilisateur je souhaite remplir une fiche Action",
  "id": "qualipro--test-fiche-action",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 51,
  "name": "Qualipro- En tant que responsable, je souhaite traiter et suivre l action avec des taux différents",
  "description": "",
  "id": "qualipro--test-fiche-action;qualipro--en-tant-que-responsable,-je-souhaite-traiter-et-suivre-l-action-avec-des-taux-différents",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 50,
      "name": "@RealisationetSuiviAction"
    }
  ]
});
formatter.step({
  "line": 52,
  "name": "Ouvrir le site QualiProWeb",
  "keyword": "Given "
});
formatter.step({
  "line": 53,
  "name": "saisir Login et PW",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "cliquer sur ouvrir une session",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "saisir \u003cexemple\u003e action",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "Consulter action a traiter",
  "keyword": "When "
});
formatter.step({
  "line": 57,
  "name": "Réaliser action avec \u003cA taux realisation\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "Vérifier etat action realisé",
  "keyword": "Then "
});
formatter.step({
  "line": 59,
  "name": "Consulter action a suivre",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "vérifier taux réalisation",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "suivre action avec \u003cN taux realisation\u003e et \u003ctaux suivi\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 62,
  "name": "Vérifier etat action suivi",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "Clôturée Action",
  "keyword": "And "
});
formatter.examples({
  "line": 65,
  "name": "",
  "description": "",
  "id": "qualipro--test-fiche-action;qualipro--en-tant-que-responsable,-je-souhaite-traiter-et-suivre-l-action-avec-des-taux-différents;",
  "rows": [
    {
      "cells": [
        "exemple",
        "A taux realisation",
        "N taux realisation",
        "taux suivi"
      ],
      "line": 66,
      "id": "qualipro--test-fiche-action;qualipro--en-tant-que-responsable,-je-souhaite-traiter-et-suivre-l-action-avec-des-taux-différents;;1"
    },
    {
      "cells": [
        "1",
        "50",
        "30",
        "70"
      ],
      "line": 67,
      "id": "qualipro--test-fiche-action;qualipro--en-tant-que-responsable,-je-souhaite-traiter-et-suivre-l-action-avec-des-taux-différents;;2"
    },
    {
      "cells": [
        "1",
        "100",
        "100",
        "100"
      ],
      "line": 68,
      "id": "qualipro--test-fiche-action;qualipro--en-tant-que-responsable,-je-souhaite-traiter-et-suivre-l-action-avec-des-taux-différents;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8057815800,
  "status": "passed"
});
formatter.scenario({
  "line": 67,
  "name": "Qualipro- En tant que responsable, je souhaite traiter et suivre l action avec des taux différents",
  "description": "",
  "id": "qualipro--test-fiche-action;qualipro--en-tant-que-responsable,-je-souhaite-traiter-et-suivre-l-action-avec-des-taux-différents;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 50,
      "name": "@RealisationetSuiviAction"
    }
  ]
});
formatter.step({
  "line": 52,
  "name": "Ouvrir le site QualiProWeb",
  "keyword": "Given "
});
formatter.step({
  "line": 53,
  "name": "saisir Login et PW",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "cliquer sur ouvrir une session",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "saisir 1 action",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "Consulter action a traiter",
  "keyword": "When "
});
formatter.step({
  "line": 57,
  "name": "Réaliser action avec 50",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "Vérifier etat action realisé",
  "keyword": "Then "
});
formatter.step({
  "line": 59,
  "name": "Consulter action a suivre",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "vérifier taux réalisation",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "suivre action avec 30 et 70",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 62,
  "name": "Vérifier etat action suivi",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "Clôturée Action",
  "keyword": "And "
});
formatter.match({
  "location": "AuthentificationStepDefinition.ouvrirQualiProWeb()"
});
formatter.result({
  "duration": 11375373000,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.saisirLoginPW()"
});
formatter.result({
  "duration": 2016428000,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.clickOuvrirSession()"
});
formatter.result({
  "duration": 24680640200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 7
    }
  ],
  "location": "FicheActionStepDefinition.saisir_action(int)"
});
formatter.result({
  "duration": 29991101,
  "status": "passed"
});
formatter.match({
  "location": "FicheActionStepDefinition.consulter_action_a_traiter()"
});
formatter.result({
  "duration": 15912373199,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td[1]\"}\n  (Session info: chrome\u003d83.0.4103.116)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027TAZ\u0027, ip: \u0027192.168.43.160\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\mootez\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:50622}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: bacda163b20c7f39dcb6b6c01030697e\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td[1]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy26.findElement(Unknown Source)\r\n\tat com.qualiprobdd.e2etests.moduleAction.models.FicheActionModele.choixNumActionRealisation(FicheActionModele.java:485)\r\n\tat com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.consulter_action_a_traiter(FicheActionStepDefinition.java:403)\r\n\tat ✽.When Consulter action a traiter(C:/Users/mootez/eclipse-workspace/testauto-web-mobile/web/src/specs/features/moduleAction/Action.feature:56)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 21
    }
  ],
  "location": "FicheActionStepDefinition.réaliser_action_avec(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FicheActionStepDefinition.vérifier_etat_action_realisé()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FicheActionStepDefinition.consulter_action_a_suivre()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FicheActionStepDefinition.vérifier_taux_réalisation()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "30",
      "offset": 19
    },
    {
      "val": "70",
      "offset": 25
    }
  ],
  "location": "FicheActionStepDefinition.suivre_action_avec_et(int,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FicheActionStepDefinition.vérifier_etat_action_suivi()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FicheActionStepDefinition.Clôturée_Action()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 588859500,
  "status": "passed"
});
formatter.before({
  "duration": 8296241599,
  "status": "passed"
});
formatter.scenario({
  "line": 68,
  "name": "Qualipro- En tant que responsable, je souhaite traiter et suivre l action avec des taux différents",
  "description": "",
  "id": "qualipro--test-fiche-action;qualipro--en-tant-que-responsable,-je-souhaite-traiter-et-suivre-l-action-avec-des-taux-différents;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 50,
      "name": "@RealisationetSuiviAction"
    }
  ]
});
formatter.step({
  "line": 52,
  "name": "Ouvrir le site QualiProWeb",
  "keyword": "Given "
});
formatter.step({
  "line": 53,
  "name": "saisir Login et PW",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "cliquer sur ouvrir une session",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "saisir 1 action",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "Consulter action a traiter",
  "keyword": "When "
});
formatter.step({
  "line": 57,
  "name": "Réaliser action avec 100",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "Vérifier etat action realisé",
  "keyword": "Then "
});
formatter.step({
  "line": 59,
  "name": "Consulter action a suivre",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "vérifier taux réalisation",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "suivre action avec 100 et 100",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 62,
  "name": "Vérifier etat action suivi",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "Clôturée Action",
  "keyword": "And "
});
formatter.match({
  "location": "AuthentificationStepDefinition.ouvrirQualiProWeb()"
});
formatter.result({
  "duration": 4798549201,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.saisirLoginPW()"
});
formatter.result({
  "duration": 1571016400,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.clickOuvrirSession()"
});
formatter.result({
  "duration": 14192563801,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 7
    }
  ],
  "location": "FicheActionStepDefinition.saisir_action(int)"
});
formatter.result({
  "duration": 5867099,
  "status": "passed"
});
formatter.match({
  "location": "FicheActionStepDefinition.consulter_action_a_traiter()"
});
formatter.result({
  "duration": 12487951500,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td[1]\"}\n  (Session info: chrome\u003d83.0.4103.116)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027TAZ\u0027, ip: \u0027192.168.43.160\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\mootez\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:50684}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 0c01b136b999fcd897f617eaf9d47401\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td[1]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy26.findElement(Unknown Source)\r\n\tat com.qualiprobdd.e2etests.moduleAction.models.FicheActionModele.choixNumActionRealisation(FicheActionModele.java:485)\r\n\tat com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.consulter_action_a_traiter(FicheActionStepDefinition.java:403)\r\n\tat ✽.When Consulter action a traiter(C:/Users/mootez/eclipse-workspace/testauto-web-mobile/web/src/specs/features/moduleAction/Action.feature:56)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 21
    }
  ],
  "location": "FicheActionStepDefinition.réaliser_action_avec(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FicheActionStepDefinition.vérifier_etat_action_realisé()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FicheActionStepDefinition.consulter_action_a_suivre()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FicheActionStepDefinition.vérifier_taux_réalisation()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 19
    },
    {
      "val": "100",
      "offset": 26
    }
  ],
  "location": "FicheActionStepDefinition.suivre_action_avec_et(int,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FicheActionStepDefinition.vérifier_etat_action_suivi()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FicheActionStepDefinition.Clôturée_Action()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 413894999,
  "status": "passed"
});
});
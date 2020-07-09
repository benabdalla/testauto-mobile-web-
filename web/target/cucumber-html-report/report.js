$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/specs/features/moduleAction/Action.feature");
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
  "duration": 9525625800,
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
  "duration": 9049663600,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.saisirLoginPW()"
});
formatter.result({
  "duration": 1574970100,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.clickOuvrirSession()"
});
formatter.result({
  "duration": 34384326300,
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
  "duration": 55479300,
  "status": "passed"
});
formatter.match({
  "location": "FicheActionStepDefinition.consulter_action_a_traiter()"
});
formatter.result({
  "duration": 11246096300,
  "error_message": "java.io.FileNotFoundException: src\\main\\resources\\testData\\TestData.xlsx (Le chemin d’accès spécifié est introuvable)\r\n\tat java.base/java.io.FileInputStream.open0(Native Method)\r\n\tat java.base/java.io.FileInputStream.open(FileInputStream.java:213)\r\n\tat java.base/java.io.FileInputStream.\u003cinit\u003e(FileInputStream.java:155)\r\n\tat java.base/java.io.FileInputStream.\u003cinit\u003e(FileInputStream.java:110)\r\n\tat com.qualiprobdd.e2etests.util.ExcelUtils.setExcelFile(ExcelUtils.java:35)\r\n\tat com.qualiprobdd.e2etests.moduleAction.stepdefs.FicheActionStepDefinition.consulter_action_a_traiter(FicheActionStepDefinition.java:397)\r\n\tat ✽.When Consulter action a traiter(src/specs/features/moduleAction/Action.feature:56)\r\n",
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
  "duration": 705633800,
  "status": "passed"
});
formatter.before({
  "duration": 25859052000,
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
  "duration": 12910628400,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d83.0.4103.116)\nBuild info: version: \u00273.8.0\u0027, revision: \u0027924c4067df\u0027, time: \u00272017-11-30T11:20:39.408Z\u0027\nSystem info: host: \u0027taz\u0027, ip: \u0027192.168.43.160\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\mootez\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:49493}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: a142d56106ca6cee460bec70f1ab26b0\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:325)\r\n\tat com.qualiprobdd.e2etests.authentification.stepdefs.AuthentificationStepDefinition.ouvrirQualiProWeb(AuthentificationStepDefinition.java:35)\r\n\tat ✽.Given Ouvrir le site QualiProWeb(src/specs/features/moduleAction/Action.feature:52)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.saisirLoginPW()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AuthentificationStepDefinition.clickOuvrirSession()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "FicheActionStepDefinition.consulter_action_a_traiter()"
});
formatter.result({
  "status": "skipped"
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
formatter.after({
  "duration": 12135262000,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d83.0.4103.116)\nBuild info: version: \u00273.8.0\u0027, revision: \u0027924c4067df\u0027, time: \u00272017-11-30T11:20:39.408Z\u0027\nSystem info: host: \u0027taz\u0027, ip: \u0027192.168.43.160\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\mootez\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:49493}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: a142d56106ca6cee460bec70f1ab26b0\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:658)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:343)\r\n\tat com.qualiprobdd.e2etests.util.Setup.afterScenario(Setup.java:49)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:223)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:211)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:205)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:580)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:716)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:988)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:648)\r\n\tat org.testng.TestRunner.run(TestRunner.java:505)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:455)\r\n\tat org.testng.SuiteRunner.access$000(SuiteRunner.java:40)\r\n\tat org.testng.SuiteRunner$SuiteWorker.run(SuiteRunner.java:489)\r\n\tat org.testng.internal.thread.ThreadUtil$1.call(ThreadUtil.java:52)\r\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\r\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)\r\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)\r\n\tat java.base/java.lang.Thread.run(Thread.java:830)\r\n",
  "status": "failed"
});
});
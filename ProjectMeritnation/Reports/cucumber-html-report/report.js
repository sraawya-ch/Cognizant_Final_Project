$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/SRAAWYA CH/eclipse-workspace/ProjectMeritnation/src/test/resources/Features/AllModules.feature");
formatter.feature({
  "line": 2,
  "name": "AUT: Meritnation",
  "description": "As a user I want to see my profile details and update them.",
  "id": "aut:-meritnation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Meritnation"
    },
    {
      "line": 1,
      "name": "@student"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "To sign in the existing user",
  "description": "",
  "id": "aut:-meritnation;to-sign-in-the-existing-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@tc_01_login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I need to launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I am on the homepage",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on the login link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter the valid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click on the login button",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "aut:-meritnation;to-sign-in-the-existing-user;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 14,
      "id": "aut:-meritnation;to-sign-in-the-existing-user;;1"
    },
    {
      "cells": [
        "meritnation.test@gmail.com",
        "password1234"
      ],
      "line": 15,
      "id": "aut:-meritnation;to-sign-in-the-existing-user;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "To sign in the existing user",
  "description": "",
  "id": "aut:-meritnation;to-sign-in-the-existing-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@student"
    },
    {
      "line": 5,
      "name": "@tc_01_login"
    },
    {
      "line": 1,
      "name": "@Meritnation"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I need to launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I am on the homepage",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on the login link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter the valid \"meritnation.test@gmail.com\" and \"password1234\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Meritnation_editprofileStep.i_need_to_launch_the_browser()"
});
formatter.result({
  "duration": 17710965700,
  "status": "passed"
});
formatter.match({
  "location": "Meritnation_editprofileStep.i_am_on_the_homepage()"
});
formatter.result({
  "duration": 104900,
  "status": "passed"
});
formatter.match({
  "location": "Meritnation_editprofileStep.i_click_on_the_login_link()"
});
formatter.result({
  "duration": 123222600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "meritnation.test@gmail.com",
      "offset": 19
    },
    {
      "val": "password1234",
      "offset": 52
    }
  ],
  "location": "Meritnation_editprofileStep.i_enter_the_valid_and(String,String)"
});
formatter.result({
  "duration": 257755200,
  "status": "passed"
});
formatter.match({
  "location": "Meritnation_editprofileStep.i_click_on_the_login_button0()"
});
formatter.result({
  "duration": 30162742200,
  "error_message": "org.openqa.selenium.NoSuchFrameException: No frame element found by name or id container-notification-frame-5e78cbd57635bd53149c7eaf\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-LFJQBRS\u0027, ip: \u0027192.168.0.71\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteTargetLocator.frame(RemoteWebDriver.java:885)\r\n\tat com.seleniumutil.MeritnationUtil.alertAfterLogin(MeritnationUtil.java:46)\r\n\tat com.StepDefinition.Meritnation_editprofileStep.i_click_on_the_login_button0(Meritnation_editprofileStep.java:67)\r\n\tat ✽.Then I click on the login button(C:/Users/SRAAWYA CH/eclipse-workspace/ProjectMeritnation/src/test/resources/Features/AllModules.feature:11)\r\n",
  "status": "failed"
});
formatter.scenarioOutline({
  "line": 18,
  "name": "To change password of the user account and update account details",
  "description": "",
  "id": "aut:-meritnation;to-change-password-of-the-user-account-and-update-account-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@tc_02_editprofile"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I log in with credentials \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I click on profile icon",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "click on My Account",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I  navigate to profile page",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I click on Edit profile",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I change \"\u003cpassword\u003e\" with \"\u003cnewPassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I click save button",
  "keyword": "And "
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "aut:-meritnation;to-change-password-of-the-user-account-and-update-account-details;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "newPassword"
      ],
      "line": 28,
      "id": "aut:-meritnation;to-change-password-of-the-user-account-and-update-account-details;;1"
    },
    {
      "cells": [
        "meritnation.test@gmail.com",
        "password1234",
        "password123"
      ],
      "line": 29,
      "id": "aut:-meritnation;to-change-password-of-the-user-account-and-update-account-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 29,
  "name": "To change password of the user account and update account details",
  "description": "",
  "id": "aut:-meritnation;to-change-password-of-the-user-account-and-update-account-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@tc_02_editprofile"
    },
    {
      "line": 1,
      "name": "@student"
    },
    {
      "line": 1,
      "name": "@Meritnation"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I log in with credentials \"meritnation.test@gmail.com\" and \"password1234\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I click on profile icon",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "click on My Account",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I  navigate to profile page",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I click on Edit profile",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I change \"password1234\" with \"password123\"",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I click save button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "meritnation.test@gmail.com",
      "offset": 27
    },
    {
      "val": "password1234",
      "offset": 60
    }
  ],
  "location": "Meritnation_editprofileStep.i_log_in_with_credentials_and(String,String)"
});

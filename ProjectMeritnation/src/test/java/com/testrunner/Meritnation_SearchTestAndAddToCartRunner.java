package com.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\SRAAWYA CH\\eclipse-workspace\\ProjectMeritnation\\src\\test\\resources\\Features\\SearchTestAndAddToCart.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport",
		"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"}

		)
public class Meritnation_SearchTestAndAddToCartRunner {
	

    @AfterClass
      public static void extendReport()
    {
        Reporter.loadXMLConfig("C:\\Users\\SRAAWYA CH\\eclipse-workspace\\ProjectMeritnation\\src\\test\\resources\\Testdata\\extent-config.xml");
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }


}

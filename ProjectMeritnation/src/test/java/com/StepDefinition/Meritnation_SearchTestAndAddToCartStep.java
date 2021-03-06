package com.StepDefinition;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.baseclass.Library;
import com.pages.Meritnation_EditProfile;
import com.pages.Meritnation_SearchTestAndAddToCart;
import com.seleniumutil.MeritnationUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Meritnation_SearchTestAndAddToCartStep extends Library{
	Meritnation_EditProfile profile ;
	Meritnation_SearchTestAndAddToCart test;
	MeritnationUtil util;
	Logger log = LogManager.getLogger("Logger");
	
//@tc_02_	FindTest
	@Given("^I need to launch the browser and log in with credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_need_to_launch_the_browser_and_log_in_with_credentials_and(String username, String password)  {

		LaunchBrowser("chrome", "https://www.meritnation.com/");
		
		util = new MeritnationUtil(driver);
		util.closeAlert("container-notification-frame-5e79f05a7635bd53149c7f22");
		
		profile = new Meritnation_EditProfile(driver);
		profile.clickLoginLink();
		profile.enterDetails("meritnation.test@gmail.com", "password123");
		profile.clickLoginBtn();
		
		util.alertAfterLogin("container-notification-frame-5e78cbd57635bd53149c7eaf");
		
		log.info("user clicks on purchase link "); 
	}
	
@Given("^I click on purchase$")
public void i_click_on_purchase(){
	
	test = new Meritnation_SearchTestAndAddToCart(driver);
	test.clickPurchaseLink();
	
	log.info("The log in linked page is clicked");
}


@When("^I Scroll down to test generator$")
public void i_Scroll_down_to_test_generator() {
	
	test = new Meritnation_SearchTestAndAddToCart(driver);
	test.scrollToTestGenerator();
	
	log.info("Am logging through step");

}

@When("^select one topic to create test$")
public void select_one_topic_to_create_test() {
	
	test = new Meritnation_SearchTestAndAddToCart(driver);
	test.selectTopicsForTest();
	log.info("user selects topics for test course ");
}

@Then("^I click on generate test button$")
public void i_click_on_generate_test_button(){
	
	test = new Meritnation_SearchTestAndAddToCart(driver);
	test.clickGenerateTest();
	log.info("user click generate test button");
}

@Then("^I add first Test Course to cart$")
public void i_add_first_Test_Course_to_cart() throws IOException {
	test = new Meritnation_SearchTestAndAddToCart(driver);
	test.addTestToCart();
	
	sleep(3000);
	MeritnationUtil util = new MeritnationUtil(driver);
	util.TakeScreenShot("C:\\Users\\SRAAWYA CH\\eclipse-workspace\\ProjectMeritnation\\src\\test\\resources\\Screenshots\\SearchTestAndAddToCart.PNG");
	browser_close();
	
	log.info("user adds the test course to cart");
}


}

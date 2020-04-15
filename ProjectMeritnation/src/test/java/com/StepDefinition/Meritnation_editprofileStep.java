package com.StepDefinition;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.baseclass.Library;
import com.excelutility.excelUtil;
import com.pages.Meritnation_EditProfile;
import com.seleniumutil.MeritnationUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Meritnation_editprofileStep extends Library {
	
	Meritnation_EditProfile profile;
	MeritnationUtil util;
	Logger log = Logger.getLogger("Logger");
	excelUtil excelread = new excelUtil();
	
//@tc_01_login	
@Given("^I need to launch the browser$")
public void i_need_to_launch_the_browser() throws InterruptedException {
	
	LaunchBrowser("chrome", "https://www.meritnation.com/");
	
	util = new MeritnationUtil(driver);
	util.closeAlert("container-notification-frame-5e79f05a7635bd53149c7f22");	
	
	log.info("user launches the browser");
}


@Given("^I am on the homepage$")
public void i_am_on_the_homepage() {
	log.info("User is on the homepage");
}

@Given("^I click on the login link$")
public void i_click_on_the_login_link() {
	
	profile = new Meritnation_EditProfile(driver);
	profile.clickLoginLink();
	
	log.info("user is on the login page");
}


@When("^I enter the valid \"([^\"]*)\" and \"([^\"]*)\"$")
public void i_enter_the_valid_and(String username, String password) 
{
	profile = new Meritnation_EditProfile(driver);
	profile.enterDetails(username, password);	
	
	log.info("user enters the valid username and password");
}


@Then("^I click on the login button$")
public void i_click_on_the_login_button0() throws IOException {
	
	profile = new Meritnation_EditProfile(driver);
	profile.clickLoginBtn();
	
	util.alertAfterLogin("container-notification-frame-5e78cbd57635bd53149c7eaf");
	util = new MeritnationUtil(driver);
	util.TakeScreenShot("C:\\Users\\SRAAWYA CH\\eclipse-workspace\\ProjectMeritnation\\src\\test\\resources\\Screenshots\\loginSuccess.png");
	
	browser_close();
	
	log.info("user is logged in to the website and closes the browser");
	
}

//@tc_02_editprofile
@Given("^I log in with credentials \"([^\"]*)\" and \"([^\"]*)\"$")
public void i_log_in_with_credentials_and(String username, String password) {
	LaunchBrowser("chrome", "https://www.meritnation.com/");
	util = new MeritnationUtil(driver);
	util.closeAlert("container-notification-frame-5e79f05a7635bd53149c7f22");
	
	profile = new Meritnation_EditProfile(driver);
	profile.clickLoginLink();
	profile.enterDetails(username, password);
	profile.clickLoginBtn();
	
	util.alertAfterLogin("container-notification-frame-5e78cbd57635bd53149c7eaf");	
	log.info("user is logged in to the website ");
	
}
@Given("^I click on profile icon$")
public void i_click_on_profile_icon() {
	profile = new Meritnation_EditProfile(driver);
	profile.clickProfileIcon();
	
	log.info("user clicks on profile icon");
}

@Given("^click on My Account$")
public void click_on_My_Account() {
	
	profile = new Meritnation_EditProfile(driver);
	profile.clickMyAccount();
	
	log.info("user clicks on my account");
}


@When("^I  navigate to profile page$")
public void i_navigate_to_profile_page1() {
	log.info("user navigates to profile page");
}

@When("^I click on Edit profile$")
public void i_click_on_Edit_profile() {
	
	profile = new Meritnation_EditProfile(driver);
	profile.clickEditProfile();
	
	log.info("user clicks on edit profile");
}

@Then("^I change \"([^\"]*)\" with \"([^\"]*)\"$")
public void i_change_with(String password, String newPassword) throws IOException {
	
	profile = new Meritnation_EditProfile(driver);
	profile.changePassword(password, newPassword); 			//if password changed,update login in other testcases with new password
	
	util = new MeritnationUtil(driver);
	sleep(3000);
	util.TakeScreenShot("C:\\Users\\SRAAWYA CH\\eclipse-workspace\\ProjectMeritnation\\src\\test\\resources\\Screenshots\\updateSuccess.png");
	browser_close();
	
	log.info("user changes password and updates the account details ");
	
}

//@tc_03_editprofile
@Then("^I update account details with emailId and grade$")
public void i_update_account_details_with_emailId_and_grade() throws IOException {
	
	profile = new Meritnation_EditProfile(driver);
	String alter_emailid = excelread.Excel_read(2, 1,"AccountDetails");
	String grade = excelread.Excel_read(2, 2, "AccountDetails");
	profile.updateAccountDetails(alter_emailid, grade);
	
	util = new MeritnationUtil(driver);
	sleep(3000);
	util.TakeScreenShot("C:\\Users\\SRAAWYA CH\\eclipse-workspace\\ProjectMeritnation\\src\\test\\resources\\Screenshots\\updateSuccess.png");
	browser_close();
	
	log.info("User updates account details with school name and Grade");
	
}


@Then("^I click save button$")
public void i_click_save_button() {
	log.info("user clicks save button");
}


//@tc_04_editprofile
@When("^I navigate to profile page$")
public void i_navigate_to_profile_page() {
	
	profile = new Meritnation_EditProfile(driver);
	profile.clickProfileIcon();
	profile.clickMyAccount();
	profile.clickEditProfile();
	
	log.info("user navigates to profile page");
}


@Then("^I update my personal details with \"([^\"]*)\" and \"([^\"]*)\"$")
public void i_update_my_personal_details_with_and(String DOB, String State) throws IOException {
	profile = new Meritnation_EditProfile(driver);
	profile.updatePersonalDetails(DOB,State);
	util = new MeritnationUtil(driver);
	sleep(3000);
	util.TakeScreenShot("C:\\Users\\SRAAWYA CH\\eclipse-workspace\\ProjectMeritnation\\src\\test\\resources\\Screenshots\\UpdatePersonalDetails.png");
	browser_close();
	
	log.info("user updates personal details");
	
}



//@tc_05_editprofile
@Then("^I update my School details with \"([^\"]*)\"$")
public void i_update_my_School_details_with(String schoolName) throws IOException {
	profile = new Meritnation_EditProfile(driver);
	profile.updateSchoolDetails(schoolName);
	util = new MeritnationUtil(driver);
	util.TakeScreenShot("C:\\Users\\SRAAWYA CH\\eclipse-workspace\\ProjectMeritnation\\src\\test\\resources\\Screenshots\\UpdateSchool.png");
	
	browser_close();
	
	log.info("user updates school details");
}


//@tc_06_editprofile
@Then("^I update parent details with \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\"$")
public void i_update_parent_details_with_and(String parentName, String parentEmailId, String MobileNo) {
	profile = new Meritnation_EditProfile(driver);
	profile.updateParentDetails(parentName, parentEmailId, MobileNo);
	browser_close();
	
	log.info("user updates parent's details");

}

//@tc_07_logout
@Then("^I click on logout button$")
public void i_click_on_logout_button() {
	profile = new Meritnation_EditProfile(driver);
	profile.logout();
	
	log.info("user clicks on logout button");
}

@Then("^I am logged out$")
public void i_am_logged_out() {
	
	browser_close();
	log.info("user is logged out of the account");
}


}
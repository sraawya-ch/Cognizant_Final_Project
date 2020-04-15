@Meritnation @student
Feature: AUT: Meritnation
  As a user I want to see my profile details and update them.

  @tc_01_login
  Scenario Outline: To sign in the existing user
  Given I need to launch the browser
  And I am on the homepage
  And I click on the login link
  When I enter the valid "<username>" and "<password>"
  Then I click on the login button
  
  Examples:
  | username                   |password    |
  | meritnation.test@gmail.com |password1234 |
  
  @tc_02_editprofile
  Scenario Outline: To change password of the user account and update account details
    Given I log in with credentials "<username>" and "<password>"
    And I click on profile icon
    And click on My Account
    When I  navigate to profile page
    And I click on Edit profile
    Then I change "<password>" with "<newPassword>"
    And I click save button

    Examples: 
      | username                   |password    |newPassword  |
      | meritnation.test@gmail.com |password1234 |password123 |
  
   @tc_03_editprofile
  Scenario Outline: To change password of the user account and update account details
    Given I log in with credentials "<username>" and "<password>"
    And I click on profile icon
    And click on My Account
    When I  navigate to profile page
    And I click on Edit profile
    Then I update account details with emailId and grade
    And I click save button
  
  
  Examples:
  |username                   |password    |
  |meritnation.test@gmail.com |password123 |
  
  	@tc_04_editprofile
  	Scenario Outline: To update Personal details of the user
  Given I log in with credentials "<username>" and "<password>"
  When I navigate to profile page
  Then I update my personal details with "<DOB>" and "<State>"
  And I click save button
  
  Examples:
  | username                   | password    | DOB        | State     |
  | meritnation.test@gmail.com | password123 | 22-05-1998 | Telangana |
  
  	@tc_05_editprofile
  	Scenario Outline: To update school details of the user
  Given I log in with credentials "<username>" and "<password>"
  When I navigate to profile page
  Then I update my School details with "<SchoolName>"
  And I click save button
  
  Examples:
  | username                   | password    | SchoolName      |
  | meritnation.test@gmail.com | password123 | KV AFS BEGUMPET |
  
  	@tc_06_editprofile
  	Scenario Outline: To update parent's details of the user
  Given I log in with credentials "<username>" and "<password>"
  When I navigate to profile page
  Then I update parent details with "<parentName>" , "<parentEmailId>" and "<MobileNo.>"
  And I click save button
  
  Examples:
  | username                   | password    | parentName | parentEmailId    | MobileNo.  |
  | meritnation.test@gmail.com | password123 | TestParent | parent@gmail.com | 9874632147 |
  
  	@tc_07_logout
  	Scenario Outline: To Logout
  Given I log in with credentials "<username>" and "<password>"
  When I click on profile icon
  Then I click on logout button
  And I am logged out
  
  Examples:
  | username                   | password    |
  | meritnation.test@gmail.com | password123 |
  
  	#As a user I want to be able to  explore my feed and add to post to my feed
  	@tc_02_FeedPage
  	  Scenario Outline: To explore Feed page of the user
		  Given I log into the website with credentials "<username>" and "<password>"
		  When I click on Feed from homepage title bar
		  And I navigate to Feed Page
		  And I navigate to my post
		  Then I enter the post details in edit box as "<Note>"
		  And I click Post button
		  And My post appears in MyPost
		  
		  Examples:
		  | username                   | password    | Note              |
		  | meritnation.test@gmail.com | password123 | This is test post |
  
  
  #	As a user i want to search a test course through test generator
   #using search filter and add the test course to cart

  	@tc_02_FindTest
  	Scenario Outline: To find the test course and add to cart
    Given I need to launch the browser and log in with credentials "<username>" and "<password>"
    And I click on purchase
    When I Scroll down to test generator
    And select one topic to create test
    Then I click on generate test button
    And I add first Test Course to cart

    Examples: 
    | username                   | password    |
    | meritnation.test@gmail.com | password123 |
  
  #As a user i want to play a tutorial video
  
  @tc_02_PlayVideo
  Scenario Outline: To play tutorial video
    Given I log into website with credentials "<username>" and "<password>"
    When I play a tutorial video on topic
    And I take Screenshot
    Then I click on close button
    And I am navigated to homepage

    Examples: 
      | username                   | password    | Note              |
      | meritnation.test@gmail.com | password123 | This is test post |

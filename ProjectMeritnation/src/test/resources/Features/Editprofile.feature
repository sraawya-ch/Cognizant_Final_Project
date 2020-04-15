@Meritnation @student @editprofile
Feature: Edit profile
#
  #As a user I want to see my profile details and update them.
  #@tc_01_login
  #Scenario Outline: To sign in the existing user
  #Given I need to launch the browser
  #And I am on the homepage
  #And I click on the login link
  #When I enter the valid "<username>" and "<password>"
  #Then I click on the login button
  #
  #Examples:
  #| username                   | password    |
  #| meritnation.test@gmail.com | password123 |
  #
  #@tc_02_editprofile
  #Scenario Outline: To change password of the user account and update account details
    #Given I log in with credentials "<username>" and "<password>"
    #And I click on profile icon
    #And click on My Account
    #When I  navigate to profile page
    #And I click on Edit profile
    #Then I change "<password>" with "<newPassword>"
    #And I click save button
#
    #Examples: 
      #| username                   | password    | newPassword  |
      #| meritnation.test@gmail.com | password123 | password1234 |

  @tc_02_editprofile
  Scenario Outline: To change password of the user account and update account details
    Given I log in with credentials "<username>" and "<password>"
    And I click on profile icon
    And click on My Account
    When I  navigate to profile page
    And I click on Edit profile
    Then I update account details with emailId and grade
    And I click save button

    Examples: 
      | username                   | password    | 
      | meritnation.test@gmail.com | password123 | 
  #@tc_03_editprofile
  #Scenario Outline: To update Personal details of the user
    #Given I log in with credentials "<username>" and "<password>"
    #When I navigate to profile page
    #Then I update my personal details with "<DOB>" and "<State>"
    #And I click save button
#
    #Examples: 
      #| username                   | password    | DOB        | State     |
      #| meritnation.test@gmail.com | password123 | 22-05-1998 | Telangana |
#
  #@tc_04_editprofile
  #Scenario Outline: To update school details of the user
    #Given I log in with credentials "<username>" and "<password>"
    #When I navigate to profile page
    #Then I update my School details with "<SchoolName>"
    #And I click save button
#
    #Examples: 
      #| username                   | password    | SchoolName      |
      #| meritnation.test@gmail.com | password123 | KV AFS BEGUMPE |
#
  #@tc_05_editprofile
  #Scenario Outline: To update parent's details of the user
    #Given I log in with credentials "<username>" and "<password>"
    #When I navigate to profile page
    #Then I update parent details with "<parentName>" , "<parentEmailId>" and "<MobileNo.>"
    #And I click save button
#
    #Examples: 
      #| username                   | password    | parentName | parentEmailId    | MobileNo.  |
      #| meritnation.test@gmail.com | password123 | TestParent | parent@gmail.com | 9874632147 |
#
  #@tc_06_logout
  #Scenario Outline: To Logout
    #Given I log in with credentials "<username>" and "<password>"
    #When I click on profile icon
    #Then I click on logout button
    #And I am logged out
#
    #Examples: 
      #| username                   | password    |
      #| meritnation.test@gmail.com | password123 |

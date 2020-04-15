@Meritnation @Student @AddPostOnFeed
Feature: Feed Page
  		 As a user I want to be able to  explore my feed and add to post to my feed

  #	  @tc_01_login
  #	  Scenario Outline: To sign in the existing user
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
  #
  #
  @tc_02_FeedPage
  Scenario Outline: To explore Feed page of the user
    Given  I log into the website with credentials "<username>" and "<password>"
    When I click on Feed from homepage title bar
    And I navigate to Feed Page
    And I navigate to my post
    Then I enter the post details in edit box as "<Note>"
    And I click Post button
    And My post appears in MyPost

    Examples: 
      | username                   | password    | Note              |
      | meritnation.test@gmail.com | password123 | This is test post |

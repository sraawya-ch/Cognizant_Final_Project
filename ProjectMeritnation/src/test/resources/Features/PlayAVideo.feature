#student
@Meritnation @PlayVideo
Feature: Play Video
  As a user i want to play a tutorial video

  @tc_01_login
  Scenario Outline: To sign in the existing user
  Given I need to launch the browser
  And I am on the homepage
  And I click on the login link
  When I enter the valid "<username>" and "<password>"
  Then I click on the login button
  
  Examples:
  | username                   | password    |
  | meritnation.test@gmail.com | password123 |
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
  

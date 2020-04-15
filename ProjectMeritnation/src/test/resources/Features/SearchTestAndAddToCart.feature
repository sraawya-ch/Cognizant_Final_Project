# Student
@Meritnation @SearchTestAndAddToCart
Feature: Search and Add test to cart
  As a user i want to search a test course through test generator 
  using search filter and add the test course to cart

  
	  Scenario Outline: To sign in the existing user
    Given I need to launch the browser
    And I am on the homepage
    And I click on the login link
    When I enter the valid "<username>" and "<password>"
    Then I click on the login button

    Examples: 
      | username                   | password    |
      | meritnation.test@gmail.com | password123 |
  
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

Feature: Guru99 Bank Demo Login

  Background: 
    Given Browser is open and user enter the url

  Scenario: Verify that user is bale to navigate to the login page
    Then user is navigated to the login page

  Scenario: Verify that user is able to login successfully with valid credentials
    When user enters the valid username
    And user enters the valid password
    And user clicks on login button
    Then user is redirected to the homepage.
#
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |

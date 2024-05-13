Feature: Add a new Customer

  #Background: 
    #Given Browser is open and user enter the url
    #When user enters the valid username
    #And user enters the valid password
    #And user clicks on login button
    #Then user is redirected to the homepage.

  Scenario: Verify that user is able to add a new customer
  	When user clicks on New Customer link
  	Then user get redirected to Add New Customer page
  	When user fills the Customer Name
  	And user selects male gender
  	And user enters date of birth
  	And user enters the address
  	And user enters the city
  	And user enter the state
  	And user enter the PIN
  	And user enters the mobile number
  	And user enters the email id
  	And user enters the password
  	And user clicks on submit button
  
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |

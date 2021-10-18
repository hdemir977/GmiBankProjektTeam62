Feature: Demo :
  The user first creates a registration from the registration page.
  Employee creates two accounts for the user.
  Employee registers the user.
  Admin activates the user.
  The user logs into his own account and creates a transfer between the two accounts.

  Background:
    Given User navigates go to "gmi_url"
    Then click menu icon

  Scenario: The user first creates a registration from the registration page.
    And click register option
    And enter valid ssn no "345-23-8787" demo
    And enter valid first name
    And enter valid last name
    And enter valid adress
    And enter valid phone number
    And enter valid username "Team62DemoUser17" demo
    And enter valid email
    And enter new password "1Aa.123" demo
    And enter new password confirmation "1Aa.123" demo
    Then click register button
    And see registration saved

   Scenario: Employee creates two accounts for the user.
     Then user logged in with a valid username and password
     And User clicks to My Operations menu
     Then User clicks to Manage Accounts button
     Then User clicks to Create a new Account button
     Then User enter "DemoTeam62Account30" in the Description and "5500" in the balance boxes
     Then User enter the later Date at the time of creation time.
     Then User enter Save button.
     And User checks if new account has been created demo


     Then User clicks to Create a new Account button
     Then User enter "DemoTeam62Account31" in the Description and "5500" in the balance boxes
     Then User enter the later Date at the time of creation time.
     Then User enter Save button.
     And User checks if new account has been created demo




  Scenario:  Employee registers the user.

    And User clicks to My Operations menu
    Then User clicks to Manage Customer Button
    Then User clicks to Create a new Customer button
    Then User enter a valid SSN nummer "345-23-8787" in SSN box
    Then User clicks search button
    And enter text to Middle Initial Text Box "Ali"
    And enter a valid phone Number to phone number text box demo
   # And enter a valid phone Number to phone number text box
    And enter a valid zip code to zip code text box "7649"
    And enter a city to city text box "Van"
    Then User enter earlier Date in Create Date box demo
    And select from county dropdown
    And enter text "Montbaur" in State
    And select from accounts  "DemoTeam62Account30" and "DemoTeam62Account31" accounts
    Then User enter Save button.
    And user logged out

  Scenario: Admin activates the user.
    And click sign in option
    And enter valid admin username "admin_username"
    And enter valid admin password "admin_password"
    And click on sign in button
    And click on Administration
    And click on user management
    And click on Created date
    And click Activate button "team62demouser17"
    And user logged out

  Scenario: The user logs into his own account and creates a transfer between the two accounts.
    And click sign in option
    And enter valid customer username "Team62DemoUser17"
    And enter valid customer password "1Aa.123"
    And click on sign in button demo
    And click on My Operations and My Accounts
    And click on My Operations and Transfer Money
    And Select fromaccount "DemoTeam62Account30" and toaccount "DemoTeam62Account31"
    And enter "5" to balance box
    And enter "Team62DemoDenemeTransfer1" in description box
    And click make transfer button
    And click on My Operations and My Accounts
    And click both viewTransaction buttons
    And click on My Operations and Transfer Money
    And Select fromaccount "DemoTeam62Account30" and toaccount "DemoTeam62Account31"
    And enter "10" to balance box
    And enter "Team62DemoDenemeTransfer2" in description box
    And click make transfer button
    And click on My Operations and My Accounts
    And click both viewTransaction buttons
    And user logged out



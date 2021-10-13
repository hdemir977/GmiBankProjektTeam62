


Feature: Create a new account Functionality (Date should be created on the time of account creation)

  Background: The employee must be logged in with a valid username and password
    Given Given User navigates go to "gmi_url"
    Then click menu icon1
    Then user logged in with a valid username and password


  Scenario: TC_01 The date cannot be typed earlier, in the past, at the time of creation an account

    And User clicks to My Operations menu
    Then User clicks to Manage Accounts button
    Then User clicks to Create a new Account button
    Then User enter "DenemeAcountTeam62" in the Description and "5500" in the balance boxes
    Then User enter earlier Date in Create Date box.
    Then User enter the later Date at the time of creation time.
    Then User enter Save button.
    And User checks if new account has been created


  Scenario: TC_02 The date should be created as month, day, year, hour and minute

    And User clicks to My Operations menu
    Then User clicks to Manage Accounts button
    Then User clicks to Create a new Account button
    Then User enter "DenemeAcountTeam62" in the Description and "5500" in the balance boxes
    Then User create Date as month, day, year, hour and minute and click Enter
    And Check the date in Create Date box

  Scenario: TC_03 User can choose a user from the registration and it cannot be blank

    And User clicks to My Operations menu
    Then User clicks to Manage Customer Button
    Then User clicks to Create a new Customer button
    Then User enter a valid SSN nummer "541-01-4572" in SSN box
    Then User clicks search button
    And Check it is not blank

  Scenario: TC_04 There user can choose an account created on manage accounts

    And User clicks to My Operations menu
    Then User clicks to Manage Accounts button
    Then User select any random account and click on their id.
    And Check this is an account

  Scenario: TC_05 User can select Zelle Enrolled optionally and save it

    And User clicks to My Operations menu
    Then User clicks to Manage Customer Button
    Then user select any random customer and click on their id.
    Then User checks Zelle Enrolled box and clicks Edit buttonbuttons should be clickable
    Then User clicks Zelle Enrolled button and save button
    And Check Zelle Enrolled changed
@us_001
Feature: US001 Registration Page

  Scenario: TC0107 any user to register with valid credentials
  validating the success message

    Given Given User navigates go to "gmi_url"
    Then click menu icon
    And click register option
    And enter valid ssn no
    And enter valid first name
    And enter valid last name
    And enter valid adress
    And enter valid phone number
    And enter valid username
    And enter valid email
    And enter new password "password"
    And enter new password confirmation "password"
    Then click register button
    And see registration saved

@us_001
Feature: US001 Registration Page

  Background:
    Given User navigates go to "gmi_url"
    Then click menu icon

  Scenario: TC0107 any user to register with valid credentials
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

    Scenario Outline: US_001 Registration with javafaker
      And click register option
      And enter valid ssn no  with JavaFaker "<SSN>"
      And enter valid first name with JavaFaker "<firstname>"
      And enter valid last name with JavaFaker "<lastname>"
      And enter valid adress with JavaFaker "<address>"
      And enter valid phone number with JavaFaker "<mobilephone>"
      And enter valid username with JavaFaker "<username>"
      And enter valid email with JavaFaker "<email>"
      And enter new password with JavaFaker "<firstpassword>"
      And enter new password confirmation with JavaFaker "<secondpassword>"
      And user click on Register button and validates success message saved as "<message>"
      Then user close page

      Examples:
      |SSN|firstname|lastname|address|mobilephone|username|email|firstpassword|secondpassword|message|
      |   |         |        |       |           |        |     |             |              |       |
      |   |         |        |       |           |        |     |             |              |       |
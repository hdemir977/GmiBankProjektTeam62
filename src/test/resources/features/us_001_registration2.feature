
@us_001
Feature: US001 Registration Page

  Background:
    Given User navigates go to "gmi_url"
    Then click menu icon
    And click register option

  Scenario: TC_0101 user enter a valid ssn
    Given enter valid ssn no "valid_ssn"
    Then user should not see the ssn error message

  Scenario: TC_0102 user enter a valid firstname
    Given enter valid ssn no "valid_ssn"
    And enter valid first name "valid_firstname"
    Then user should not see the firstname error message

  Scenario: TC_0103 user enter a valid lastname
    Given enter valid ssn no "valid_ssn"
    And enter valid first name "valid_firstname"
    And enter valid lastname "valid_lastname"
    Then user should not see the lastname error message

  Scenario: TC_0104 user enter a valid adress
    Given enter valid ssn no "valid_ssn"
    And enter valid first name "valid_firstname"
    And enter valid lastname "valid_lastname"
    And enter valid adress "valid_adress"
    Then user should not see the adress error message

  Scenario: TC_0105 user enter a valid phone number
    Given enter valid ssn no "valid_ssn"
    And enter valid first name "valid_firstname"
    And enter valid lastname "valid_lastname"
    And enter valid adress "valid_adress"
    And enter valid phone number "valid_phonenumber"
    Then user should not see the phone number error message

  Scenario: TC_0106 user enter a valid username
    Given enter valid ssn no "valid_ssn"
    And enter valid first name "valid_firstname"
    And enter valid lastname "valid_lastname"
    And enter valid adress "valid_adress"
    And enter valid phone number "valid_phonenumber"
    And enter valid username "valid_username"
    Then user should not see the username error message

  Scenario: TC_0107 user enter a valid username
    Given enter valid ssn no "valid_ssn"
    And enter valid first name "valid_firstname"
    And enter valid lastname "valid_lastname"
    And enter valid adress "valid_adress"
    And enter valid phone number "valid_phonenumber"
    And enter valid username "valid_username"
    And enter valid email adress "valid_email"
    Then user should not see the email adress error message

  Scenario: Registration with valid credantials
    Given enter valid ssn no "valid_ssn"
    And enter valid first name "valid_firstname"
    And enter valid lastname "valid_lastname"
    And enter valid adress "valid_adress"
    And enter valid phone number "valid_phonenumber"
    And enter valid username "valid_username"
    And enter valid email adress "valid_email"
    And enter new password "valid_password"
    And enter new password confirmation "valid_password"
    Then click register button
    And see registration saved and verify success message


  Scenario Outline: ***** Registration valid credantials with Senario Outline ****
    Given enter valid ssn no "<valid_ssn>"
    And enter valid first name "<valid_firstname>"
    And enter valid lastname "<valid_lastname>"
    And enter valid adress "<valid_adress>"
    And enter valid phone number "<valid_phonenumber>"
    And enter valid username "<valid_username>"
    And enter valid email adress "<valid_email>"
    And enter new password "<valid_password>"
    And enter new password confirmation "<valid_password>"
    Then click register button
    And user click on Register button and validates success message saved as "<message>"
    Examples:
      | valid_ssn   | valid_firstname | valid_lastname | valid_adress             | valid_phonenumber | valid_username | valid_email           | valid_password  | message             |
      | 856-32-7074 | Peter4          | Pan4           | 241 Ruskin Road, Arizona | 235-456-9854      | team62peter4   | team62peter4@mail.com | Team62customer. | Registration saved! |










#  Scenario: TC_0107 any user to register with valid credentials
#    And enter valid ssn no
#    And enter valid first name
#    And enter valid last name
#    And enter valid adress
#    And enter valid phone number
#    And enter valid username
#    And enter valid email
#    And enter new password "password"
#    And enter new password confirmation "password"
#    Then click register button
#    And see registration saved

#  Scenario Outline: US_001 Registration with javafaker
#    And click register option
#    And enter valid ssn no  with JavaFaker "<SSN>"
#    And enter valid first name with JavaFaker "<firstname>"
#    And enter valid last name with JavaFaker "<lastname>"
#    And enter valid adress with JavaFaker "<address>"
#    And enter valid phone number with JavaFaker "<mobilephone>"
#    And enter valid username with JavaFaker "<username>"
#    And enter valid email with JavaFaker "<email>"
#    And enter new password with JavaFaker "<firstpassword>"
#    And enter new password confirmation with JavaFaker "<secondpassword>"
#   And user click on Register button and validates success message saved as "<message>"
#    Then user close page
#
#    Examples:
#      | SSN | firstname | lastname | address | mobilephone | username | email | firstpassword | secondpassword | message |
#      |     |           |          |         |             |          |       |               |                |         |
#      |   |         |        |       |           |        |     |             |              |       |
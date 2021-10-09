Feature: Password Page Functionality


  Background: The user logged in and go to password page

    Given Given User navigates go to "gmi_url"
    Then click menu icon
    Then user logged in with a valid username and password
    Then User clicks to account menu
    Then User clicks to password button

  Scenario: US_008 TC_01 The old password should not be used

    Then User enters the current password in the current and new password boxes
    And Check the fail-box message
    And user logged out


  Scenario Outline: US_008 TC_02-TC_03-TC_04-TC_05-TC_06
    Then  User enters "<pass>" to use at least  "<char>" char for stronger password and see the level chart colour "<colour>" change  accordingly
    And user logged out
    Examples:
      | pass    | char           | colour|
      | 123456p | 1 lowercase    |orange  |
      | 123456P | 1 uppercase    |orange  |
      | pppppp1 | 1 digit        |orange  |
      | 123456. | 1 special char |orange  |
      | 1Aa.123 | 7              |green   |

    Scenario: US_008 TC_07 The new password should be confirmed
      Then User enter old password in password box and a valid new password in new password and confirmation boxes
      Then User should not see fail message under the new password box.

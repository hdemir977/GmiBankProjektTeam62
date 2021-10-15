@US_10
Feature: Address of customer can be created

  Background:
    Given User navigates go to "gmi_url"
    Then click menu icon

  Scenario: 1 Creating a customer
    And click register option
    And enter a valid ssn number "ssn"
    And enter valid first name
    And enter valid last name
    And enter valid adress
    And enter valid phone number
    And enter valid username
    And enter valid email address
    And enter new password "password"
    And enter new password confirmation "password"
    Then click register button
    And see registration saved

  Scenario:2 Creating customer address

    And click sign in option
    And enter valid manager username "username_manager"
    And enter valid manager password "newpassword_manager"
    And click on sign in button
    And click on My Operations
    And click on Manage Customers
    And click on Create a New Customer
    And enter ssn to SSN text box "ssn"
    And click on Search button
    And enter text to Middle Initial Text Box "Ali"
    And enter a valid phone Number to phone number text box
    And enter a valid zip code to zip code text box "7649"
    And enter a city to city text box "Van"
    And click Save button
    And verify translation not found toast message.











#  @US_010
#  Feature: US010 Customer address creation
#
#
#  Background: User entered a valid zip code
#    Given Given User navigates to "gmi_url"
#    And click menu icon
#    And click sign in option
#    And enter valid username "username_manager"
#    And enter valid password "newpassword_manager"
#    And click on sign in button
#    And click on My Operations
#    And click on Manage Customers
#    And click on Create a New Customer
#    And send "SSN" to SSN text box
#    And click on Search button
##    And verify translation-not-found pop up text
#    And send "middle_initial" to Middle Initial text box
##    And Enter a valid Mobile number
#    And Enter a valid Phone number "phone_number"
#    And Enter a valid Zip Code "zip_code"
#
#  Scenario: 1
#    And Delete the text in Address Text Box
#    And delete the text in state text box
#    And click on Save button2
#    And verify this field is required text under Address text box
#    And verify this field is required text under city text box


#  Scenario: 1
#    And enter a valid adress
#    And enter a valid city
#    And select a country from country dropdown
#    And enter a valid state
#    And click on Save button2
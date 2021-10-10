@US_010
Feature: US010 Customer address creation


Background: User entered a valid zip code
    Given Given User navigates to "gmi_url"
    And click menu icon
    And click sign in option
    And enter valid username "username_manager"
    And enter valid password "newpassword_manager"
    And click on sign in button
    And click on My Operations
    And click on Manage Customers
    And click on Create a New Customer
    And send "SSN" to SSN text box
    And click on Search button
#    And verify translation-not-found pop up text
    And send "middle_initial" to Middle Initial text box
#    And Enter a valid Mobile number
    And Enter a valid Phone number "phone_number"
    And Enter a valid Zip Code "zip_code"

  Scenario: 1
    And Delete the text in Address Text Box
    And delete the text in state text box
    And click on Save button2
    And verify this field is required text under Address text box
    And verify this field is required text under city text box


#  Scenario: 1
#    And enter a valid adress
#    And enter a valid city
#    And select a country from country dropdown
#    And enter a valid state
#    And click on Save button2




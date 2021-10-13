@us_003
Feature: US09 Create A New Customer Feature
  Scenario:
    Given User navigates go to gmibank login page
    And  send username to username box "team62user"
    And  send password to password box "Team18user."
    And click sign in
    And  click to my operations
    And  click to manage customers
    And  click to create a new customer
     And type a valid SSN "541-01-4572"
    And  click search button
    And  verify search button
     And getAttribute from firstname box
    And  getAttribute from lastname box
    And  getAttribute from email box
    And  getAttribute from mobile phone number box
    And  getAttribute from phone number box
    And  getAttribute from phone ssn box

  Feature: US_012 an employee can manage customer

    Background:
      Given User navigates go to "gmi_url"
      Then click menu icon
      And User click Sign in option
      And User enter valid username
      And User enter valid password
      And User click Sign In Button
      And User click My Operations option
      And User select Manage Customers

    Scenario: US_012 TC_1201
      Given User sees all customer registration information


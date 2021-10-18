@US_012
Feature: US_012 Employee can manege customer

  Background: US_012 Employee login the application with valid credentials
    Given User navigates go to "gmi_url"
    Then user login the application valid credantials
    Given user click My Operations
    And user select Manage Customers

  Scenario: TC_1201 User see all their manage customers info populated
    And User sees all registrations info
      | ID                  |
      | First Name          |
      | Last Name           |
      | Middle Initial      |
      | Email               |
      | Mobile Phone Number |
      | Phone Number        |
      | Address             |
      | Create Date         |


  Scenario: TC_1202 When user click view button, user can see customer information in their own page
    And User click view button
    Then User sees all information populated
    And User sees edit button

  Scenario: TC_1203 There should be an Edit button where all customer information can be populated
    Then User clicks edit button
    And User sees all editable information populated

  Scenario: TC_1204 The Edit portal can allow user to create or update the user info
    Then User update information
    And User back customerHomePage

  Scenario: TC_1205 User can delete a customer, but seeing a message if the user is sure about deletion
    When User click delete button
    Then User sees confirm delete operation message
    And User click second delete button
    And User sees success edit message



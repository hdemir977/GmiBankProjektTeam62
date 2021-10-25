Feature: Customer Api Control

  Scenario: Customer Validation
    Given user creates token via api endpoint "https://gmibank.com/api/authenticate"
    Then read all customer data using with api endpoint "https://www.gmibank.com/api/tp-customers"
    Then validate all customer data
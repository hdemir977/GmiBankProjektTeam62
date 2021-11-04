

Feature: US_026 "System should allow to update countries using api end point
  "https://www.gmibank.com/api/tp-countries"

  Scenario:update countries
    Given user creates token via api endpoint "https://gmibank.com/api/authenticate"
    Then user read all countries "https://www.gmibank.com/api/tp-countries"
    Then user update a country
    And user validate update the country
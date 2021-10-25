@US_25
Feature: "System should allow to create new countries using api end point
  "https://www.gmibank.com/api/tp-countries"" if not created already"


  Scenario: Creating a new country
  Given user creates token via api endpoint "https://gmibank.com/api/authenticate"
    Given User post a request to create a new country from api_endpoint "endpoint_countries"

 Scenario:Reading the information of all countries
   Given User read all country information from api_endpoint "endpoint_countries"

  Scenario: Validating create a new country
  Then User validate create a new country from api_endpoint "endpoint_countries"


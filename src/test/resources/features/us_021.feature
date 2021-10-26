
Feature: "System should allow to read all countries info using api end point
  ""https://www.gmibank.com/api/tp-countries"" "


  Scenario:
    Given Read all countries you created and validate them from your data set "endpoint_countries"
    Then Read all countries you created and validate them one by one
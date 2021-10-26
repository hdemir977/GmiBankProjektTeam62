Feature: "System should allow to read all Applicants using api end point
  ""https://www.gmibank.com/api/tp-account-registrations"""

  Scenario:
    Given Read all registrants you created and validate them from your data set "https://www.gmibank.com/api/tp-account-registrations"
    Then Read all registrants you created and validate them one by one
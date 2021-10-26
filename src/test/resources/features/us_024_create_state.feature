

Feature: "System should allow to create new states using api end point
  "https://www.gmibank.com/api/tp-states" if not created already"

  Scenario:
    Given User can Just create each state one by one using "api_end_point_states"
    And user verify if state created "api_end_point_states"
    And user assert the new state if created
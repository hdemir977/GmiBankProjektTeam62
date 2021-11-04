
Feature: "System should allow to delete states using api end point
  "https://www.gmibank.com/api/tp-states/1803"

  Scenario Outline: TC_001 delete states
    Given delete a state using api end point "<endpoints>" and its extension "<id>"
    Then user validates if state deleted using "id"

    Examples: delete states
      | endpoints                             | id      |
      | https://www.gmibank.com/api/tp-states | /103435 |

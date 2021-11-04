Feature: US_030 Database Testing

  Background: create connection database
    Given database user creates a connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"

  Scenario Outline: validate all data using with ssn
    And database user reads the Customers data using "<query>" and "<columnName>"
    Then database validate customers data

    Examples: database read the ssn data
      | query                     | columnName |
      | Select * from tp_customer | ssn        |


  Scenario Outline: test all country info based on DB
    Then user reads the country data using "<query>" and "<columnName>"
    Then user save DB country info to correspondent files
    Then user validates all countries' info

    Examples:
      | query                    | columnName |
      | Select * from tp_country | id         |

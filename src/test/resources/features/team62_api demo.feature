@api_demo_team62
  Feature: Bank Project8 Team62_Api_Demo

    Scenario: US_020 Customer Validation ( SSN and CustomerList )
      Given user creates token via api endpoint "https://gmibank.com/api/authenticate"
      Then read all customer data using with api endpoint "https://www.gmibank.com/api/tp-customers"
      Then validate all customer data

    Scenario: US_021 Country Validation (CountryNames)
      Given Read all countries you created and validate them from your data set "api_endpoint_countries"
      Then Read all countries you created and validate them one by one

    Scenario: US_022 State Validation ( StateIds )
      Given user creates token via api endpoint "https://gmibank.com/api/authenticate"
      Given Read all states you created and validate them from your data set using api_endpoint "https://www.gmibank.com/api/tp-states"
      Then Read all states you created and validate them one by one

    Scenario: US_023 Registrats Validation ( expected SSN )
      Given Read all registrants you created and validate them from your data set "https://www.gmibank.com/api/tp-account-registrations"
      Then Read all registrants you created and validate them one by one

    Scenario: US_024 State Creation ( StateName )
      Given User can Just create each state one by one using "api_end_point_states"
      And user verify if state created "api_end_point_states"
      And user assert the new state if created

    Scenario: US_025 Creating a new country
      Given user creates token via api endpoint "https://gmibank.com/api/authenticate"
      When User post a request to create a new country from api_endpoint "api_endpoint_countries"
      Then User read all country information from api_endpoint "api_endpoint_countries"
      And User validate create a new country from api_endpoint "api_endpoint_countries"

    Scenario: US_026 Update countries
      Given user creates token via api endpoint "https://gmibank.com/api/authenticate"
      Then user read all countries "https://www.gmibank.com/api/tp-countries"
      Then user update a country
      And user validate update the country

    Scenario Outline: US_027 Delete State
      Given delete a state using api end point "<endpoints>" and its extension "<id>"
      Then user validates if state deleted using "id"

      Examples: delete state
        | endpoints                             | id      |
        | https://www.gmibank.com/api/tp-states | /103661 |


# Database testing
    Scenario Outline: US_29 validate all data using with ssn
      Given database user creates a connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"
      And database user reads the Customers data using "<query>" and "<columnName>"
      Then database validate customers data

      Examples: database read the ssn data
        | query                     | columnName |
        | Select * from tp_customer | ssn        |


    Scenario Outline: US_29 test all country info based on DB
      Given database user creates a connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"
      Then user reads the country data using "<query>" and "<columnName>"
      Then user save DB country info to correspondent files
      Then user validates all countries' info

      Examples:
        | query                    | columnName |
        | Select * from tp_country | id         |

    @pdf_generator
    Scenario Outline: pdf read some state a and create pdf
      Given database user creates a connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"
      And pdf user provides the query "<query>"

      Examples: pdf read the data
        |query|
        |Select * from tp_state|
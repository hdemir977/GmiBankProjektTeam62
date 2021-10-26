@database_ders_bank8
Feature: database testing ders bank8
  Background: create connection ders bank8
    Given database ders bank8 user creates a connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"

  Scenario Outline: database ders bank8 read and validate created data using with ssn
    And database ders bank8 user reads the Customers data using "<query>" and "<columnName>"
    Then database ders bank8 validate customers data

    Examples: database ders bank8 demo read the data
      |query|columnName|
      |Select * from tp_customer|ssn|
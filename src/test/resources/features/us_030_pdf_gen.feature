

@pdf
Feature: Pdf Generator

  @pdf_generator
  Scenario Outline: pdf read some states data and create pdf
    Given database user creates a connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"
    And pdf user provides the query "<query>"

    Examples: pdf read the data
      |query|
      |Select * from tp_state|
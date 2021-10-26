@api_testing_ders_bank8
Feature: Api testing ders bank8

  @customer_validation_bank8
  Scenario: read and validate customer data bank8
    Given read all customer data using with api endpoint "https://www.gmibank.com/api/tp-customers" bank8
    Then validate customer data bank8

  @read_country_bank8
  Scenario: read countries bank8
    Then read all countries and write country ids to txt using api endpoint "https://www.gmibank.com/api/tp-countries" bank8


  @create_country_bank8
  Scenario: Create a country bank8
    And create country "https://www.gmibank.com/api/tp-countries" bank8


  @@validate_country_bank8
  Scenario: Validate created country bank8
    Then validate created a country bank8

  @update_country_bank8
  Scenario Outline:  Update country bank8
    And update created a country using api end point "https://www.gmibank.com/api/tp-countries"  "<name>" and its extension "<id>" bank8

    Examples: Update country bank8
      |name|id|
      |Guncellenmis Ulke|93277|

  @delete_country_bank8
  Scenario Outline: Delete country bank8
    Given delete updated a country using endpoint "<endPoint>" and its extension "<id>" and validate bank8

    Examples: Delete Country ders bank8
      |api_endPoint                                |id    |
      |https://www.gmibank.com/api/tp-countries%7C/93277%7C
  @api_testing_ders_bank8
  Feature: Api testing ders bank8

  @customer_validation_bank8
  Scenario: read and validate customer data bank8
    Given read all customer data using with api endpoint "https://www.gmibank.com/api/tp-customers" bank8
    Then validate customer data bank8

  @read_country_bank8
  Scenario: read countries bank8
    Then read all countries and write country ids to txt using api endpoint "https://www.gmibank.com/api/tp-countries" bank8


  @create_country_bank8
  Scenario: Create a country bank8
    And create country "https://www.gmibank.com/api/tp-countries" bank8


  @@validate_country_bank8
  Scenario: Validate created country bank8
    Then validate created a country bank8

  @update_country_bank8
  Scenario Outline:  Update country bank8
    And update created a country using api end point "https://www.gmibank.com/api/tp-countries"  "<name>" and its extension "<id>" bank8

    Examples: Update country bank8
      |name|id|
      |Guncellenmis Ulke|93277|

  @delete_country_bank8
  Scenario Outline: Delete country bank8
    Given delete updated a country using endpoint "<endPoint>" and its extension "<id>" and validate bank8

    Examples: Delete Country ders bank8
      |api_endPoint                                |id    |
      |https://www.gmibank.com/api/tp-countries%7C/93277%7C

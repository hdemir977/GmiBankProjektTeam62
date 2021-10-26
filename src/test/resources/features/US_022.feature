Feature:

  Scenario:
    Given user creates token via api endpoint "https://gmibank.com/api/authenticate"
    Given Read all states you created and validate them from your data set using api_endpoint "https://www.gmibank.com/api/tp-states"
    Then Read all states you created and validate them one by one
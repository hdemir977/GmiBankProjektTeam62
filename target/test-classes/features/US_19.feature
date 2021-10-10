
@TC001
  Feature: US_19 Creating a new customer by Employee
    Scenario TC01 Create a description part
      Given Employee is on the "gmi_url"page
      And Clicks on SignIn Button
      And Enters username "gerardo.schuppe"
      And Enters password "$Qc@4wVWbl2A*0"
      Then Clicks on Sign_in Button
      And Clicks on My Operations
      And Clicks on Manage Accounts
      And Clicks on Create a new Account
      And Clicks on Description part
      Then leave it blank
      But If an error message occurs
      Then Ignore it and Go to Balance button
      And Write dollar sign on it
      And write a number
      But if the error message occurs
      Then write only a number
      And go to Account Type button
      Then Select Checking
      And go to Account Status Type button
      Then select Active
      And go to Employee button
      And select an employee from the drop-down
      But If the drop-down is empty
      Then leave the button empty








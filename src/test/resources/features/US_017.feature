@US_17

  Feature: US_17 management of users

#    Background: User is on the google home page (like @before method, run before each scenario)
#      Given User navigates to "gmi_url"
#      Then click menu icon
#      And click sign in option
#      And enter valid admin username
#      And enter valid admin password
#      And click on sign in button
#      And click on Administration
#      And click on user management


     Background:
      Given User navigates to "gmi_url"
      Then click menu icon
      And click sign in option
      And enter valid admin username "admin_username"
      And enter valid admin password "admin_password"
      And click on sign in button
      And click on Administration
      And click on user management

      Scenario: Admin can activate as user as Role_User
      And click on Edit button on the first line
      And click on Role_User in Profile box
      And click on Save button
      Then verify A user is updated with identifier... text in pop up

      Scenario: Admin can view User info
      And click view button
      And verify Role_User Text

     Scenario: Admin can delete User
     And click on Edit button on the first line
     And click on Role_User in Profile box
     And verify A user is updated with identifier... text in pop up
     And click on delete button
     And click on delete2 button
     And verify internal server error pop up



#   Scenario: Admin can view user information
#
#    And click on view button on the first line


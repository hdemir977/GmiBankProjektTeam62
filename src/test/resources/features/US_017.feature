@US_17

  Feature: US_17 management of users

    Background:
      Given User navigates to "gmi_url"
      Then click menu icon
      And click sign in option
      And enter valid admin username "admin_username"
      And enter valid admin password "admin_password"
      And click on sign in button
      And click on Administration
      And click on user management
      And click on create a new user
      And enter a login name "Ayhan12"
      And enter valid first name "AyhanAyhan"
      And enter a valid last name "AyhanAyhanAyhan"
      And enter a valid email address

    Scenario: 1 Admin can edit ROLE_USER
      And click on ROLE_USER
      And click on Save button
      And verify toast message as created
      And click on Created date
      And click on view Button
      And verify ROLE_USER text
      And click on Back button
      And click on Created date
      And click on Edit button
      And enter a text to Last name text box "Jordan23"
      And click on Save button
      And verify toast message  as updated
      And click on Created date
      And click on Delete button
      And click on Delete button in pop up
      And verify the toast message as deleted
      And user logged out

    Scenario: 2 Admin can edit ROLE_EMPLOYEE
      And click on ROLE_EMPLOYEE
      And click on Save button
      And verify toast message as created
      And click on Created date
      And click on view Button
      And verify ROLE_EMPLOYEE text
      And click on Back button
      And click on Created date
      And click on Edit button
      And enter a text to Last name text box "Jordan23"
      And click on Save button
      And verify toast message  as updated
      And click on Created date
      And click on Delete button
      And click on Delete button in pop up
      And verify the toast message as deleted
        And user logged out

    Scenario: 3 Admin can edit ROLE_MANAGER
      And click on ROLE_MANAGER
      And click on Save button
      And verify toast message as created
      And click on Created date
      And click on view Button
      And verify ROLE_MANAGER text
      And click on Back button
      And click on Created date
      And click on Edit button
      And enter a text to Last name text box "Jordan23"
      And click on Save button
      And verify toast message  as updated
      And click on Created date
      And click on Delete button
      And click on Delete button in pop up
      And verify the toast message as deleted
      And user logged out

    Scenario: 4 Admin can edit ROLE_ADMIN
      And click on ROLE_ADMIN
      And click on Save button
      And verify toast message as created
      And click on Created date
      And click on view Button
      And verify ROLE_ADMIN text
      And click on Back button
      And click on Created date
      And click on Edit button
      And enter a text to Last name text box "Jordan23"
      And click on Save button
      And verify toast message  as updated
      And click on Created date
      And click on Delete button
      And click on Delete button in pop up
      And verify the toast message as deleted
      And user logged out




#       And click on create a new user
#       And enter a valid login name





#      Scenario: Admin can activate a role as User
#      And click on Edit button on the first line
#      And click on Role_User in Profile box
#      And click on Save button
#      Then verify A user is updated with identifier... text in pop up
#
#      Scenario: Admin can view User info
#       And click on Edit button on the first line
#       And click on Role_User in Profile box
#       And click on Save button
#       Then verify A user is updated with identifier... text in pop up
#       And click view button
#       And verify Role_User Text
#
#     Scenario: Admin can edit User info
#      And click on Edit button on the first line
#      And click on Role_User in Profile box
#      And click on Save button
#      And verify A user is updated with identifier... text in pop up
#      And click on Edit button on the first line
#      And enter Jordan23 into LastName text box
#      And click on Save button
#
#     Scenario: Admin can delete User
#     And click on Edit button on the first line
#     And click on Role_User in Profile box
#     And verify A user is updated with identifier... text in pop up
#     And click on delete button
#     And click on delete2 button
#     And verify internal server error toastmessage






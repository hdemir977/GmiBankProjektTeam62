@TC_005
Feature:


Background: User will be on gmi bank page
    Given user is on gmi_url
    Then click on Menu icon
    And click on SignIn

@Scenario1
  Scenario:  1.User cannot login with invalid email address
    Then user click on username
    And enter a invalid username
    Then user click on password
    And enter a valid password
    Then user verify the error message

  @Scenario2
  Scenario: 2. User can not login with invalid password
    Then Kullanıcı adı tıklıyor
    And Valıd kullanıcı adı veriyor
    Then Passwordu tıklıyor
    And Yanlıs bır sıfreyı yazıyor
    Then Error messajı alıyor ve verıfe edıyor

  @Scenario3
  Scenario: TC003 User can not login with invalid credential
    Then Klikne na username
    And Pogresni username pise
    Then Klikne na password
    And Pise pogresn password
    Then Verifikuje error poruku

@Scenario4
  Scenario: 4. User can reset password
    Then Klikne opet na  username
    Then unese lazno ime
    And klikne na sifricu
    And unese neku sifricu
    Then verifikuje poruku
    Then user click on Did you forget your password?
    And click on email
    And enter a valid email
    Then click on Reset password

@Scenario5
  Scenario: 5. User can register an account proba samo jos jedna

    Then Username Click
    Then Usernamefill
    Then Password click
    Then Password fill
    Then Second SignIn Click
    Then click on You don't have an account yet? Register a new account
    And enter a valid ssn number
    And Enter a valid First Name
    And Enter a valid Last Name
    And Enter a valid Address
    And Enter a valid Phone Number
    And Enter a username
    And Enter a valid Email7
    And Enter a New password
    And Enter a New password confirmation
    Then Click on Register
    And verify the saved message



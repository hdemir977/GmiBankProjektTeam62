Feature:Sign in page

  Background: The user logged in
    Given go to homepage
    And Kullanıcı Menu tuşuna tıklar
    And Kullanıcı Sign in buttonunu tıklar
    Then Kullanici Username basligini dogrular ve gecerli bir Username girer
    Then Kullanici Password basligini dogrular ve gecerli bir Password girer

  @signInPage
  Scenario: US_004_TC_01 Giriş yapmak için başarı mesajıyla doğrulanan geçerli bir kullanıcı adı ve Password sağlanmalıdır.
    And Kullanici Sign in butonunu tiklar
    And Kullanici adini dogrula "Oscar Salazar"
    When Kullanici Account ve Sign out tiklar
    Then Kullanici menuden cikar ve Ana menuyü dogrular
  @signInPage
  Scenario: US_004_TC_02 Login sayfasında girişi iptal eden "cancel" seçeneği de olmalıdır.
    When Kullanici Cancel basligini dogrular ve Cancel butonunu tiklar
    Then Kullanici menuden cikar ve Ana menuyü URL den dogrular
  @signInPage
  Scenario Outline: US_004_TC_03 and TC_04 Geçersiz verilerle sisteme basarisiz giris olmalidir
    And kullanici "<Username>" ve "<Password>" sisteme girer
    And Kullanici Sign in butonunu tiklar
    When "Failed to sign in! Please check your credentials and try again." aciklamasini dogrular
    Then Acilan Pup-up ifadesinin "translation-not-found" oldugunu dogrular

    Examples:
      | Username   | Password    |
      | team62     | Team62user. |
      | team62user | Team62      |
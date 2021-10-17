Feature:Date in page

  Background: The user logged in
    Given go to homepage
    And Kullanıcı Menu tuşuna tıklar
    And Kullanıcı Sign in buttonunu tıklar
    Then Kullanici Username basligini dogrular ve gecerli bir Username girer
    Then Kullanici Password basligini dogrular ve gecerli bir Password girer
    And Kullanici Sign in butonunu tiklar
    And Cikan sayfada sag uste My Operations a tikla
    And Manage Customers a tikla
    Then Sag uste cikan Create a new Customer butonuna tikla
    And SSN textbox a kayıtlı bir SSN no gir
    And Search butonuna tikla

  Scenario: US_011_TC_01 Tarih, müşteri oluşturma anında oluşturulmalıdır.
    And user should fill to the fields
      | middleInitial | D            |
      | phoneNumber   | 654-789-6321 |
      | zipCode       | 45876        |
      | city          | Frankfurt    |
      | date          | 14.10.2021   |
      | ulke          | USA          |
      | hesap         | asd          |
    Then Save botonuna tikla
    Then Acilan Pup-up ifadesinin "translation-not-found" oldugunu dogrularr


  Scenario: US_011_TC_02 Girilen tarih, müşteri oluşturma anından daha erken veya geçmişte olamaz.
    And user should fill to the fields
      | middleInitial | D            |
      | phoneNumber   | 654-789-6321 |
      | zipCode       | 45876        |
      | city          | Frankfurt    |
      | date          | 01.10.2021   |
      | ulke          | USA          |
      | hesap         | asd          |
    And Save botonuna tikla
    Then Acilan Pup-up ifadesinin "Internal server error." oldugunu dogrularr



  Scenario: US_011_TC_03 Tarih ay, gün, yıl, saat ve dakika olarak oluşturulmalıdır.
    And Create Date textbox a eksik tarih gir
    Then Tarih Text Box class degerinin invalid oldugunu test et


  Scenario: US_011_TC_04 Kullanıcı kayıtlı kullanıcılardan bir kullanıcı seçebilir ve bu kısmı boş bırakamaz
    And user should fill to the fields
      | middleInitial | D            |
      | phoneNumber   | 654-789-6321 |
      | zipCode       | 45876        |
      | city          | Frankfurt    |
      | date          | 14.10.2021   |
      | ulke          | USA          |
      | hesap         |              |
    And Save botonuna tikla
    Then Acilan Pup-up ifadesinin "Internal server error." oldugunu dogrularr


  Scenario: US_011_TC_05 Kullanıcı isteğe bağlı olarak Zelle Enrolled seçeneğini seçebilir ve kaydedebilir.
    And user should fill to the fields
      | middleInitial | D            |
      | phoneNumber   | 654-789-6321 |
      | zipCode       | 45876        |
      | city          | Frankfurt    |
      | date          | 14.10.2021   |
      | ulke          | USA          |
      | hesap         | asd          |
    And Zelle Enrolled box a tik at
    And Save botonuna tikla
    Then Acilan Pup-up ifadesinin "Internal server error." oldugunu dogrularr




  Scenario: Enter a date
    And user should fill to the fields
      | middleInitial | D            |
      | phoneNumber   | 654-789-6321 |
      | zipCode       | 45876        |
      | city          | Frankfurt    |
      | date          | 13.10.2021   |
      | ulke          | USA          |
      | hesap         | asd          |
    Then Save botonuna tikla
    Then Acilan Pup-up ifadesinin "Internal server error." oldugunu dogrularr


  Scenario: ilk yapi
    And Middle Initial textbox a data gir
    And Phone Number textbox a data gir
    And Zip Code textbox a data gir
    And City textbox a data gir
    And Create Date textbox a şu andaki tarihi data gir
    And County den bir ulke sec
    And Account dropdrowndan bir hesap sec






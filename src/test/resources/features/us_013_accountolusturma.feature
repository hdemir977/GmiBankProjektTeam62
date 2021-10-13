@US_013
Feature: Calisan hesabiyla yeni bir banka hesabı(Account) oluşturabilir.

  Background: Kullanici gecerli(employee) kullanici adi ve pssword ile login olmus olmali
    Given Kullanici "gmi_url" anasayfasina gider.
    And  Kullanici sag ustte bulunan insan figurune tiklar.
    And Kullanici sign in butonuna tiklar
    And Kullanici username textbox'ina "employeeusername" datasini girer.
    And Kullanici pasword textbox'ina "employeepassword" datasini girer.
    And Kullanici sign in butonunu tiklar.
    And Kullanici myOperation butonunu tiklar.
    And  Kullanici manage account butonunu tiklar.
    Then Kullanici create new account botonunu tiklar.


    @US_1301
  Scenario: TC_01 Kullanıcı yeni hesap için bir açıklama girmelidir. Bu kısım boş bırakılamaz.
    Then Kullanici acilir pencere de description kismini bos birakirsa "invalidmessage" mesajini almalidir.
    Then Kullanici sayfayi kapatir.

  @US_1302
  Scenario: TC_02 Kullanici, ilk kez hesap oluşturmak için Dolar olarak bir bakiye sağlamalıdır.
    Then Kullanici acilir pencerede balance checkbox'ina "miktar" girebilmelidir.
    Then Kullanici sayfayi kapatir.

    @US_1303
  Scenario: TC_03 Kullanici, ilk kez hesap oluştururken bakiye bos birakilmamalidir.
    Then Kullanici acilir pencerede balance checkbox'ini bos birakirsa "invalidmessage" mesajini almalidir.
    Then Kullanici sayfayi kapatir.

  @US_1304
  Scenario: TC_04 Kullanici CHECKING, SAVING, CREDIT_CARD veya INVESTING olarak bir hesap türü seçebilir.
    Then Kullanici account type'lerden bir "hesapturu" secebilmelidir.
    Then Kullanici sayfayi kapatir.

    @US_1305
  Scenario: TC_05 Hesap durumu AKTİF(ACTIVE), ASKIYA ALINDI(SUSPENDED) veya KAPALI(CLOSED) olarak tanımlanmalıdır.
    Then Kullanici Hesap durumunu "secenekler" ile tanimlayabilmelidir.
      Then Kullanici sayfayi kapatir.

  @US_1306
  Scenario: TC_06 Kullanıcı açılır menüden bir çalışan seçebilir / İsteğe bağlı.
    Then Kullanici employee kismindan istege bagli olarak "calisan" secebilir.







































































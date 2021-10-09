Feature: Calisan hesabiyla yeni bir banka hesabı(Account) oluşturabilir.
  Background: Kullanici gecerli(employee) kullanici adi ve pssword ile login olmus olmali
    Given Kullanici "gmi_url" anasayfasina gider.
    And  Kullanici sag ustte bulunan insan figurune tiklar.
    And Kullanici sign in butonunu tiklar.
    And Kullanici username textbox'ina "employeeusername" datasini girer.
    And Kullanici pasword textbox'ina "employeepassword" datasini girer.
    And Kullanici sign in butonunu tiklar.


  Scenario: TC_01 Kullanıcı yeni hesap için bir açıklama girmelidir. Bu kısım boş bırakılamaz.

  And  Kullanici manage account butonunu tiklar.
  Then Kullanici create new account botonunu tiklar.
  Then Kullanici acilir pencere de description kismini bos birakirsa "invalidmessage" mesajini almalidir.

    Scenario: TC_02 Kullanici, ilk kez hesap oluşturmak için Dolar olarak bir bakiye sağlamalıdır.
      And  Kullanici manage account butonunu tiklar.
      Then Kullanici create new account botonunu tiklar.
      Then Kullanici acilir pencerede balance checkbox'ina "miktar" girebilmelidir.





































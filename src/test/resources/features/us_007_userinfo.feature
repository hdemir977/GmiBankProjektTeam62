
Feature: Sistem, geçersiz kimlik bilgileriyle güncelleme yapılmasına izin vermemelidir.
  Background:
    Given Kullanici "gmi_url" anasayfasina gider.
    And  Kullanici sag ustte bulunan insan figurune tiklar.
    And Kullanici sign in butonuna tiklar
    And Kullanici username textbox'ina "adminusername" datasini girer.
    And Kullanici pasword textbox'ina "adminpassword" datasini girer.
    And Kullanici sign in butonunu tiklar.
    And Kullanici isminin oldugu(Salih Sen)'i tiklar.
    And Kullanici user info butonunu tiklar.

  Scenario:TC_01 E-posta adresi, "@" veya "." işaretleri olmadan yalnızca rakam veya karakter içeremez.

    Given Kullanici email checkbox'ina "invalidMail1" girer.
    Then Kullanici gecersiz datayi girdikten sonra "invalidMessage" mesajini almalidir.
    Then Kullanici sayfayi kapatir.

  Scenario: TC_02 E-posta adresi, "@" veya "." işaretleri olmadan yalnızca rakam veya karakter içeremez.
    Given Kullanici email checkbox'ina "invalidMail2" girer.
    Then Kullanici gecersiz datayi girdikten sonra "invalidMessage" mesajini almalidir.
    Then Kullanici sayfayi kapatir.

  Scenario: TC_03 E-posta adresi, "@" veya "." işaretleri olmadan yalnızca rakam veya karakter içeremez.
    Given Kullanici email checkbox'ina "invalidMail3" girer.
    Then Kullanici gecersiz datayi girdikten sonra "invalidMessage" mesajini almalidir.
    Then Kullanici sayfayi kapatir.

  Scenario: TC_04 E-posta adresi, "@" veya "." işaretleri olmadan yalnızca rakam veya karakter içeremez.
    Given Kullanici email checkbox'ina "invalidMail4" girer.
    Then Kullanici gecersiz datayi girdikten sonra "invalidMessage" mesajini almalidir.
    Then Kullanici sayfayi kapatir.




  Scenario:İngilizce veya Türkçe dışında başka bir dil seçeneği olmamalıdır.
    Given Kullanici language butonunu tikladiginda sadece Ingilizce ve Turkce dil seceneklerini gormelidir.











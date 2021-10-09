@US_007
Feature: Sistem, geçersiz kimlik bilgileriyle güncelleme yapılmasına izin vermemelidir.

  Scenario Outline: TC_01 E-posta adresi, "@" isareti olmadan yalnızca rakam veya karakter içeremez.
  Given Kullanici "gmi_url" anasayfasina gider.
  And  Kullanici sag ustte bulunan insan figurune tiklar.
  And Kullanici sign in butonuna tiklar
  And Kullanici username textbox'ina "adminusername" datasini girer.
  And Kullanici pasword textbox'ina "adminpassword" datasini girer.
  And Kullanici sign in butonunu tiklar.
  And Kullanici isminin oldugu(Salih Sen)'i tiklar.
  And Kullanici user info butonunu tiklar.
  And Kullanici email checkbox'ina "invalidMail" girer.
  Then Kullanici gecersiz datayi girdikten sonra "invalidMessage" mesajini almalidir.

    Examples:
    |invalidMail|
    |salihsengmail.com|
    |salihsen@gmailcom|
    |12345            |
    |salihsen         |

    @TC02
    Scenario:İngilizce veya Türkçe dışında başka bir dil seçeneği olmamalıdır.
      Given Kullanici "gmi_url" anasayfasina gider.
      And  Kullanici sag ustte bulunan insan figurune tiklar.
      And Kullanici sign in butonuna tiklar
      And Kullanici username textbox'ina "adminusername" datasini girer.
      And Kullanici pasword textbox'ina "adminpassword" datasini girer.
      And Kullanici sign in butonunu tiklar.
      And Kullanici isminin oldugu(Salih Sen)'i tiklar.
      And Kullanici user info butonunu tiklar.
      Then Kullanici language butonunu tikladiginda sadece Ingilizce ve Turkce dil seceneklerini gormelidir.











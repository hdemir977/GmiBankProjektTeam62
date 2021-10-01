package gmiBank.com.utilities;





import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    //tercuman class bu. ara klas.configuration classindan degerleri almak gorevi

    //1.Properties objesi olusturmak
    //class ismiyle projenin her yerinden cagrilsin diye static
    //bu objeye class disindan mudahale edilmesin diye private(opsiyonel)

    static private Properties properties;

    //static block kullaniyoruz. Herseyden once calisir. Mainden bile once calisir
    static {
        //dosya yolunu tanitiyoruz.
        String path = "configuration.properties";


        //dosyayi bulamazsa diye try-catch yapiyoruz.
        try {
            //dosyayi okumak icin

            FileInputStream fileInputStream = new FileInputStream(path);
            //propertis deger atamasi yapiyoruz
            properties = new Properties();

            //dosya yukleme yapiyor.
            //Bu class calistiginda ilk olarak static block calisacak ve bir tek islem yapacak.
            //file dosyasini bulacak. properties icine load edecek.
            //fileInputStream objesi calisack ve okudugu bilgileri properties objesine yukleyecek

            properties.load(fileInputStream);

            //kapatmazsak bilgisayari mesgul eder
            fileInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //method olusturacagiz. key yollayip value alacagiz.
    //static private Properties properties; oldugu icin static

    public static String getProperty(String key){

        String value =properties.getProperty(key);//properties uzerindeki value
        // bu key yardimiyla return ettik
        return value;
    }

}


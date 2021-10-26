package gmiBank.com.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    //RunWith,  Junit icinde oldugu icin cucumber kullandik. TestNG kullanmadik
    @RunWith(Cucumber.class)
    @CucumberOptions(

            /*
            //paralel testing icin 2 runner classi olusturdum ve isim olarak TestRunner yazmaliyim
    //html:target\cucumber2-raporlar.html gibi olanlar dosya, dosya isimlerini degistirmemiz lazim
    //cunku ayri ayri rapor olmaz testrunnerla ayni oldugundan hangisi once biterse oburunun ustune katar
    //o yuzden isimleri degistirelim
    //taglari da boluyorum,paylastiriyorum yarisini rapor1 bunu rapor 2 yapiyorum
    //pom umuza 2 tane eklenti ekliyoruz
    //dependencylerin disina plugins ekledik(failsafe surefile)
    //sonra terminal kismina mvn clean verify yaz ve enter a bas
    //daha sonra daha guzel olasi icin hocanin plugin i ekle ve bukadar:))
             */
            //6. rapor almak icin

            plugin = {"html:target\\cucumber-raporlar1.html",
                    "json:target/json-reports/cucumber1.json",
                    "junit:target/xml-report/cucumber1.xml"},

            //plugin={"html:target\\cucumber-reports.html"},

            //1.
            //Bu notasyonun gorevi feature dosyalari ile stepdefinition dosylarini birlestirmektir
            //features="features folder path",
            //Cuycumber package ile package birbirine bagliyor.
            //2
            features = "src/test/resources/features",
            //stepDefinitions package ismiu
            //3
            glue = "gmiBank/com/stepDefinitions",
            //boylece packageleri birbirine bagladik
            //bu iki paket altinda kac tane class olursa olsun herhandi bir clasta yazilan her aadim
            //diger classlardaki adimlarla uyusurssa yeni adim olusturmaya gerek kalmaz


            //4
//        tags="@ali or miniregression"


            tags = "@registration_scenario",
            //tags="@istediginiz tag", TEstNG de gordugumuz group gibi calisir
            //tags="@smoke or miniregression" => boyle yapabiliriz. Or dersek veya
            // work in progress hangi feature veya senaryoyu calistiracagini bilmesi icin onemli
            //Birden fazla feature ve Scenario calistirmak istedigimizde
            // calistirtacagimiz feature ve Scenario lara ortak tag atamamiz ve bu tag i
            //runner da belirtmemiz gerekir
            //And ==> dendiginde verilen ozellilerin tamamini tasiyan tag lar yazilir
            // OR => dendiginde yazilan taglardan herhangi birine veya daha fazlasina sahip olanlar calisir.
            //TAG kapatilirsa tamamini calistirir. yani bir tag belirtmezsek hepsi calisir
            //5
            dryRun = false
            // dryRun=true oldugunda test caseleri calistirmayi denemeden sadece eksik olan stepleri bana verir
            // dryRun=false => oldugunda test caseleri calsitirmayi dener eksik step bulursa onu rapor eder
    )
    public class Runner {


}


package interviewQuestions9;

import java.util.HashMap;
import java.util.Map;

public class Q01_MapKeysValues {
    //5 tane ulke ismi ve nufusunu oluşturuyoruz.(put)
    //5 tane ulke ismi ve nufusunu yazdırıyoruz(country)
    //5 tane ulke ismi yazdırıyoruz. (keyset())
    //5 tane ulke nufusunu yazdırıyoruz. (values())
    //nüfusların toplamını yazdırın.
    //kaç tane 50 milyondan fazla nüfuslu ülke var?
    // ulke ve nufus  lari hem map gibi..hem de ayri ayri yazdirma ?

    public static void main(String[] args) {

        HashMap<String, Integer> ulke = new HashMap<>();

        ulke.put("Almanya", 80);
        ulke.put("Turkiye", 83);
        ulke.put("Amerika", 250);
        ulke.put("Fransa", 60);
        ulke.put("Kanada", 40);

        System.out.println("Ulke isimleri ve nufuslari = " + ulke + " milyondur .");

        System.out.println("Ulke isimleri : " + ulke.keySet());
        //Ulke isimleri : [Turkiye, Fransa, Kanada, Almanya, Amerika]

        System.out.println("Ulkelerin nufuslari : " + ulke.values());
        //Ulkelerin nufuslari : [83, 60, 40, 80, 250]

        int sayac=0; // 50 mil fazla ulke sayiyi
        for (Integer buyukMu: ulke.values()) { // ulkelre bakiyor
            if (buyukMu>50){ // buyukse
                sayac++; // artiriyor
            }

        }
        System.out.println("Nufusu 50 ml fazla olanlar : " + sayac); //Nufusu 50 ml fazla olanlar : 4


        int nufus=0;
        for (Integer toplam:ulke.values()) {
            nufus+=toplam;

        }
        System.out.println("Nufus toplami : " + nufus); // Nufus toplami : 513

        for (Map.Entry<String , Integer> siralama:ulke.entrySet()) { // entrySet=key+value
            System.out.println(siralama);
        }

        for (String   ulkeSirasi: ulke.keySet()){
            System.out.println(ulkeSirasi);

        }
        for (Integer  ulkeSirasi: ulke.values()){
            System.out.println(ulkeSirasi);

        }

    }
}

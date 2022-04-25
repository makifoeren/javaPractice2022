package interviewQuestions8;

import java.util.*;

public class Q04_MapTask {

// PART 1
// create a map with groupName as key and groupMembers as value
// "Group1" = ["Member1", "Member2"]
// "Group2" = ["Member3", "Member4", "Member5"]


// BÖLÜM 1
// anahtar olarak groupName ve değer olarak groupMembers ile bir harita oluşturun
// "Grup1" = ["Üye1", "Üye2"]
// "Grup2" = ["Üye3", "Üye4", "Üye5"]

// PART 2
// find how many members each group has

// BÖLÜM 2
// her grubun kaç üyesi olduğunu bul

    public static void main(String[] args) {


        HashMap<String, ArrayList<String>> grupIsmiVeUyeler = new HashMap<>();

        ArrayList<String> devTeam = new ArrayList<>(Arrays.asList("Abdullah", "Enes Faruk", "Kutay", "Yasin"));
        ArrayList<String> qaTeam = new ArrayList<>(Arrays.asList("Kadir", "Seher", "Gokhan", "Bahattin"));


        grupIsmiVeUyeler.put("Development Team", devTeam);
        grupIsmiVeUyeler.put("QA Team", qaTeam);

        System.out.println("Grup isim ve uyaler : " + grupIsmiVeUyeler);
        //Grup isim ve uyaler : {QA Team=[Kadir, Seher, Gokhan, Bahattin], Development Team=[Abdullah, Enes Faruk, Kutay, Yasin]}

        // bolum 2
        // 1. yol

        Collection<ArrayList<String>> values = grupIsmiVeUyeler.values();
        for (ArrayList<String> kisi:values
        ) {
            System.out.println(kisi.size()); // ikisi icin de 4
        }

        // 2.yol
        Set<String> keys =grupIsmiVeUyeler.keySet();

        for (String key:keys
             ) {
            ArrayList<String> grupList=grupIsmiVeUyeler.get(key);

            System.out.println("gruptaki uye sayisi : " +  key  + " " + grupList.size());
        }




    }
}



















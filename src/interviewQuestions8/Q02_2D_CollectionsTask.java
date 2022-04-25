package interviewQuestions8;

import java.util.ArrayList;

public class Q02_2D_CollectionsTask {

    // Create 2D ArrayList which can store String ArrayLists
// Create 3 ArrayLists which are Employees, Employers, Companies
// Store this 3 ArrayList in 2D ArrayList

// String ArrayList'leri depolayabilen 2D ArrayList oluşturun
// Çalışanlar, İşverenler, Şirketler olmak üzere 3 DiziListesi oluşturun
// Bu 3 ArrayList'i 2D ArrayList'te saklayın

    public static void main(String[] args) {


        ArrayList<ArrayList<String>> listeler = new ArrayList<>(); //2D arrList
        ArrayList<String> calisanlar = new ArrayList<>();

        calisanlar.add("Ahmet");
        calisanlar.add("Mehmet");
        calisanlar.add("Yasin");
        calisanlar.add("Can");
        calisanlar.add("Hasan");

        System.out.println("calisanlar = " + calisanlar);

        ArrayList<String> isverenler = new ArrayList<>();

        isverenler.add("Haluk");
        isverenler.add("Eylul");
        isverenler.add("Yusuf");
        isverenler.add("Can");
        isverenler.add("Ibrahim");
        isverenler.add("Mehmet");

        System.out.println("isverenler = " + isverenler);


        ArrayList<String> sirketler = new ArrayList<>();

        sirketler.add("Amazon");
        sirketler.add("Google");
        sirketler.add("Testinum");
        sirketler.add("IBM");
        sirketler.add("Bosc");

        System.out.println("sirketler = " + sirketler);

        listeler.add(calisanlar);
        listeler.add(sirketler);
        listeler.add(isverenler);

        System.out.println(listeler);


    }

}









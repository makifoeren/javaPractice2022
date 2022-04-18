package interviewQuestions6;

import java.util.Locale;
import java.util.Scanner;

public class Q02_AtbashCode {

    /*
  AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
  Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
  "abcdefghijklmnopqrstuvwxyz"; 26 harf
  "zyxwvutsrqponmlkjihgfedcba";
 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sifrelemek istediginiz ifadeyi giriniz : ");
        String ifade= scan.nextLine().toLowerCase();

        for (int i = 0; i < ifade.length(); i++) {
            int index='z'-ifade.charAt(i); // tersten bakacagi icin sondan cikardik,kayma miktari buluudu
            System.out.print((char)(('a') + index));
        }
        System.out.println();

        String str1="abcdefghijklmnopqrstuvwxyz";
        String str2="zyxwvutsrqponmlkjihgfedcba";
        System.out.print("Sifrelemek istediginiz ifadeyi giriniz : ");
        String str3=scan.nextLine().toLowerCase();

        for (int i = 0; i < str3.length(); i++) { // str3 icin index i
            for (int j = 0; j < 26; j++) { // str1 ve str2 icin index j
                if (str3.charAt(i)==str1.charAt(j)){ // kullanicidan aldigim str3 teki herhangi bir karakter
                                                     // str1 deki bir karaktere esit is
                    System.out.print(str2.charAt(j));// ayni indexsteki str 2 deki karsiligini yazdir
                }
            }
        }


    }
}

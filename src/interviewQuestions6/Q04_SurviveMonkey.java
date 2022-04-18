package interviewQuestions6;

public class Q04_SurviveMonkey {

      /*
        There is a lonely monkey in the island
        He needs to eat 4 bananas every day
        there are just 165 bananas in that island
        Create following variables and find how many days
        monkey can survive.

        Use do while loop, increment and decrement and if statements
        int numberOfBananas =165, survivalDays = 1;
        boolean monkeyAlive = true;

*/
      public static void main(String[] args) {

          int numberOfBananas =165;
          int survivalDays = 0;
          boolean monkeyAlive = true;

          do {
              System.out.println("Maymunlar günde 4 muz yer ");
              numberOfBananas-=4; // her seferinde toplam muz sayiyindan 4 muz eksilir
              survivalDays++; // yasadigi gün sayisini bir artirdik
              if (numberOfBananas<4) {// 4 ten az muz kalirsa
                  monkeyAlive=false; // maymun hayatta degil
                  System.out.println("bugun " +survivalDays + " .gun muz kalamdi, maymun ..." );
              } else System.out.println("Bugun " + survivalDays + " .gun, maymun halen yasiyor ");

              System.out.println("Kalan muz sayisi = " + numberOfBananas);

          }while (monkeyAlive);
          System.out.println("Toplam maymunun yasadigi gun sayisi = " + (survivalDays ));



      }
}


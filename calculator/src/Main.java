import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       /* Scanner number = new Scanner(System.in);
        System.out.println("Enter number:");
        double number1 = number.nextDouble();
        double number2 = number.nextDouble();
        double add = number1 + number2 ;
        double subt = number1 - number2 ;
        double multi = number1 * number2 ;
        double div = number1 / number2 ;
        System.out.println("Result add :" + add + "\nResult subt:" + subt + "\nResult multi:" + multi + "\nResult div:" + div);
*/

//--------------------------------------------------------------------------------------------------------------------------------------
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter year :");
        double year = input.nextDouble();
        if (year % 4==0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("This year is leap year.");
                }
                else {
                    System.out.println("This year is not leap year.");
                }
            } else {
                System.out.println("This year is leap year");
            }
        }
        else{
            System.out.println("This year is not leap year.");
        }*/

 //--------------------------------------------------------------------------------------------------------------------------------------

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter number:");
//        double number = input.nextDouble();
//        double faktoriel = 1 ;
//        int sayac = 1 ;
//        while ( sayac <= number){
//            faktoriel = faktoriel * sayac;
//            sayac++;
//        }
//        System.out.println("Sonuc:" + faktoriel);
//

//-----------------------------------------------------------------------------------------------------------------------------------------
       /* Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        double number = input.nextDouble();
        double toplam = 0 ;
        double sayac = 1;
        while (sayac<=number){
            toplam = toplam + sayac;
            sayac++;
        }
        System.out.println("Sonuc:" + toplam);*/

//--------------------------------------------------------------------------------------------------------------------

      /* Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        double number = input.nextDouble();
        double sayac = 0;
        double a = 0 , c = 0 , b = 1;
        while (sayac < number){
            c = a+ b;
            a = b;
          b = c;
           sayac++;
      }
        System.out.println((int) number + ". sıradaki fibonacci sayısı:" + c);*/
//----------------------------------------------------------------------------------------------------------------

        /*int i,j = 0;
        for (i =0;i<=5;i++){
            for (j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }*/


    }
}
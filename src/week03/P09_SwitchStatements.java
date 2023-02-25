package week03;

import java.util.Scanner;

public class P09_SwitchStatements {
    public static void main(String[] args) {
        /*
        Kullanıcıdan yılı ve ay numarasını alıp o yıldaki o ayda kaç gün olduğunu yazdırın
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bilgi istediginiz yili giriniz: ");
        int year=scan.nextInt();
        System.out.println("Gun sayisini merak ettiginiz ayin kacinci ay oldugunu giriniz: ");
        int month=scan.nextInt();
        int numDays=0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays=31;
                System.out.println(numDays);
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                numDays=30;
                System.out.println(numDays);
                break;

            case 2:
                numDays=(((year%4==0)&&!(year%100==0)||(year%400==0)?29:28));
                System.out.println(numDays);
                break;
            default:
                System.out.println("gecersiz ay");


        }
    }
}

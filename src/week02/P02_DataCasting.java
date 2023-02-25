package week02;

import java.util.Scanner;

public class P02_DataCasting {
    public static void main(String[] args) {
        /*
        1. Int olarak verilen 3 sayinin toplamini double
        olarak yazdirin
         */
        int a = 3, b = 9, c = 7;
        double toplam = (a + b + c);
        System.out.println("toplam = " + toplam);

        /*
        int a=3, b=9, c=7;
        int toplam=(a+b+c);
        System.out.println("toplam = "(double) +toplam);
         */
        /*
        double a=3, b=9, c=7;
        double toplam=(a+b+c);
        System.out.println("toplam = "(int) +toplam);
         */

        /*
        2. Kullanicidan bir harf isteyin o harften sonra
        geken harfleri
        Girdiğiniz harf :
        Girdiğiniz harften sonraki  3 harf :
        şeklinde yazdrın.
        ipucu: char
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir harf girin");
        char harf = scan.next().charAt(0);
        System.out.println("Girdiginiz harf: " + harf +
                "\n" + "Girdiginiz harften sonraki uc harf: " + (char) (harf + 1) + ", "
                + (char) (harf + 2) + ", " + (char) (harf + 3) + "'dir");

        /*
        3- Kullanıcıdan iki double sayı alın ve ilk sayıyı ikinci sayıa bölün ve
        sonucu tam sayı yazdırın
        ipucu: sorumluluk bende
         */
        Scanner scan2=new Scanner(System.in);
        System.out.println("iki ondalikli sayi girin");
        double db1=scan.nextDouble();
        double db2=scan.nextDouble();

        int total = (int) (db1/db2);
        System.out.println(total);
    }
}

package week02;

import java.util.Scanner;

public class P01_Scanner2 {
    public static void main(String[] args) {
        /*
        Kullanicidan ucgenin kenarini ve o kenarin yuksekligini
        girmesini isteyerek ucgenin alanini hesaplayin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Ucgenin kenarini giriniz");
        double kenar1= scan.nextDouble();
        System.out.println("Kenara ait yuksekligi giriniz");
        double kenarYuk= scan.nextDouble();

        System.out.println("Ucgenin Alani: \n" +kenar1*kenarYuk/2);

        int a=10, h=5;
        System.out.println("Ucgenin alani: " +a*h/2);

    }
}

package week02;

import java.util.Scanner;

public class P01_Scanner3 {
    public static void main(String[] args) {
        /*
        Kullanicidan iki sayi alip ucuncu bir
        degisken kullanmadan sayi degerlerini
        degistirin(swap)
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Iki sayi giriniz");
        int a= scan.nextInt();
        int b= scan.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a: " +a+ "\nb: " + b);
    }
}

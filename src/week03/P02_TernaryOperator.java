package week03;

import java.util.Scanner;

public class P02_TernaryOperator {
    public static void main(String[] args) {
        /*
        Kullanicidan bir harf isteyin, girilen karakter
        kucuk harf ise onu buyuk harf olarak yazdirin,
        yoksa girilen harfi yazdirin
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Harf giriniz: ");
        char harf = scanner.next().charAt(0);
        System.out.println(((harf >= 97 && harf <= 122) ? (char) (harf - 32) : harf));
        System.out.println(harf >= 'a' && harf <= 'z' ? (char) (harf - 32) : harf);

        if (harf >= 'a' && harf <= 'z') {
            harf = (char) (harf - 32);
            System.out.println(harf);
        }

    }

}


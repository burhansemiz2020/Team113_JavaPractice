package week03;

import java.util.Scanner;

public class P10_StringManipulation {
    public static void main(String[] args) {
        /*
        Kullanicidan isim ve soyismini ayri ayri alin.
        ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        yazdirin soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        harflerle yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Isminizi giriniz: ");
        String isim = scan.nextLine();
        System.out.println("Soyisminizi giriniz: ");
        String soyisim = scan.nextLine();

        //charAt ile sadece ilk harf aliriz

        if (isim.length() > soyisim.length()) {
            isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
            soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
            System.out.println(isim + " " + soyisim);
        }
        if (isim.length() < soyisim.length()) {
            soyisim =soyisim.toUpperCase();
            isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
            System.out.println(isim + " " + soyisim);
        }

        }
    }

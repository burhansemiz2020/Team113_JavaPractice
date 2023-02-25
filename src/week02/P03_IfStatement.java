package week02;

import java.util.Scanner;

public class P03_IfStatement {
    public static void main(String[] args) {
        /*
        1- Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        Ornek:  gun=Pazar output = "Hafta sonu"  gun=Sali output = "Hafta ici"
        *** String icin equals method'unusalı kullanin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Gun Giriniz");
        String gun = scan.next().toLowerCase();

        if (gun.equals("cumartesi") ||
                gun.equals("Pazar")) {
            System.out.println("Hafta sonu");
        } else if (gun.equals("pazartesi") ||
                gun.equals("sali") ||
                gun.equals("carsamba") ||
                gun.equals("persembe") ||
                gun.equals("cuma")) {
            System.out.println("Hafta ici");
        } else {
            System.out.println("Hatali Giris Yaptiniz");
            /*
            else if ya da else kullanmak yerine iki tane daha
            if kullanabiliriz
            ornegin
            if(!gun.equals("cumartesi") ||
                gun.equals("Pazar")) ||
                gun.equals("sali") ||
                gun.equals("carsamba") ||
                gun.equals("persembe") ||
                gun.equals("cuma"))
                System.out.println("Hatali Giris Yaptiniz");
             */
        }

    }
}

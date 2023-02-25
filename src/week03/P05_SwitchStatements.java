package week03;

import java.util.Scanner;

public class P05_SwitchStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan aldigimiz rakami yazi ile yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir rakam giriniz (0-9): ");
        int rakam = scan.nextInt();
        switch (rakam){
            case 0:
                System.out.println("Sifir");
                break;

        }switch (rakam){
            case 1:
                System.out.println("Bir");
                break;
        }switch (rakam){
            case 2:
                System.out.println("Iki");
                break;
        }switch (rakam){
            case 3:
                System.out.println("Uc");
                break;
        }switch (rakam){
            case 4:
                System.out.println("Dort");
                break;
        }switch (rakam){
            case 5:
                System.out.println("Bes");
                break;
        }switch (rakam){
            case 6:
                System.out.println("Alti");
                break;
        }switch (rakam){
            case 7:
                System.out.println("Yedi");
                break;
        }switch (rakam){
            case 8:
                System.out.println("Sekiz");
                break;
        }switch (rakam){
            case 9:
                System.out.println("Dokuz");
                break;
            default:
                System.out.println("fasdfsd");

        }
    }
}

package week03;

import java.util.Scanner;

public class P07_SwitchStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan ay numarasini alip ay adini yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Ay numarasini giriniz: ");
        int ay = scan.nextInt();
        switch (ay) {
            case 1:
                System.out.println("Ocak");
                break;
        }
        switch (ay) {
            case 2:
                System.out.println("Subat");
                break;
        }
        switch (ay) {
            case 3:
                System.out.println("Mart");
                break;
        }
        switch (ay) {
            case 4:
                System.out.println("Nisan");
                break;
        }
        switch (ay) {
            case 5:
                System.out.println("Mayis");
                break;
        }
        switch (ay) {
            case 6:
                System.out.println("Haziran");
                break;
        }
        switch (ay) {
            case 7:
                System.out.println("Temmuz");
                break;
        }
        switch (ay) {
            case 8:
                System.out.println("Agustos");
                break;
        }
        switch (ay) {
            case 9:
                System.out.println("Eylul");
                break;
        }
        switch (ay) {
            case 10:
                System.out.println("Ekim");
                break;
        }
        switch (ay) {
            case 11:
                System.out.println("Kasim");
                break;
        }
        switch (ay) {
            case 12:
                System.out.println("Aralik");
                break;
            default://default break ile ayni hizada olmamali
                System.out.println("gecersiz");

        }


    }
}
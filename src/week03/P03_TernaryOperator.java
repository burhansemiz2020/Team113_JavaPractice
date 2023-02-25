package week03;

import java.util.Scanner;

public class P03_TernaryOperator {
    public static void main(String[] args) {
        /*
        Kullanicidan iki adat sayi isteyin
        buyuk olmayan sayiyi yazdirin
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iki sayi giriniz: ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        System.out.println(sayi1>sayi2?"Buyuk olmayan sayi: " +sayi2:"Buyuk olmayan sayi: " +sayi1);

    }
}

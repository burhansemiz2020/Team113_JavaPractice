package week03;

import java.util.Scanner;

public class P04_TernaryOperator {
    public static void main(String[] args) {
        /*
        Kullanicidan notunu alin
        50 veya daha buyukse  sinifi
        gectin, 50 den kucukse maalesef
        kaldin
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Notunuzu giriniz:");
        double not=scan.nextDouble();
        System.out.println(not >= 50 ? "Sinifi " + not + " ortalamasi ile geciniz " : "Maalesef 45" + not + " ortalamasi ile kaldiniz");
    }
}

package week02;

import java.util.Scanner;

public class P05_IfElseStatement {
    public static void main(String[] args) {
        /*
        1- Öğrenci notunu harf notuna dönüştüren bir kod yazınız
            85-100 -----> AA
            80-85 ------> BA
            75-80 ------> BB
            65-75 ------> CB
            50-65 ------> CC
            50 Altı ise  ------> FF
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez votre note SVP: ");
        int note = scan.nextInt();

        if (note >= 85 && note <= 100) {
            System.out.println("Votre note est: " + note + " Harf Notunuz: AA--GECTINIZ");
        } else if (note >= 80 && note < 85) {
            System.out.println("Votre note est: " + note + " Harf Notunuz: BA--GECTINIZ");
        } else if (note >= 75 && note < 80) {
            System.out.println("Votre note est: " + note + " Harf Notunuz: BB--GECTINIZ");
        } else if (note >= 65 && note < 75) {
            System.out.println("Votre note est: " + note + " Harf Notunuz: CB--GECTINIZ");
        } else if (note >= 50 && note < 65) {
            System.out.println("Votre note est: " + note + " Harf Notunuz: CC--GECTINIZ");
        } else if (note < 50) {
            System.out.println("Votre note est: " + note + " Harf Notunuz: FF--KALDINIZ");
        } else {
            System.out.println("Invalid Note");
        }
        /*
        NOT
        Birden fazla if ve else if ya da else durumlarinda en son adimlara bakilir
        en son else ile biterse tyukaridakilerin disindaki tum ihtimalleri kapsar
        sonuc olarak bir bosluk birakmaz.
        AMA ELSE IF ile bitiyorsa kapsanmayan ihtimaller var demektir.

         */
    }
}

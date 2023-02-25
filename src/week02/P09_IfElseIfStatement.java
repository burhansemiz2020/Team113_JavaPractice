package week02;

import java.util.Scanner;

public class P09_IfElseIfStatement {
    public static void main(String[] args) {
    /*
    3-Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak "Emekli
olabilirsin" veya "Emekli olmak icin .. Yil daha calisman gerekir" yazdirin.
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Yasinizi sonra Cinsiyetinizi Giriniz E ya da K seklide giriniz");
        int yas = scan.nextInt();
        char cins = scan.next().charAt(0);
        if ((cins == 'K' || cins == 'k') && (yas >= 60)) {
            System.out.println("Emekli olabilirsiniz");
        }
        if ((cins == 'K' || cins == 'k') && (yas < 60)) {
            System.out.println("Emekli olmak icin: " + (60 - yas) + " yil calismalisiniz");
        }
        if ((cins == 'E' || cins == 'e') && (yas >= 65)) {
            System.out.println("Emekli olabilirsiniz");
        }
        if ((cins == 'E' || cins == 'e') && (yas < 65)) {
            System.out.println("Emekli olmak icin: " + (65 - yas) + " yil calismalisiniz");

        }
    }
}

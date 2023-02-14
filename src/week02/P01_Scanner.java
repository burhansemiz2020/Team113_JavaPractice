package week02;

import java.util.Scanner;

public class P01_Scanner {
    public static void main(String[] args) {
        /*
        Adiniz          Tarik
        Soyadiniz       Yigit
        yasiniz         42
        mail adresiniz  tarik@yigit.com
        sifreniz        A2bhg
        seklinde sistemimize basariyla kaydedilmistir
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Adinizi giriniz");
        String ad= scan.nextLine();
        System.out.println("Soyadinizi giriniz");
        String soyad=scan.nextLine();
        System.out.println("Yasinizi giriniz");
        double yas=scan.nextDouble();
        System.out.println("Mail adresinizi giriniz");
        String mail= scan.next();
        System.out.println("Sifrenizi giriniz");
        String sifre= scan.next();
        System.out.println("Adiniz : " + ad +
                            "\n Soyadiniz :" +soyad+
                            "\n Yasiniz :" +yas+
                            "\n Mail adresiniz :" +mail+
                            "\n Sifreniz : " +sifre+
                            "\n seklinde sistemimize basariyla kaydedilmistir");

        /*
        Yukarida aldiginiz bilgileri
        Kullanici : T. Yigit, 42

         */
        System.out.println(ad.charAt(0)+". "+soyad+", "+yas);

    }
}

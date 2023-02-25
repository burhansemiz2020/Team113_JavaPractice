package week02;

import java.util.Scanner;

public class P04_IfStatement {
    public static void main(String[] args) {
        /*
        2- Kullanıcıdan İki adet vize notu ve bir adet final notu girmesini isteyin
        Yıl sonu notunu vizeler %40 finaller % 60 olacak şekilde hesaplayıp
        Ders durumuna bu not 50'den büyük ise Geçtiniz Tebrikler! olduğunu 50'den
        küçükse Maalesef Kaldınız olarak aşağıdaki formatta yazdırınız

        Ad:
        Soyad:
        1.Vize:
        2. Vize:
        Final :
        Yıl Sonu Notu:
        Ders Durumu :
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Adiniz: ");
        String name= scan.nextLine();
        System.out.print("Soyadiniz: ");
        String surname=scan.nextLine();
        System.out.println("Lutfen vize ve final notlarinizi giriniz");
        System.out.print("1. vize notu giriniz: ");
        int vize1 = scan.nextInt();
        System.out.print("2. vize notu giriniz: ");
        int vize2 = scan.nextInt();
        System.out.print("Final notunu giriniz: ");
        int finalNotu = scan.nextInt();
        int yilsonuNotu=(((vize1+vize2)/2)*40/100)+(finalNotu*60/100);
        System.out.println("Adiniz              : " + name);
        System.out.println("Soyadiniz           : " + surname);
        System.out.println("1. vize             : " +vize1);
        System.out.println("2. vize             : " +vize2);
        System.out.println("Final               : " +finalNotu);
        System.out.println("Yil Sonu Notu       : " + yilsonuNotu);
        if (yilsonuNotu>=50){
            System.out.println("Ders Durumu         : Gectiniz Tebrikler");
        }
        if (yilsonuNotu<50){
            System.out.println(" Ders Durumu : Maalesef Kaldiniz");
        }



    }
}

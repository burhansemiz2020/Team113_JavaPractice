package week02;

import java.util.Scanner;

public class P06_IfElseStatement {
    public static void main(String[] args) {
        /*
        Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi
        birini sorun, istedigi birim metre veya santimetre ise cevirip
        yazdirin, yoksa "istediginiz birim sisteme kayitli degil!" yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("KM cinsinden mesafeyi giriniz : ");
        double km=scan.nextDouble();
        System.out.print("Lutfen donusturmek istediginiz birimi giriniz : ");
        char birim=scan.next().charAt(0);
        if (birim =='m' || birim=='M'){
            System.out.print("Girdiginiz mesafenin metre degeri : " +km*1000+ " 'dir.");
        } else if (birim=='s' || birim=='S') {
            System.out.print("Girdiginiz mesafenin metre degeri : "  +km*1000*100+  " 'dir.");
        } else {
            System.out.println("Istediginiz birim sisteme kayitli degil!");
        }
        /*
        bu soruyu string olarak cozun
         */
    }
}

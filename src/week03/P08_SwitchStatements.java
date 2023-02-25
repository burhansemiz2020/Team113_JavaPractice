package week03;

import java.util.Scanner;

public class P08_SwitchStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan ay numarasini alip mevsimi yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Ay numarasini giriniz:");
        int ayNum=scan.nextInt();
        switch (ayNum){
            case 12: case 1: case 2:
                System.out.println("Kis");
                break;
            case 3: case 4: case 5:
                System.out.println("Ilkbahar");
                break;
            case 6: case 7: case 8:
                System.out.println("6");
                break;
            case 9: case 10: case 11:
                System.out.println("11");
                default:
                    System.out.println("Gecersiz deger");





        }
    }
}

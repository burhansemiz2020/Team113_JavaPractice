package week03;

import java.util.Scanner;

public class P01_TernaryOperator {
    public static void main(String[] args) {
        /*
        1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
"Eskenar ucgen" yazdirin, degilse "Eskenar degil" yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the three lines of a triangle: ");
        double a=scan.nextDouble();
        double b=scan.nextDouble();
        double c=scan.nextDouble();
        System.out.println((a==b)&&(b==c)&&(c==a)?"Eskenar ucgen":"Eskenar ucgen degil");

        if ((a==b)&&(b==c)){
            System.out.println("This is a equilateral triangle");
        }else System.out.println("This is not a equilateral triangle");

    }
}

package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        ivedimas();
        System.out.println("Suma: " + skaiciuotuvas.suma(a,b));
        System.out.println("Suma: " + skaiciuotuvas.suma((float) a, (float) b));
        System.out.println("Skirtumas: " + skaiciuotuvas.skirtumas(a,b));
        System.out.println("Skirtumas: " + skaiciuotuvas.skirtumas((float)a, (float)b));
        System.out.println("Sandauga: " + skaiciuotuvas.sandauga(a,b));
        System.out.println("Sandauga: " + skaiciuotuvas.sandauga((float)a,(float)b));
    }
    static int a;
    static int b;

    public static void ivedimas(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite du skaicius");
        a = sc.nextInt();
        b = sc.nextInt();

    }
}

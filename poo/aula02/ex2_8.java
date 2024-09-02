package aula02;
import java.util.Scanner;

public class ex2_8 {
    public static void main(String[] args) {
        double ca ,cb, h;
        Scanner sc= new Scanner(System.in);
        do {System.out.print("Cateto A: ");
        ca = sc.nextDouble();}
        while (ca < 0);
        do {System.out.print("Cateto B: ");
        cb = sc.nextDouble();}
        while (cb < 0);
        sc.close();
        h = Math.sqrt( (Math.pow(ca, 2)) + (Math.pow(cb, 2)) );
        double cosA = (cb * cb + h * h - ca * ca) / (2 * cb * h);
        double angleA = Math.toDegrees(Math.acos(cosA));
        System.out.println("A hipotenusa tem o valor de " + h);
        System.out.println("O ângulo tem o valor de " + angleA);

    } 
}

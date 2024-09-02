package aula02;
import java.util.Scanner;

public class ex2_5 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double v1, d1, v2, d2, vm;
        do {System.out.print("Velocidade 1: ");
        v1 = sc.nextDouble();}
        while ( v1 < 0 );
        do {System.out.print("Distância 1: ");
        d1 = sc.nextDouble();}
        while (d1 < 0);
        do {System.out.print("Velocidade 2: ");
        v2 = sc.nextDouble();}
        while ( v2 < 0);
        do {System.out.print("Distância 2: ");
        d2 = sc.nextDouble();}
        while ( d2 < 0);
        vm = (v1 * v2 * (d1 + d2)) / (d1 * v2 + d2 * v1);
        System.out.print("Velocidade média final: " + vm);

        sc.close();
    }
}

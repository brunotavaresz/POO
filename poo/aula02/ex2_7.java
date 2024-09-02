package aula02;
import java.util.Scanner;
public class ex2_7 {
    public static void main(String[] args) {
        float p1x, p2x, p1y, p2y;
        double X, Y, dist;
        Scanner sc = new Scanner(System.in);
        System.out.println("Coordenadas p1: ");
        System.out.print("X: ");
        p1x = sc.nextFloat();
        System.out.print("Y: ");
        p1y = sc.nextFloat();
        System.out.println("Coordenadas P2:");
        System.out.print("X:");
        p2x = sc.nextFloat();
        System.out.print("Y:");
        p2y = sc.nextFloat();
        sc.close();
        X = (p2x - p1x) * (p2x - p1x);
        Y = (p2y - p1y) * (p2y - p1y);
        dist = Math.sqrt((X+Y));
        System.out.println("Distancia média entre os 2 pontos é de " + dist);
    }
    
}

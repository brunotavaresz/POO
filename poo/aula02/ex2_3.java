package aula02;
import java.util.Scanner;
public class ex2_3 {
    public static void main(String[] args) {
        double tempi,tempf,M,Q;
        Scanner sc =new Scanner(System.in);
        System.out.print("Temperatura inicial: ");
        tempi=sc.nextDouble();
        System.out.print("Temperatura final: ");
        tempf=sc.nextDouble();
        System.out.print("Quantidade de água em kg: ");
        M=sc.nextDouble();
        Q = M * ( tempf - tempi ) * 4184;
        sc.close();
        System.out.println("A energia necessaria para aquecer a água é " + Q + " J");   
    }
}
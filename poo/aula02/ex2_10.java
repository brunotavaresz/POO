package aula02;
import java.util.Scanner;

public class ex2_10 {
    public static void main(String[] args) {
        double ni,nf,max,min,media,soma,n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Número: ");
        ni = sc.nextDouble();
        n = 1;
        soma = ni;
        max = ni;
        min = ni;
        do{
            System.out.print("Número: ");
            nf = sc.nextDouble();
            n = n + 1;
            soma= soma + nf;
            if (nf > max){
                max = nf;
            }
            if (nf < min){
                min = nf;
            }
        } while(ni != nf);
        sc.close();
        media = soma / n;
        System.out.println("Número maior: " + max);
        System.out.println("Número menor: " + min);
        System.out.println("Média: " + media);
        System.out.println("Total de números lidos: " + n);
    }
}

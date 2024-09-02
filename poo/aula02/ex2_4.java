package aula02;
import java.util.Scanner;

public class ex2_4 {
    public static void main(String[] args) {
        double invs,total;
        float jri,jrf;
        Scanner sc= new Scanner(System.in);
        System.out.print("Valor do investimento inicial: ");
        invs = sc.nextDouble();
        System.out.print("Valor do juro (%): ");
        jri = sc.nextFloat();
        jrf = jri / 100;
        total = invs;
        sc.close();
        for (int i=0;i<3;i++){
            total = total + (total * jrf);
        } 
        System.out.println("Com um investimento inicial de " + invs + " e com uma taxa de juro mensal de " + jri + " ao fim de 3 meses o valor total irá ser de " + total + " euros");
    }
}

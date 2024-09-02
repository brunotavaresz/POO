package aula03;
import java.util.Scanner;

public class ex3_2 {
    public static void main(String[] args) {
        double investimento, total;
        float jur, jurf;
        Scanner sc= new Scanner(System.in);
        System.out.print("Investimento inicial (valor positivo e múltiplo de 1000): ");
        investimento = sc.nextDouble();
        if (( investimento < 0 ) || ( investimento % 1000 != 0 )){
            do{
                System.out.print("Investimento inicial(valor positivo e multiplo de 1000): ");
                investimento = sc.nextDouble();
            }while((investimento < 0)||(investimento % 1000 != 0));    
        }
        System.out.print("Juro (0 - 5)%: ");
        jur=sc.nextFloat();
        if (( jur < 0 ) || ( jur > 5 )){
            do {
                System.out.print("Juro (0 - 5)%: ");
                jur = sc.nextFloat();
            } while ((jur < 0) || (jur > 5));
        }
        jurf = jur/100;

        sc.close();
        total=investimento;
        for (int i=0;i<12;i++){
            total=total+(total*jurf);
            
            System.out.println("Investimento inicial: "+ investimento +", taxa de juro mensal: "+ jur+", no final do " + (i+1) + "º mes: " + total + " euros");
        }
    }
    
}

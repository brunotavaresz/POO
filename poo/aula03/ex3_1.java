package aula03;
import java.util.Scanner;

public class ex3_1 {
    public static boolean numprimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, soma = 0;
        do {
            System.out.print("Número inteiro positivo: ");
            num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Valor inválido! ");
            }
        } while (num <= 0);

        for (int i = 2; i <= num; i++) {
            if (numprimo(i)) {
                soma += i;
            }
        }
        System.out.println("A soma de todos os números primos até " + num + " é de " + soma);
        sc.close();
    }
}
    

    


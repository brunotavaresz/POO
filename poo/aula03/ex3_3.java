package aula03;
import java.util.Random;
import java.util.Scanner;

public class ex3_3 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num, tentativa, numtent, randomm;
        String resp;
        do {
        numtent = 1;
        Random rand =new Random();
        randomm = 101;
        num = rand.nextInt(randomm); 
        
        do {System.out.print("Número ( 1 - 100 ): ");
        tentativa = sc.nextInt();}
        while (0 >= tentativa || tentativa > 100);

        if (tentativa == num){
            numtent = 1;    
        }else{
            do {
                numtent += 1; 
                if (num < tentativa){
                    System.out.println("demasiado alto");
                }   
                if (num > tentativa){
                    System.out.println("demasiado baixo");
                }  
                System.out.print("Número ( 1 - 100 ): ");
                tentativa = sc.nextInt();         
            } while(tentativa != num);
        }
        
        System.out.println("Parabéns, acertou em cheio no número " + num +" depois de " + numtent + " tentativas.");
        System.out.println("Pretende Continuar:(S/Sim)");
        resp = sc.next();
        } while( resp.equals("S") || resp.equals("SIM"));
        System.out.print("FIM DO JOGO!");
        sc.close();
    }
    
}

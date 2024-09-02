package aula02;
import java.util.Scanner;

public class ex2_6 {
    public static void main(String args[]){ 
        int hora, minuto, segundo, tempo; 
        Scanner sc = new Scanner(System.in);
   
        System.out.print("Informe os segundos: ");
        tempo = sc.nextInt();
        hora = (int) tempo / 3600;
        minuto = (int) (tempo % 3600) / 60;
        segundo = (int) (tempo % 3600) % 60;
   
        System.out.println(hora + ":" + minuto + ":" + segundo); 
        sc.close();
        } 
    
}

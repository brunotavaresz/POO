package aula05;
import java.util.Scanner;

public class ex5_1 {
    public static void main(String[] args){
       
        int option;
        int dia;
        int mes;
        int ano;
        Data data = null; 

        Scanner sc= new Scanner(System.in);

        do{
            System.out.println("Date operations:");
            System.out.println("1 - create new date");
            System.out.println("2 - show current date");
            System.out.println("3 - increment date");
            System.out.println("4 - decrement data");
            System.out.println("0 - exit");
            System.out.println();
            System.out.print("Operation: ");
            option = sc.nextInt();

            switch(option){
                case 0:
                    System.out.println("Ending...");
                    break;
                case 1:
                    System.out.print("Day: ");
                    dia = sc.nextInt();
                    System.out.print("Month: ");
                    mes = sc.nextInt();
                    System.out.print("Year: ");
                    ano = sc.nextInt();          
                    data = new Data(dia, mes, ano); 
                    break;
                case 2:
                    System.out.println("Data: " + data);
                    break;
                case 3:
                    data.increment();
                    break;
                case 4:
                    data.decrement();
                    break;
                default:
                    System.out.println("Not valid!");
                    break;
            }
        } while(option != 0);

        sc.close();
    }
    
}

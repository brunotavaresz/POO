package aula07;

import java.util.Scanner;

public class ex7_2 {
    public static void main(String[] args) {
        Date date1 = null;
        Date date2 = null;
        int option;
        int year = 0, month = 0, day = 0;
        int increment, decrement;
        var sc = new Scanner(System.in);

        do {
            System.out.print("Date Operations: \n 1- create new date \n 2- show current date \n 3- increment date \n 4- decrement date  \n 0- exit \n Option: ");
            option = sc.nextInt();
            if (option == 1) {
                do {
                    System.out.print("Ano? ");
                    year = sc.nextInt();
                } while (year <= 0);
                do {
                    System.out.print("Mês? ");
                    month = sc.nextInt();
                } while (DateYMD.ValidMonth(month));
                do {
                    System.out.print("Dia? ");
                    day = sc.nextInt();
                } while (day > DateYMD.GetDays(month, year));
                date1 = new DateYMD(year, month, day);
                date2 = new DateND(year, month, day);
                System.out.print("\033[H\033[2J"); 
                System.out.println("Data criada!");
                System.out.println("Data: " + date1.toString());
                System.out.println("Distancia até 2000/1/1 - " + date2.toString());
            }
            if (option == 2) {
                System.out.print("\033[H\033[2J"); 
                if (date1 == null)
                    System.out.println("Nenhuma data criada!");
                else
                System.out.println("Data: " + date1.toString());
                System.out.println("Distancia até 2000/1/1 - " + date2.toString());
            }
            if (option == 3) {
                if (date1 != null && date2 != null ){
                System.out.print("Incremento( dias ): ");
                increment = sc.nextInt();
                date1.Increment(increment);
                date2.Increment(increment);
                System.out.print("\033[H\033[2J"); 
                System.out.println("Nova data: " + date1.toString());
                System.out.println("Distancia até 2000/1/1 - " + date2.toString());
            }
            else {
                System.out.println("Nenhuma data criada!");
            }
            }
            if (option == 4) {
                if (date1 != null && date2 != null){
                System.out.print("Decremento( dias ): ");
                decrement = sc.nextInt();
                date1.Decrement(decrement);
                date2.Decrement(decrement);
                System.out.print("\033[H\033[2J"); 
                System.out.println("Nova data: " + date1.toString());
                System.out.println("Distancia até 2020/1/1 - " + date2.toString());
                }
                else {
                    System.out.println("Nenhuma data criada!");
                }
            }
        } while (option != 0);
        
        sc.close();
    }
}

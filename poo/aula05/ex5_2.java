package aula05;
import java.util.Scanner;

public class ex5_2 {
    public static void main(String[] args){
        int ano;
        int mes;
        int option;
        int weekdayear;
        Data2 newData = null;
        Scanner sc= new Scanner(System.in);

        do{
            System.out.println("Calendar operations:");
            System.out.println("1 - create new calendar");
            System.out.println("2 - print calendar month");
            System.out.println("3 - print calendar");
            System.out.println("4 - add event to date");
            System.out.println("5 - remove event from date");
            System.out.println("0 - exit");
            System.out.println();
            System.out.print("Operation: ");
            option = sc.nextInt();

            switch(option){
                case 0:
                    System.out.println("Ending...");
                    break;
                case 1:
                    System.out.print("Year: ");
                    ano = sc.nextInt();          
                    System.out.print("First weekday of year, (1-domingo e 7-sábado): ");
                    weekdayear = sc.nextInt();
                    if (weekdayear >=1 && weekdayear<=7) {
                        newData = new Data2(ano, weekdayear);
                    }
                    else {
                        System.out.println("Not Valid!");
                    }
                    break;
                case 2:
                    System.out.print("Month: ");
                    mes = sc.nextInt();
                    if (Data2.validMonth(mes)) {
                        System.out.print(newData.printMonth(mes));
                    } else {
                        System.out.println("Not Valid Month!");
                    }
                    break;
                case 3:
                    System.out.print(newData);
                    break;
                case 4:
                    System.out.print("Day: ");
                    int day = sc.nextInt();
                    System.out.print("Month: ");
                    mes = sc.nextInt();
                    System.out.print("Year: ");
                    ano = sc.nextInt();
                    if (Data2.validMonth(mes) && day >= 1 && day <= Data.diasmes(mes, ano)) {
                        newData.addEvent(mes, day);
                        System.out.println("Event added successfully!");
                    } else {
                        System.out.println("Invalid date or month!");
                    }
                    break;
                case 5:
                    System.out.print("Day: ");
                    day = sc.nextInt();
                    System.out.print("Month: ");
                    mes = sc.nextInt();
                    System.out.print("Year: ");
                    ano = sc.nextInt();
                    if (Data2.validMonth(mes) && day >= 1 && day <= Data.diasmes(mes, ano)) {
                        newData.removeEvent(mes, day);
                        System.out.println("Event removed successfully!");
                    } else {
                        System.out.println("Invalid date or month!");
                    }
                    break;
                default:
                    System.out.println("Not valid!");
                    break;
            }

        } while(option != 0);

        sc.close();
    }
}
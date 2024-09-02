package aula03;
import java.util.Scanner;

public class ex3_5 {

        public static void main(String[] args) {
            int mes, ano, diasemana;
            Scanner sc = new Scanner(System.in);
            

            do {
                System.out.print("Data (mm/yyyy): ");
                mes = sc.nextInt();
                ano = sc.nextInt();
            } while (!validar(mes, ano));
            

            do {
                System.out.print("Dia da semana em que o mês começa (1=Sunday, ..., 7=Saturday): ");
                diasemana = sc.nextInt();
            } while (diasemana < 1 || diasemana > 7);
            

            calendario(mes, ano, diasemana);
            
            sc.close();
        }
        

        public static boolean validar(int mes, int ano) {
            return (mes >= 1 && mes <= 12 && ano >= 0);
        }
        

        public static int diasmes(int mes, int ano) {
            if (mes == 2) {
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    return 29; 
                } else {
                    return 28;
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                return 30;
            } else {
                return 31;
            }
        }

        public static String nomemes(int mes) {
            switch (mes) {
                case 1:
                    return "January";
                case 2:
                    return "February";
                case 3:
                    return "March";
                case 4:
                    return "April";
                case 5:
                    return "May";
                case 6:
                    return "June";
                case 7:
                    return "Julho";
                case 8:
                    return "August";
                case 9:
                    return "Sectember";
                case 10:
                    return "October";
                case 11:
                    return "November";
                case 12:
                    return "December";
                default:
                    return "";
            }
        }
        

        public static void calendario(int mes, int ano, int diasemana) {
            int diasMes = diasmes(mes, ano);
            String nomeMes = nomemes(mes);

            

            System.out.println("        " + nomeMes + " " + ano);
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
            

            for (int i = 1; i < diasemana; i++) {
                System.out.print("    ");
            }
            
            // imprime os dias do mês
            for (int i = 1; i <= diasMes; i++) {
                System.out.printf("%4d", i);
                if ((i + diasemana - 1) % 7 == 0) {
                    System.out.println(); 
                }
            }
            System.out.println();
        }
    
    }
    


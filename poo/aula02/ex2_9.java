package aula02;
import java.util.Scanner;

public class ex2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE UM NÚMERO");
        for (int n1 = sc.nextInt(); n1 >= 0; n1--) {
            if(n1 == 0) { 
                System.out.print(n1);
            }
            else if(n1 % 10 == 0){
                System.out.print(n1 + "\n");

            }
            else{
            System.out.print(n1 + ", ");
            }
        }
        sc.close();
    }
}

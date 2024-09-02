package aula02;
import java.util.Scanner;

public class ex2_2 {
   public static void main(String[] args) {
      // Put your code here
      double c, f;
      Scanner sc = new Scanner(System.in);
      System.out.print("Celsius? ");
      c =sc.nextDouble();
      f = 1.8 * c +32;
      
      System.out.println(c + " C = " + f + " F ");
      System.out.println("THE END");
      sc.close();
   }
}
    


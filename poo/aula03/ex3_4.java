package aula03;
import java.util.Scanner;
import java.util.Random;

public class ex3_4 {

    public static void notafinal(){
        //função da primeira parte do exercício
        double notaP,notaT,notaF;
        notaF = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota Pratica: ");
        notaP=sc.nextFloat();
        System.out.println("Nota Teorica: ");
        notaT=sc.nextFloat();
        sc.close();
        if ((notaT < 20.1 && notaT > -0.1 ) && (notaP > -0.1 && notaP < 20.1)){
            if (notaT < 7.0 || notaP < 7.0){
                System.out.printf("Codigo 66, reprovado por nota minima");
            }else{
                notaF=(0.4 * notaT) + (0.6 * notaP);
                System.out.println("Nota final é de "+ notaF);
            }
        }else{
            System.out.println("Valores introduzidos invalidos"); 
        }
    
    }
    
    public static void main(String[] args) {
        double notaP, notaT, notaF, randomm;
        int alunos;
        Scanner sc= new Scanner(System.in);
        System.out.print("Quantidade de alunos: ");
        alunos = sc.nextInt();
        double n[][] = new double[alunos][3];

        Random rand = new Random();
        
        randomm = 21;

        for (int i=0 ; i< alunos ; i++){ 
            notaT=rand.nextDouble(randomm);
            notaP=rand.nextDouble(randomm);
            n[i][0] = notaT;
            n[i][1] = notaP;
            if (notaT < 7.0|| notaP < 7.0){
                notaF = 66;
                n[i][2] = notaF;
            }else{
                notaF = (0.4 * notaT)+(0.6 * notaP);
                n[i][2] = notaF;
            }
    }
    System.out.printf("%n %7s %7s %7s","NotaT", "NotaP", "Pauta");
    for (int i=0;i<alunos;i++) {
        System.out.printf("%n %7.2f %7.2f%5.0f", n[i][0],n[i][1],n[i][2]);
    }
    sc.close();
}



    
    }
    
    


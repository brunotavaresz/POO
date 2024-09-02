package aula09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Ex2 {
    public static void main(String[] args) {
        int[] DIM= {1000, 5000, 10000, 20000, 40000, 50000, 100000};
        List<Collection<Integer>> cols= new ArrayList<>();
        cols.add(new ArrayList<>());
        cols.add(new LinkedList<>());
        cols.add(new HashSet<>());
        cols.add(new TreeSet<>());

        System.out.println("______________________________________________________________________________________________________________________________________");

        System.out.printf("%-10s", "Collection");
        System.out.println();
        for(int i=0; i< DIM.length;i++){
            System.out.printf("%19d", DIM[i]);
        }
        System.out.print("\r\n");
        for(Collection<Integer> col: cols){
            printTable(col, DIM);
        }
    }
   
    private static double[] checkPerformance(Collection<Integer> col, int DIM) {
        double start, stop, deltaAdd, deltaSearch, deltaRemove;
        // Add
        start= System.nanoTime(); // clock snapshot before
        for(int i=0; i<DIM; i++ )
            col.add( i);
        stop= System.nanoTime();  // clock snapshot after
        deltaAdd= (stop-start)/1e6; // convert to milliseconds
        // Search
        start= System.nanoTime(); // clock snapshot before
        for(int i=0; i<DIM; i++ ) {
            int n= (int) (Math.random()*DIM);
            if(!col.contains(n)) 
                System.out.println("Not found???"+n);
        }
        stop= System.nanoTime();  // clock snapshot after
        deltaSearch= (stop-start)/1e6; // convert nanoseconds to milliseconds

        // Remove
        start= System.nanoTime(); // clock snapshot before
        Iterator<Integer> iterator= col.iterator();
        while(iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        stop= System.nanoTime();  // clock snapshot after
        deltaRemove= (stop-start)/1e6; // convert nanoseconds to milliseconds
        double[] arr= {deltaAdd, deltaSearch, deltaRemove};
        
        return arr;
    }

    private static void printTable(Collection<Integer> col, int[] DIM) {
        double[][] table= new double[DIM.length][3];
        String[] contas = {"Add","Search", "Remove"};

        for(int k=0; k<DIM.length; k++){
            double[] resultados = checkPerformance(col, DIM[k]);
            table[k]=resultados;
        }

        for(int i=0; i<3;i++){
            System.out.printf("%-20s\n", contas[i]);
            for(int t=0; t<DIM.length; t++){
                System.out.printf("%19.2f", table[t][i]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
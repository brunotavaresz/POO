package aula06;
import aula05.Data;
public class ex1_1 {

    public class Test {
        public static void main(String[] args) {
       Aluno al = new Aluno ("Andreia Melo", 9855678,
       new Data(18, 7, 1990), new Data(1, 9, 2018));
       Professor p1 = new Professor("Jorge Almeida", 3467225, new Data(13, 3, 1967),
       "Associado", "Informática");
       Bolseiro bls = new Bolseiro ("Igor Santos", 8976543, new Data(11, 5, 1985), p1,
       900);
       bls.setBolsa(1050);
       System.out.println("Aluno: " + al.getNome());
       System.out.println(al);
       
       System.out.println("Bolseiro: " + bls.getNome() + ", NMec: "
       + bls.getNMec() + ", Bolsa: " + bls.getBolsa() + ", Orientador: " +
       bls.getOrientador());
       System.out.println(bls);
    }
}
    
}

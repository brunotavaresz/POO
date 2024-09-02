package aula06;

import aula05.Data;


public class Bolseiro extends Aluno {

    private Pessoa orientador;
    private int bolsa;

    public Bolseiro(String nome, int NMec, Data dataNasc, Pessoa orientador, int bolsa){
        super(nome, NMec, dataNasc);
        this.orientador = orientador;
        this.bolsa  = bolsa;
    }
    
    public Pessoa getOrientador() {
        return orientador;
    }

    public int getBolsa(){
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa  = bolsa;
    }

    @Override

    public String toString() {
        return this.getNome() + ", NMec: " + this.getNMec() + ", Data de Inscrição: " + this.getDataInsc() + ", Bolsa: " + bolsa;
    }


}

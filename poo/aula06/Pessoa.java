package aula06;

import aula05.Data;

public class Pessoa {

    private String nome;
    private int cc;
    private Data dataNasc;
    
    public Pessoa(String nome, int cc, Data data) {
        this.nome = nome;
        this.cc = cc;
        this.dataNasc = data;
    }
 
    public String getNome() {
        return nome;
    }
 
    public int getCc() {
        return cc;
    }
 
    public Data getDataNasc() {
        return dataNasc;
    }
 

    public String toString() {
        return nome + ", CC: " + cc + ", Data de Nascimento: " + dataNasc;
    }
}

package aula06;

import aula05.Data;

public class Aluno extends Pessoa{

    private final int NMec;
    private Data dataInsc;
    private static int contador = 100;
    
    public Aluno(String nome, int cc, Data dataNasc, Data dataInsc) {
        super(nome, cc, dataNasc);
        this.dataInsc = dataInsc;
        this.NMec = contador++;
    }

    public Aluno(String nome, int cc, Data dataNasc) {
        super(nome, cc, dataNasc);
        this.NMec = contador++;
        this.dataInsc = Data.today();
    }

    public Data getDataInsc() {
        return dataInsc;
    }

    public int getNMec() {
        return NMec;
    }

    @Override
	public String toString() {
		return this.getNome() + ", NMec: " + this.getNMec() + ", Data de Inscrição: " + dataInsc;
	}
    
}

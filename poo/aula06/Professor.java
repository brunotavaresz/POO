package aula06;

import aula05.Data;

public class Professor extends Pessoa {

    private String categoria;
    private String departamento;

    public Professor(String nome, int cc, Data dataNasc, String categoria, String departamento) {
        super(nome, cc, dataNasc);
        this.categoria = categoria;
        this.departamento = departamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String toString() {
        return this.getNome() + ", Categoria: " + this.getCategoria() + ", Departamento: " + this.getDepartamento();

    }
}


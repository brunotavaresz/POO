package teste2020;

import java.util.HashSet;
import java.util.Set;

public class Telemovel extends Produto{
    public static final int IVA = 23;

    private String marca;
    private String modelo;
    Set<String> notas;
    private int stock;

    public Telemovel(String marca, String modelo, double precoSemImposto) {
        super("D", precoSemImposto);
        this.marca = marca;
        this.modelo = modelo;
        this.notas = new HashSet<>();
    }


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Set<String> getNotas() {
        return this.notas;
    }

    public void setNotas(Set<String> notas) {
        this.notas = notas;
    }

    public void addNota(String nota) {
        this.notas.add(nota);
    }
    
    public void addStock(int quantidade) {
            this.stock += quantidade;
    }

    public int getStock() {
        return this.stock;
    }

    public boolean vender(int quantidade) {
        if (this.stock > 0) {
            this.stock--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Telemovel [marca=" + marca + ", modelo=" + modelo + ", notas=" + notas + "]";
    }


    @Override
    public double precoVendaAoPublico() {
        return this.getPrecoSemImposto()*(1+IVA/100);
    }

    @Override
    public String getDescricao() {
        return this.marca+"/"+this.modelo;
    }


    
}

package aula08;

public class pesadomercadorias  extends Veiculo {
    private int nrquadro;
    private double peso;
    private double cargaMaxima;

    public pesadomercadorias(String matricula, String marca, String modelo, int cilindrada, int nrquadro, double peso, double cargaMaxima) {
        super(matricula, marca, modelo, cilindrada);
        this.nrquadro = nrquadro;
        this.peso = peso;
        this.cargaMaxima = cargaMaxima;
    }

    public int getNumQuadro() {
        return nrquadro;
    }

    public double getPeso() {
        return peso;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

}
package aula08;

public class pesadopassageiros extends Veiculo {
    private int numQuadro;
    private double peso;
    private double numPassageiros;

    public pesadopassageiros(String matricula, String marca, String modelo, int cilindrada, int numQuadro, double peso, double numPassageiros) {
        super(matricula, marca, modelo, cilindrada);
        this.numQuadro = numQuadro;
        this.peso = peso;
        this.numPassageiros = numPassageiros;
    }

    public int getNumQuadro() {
        return numQuadro;
    }

    public double getPeso() {
        return peso;
    }

    public double getNumPassageiros() {
        return numPassageiros;
    }

}

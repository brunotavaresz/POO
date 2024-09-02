package aula08;


public class automovel extends Veiculo {
    private int nrquadro;
    private int bagageira;

    public automovel(String matricula, String marca, String modelo, int cilindrada, int nrquadro, int bagageira) {
        super(matricula, marca, modelo, cilindrada);
        this.nrquadro = nrquadro;
        this.bagageira = bagageira;
    }

    public int getNrQuadro() {
        return nrquadro;
    }

    public int getBagageira() {
        return bagageira;
    }
    
}
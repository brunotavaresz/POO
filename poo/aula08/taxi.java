package aula08;

public class taxi extends automovel {
    private int nrlicenca;

    public taxi(String matricula, String marca, String modelo, int cilindrada, int numQuadro, int capBagageira,int nrlicenca) {
        super(matricula, marca, modelo, cilindrada, numQuadro, capBagageira);
        this.nrlicenca = nrlicenca;
    }

    public int getNumLicenca() {
        return nrlicenca;
    }

    
}
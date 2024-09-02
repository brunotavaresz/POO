package testepratico;

public class CampingSpace {
    private String localizacao;
    private int[] dimensoes;
    private double precodia;
    private double aluguer;
    private String type;

    public CampingSpace(String localizacao, int[] dimensoes, double precodia) {
        this.localizacao = localizacao;
        this.dimensoes = dimensoes;
        this.precodia = precodia;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public int[] getDimensoes() {
        return dimensoes;
    }

    public double getPrecodia() {
        return precodia;
    }

    public double getAluguer() {
        return aluguer;
    }

    public void setAluguer(double aluguer) {
        this.aluguer = aluguer;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setDimensoes(int[] dimensoes) {
        this.dimensoes = dimensoes;
    }

    public void setPrecodia(double precodia) {
        this.precodia = precodia;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CampingSpace{" + "localizacao='" + localizacao + '\'' + ", dimensoes=" + dimensoes[0] + "x" + dimensoes[1] + ", precodia=" + precodia + ", aluguer=" + aluguer + '}';
    }




}

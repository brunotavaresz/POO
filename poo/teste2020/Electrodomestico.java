package teste2020;

public class Electrodomestico extends Produto {
    public static final int IVA = 23;

    private String tipo;
    private String marca; 
    private String modelo;
    private ClasseEnergetica classeEnergetica;
    private double potencia;
    private int stock;
    

    public Electrodomestico(String tipo, String marca, String modelo, double precoSemImposto) {
        super("E", precoSemImposto);
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Electrodomestico(String tipo, String marca, String modelo, double precoSemImposto, double potencia) {
        super("E", precoSemImposto);
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public ClasseEnergetica getClasseEnergetica() {
        return this.classeEnergetica;
    }

    public void setClasse(ClasseEnergetica classeEnergetica) {
        this.classeEnergetica = classeEnergetica;
    }

    public double getPotencia() {
        return this.potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public void addStock(int quantidade) {
        this.stock += quantidade;
    }

    @Override
    public String toString() {
        return "Electrodomestico [classeEnergetica=" + classeEnergetica + ", marca=" + marca + ", modelo=" + modelo
                + ", potencia=" + potencia + ", tipo=" + tipo + "]";
    }

	public String getDescricao() {
		return this.tipo+":"+this.marca+"/"+this.modelo;
	}

    @Override
    public double precoVendaAoPublico() {
        return this.getPrecoSemImposto()*(1+ IVA /100);
    }



    
}

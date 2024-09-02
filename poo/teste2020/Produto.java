package teste2020;

public abstract class  Produto implements PVP {
    private static int proximoCodigo = 1000;
    private String codigo;
    private int quantidade;
    private double precoSemImposto;


    public Produto(String start, double precoSemImposto) {
        this.codigo = start + String.valueOf(proximoCodigo);
        proximoCodigo += 2;

        this.quantidade = 0;
        this.precoSemImposto = precoSemImposto;
    }

    public abstract String getDescricao();

    public String getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoSemImposto() {
        return precoSemImposto;
    }

    public double getPrecoComImposto() {
        return precoSemImposto * 1.23;
    }

    public double getValorTotal() {
        return getPrecoComImposto() * quantidade;
    }


    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", precoSemImposto=" + precoSemImposto + ", quantidade=" + quantidade
                + "]";
    }


}
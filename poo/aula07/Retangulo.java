package aula07;

public class Retangulo extends Forma{
    private double comprimento;
    private double alt;


    public double area() {
        return comprimento * alt;
    }

    public double perimetro() {
        return 2 * (comprimento + alt);
    }

    public String cor() {
        return cor();
    }


    public Retangulo(double comprimento, double alt, String cor) {
        super(cor);
        this.comprimento = comprimento;
        this.alt = alt;
    }

    public double getComp() {
        return comprimento;
    }

    public double getAlt() {
        return alt;
    }

    public void setComp(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(alt);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(comprimento);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Retangulo other = (Retangulo) obj;
        if (Double.doubleToLongBits(alt) != Double.doubleToLongBits(other.alt))
            return false;
        if (Double.doubleToLongBits(comprimento) != Double.doubleToLongBits(other.comprimento))
            return false;
        return true;
    }

    public String toString() {
        return "Retângulo [comprimento=" + comprimento + ", altura=" + alt + ", Área=" + area() + ", Perimetro=" + perimetro() + "]";
    }
}
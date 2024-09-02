package aula04;

public class retangulo {
    private double comp;
	private double alt;

    public retangulo(double comp, double alt){
        this.alt = alt; 
        this.comp = comp;
    }    

    public double getAlt() {
        return alt;
    }

    public double getComp() {
        return comp;
    }

    public void setComp(double comp) {
		this.comp = comp;
	}

	public void setAlt(double alt) {
		this.alt = alt;
	}

    public double Area() {
		return (alt * comp);
	}
	
	public double Perimetro() {
		return (2 * alt + 2 * comp);
	}

    public String toString() {
		return "Retangulo [comprimento=" + comp + ", altura=" + alt + ", Area=" + Area() + ", Perimetro=" + Perimetro() + "]";
	}
}

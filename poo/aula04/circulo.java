package aula04;

public class circulo {
    private double raio;
    private xy centro;

    public circulo(xy centro, double raio) {
        this.raio = raio;
        this.centro = centro;
    }

    public double getRaio() {
        return raio;
    }

    public xy getCentro() {
        return centro;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void setCentro(xy centro) {
        this.centro = centro;
    }

    public double Area() {
        return (Math.PI * (Math.pow ( this.raio , 2)));
    }

    public double Perimetro() {
        return (2 * Math.PI * this.raio);
    }

    public boolean equals(Object obj) {
		if (this == obj) {
            return true;
        }
		if (obj == null) {
            return false;
        }
		if (getClass() != obj.getClass()) {
            return false;
        }

		circulo other = (circulo) obj;
		if (centro == null) {
			if (other.centro != null) {
                return false;
            }
		} else if (!centro.equals(other.centro)) {
            return false;
        }
		if (Double.doubleToLongBits(raio) != Double.doubleToLongBits(other.raio)) {
            return false;
        }
		return true;
	}

    public String toString() {
		return "Circulo [raio = " + raio + ", centro = " + centro + ", Area = " + Area() + ", Perimetro = " + Perimetro() +"]";
	}
}

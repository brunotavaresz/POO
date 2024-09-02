package aula09;

public class MilitaryPlane extends Plane {
    private int numMunitions;

    public MilitaryPlane(String id, String manufacturer, String model, int year,
                          int maxPassengers, int maxSpeed, int numMunitions) {
        super(id, manufacturer, model, year, maxPassengers, maxSpeed);
        this.numMunitions = numMunitions;
    }

    public int getNumMunitions() {
        return numMunitions;
    }

    public void setNumMunitions(int numMunitions) {
        this.numMunitions = numMunitions;
    }

    @Override
    public String getPlaneType() {
        return "Militar";
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de munições=" + numMunitions;
    }
}
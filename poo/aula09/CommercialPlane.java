package aula09;

public class CommercialPlane extends Plane {
    private int numCrewMembers;

    public CommercialPlane(String id, String manufacturer, String model, int yearOfProduction, int maxPassengers, int maxSpeed, int numCrewMembers) {
        super(id, manufacturer, model, yearOfProduction, maxPassengers, maxSpeed);
        this.numCrewMembers = numCrewMembers;
    }

    public int getNumCrewMembers() {
        return numCrewMembers;
    }

    public void setNumCrewMembers(int numCrewMembers) {
        this.numCrewMembers = numCrewMembers;
    }


    @Override
    public String toString() {
        return "CommercialPlane [ID=" + getId() + ", Fabricante=" + getManufacturer() + ", Modelo=" + getModel()
                + ", Ano de produção=" + getYearOfProduction() + ", Máximo de Passageiros=" + getMaxPassengers() + ", Velocidade Máxima="
                + getMaxSpeed() + ", Tripulantes=" + numCrewMembers + "]";
    }

    @Override
    public String getPlaneType() {
        return "Comercial";
    }
}
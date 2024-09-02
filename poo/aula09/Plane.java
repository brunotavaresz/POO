package aula09;

public class Plane {
    private String id;
    private String manufacturer;
    private String model;
    private int yearOfProduction;
    private int maxPassengers;
    private int maxSpeed;

    public Plane(String id, String manufacturer, String model, int yearOfProduction, int maxPassengers, int maxSpeed) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Military Plane [ID=" + id + ", Fabricante=" + manufacturer + ", Modelo=" + model + ", Ano de produção="
                + yearOfProduction + ", Máximo de Passageiros=" + maxPassengers + ", Velocidade Máxima=" + maxSpeed + "]";
    }

    public String getPlaneType() {
        return "Unknown";
    }
}
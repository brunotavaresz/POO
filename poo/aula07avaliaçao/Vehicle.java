package aula07avaliaçao;

public class Vehicle {
    private int id;
    private String marca;
    private String modelo;
    private boolean isAvailable;
    private String alugadopor;
    private String name;
    private double capacidade;
    

    public Vehicle(String marca, String model, String name, double capacidade) {
        this.marca = marca;
        this.modelo = model;
        this.capacidade = capacidade;
        this.alugadopor = name;
    }

    public Vehicle() {
    }

    public int getcapacidade() {
        return capacidade;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getalugadopor() {
        return alugadopor;
    }

    public void rent(String alugador) {
        if (!isAvailable) {
            System.out.println("Veículo não está disponivel.");
        } else {
            isAvailable = false;
            alugadopor = alugador;
            System.out.println("Veículo alugado por " + alugador);
        }
    }

    public void returnVehicle() {
        if (isAvailable) {
            System.out.println("Veiculo já foi devolvido.");
        } else {
            isAvailable = true;
            alugadopor = null;
            System.out.println("Veiculo devolvido!.");
        }
    }
}
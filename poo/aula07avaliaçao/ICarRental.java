package aula07avaliaçao;
import java.util.Scanner;
import aula07.Vehicle;
public interface ICarRental {
    Scanner sc = new Scanner(System.in);
    String[] vehicles = new String[10] ;


    public static void addVehicle(Vehicle vehicle) {
    System.out.println("Tipo de veículo (car/van): ");
    String type = sc.nextLine();
    System.out.println("Marca: ");
    String marca = sc.nextLine();
    System.out.println("Modelo: ");
    String model = sc.nextLine();
    System.out.println("Nome do cliente que pretende alugar:");
    String name = sc.nextLine();
    if (type.equals("Car")) {
        System.out.println("portas do carro? :");
        int portas = Integer.parseInt(sc.nextLine());
        CarRentalMain.addVehicle(new Vehicle(marca, model, name, portas));
    } else if (type.equals("Van")) {
        System.out.println("Volume de carga em litros: ");
        double capacidade = Double.parseDouble(sc.nextLine());
        CarRentalMain.addVehicle(new Vehicle(marca, model, name, capacidade));
        vehicles[0] = model;
    } else {
        System.out.println("Inválido.");
    }

}

    public void removeVehicle(Vehicle vehicle){
    System.out.println("Modelo do carro: ");
    String model1 = scanner.nextLine()
    vehicles[0]--;





    public void searchForModel(String model){
    System.out.print("Modelo do carro: ");
    String model3 = scanner.nextLine();


    public boolean rentVehicle(int vehicleId){
        Vehicle.rentVehicle();
    }


    public boolean returnVehicle(int vehicleId){
    Vehicle.returnVehicle();
    }

    public void printAllVehicle();
    System.out.print(vehicles)
}
}

package aula07avaliaçao;
import java.util.Scanner;

import aula07avaliaçao.ICarRental;

public class CarRentalMain {
    public static void main(String[] args) {
        ICarRental carRental = new Vehicle();
        Scanner sc = new Scanner(System.in);
        String choice = "";
        String modelo;
        String car, van;
        String marca;
        String name;
        int portas, capacidade;

        while (!choice.equals("7")) {
            System.out.println("CarRental Menu:");
            System.out.println("1. Add vehicle");
            System.out.println("2. Remove vehicle");
            System.out.println("3. Search for model");
            System.out.println("4. Rent vehicle");
            System.out.println("5. Return vehicle");
            System.out.println("6. Print all vehicles");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextLine();

            switch (choice) {
                case "1":
                System.out.print("Carro? (Sim / Não)");
                car = sc.nextLine();
                if (car == "Sim");
                ICarRental.addVehicle(new Vehicle(marca, modelo, name, portas));
                if (car == "Não");
                System.out.print("Van? (Sim / Não)");
                van = sc.nextLine();
                if (van == "Sim");
                ICarRental.addVehicle(new Vehicle(marca, modelo, name, capacidade));
                if (van == "Não");
                break;
                case "2":
                    ICarRental.removeVehicle();
                case "3":

                    
                case "4":
                    ICarRental.rentVehicle();
                case "5":
                    ICarRental.returnVehicle();
                case "6":
                    ICarRental.printAllVehicle();
                case "7":
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.print("Erro");
            }
        }
        sc.close();
    }

}

package aula09;

import java.util.Scanner;

public class PlaneTester {
    public static void main(String[] args) {
        PlaneManager manager = new PlaneManager();
        Scanner scanner = new Scanner(System.in);

        int choice = -1;
        while (choice != 8) {
            System.out.println("\n======= MENU =======");
            System.out.println("1. Adicionar novo avião");
            System.out.println("2. Remover avião");
            System.out.println("3. Procurar avião");
            System.out.println("4. Imprimir informação de todos os aviões");
            System.out.println("5. Imprimir lista de aviões comerciais");
            System.out.println("6. Imprimir lista de aviões militares");
            System.out.println("7. Imprimir informações do avião mais rápido");
            System.out.println("8. Sair");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Adicionar novo avião:");
                    System.out.print("Identificador: ");
                    String id = scanner.nextLine();
                    System.out.print("Fabricante: ");
                    String manufacturer = scanner.nextLine();
                    System.out.print("Modelo: ");
                    String model = scanner.nextLine();
                    System.out.print("Ano de produção: ");
                    int year = scanner.nextInt();
                    System.out.print("Número máximo de passageiros: ");
                    int maxPassengers = scanner.nextInt();
                    System.out.print("Velocidade máxima: ");
                    int maxSpeed = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Tipo de avião (comercial ou militar): ");
                    String planeType = scanner.nextLine();
                    if (planeType.equalsIgnoreCase("comercial")) {
                        System.out.print("Número de tripulantes: ");
                        int crewNumber = scanner.nextInt();
                        scanner.nextLine();
                        CommercialPlane commercialPlane = new CommercialPlane(id, manufacturer, model, year, maxPassengers, maxSpeed, crewNumber);
                        manager.addPlane(commercialPlane);
                        System.out.println("Avião comercial adicionado com sucesso.");
                    } else if (planeType.equalsIgnoreCase("militar")) {
                        System.out.print("Número de munições: ");
                        int ammunitionNumber = scanner.nextInt();
                        scanner.nextLine();
                        MilitaryPlane militaryPlane = new MilitaryPlane(id, manufacturer, model, year, maxPassengers, maxSpeed, ammunitionNumber);
                        manager.addPlane(militaryPlane);
                        System.out.println("Avião militar adicionado com sucesso.");
                    } else {
                        System.out.println("Tipo de avião inválido.");
                    }
                    break;
                case 2:
                    System.out.println("Remover avião:");
                    System.out.print("Identificador: ");
                    String planeId = scanner.nextLine();
                    boolean success = manager.removePlane(planeId);
                    if (success) {
                        System.out.println("Avião removido com sucesso.");
                    } else {
                        System.out.println("Avião não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Procurar avião:");
                    System.out.print("Identificador: ");
                    String searchId = scanner.nextLine();
                    Plane searchResult = manager.searchPlane(searchId);
                    if (searchResult != null) {
                        System.out.println(searchResult.toString());
                    } else {
                        System.out.println("Avião não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Informação de todos os aviões:");
                    manager.printAllPlanes();
                    break;
                case 5:
                    System.out.println("Lista de aviões comerciais:");
                    manager.printCommercialPlaneList();
                    break;
                case 6:
                    System.out.println("Lista de aviões militares:");
                    manager.printMilitaryPlaneList();
                    break;
                case 7:
                    System.out.println("Informações do avião mais rápido:");
                    Plane fastestPlane = manager.getFastestPlane();
                    if (fastestPlane != null) {
                    System.out.println(fastestPlane.toString());
                    } else {
                    System.out.println("Nenhum avião encontrado.");
                    }
                    break;
                case 8:
                    System.out.println("Saindo...");
                    break;
                    default:
                    System.out.println("Escolha inválida.");
                    break;
                }
                }
                scanner.close();
                }
                }

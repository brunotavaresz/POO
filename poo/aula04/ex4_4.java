package aula04;
import java.util.Scanner;


class Car {
    public String carro;
    public String modelo;
    public int ano;
    public int km;

    public Car(String carro, String modelo, int ano , int km) {
        this.carro = carro;
        this.modelo = modelo;
        this.ano = ano;
        this.km = km;
    }

    public void drive(int distance) {
        this.km += distance;
    }

    public String carro(){
        return carro;
    }
}

public class ex4_4 {

    static Scanner sc = new Scanner(System.in);

    static int registerCars(Car[] cars) {
        int count = 0;
        while(true){
            System.out.print("Insira dados do carro (marca, modelo, ano, quilómetros): ");
            String carro = sc.nextLine();

            if (carro.isEmpty()) {
                break;
            }

            String[] a = carro.split("\\s+");
            String marca = a[0];
            String modelo = "";
            for (int i = 1; i < a.length - 2; i++) {
                modelo += a[i] + " ";
            }

            int ano = Integer.parseInt(a[a.length - 2]);
            int km = Integer.parseInt(a[a.length - 1]);

            if (verificarDados(carro)) {
                System.out.print("\n");
            } else {
                System.out.println("Dados mal formatados. Tente novamente");
            }

            Car car = new Car(marca, modelo, ano, km);

            cars[count] = car;

            count++;

        }return count;       
  
    }

    public static boolean verificarDados(String input) {
        String[] a = input.split("\\s+");

        int ano, km;

        try {
            ano = Integer.parseInt(a[2]);
            km = Integer.parseInt(a[3]);
        } catch (NumberFormatException e) {
            return false;
        }


        // Verificar se o ano tem 4 dígitos e é positivo
        if (ano < 0 || ano < 1000 || ano > 9999) {
            return false;
        }

        // Verifica se os kms são positivos
        if (km < 0) {
            return false;
        }

        return true;
    }



    static void registerTrips(Car[] cars, int numCars) {
        while (true) {
        System.out.print("Registe uma viagem no formato \"carro:distância\": ");
        String input = sc.nextLine();
        if (input.isEmpty()) {
            break;
        }
        String[] a = input.split(":");
        if (a.length != 2) {
            System.out.println("Dados mal formatados. Tente novamente");
            continue;
        }
        String carro = a[0];
        int dist = Integer.parseInt(a[1]);
        Car car = null;

        for (int i = 0; i < numCars; i++) {
            if (cars[i].carro.equals(carro)) {
                car = cars[i];
                break;
            }
        }
        if (car == null) {
            System.out.println("Carro <not found>. Tente novamente");
            continue;
        }
        
            car.drive(dist);
        }
        System.out.print("Registe uma viagem \"carro:distância\": ");
    } 
  
    static void listCars(Car[] cars, int count) {
        System.out.println("\nCarros registados: ");
        System.out.println("cars: " + cars[0]);

        for (int i=0; i < count; i++){
            
            System.out.print(cars[i].carro() + " " + cars[i].modelo + ", " + cars[i].ano + ", kms:" + cars[i].km + "\n");
        }
        
        System.out.println("\n");
    }

    public static void main(String[] args) {

        Car[] cars = new Car[10];

        int numCars = registerCars(cars);

        if (numCars > 0) {
            listCars(cars, numCars);
            registerTrips(cars, numCars);
            listCars(cars, numCars);
        }
        System.out.print(cars);


        sc.close();

    }
}
 
// O programa não está 100% funcional mas tem várias partes completas
// Penso que falte alguns detalhes que eu não estou a conseguir completar
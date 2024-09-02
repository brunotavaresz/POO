package aula13AV;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PackageManager {
    List<Package> packages;
    private ShippingCostCalculator shippingCostCalculator;

    public PackageManager(ShippingCostCalculator shippingCostCalculator) {
        this.packages = new ArrayList<>();
        this.shippingCostCalculator = shippingCostCalculator;
    }

    public void addPackage(Package p) {
        packages.add(new Package(p.getId(), p.getWeight(), p.getSender(), p.getDestination()));
    }

    public void removePackage(int id) {
        Package packageremover = null; //cria um objeto do tipo Package com o valor null
        for (Package p : packages) { //percorre a lista de packages
            if (p.getId() == id) {
                packageremover = p; //se o id do objeto for igual ao id passado como parâmetro, o objeto packageremover passa a ter o valor do objeto p
                break;
            }
        }

        if (packageremover != null) { //se o objeto for diferente de null
            packages.remove(packageremover);
        }

    }

    public List<Package> searchPackage(int id) {
        List<Package> resultados = new ArrayList<>();
        for (Package p : packages) {
            if (p.getId() == id) {
                resultados.add(p);
            }
        }
        return resultados;
        
    }

    public void calculateShippingCost(int id) {
        for (Package p : packages) {
            if (p.getId() == id) {
                System.out.println(shippingCostCalculator.calculateShippingCost(p));
            }
        }

    }

    public void printAllPackages() {
        for (Package p : packages) {
            System.out.println(p);
        }
    }

    public void saveToFile() {
        try (FileWriter writer = new FileWriter("encomendasSalvas.txt")) {
            for (Package p : packages) {
                writer.write(p.toString() + "\n");
            }
            System.out.println("Encomendas salvas com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no ficheiro");
        }
    }

    public void lerFicheiro(String caminhoficheiro) throws FileNotFoundException, ParseException {
        try {
            File ficheiro = new File(caminhoficheiro);
            Scanner sc = new Scanner(ficheiro);
            sc.nextLine();
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                String[] partes = linha.split("; ");
                int id = Integer.parseInt(partes[0]);
                double peso = Double.parseDouble(partes[1]);
                String destino = partes[2];
                String remetente = partes[3];
                Package p = new Package(id, peso, destino, remetente);
                packages.add(p);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado");
        }


}
}
    

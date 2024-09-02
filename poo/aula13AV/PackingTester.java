package aula13AV;

import java.io.IOException;
import java.text.ParseException;

public class PackingTester {

    public static void main(String[] args) {
        
        PackageManager pm = new PackageManager(new StandardShippingCostCalculator());  //cria um novo objeto do tipo PackageManager

        pm.addPackage(new Package(1, 10, "Porto", "Lisboa"));
        pm.addPackage(new Package(2, 20, "Lisboa", "Porto"));
        pm.removePackage(1);

        pm.printAllPackages();
        pm.calculateShippingCost(2);
        System.out.println(pm.searchPackage(2));
        
        try {
            pm.lerFicheiro("encomendas.txt");
        }
        catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        
        pm.saveToFile();

    }

    }

    

package aula11;

import java.util.Arrays;
import java.io.IOException;
import java.io.FileNotFoundException;

public class EnergyUsageReportTester {

    public static void main(String[] args) {
        try {
            EnergyUsageReport energyReport = new EnergyUsageReport();

            energyReport.load("clients.txt");

            Customer newCustomer = new Customer(999, Arrays.asList(1500.0, 2000.0, 2500.0, 3000.0));
            energyReport.addCustomer(newCustomer);
            energyReport.removeCustomer(1015);
            Customer retrievedCustomer = energyReport.getCustomer(1025);


            for (int customerId : energyReport.getAllCustomerIds()) {
                double totalEnergyUsage = energyReport.calculateTotalUsage(customerId);
                System.out.println("Total energy usage for customer " + customerId + ": " + totalEnergyUsage);
            }
            energyReport.generateReport("energy_report.txt");
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found.");
        } catch (IOException e) {
            System.err.println("Error: I/O exception.");
        }
    }
}
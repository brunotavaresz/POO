package aula11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnergyUsageReport {
    private Map<Integer, Customer> customers = new HashMap<>();

    public void load(String filename) throws FileNotFoundException, IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                int customerId = Integer.parseInt(parts[0]);
                List<Double> meterReadings = new ArrayList<>();
                for (int i = 1; i < parts.length; i++) {
                    meterReadings.add(Double.parseDouble(parts[i]));
                }
                customers.put(customerId, new Customer(customerId, meterReadings));
            }
        }
    }

    public void addCustomer(Customer customer) {
        customers.put(customer.getCustomerId(), customer);
    }

    public void removeCustomer(int customerId) {
        customers.remove(customerId);
    }

    public Customer getCustomer(int customerId) {
        return customers.get(customerId);
    }

    public double calculateTotalUsage(int customerId) {
        Customer customer = customers.get(customerId);
        if (customer == null) {
            return 0;
        }
        return customer.getMeterReadings().stream().mapToDouble(Double::doubleValue).sum();
    }

    public void generateReport(String filename) throws IOException {
        try (FileWriter fw = new FileWriter(filename)) {
            for (Customer customer : customers.values()) {
                int customerId = customer.getCustomerId();
                double totalUsage = calculateTotalUsage(customerId);
                fw.write(String.format("%d|%f%n", customerId, totalUsage));
            }
        }
    }


    public List<Integer> getAllCustomerIds() {
        return new ArrayList<>(customers.keySet());
}
}
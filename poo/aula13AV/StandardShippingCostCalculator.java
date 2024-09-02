package aula13AV;

public class StandardShippingCostCalculator implements ShippingCostCalculator {
    @Override
    public double calculateShippingCost(Package pkg) {
        if (pkg.getWeight() < 5) {
            return 1.0;
        } else if (pkg.getWeight() >= 5 && pkg.getWeight() <= 10) {
            return 2.0;
        } else {
            return 3.0;
        }
    }
    
}

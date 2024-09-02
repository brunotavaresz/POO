package aula04;
class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int  getQuantity() {
        return quantity;
    }
}


class CashRegister {

    private Product[] products;
    private int count;

    public CashRegister() {
        this.products = new Product[100];
        this.count = 0;
    }

    public void addProduct(Product product) {
        this.products[count++] = product;
    }

    public double getTotalValue() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += products[i].getTotalValue();
        }
        return total;
    }


    public String toString() {
        String result = "Product; Price; Quantity; Total \n";
        for (int i = 0; i < count; i++) {
            Product prod = products[i];
            result += prod.getName() + "; " + prod.getPrice() + "; " + prod.getQuantity() + "; " + prod.getTotalValue() + "\n";
        }
        result += "Total value: " + getTotalValue();
        return result;
    }

}

public class ex4_2 {

    public static void main(String[] args) {

        CashRegister cr = new CashRegister();
        cr.addProduct(new Product("Book", 9.99, 3));
        cr.addProduct(new Product("Pen", 1.99, 10));
        cr.addProduct(new Product("Headphones", 29.99, 2));
        cr.addProduct(new Product("Notebook", 19.99, 5));
        cr.addProduct(new Product("Phone case", 5.99, 1));
        
        System.out.println(cr);

    }
}
package aula05;
import java.util.ArrayList;
import java.util.Date;
import aula05.Data;
public class Ex5_3 {
    public static void main(String[] args) {
        RealEstate imobiliaria = new RealEstate();
        imobiliaria.newProperty("Glória", 2, 30000);
        imobiliaria.newProperty("Vera Cruz", 1, 25000);
        imobiliaria.newProperty("Santa Joana", 3, 32000);
        imobiliaria.newProperty("Aradas", 2, 24000);
        imobiliaria.newProperty("São Bernardo", 2, 20000);

        imobiliaria.sell(1001);
        imobiliaria.setAuction(1002, new Data(21, 3, 2023), 4);
        imobiliaria.setAuction(1003, new Data(1, 4, 2023), 3);
        imobiliaria.setAuction(1001, new Data(1, 4, 2023), 4);
        imobiliaria.setAuction(1010, new Data(1, 4, 2023), 4);

        System.out.println(imobiliaria);

    }

    public class RealEstate {
        private ArrayList<Property> properties;
        private int nextPropertyId;
    
        public RealEstate() {
            this.properties = new ArrayList<Property>();
            this.nextPropertyId = 1000;
        }
    
        public void newProperty(String location, int rooms, double price) {
            Property property = new Property(nextPropertyId, location, rooms, price);
            properties.add(property);
            nextPropertyId++;
        }
    
        public void sell(int id) {
            Property property = getPropertyById(id);
            if (property != null) {
                property.sell();
                System.out.println("Imóvel " + id + " vendido.");
            } else {
                System.out.println("Imóvel " + id + " não existe.");
            }
        }
    
        public void setAuction(int id, Date startDate, int durationDays) {
            Property property = getPropertyById(id);
            if (property != null) {
                property.setAuction(startDate, durationDays);
            } else {
                System.out.println("Imóvel " + id + " não existe.");
            }
        }
    
        public Property getPropertyById(int id) {
            for (Property property : properties) {
                if (property.getId() == id) {
                    return property;
                }
            }
            return null;
        }
    
        public String toString() {
            String result = "Propriedades:\n";
            for (Property property : properties) {
                result += property.toString() + "\n";
            }
            return result;
        }
    }
    
    class Property {
        private int id;
        private String location;
        private int rooms;
        private double price;
        private boolean available;
        private Date auctionStartDate;
        private int auctionDurationDays;
    
        public Property(int id, String location, int rooms, double price) {
            this.id = id;
            this.location = location;
            this.rooms = rooms;
            this.price = price;
            this.available = true;
            this.auctionStartDate = null;
            this.auctionDurationDays = 0;
        }
    
        public int getId() {
            return id;
        }
    
        public void sell() {
            available = false;
        }
    
        public void setAuction(Date startDate, int durationDays) {
            auctionStartDate = startDate;
            auctionDurationDays = durationDays;
        }
    
        public String toString() {
            String result = "Imóvel: " + id + "; quartos: " + rooms + "; localidade: " + location +
                "; preço: " + price + "; disponível: " + (available ? "sim" : "não");
            if (auctionStartDate != null) {
                result += "; leilão " + auctionStartDate.toString() + " : ";
                Date endDate = new Date(auctionStartDate.getTime() + auctionDurationDays * 24 * 60 * 60 * 1000);
                result += endDate.toString();
            }
            return result;
        }
    }
}

//Penso que tenha o código quase todo correto, só me deu um erro que não estou a conseguir solucionar.

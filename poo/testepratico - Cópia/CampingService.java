package testepratico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CampingService implements CampingServiceInterface{

    private String nome;
    private String endereco;
    private List<CampingSpace> campingSpacesss;
    private List<Client> clients;
    private Map<Client, List<Booking>> bookings;


    public CampingService(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.clients = new ArrayList<>();
        this.campingSpacesss = new ArrayList<>();
        this.bookings = new HashMap<>();
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public boolean registerClient(int taxId, String name, ClientType type) {
    for (Client client : clients) {
        if (client.getNumerocontribuinte() == taxId) {
            return false;
        }
    }
    return clients.add(new Client(taxId, name, type));
}


    public Client getClient(int taxId) {
    for (Client client : clients) {
        if (client.getNumerocontribuinte() == taxId) {
            return client;
        }
    }
    return null;
}


    public void addCampingSpace(CampingSpace campingSpace) {
        campingSpacesss.add(campingSpace);
    }

    public void addCampingSpaces(Collection<CampingSpace> campingSpaces) {
        campingSpacesss.addAll(campingSpaces);
    }

    

    public boolean checkAvailability(CampingSpace campingSpace, LocalDate startDate, LocalDate endDate) {
        for (CampingSpace campingSpace2 : campingSpacesss) {
            if (campingSpace2.equals(campingSpace)) {
                List<Booking> bookingsList = bookings.get(campingSpace2);
                if (bookingsList != null) {
                    for (Booking booking : bookingsList) {
                        if (booking.getDatainicio().isBefore(endDate) && booking.getDatafim().isAfter(startDate)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public List<CampingSpace> findAvailableCampingSpaces(SpaceType spaceType, LocalDate fromDate, int duration, int[] minDimensions) {
        return null;
    }

    public boolean bookCampingSpace(Client client, CampingSpace campingSpace, LocalDate startDate, int duration) {
        if (checkAvailability(campingSpace, startDate, startDate.plusDays(duration))) {
            List<Booking> bookingsList = bookings.getOrDefault(campingSpace, new ArrayList<>());
            bookingsList.add(new Booking(startDate, startDate.plusDays(duration)));
            bookings.put(client, bookingsList);
            return true;
        }
        return false;
    }


    public double calculateTotalCost(CampingSpace campingSpace, int duration) {
        return 0;
    }

    public List<String> listBookings() {
        List<String> bookingStrings = new ArrayList<>();
        for (Map.Entry<Client, List<Booking>> entry : bookings.entrySet()) {
            Client client = entry.getKey();
            List<Booking> clientBookings = entry.getValue();
            bookingStrings.add(client.getNome() + "\s" + "[" + client.getTipocliente() + ":" + client.getNumerocontribuinte() + "]" + "\s");
            for (Booking booking : clientBookings) {
                bookingStrings.add(booking.toString() + "\n");
            }
            // tenho as funcoes feitas mas falta o resto do print, sem tempo.
        }
        return bookingStrings;
    }

    public List<String> listBookings(SpaceType spaceType) {
        return null;
    }


    public Iterable<CampingSpace> getAvailableSpacesByTotalArea(LocalDate of, int i) {
        return null;
    }


    
    



    
}

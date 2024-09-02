package testepratico;

import java.time.LocalDate;

public class Booking {

    LocalDate datainicio;
    LocalDate datafim;

    public Booking(LocalDate datainicio, LocalDate datafim) {
        this.datainicio = datainicio;
        this.datafim = datafim;
    }

    public LocalDate getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(LocalDate datainicio) {
        this.datainicio = datainicio;
    }

    public LocalDate getDatafim() {
        return datafim;
    }

    public void setDatafim(LocalDate datafim) {
        this.datafim = datafim;
    }

    @Override
    public String toString() {
        return "[" + datainicio + " : " + datafim + ']';
    }

  
}

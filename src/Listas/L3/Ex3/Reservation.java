package Listas.L3.Ex3;

import java.util.Date;

public class Reservation {
    private int id;
    Passanger passanger;
    Flight flight;

    public Reservation(int id, Passanger passanger, Flight flight) {
        this.id = id;
        this.passanger = passanger;
        this.flight = flight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Passanger getPassanger() {
        return passanger;
    }

    public void setPassanger(Passanger passanger) {
        this.passanger = passanger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}

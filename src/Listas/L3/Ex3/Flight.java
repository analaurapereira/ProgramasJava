package Listas.L3.Ex3;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private int id;
    private String origin;
    private String destination;
    private List<Reservation> reservas;

    public Flight(int id, String origin, String destination) {
        this.setId(id);
        this.setOrigin(origin);
        this.setDestination(destination);
        this.reservas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<Reservation> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reservation> reservas) {
        this.reservas = reservas;
    }

    public boolean adicionarReserva(Reservation reserva) {
        if (reservas.size() < 100) {
            reservas.add(reserva);
            return true;
        }
        else {
            System.out.println("Não há mais assentos disponíveis neste voo.");
            return false;
        }
    }
}

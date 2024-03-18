package Listas.L3.Ex3;

public class Main {
    public static void main(String[] args) {
        Passanger p1 = new Passanger(123, "João", "12345654321");
        Passanger p2 = new Passanger(122, "Laura", "12349543021");
        Passanger p3 = new Passanger(223, "Carlos", "12245654321");

        Flight f1 = new Flight(23, "São Paulo", "Dubai");
        Flight f2 = new Flight(20, "Rio de Janeiro", "Londres");

        Reservation r1 = new Reservation(1, p1, f1);
        Reservation r2 = new Reservation(3, p2, f2);

        f1.adicionarReserva(r1);
        f1.adicionarReserva(r2);

        for (Reservation reserva : f1.getReservas()) {
            Passanger passageiro = reserva.getPassanger();
            System.out.println("Reserva para " + passageiro.getName() + " no voo " + reserva.getFlight().getId()+
                    " com destino a " +reserva.getFlight().getDestination());
        }
    }
}
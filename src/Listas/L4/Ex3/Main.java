package Listas.L4.Ex3;

public class Main {
    public static void main(String[] args) {
        Radio r1 = new Radio(23, 45, "97.2", "Teddy");
        TV t1 = new TV(25, 98, 3);

        r1.maisVolume();
        System.out.println(r1.escutar());

        t1.menosVolume();
        t1.trocaCanal(6);
        System.out.println(t1.toString());
    }
}
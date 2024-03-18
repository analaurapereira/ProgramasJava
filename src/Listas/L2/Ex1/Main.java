package Listas.L2.Ex1;
public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("123456-7", "1234-5", "João", 78);

        System.out.println(c1.toString());

        c1.realizarDeposito(50);
        c1.realizarSaque(30);

        System.out.println(c1.toString());
    }
}

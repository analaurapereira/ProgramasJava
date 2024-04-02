package Aulas.Interface;


public class Main {
    public static void main(String[] args) {
        JogadorVF j1 = new JogadorVF();
        JogadorVB j2 = new JogadorVB();

        j1.bloqueio();
        j1.corte();
        j1.saque();

        j2.bloqueio();
    }
}
package Aulas.Aula01;

public class Main {
    public static void main(String[] args) {

        Time t1 = new Time("Minas", 14, true,"A");
        Time t2 = new Time("Praia", 15, true,"A");
        Time t3 = new Time("Blumenau", 15, true,"B");
        Time t4 = new Time("Osasco", 14, false, "A");

        Jogo j1 = new Jogo();
        j1.marcarJogos(t1, t2);
        j1.jogar();

        Jogo j2 = new Jogo();
        j2.marcarJogos(t1, t3);
        j2.jogar();

        Jogo j3 = new Jogo();
        j1.marcarJogos(t1, t3);
        j1.jogar();


    }
}
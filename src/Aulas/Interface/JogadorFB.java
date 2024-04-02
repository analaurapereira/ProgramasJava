package Aulas.Interface;

public class JogadorFB implements JogadorBasquete, JogadorFutebol{
    @Override
    public void lanceLivre() {
        System.out.println("Lance Livre");
    }

    @Override
    public void bandeja() {
        System.out.println("Bandeja");
    }

    @Override
    public void penalti() {
        System.out.println("Penalti");
    }

    @Override
    public void escanteio() {
        System.out.println("Escanteio");
    }
}

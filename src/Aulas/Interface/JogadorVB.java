package Aulas.Interface;

public class JogadorVB implements JogadorVolei, JogadorBasquete{
    @Override
    public void lanceLivre() {
        System.out.println("Lance Livre");
    }

    @Override
    public void bandeja() {
        System.out.println("Bandeja");
    }

    @Override
    public void corte() {
        System.out.println("Kusnetsovaaaaa!!!");
    }

    @Override
    public void saque() {
        System.out.println("Saque da Gatazzz");
    }

    @Override
    public void bloqueio() {
        System.out.println("Paredão Júlia Kudiess");
    }
}

package Aulas.Interface;

public class JogadorVF implements JogadorVolei, JogadorFutebol{
    @Override
    public void penalti() {
        System.out.println("Penalti");
    }

    @Override
    public void escanteio() {
        System.out.println("Escanteio");
    }

    @Override
    public void corte() {
        System.out.println("Pancada Rosamaria!!!");
    }

    @Override
    public void saque() {
        System.out.println("Saque Thaisaa");
    }

    @Override
    public void bloqueio() {
        System.out.println("Paredão Carolana");
    }
}

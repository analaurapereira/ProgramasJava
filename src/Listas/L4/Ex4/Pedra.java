package Listas.L4.Ex4;

public class Pedra extends Coisa{

    @Override
    boolean ganhaDe(Coisa outraCoisa) {
        return outraCoisa instanceof Tesoura;
    }

    @Override
    public String toString() {
        return "Pedra";
    }
}

package Listas.L4.Ex4;

public class Papel extends Coisa{
    @Override
    boolean ganhaDe(Coisa outraCoisa) {
        return outraCoisa instanceof Pedra;
    }

    @Override
    public String toString() {
        return "Papel";
    }
}

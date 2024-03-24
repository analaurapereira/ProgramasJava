package Listas.L4.Ex4;

public class Tesoura extends Coisa{
    @Override
    boolean ganhaDe(Coisa outraCoisa) {
        return outraCoisa instanceof Papel;
    }

    @Override
    public String toString() {
        return "Tesoura";
    }
}
